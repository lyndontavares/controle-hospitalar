https://pt-br.reactjs.org/docs/add-react-to-a-website.html#optional-try-react-with-jsx

Passo 1: Execute npm init -y (se falhar, aqui está uma correção)
Passo 2: Execute npm install babel-cli@6 babel-preset-react-app@3

Execute o Pré-processador JSX
Crie uma pasta chamada src e execute no terminal esse comando:

npx babel --watch src --out-dir . --presets react-app/prod
