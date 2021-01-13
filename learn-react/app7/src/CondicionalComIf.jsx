import If from './If'

function CondicionalComIf(props) {
    return (
        <div>
           <If test={props.numero % 2 === 0}>Par (com if)</If>
           <If test={props.numero % 2 !== 0}>Impar (com if)</If>
       </div>
    )
}

export default CondicionalComIf
