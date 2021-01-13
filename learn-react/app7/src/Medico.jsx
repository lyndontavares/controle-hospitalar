import React from 'react'
import { useState} from 'react'
import Condicional from './Condicional'
import CondicionalComIf from './CondicionalComIf'

function ListaMedicos() {

}

function Medico() {
    const [contador,setContador] = useState(1)

    function addContador() {
        setContador(contador+1)
    }

    function minusContador() {
        setContador(contador-1)
    }

    return (
    <div>
     <h1>Contador</h1>
        <button onClick={addContador}>Adicionar</button>
        <button onClick={minusContador}>Subtrair</button>
        <div>{contador}</div>
            <Condicional numero={contador}/>
           <CondicionalComIf numero={contador}/>

    </div>
    )
}

export default Medico
