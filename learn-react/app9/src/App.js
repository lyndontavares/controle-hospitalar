import React, { useEffect, useState } from "react";
import "./styles.css";

import api from "./services/api";

const githubUsers = ["tgmarinho", "diego3g", "vinifraga"];

export default function App() {
  const [user, setUser] = useState();
  const [users, setUsers] = useState([]);

  // Utilização mais simples de busca axios
  useEffect(() => {
    api
      .get("users/" + githubUsers[2])
      .then((response) => setUser(response.data))
      .catch((err) => {
        console.error("ops! ocorreu um erro" + err);
      });
  }, []);

  // Utilizando multi requisocões assíncronas com axios + promisses
  useEffect(() => {
    Promise.all([
      api.get("users/tgmarinho"),
      api.get("users/diego3g"),
      api.get("users/vinifraga")
    ]).then((response) => {
      for (const res of response) {
        const {
          data: { login, bio }
        } = res;

        setUsers((state) => [...state, { login, bio }]);
      }
    });
  }, []);

  return (
    <div className="App">
      <h1>Hello {user?.login}</h1>
      <h2>Let me see your bio:</h2>
      <h2>{user?.bio}</h2>

      {users?.map((user, index) => (
        <div key={String(user.login + index)}>
          <h1>Hello for you too: {user?.login}</h1>
          <h2>Let me see your bio:</h2>
          <h2>{user?.bio}</h2>
        </div>
      ))}
    </div>
  );
}
