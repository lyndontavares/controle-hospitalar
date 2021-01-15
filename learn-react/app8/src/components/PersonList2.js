import React from 'react';

import API from './api';

export default class PersonList extends React.Component {
  state = {
    persons: []
  }

  componentDidMount() {

    //Como http://jsonplaceholder.typicode.com/ é agora a URL base, não é mais necessário escrever toda a URL sempre que quiser acessar um ponto de extremidade diferente na API.
    API.delete(`users/${this.state.id}`)
      .then(res => {
        const persons = res.data;
        this.setState({ persons });
      })
  }

  render() {
    return (
      <ul>
        { this.state.persons.map(person => <li>{person.name}</li>)}
      </ul>
    )
  }
}


/*

Passo 6 — Usando o async e await
Neste exemplo, você verá como usar o async e await para trabalhar com promessas.

A palavra-chave await resolve a promise e retorna o value. Depois disso, o value pode ser atribuído a uma variável.

handleSubmit = async event => {
  event.preventDefault();

  //
  const response = await API.delete(`users/${this.state.id}`);

  console.log(response);
  console.log(response.data);
};

*/
