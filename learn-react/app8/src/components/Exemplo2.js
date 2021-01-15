//Em requisições que precisam de acessar rotas autenticadas, podemos passar o token da requisição na propriedade Authorization dos headers:

api.defaults.headers.authorization = `Bearer ${token}`;

//É possível realizar execução de várias requisições simultâneas:

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

  //Podemos criar interceptadores de cada requisição e resposta:

  import axios from "axios";

const api = axios.create({
  baseURL: "<https://api.github.com>"
});

let countReq = 0;

// Add a request interceptor
api.interceptors.request.use(
  function (config) {
    if (config.method === "get") {
      ++countReq;
    }
    console.log(
      `Já tivemos ${countReq} requisições do tipo ${config.method.toUpperCase()}`
    );
    return config;
  },
  function (error) {
    // Do something with request error
    return Promise.reject(error);
  }
);

export default api;

/**
Resposta:
Já tivemos 1 requisições do tipo GET
Já tivemos 2 requisições do tipo GET
Já tivemos 3 requisições do tipo GET
**/
