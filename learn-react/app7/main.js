function MeuComponente() {
   return (
        <div id="componente">
            <MeuComponente1 />
        </div>
    )

}

function MeuComponente1() {
    return (
        <div class="componnte-1">
            Componente 1
        </div>
    )
}


ReactDOM.render(
    <MeuComponente/>,
    document.getElementById('app')
)
