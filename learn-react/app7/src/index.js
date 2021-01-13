import React from 'react'
import ReactDOM from 'react-dom'
import Medico from './Medico'
import './style.css'

ReactDOM.render(

    <div>
      <h1> Lista de Médicos</h1>
     <Medico/>

    </div>,

    document.getElementById('root'),

 )

/*
   Retornando 2 elementos Adjacentes

   Ténica.1:
   ReactDOM.render(

    <>
      <h1> Olá Mundo!</h1>
     <Primeiro/>
    </>,

    document.getElementById('root'),

 )

  Ténica.2:
  ReactDOM.render(

    <React.Fragment>
      <h1> Olá Mundo!</h1>
     <Primeiro/>
    </React.Fragment>,

    document.getElementById('root'),

 ) */
