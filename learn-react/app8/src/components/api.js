// Passo 5 — Usando uma instância base no Axios
// Neste exemplo, você verá como configurar uma instância base na qual é possível definir uma URL, além de qualquer outro elemento de configuração./

import axios from 'axios';

export default axios.create({
  baseURL: `http://jsonplaceholder.typicode.com/`
});
