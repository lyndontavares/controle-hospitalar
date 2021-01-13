function Condicional(props) {
    return (
        <div>
            { props.numero % 2 === 0 ?
                <p>Par</p> : <p>Impar</p>
            }
       </div>
    )
}

export default Condicional
