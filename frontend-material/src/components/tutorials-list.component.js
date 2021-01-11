import React, { Component } from "react";
import TutorialDataService from "../services/tutorial.service";
import { Link } from "react-router-dom";

import { styles } from "../css-common"
import { TextField, Button, Grid, ListItem, withStyles } from "@material-ui/core";

class TutorialsList extends Component {
  constructor(props) {
    super(props);
    this.onChangeSearchTitle = this.onChangeSearchTitle.bind(this);
    this.retrieveTutorials = this.retrieveTutorials.bind(this);
    this.refreshList = this.refreshList.bind(this);
    this.setActiveTutorial = this.setActiveTutorial.bind(this);
    this.removeAllTutorials = this.removeAllTutorials.bind(this);
    this.searchTitle = this.searchTitle.bind(this);

    this.state = {
      tutorials: [],
      currentTutorial: null,
      currentIndex: -1,
      searchTitle: ""
    };
  }

  componentDidMount() {
    this.retrieveTutorials();
  }

  onChangeSearchTitle(e) {
    const searchTitle = e.target.value;

    this.setState({
      searchTitle: searchTitle
    });
  }

  retrieveTutorials() {
    TutorialDataService.getAll()
      .then(response => {
        this.setState({
          tutorials: response.data
        });
        console.log(response.data);
      })
      .catch(e => {
        console.log(e);
      });
  }

  refreshList() {
    this.retrieveTutorials();
    this.setState({
      currentTutorial: null,
      currentIndex: -1
    });
  }

  setActiveTutorial(tutorial, index) {
    this.setState({
      currentTutorial: tutorial,
      currentIndex: index
    });
  }

  removeAllTutorials() {
    TutorialDataService.deleteAll()
      .then(response => {
        console.log(response.data);
        this.refreshList();
      })
      .catch(e => {
        console.log(e);
      });
  }

  searchTitle() {
    TutorialDataService.findByTitle(this.state.searchTitle)
      .then(response => {
        this.setState({
          tutorials: response.data
        });
        console.log(response.data);
      })
      .catch(e => {
        console.log(e);
      });
  }

  render() {
    const { classes } = this.props
    const { searchTitle, tutorials, currentTutorial, currentIndex } = this.state;

    return (
      <div className={classes.form}>
        <Grid container>
          <Grid className={classes.search} item sm={12} xs={12} md={12} xl={12} lg={12}>
            <TextField
              label="digite nome"
              value={searchTitle}
              onChange={this.onChangeSearchTitle}
            />
            <Button
              size="small"
              variant="outlined"
              className={classes.textField}
              onClick={this.searchTitle}>
              Pesquisar
            </Button>
          </Grid>
          <Grid item md={4}>
            <h2>Lista</h2>

            <div className="list-group">
              {tutorials &&
                tutorials.map((tutorial, index) => (
                  <ListItem
                    selected={index === currentIndex}
                    onClick={() => this.setActiveTutorial(tutorial, index)}
                    divider
                    button
                    key={index}>
                    {tutorial.nome}
                  </ListItem>
                ))}
            </div>

            <Button
              className={`${classes.button} ${classes.removeAll}`}
              size="small"
              color="secondary"
              variant="contained"
              onClick={this.removeAllTutorials}
            >
              Remover Todos
          </Button>
          </Grid>
          <Grid item md={8}>
            {currentTutorial ? (
              <div className={classes.tutorial}>
                <h4>Cadastro</h4>
                <div className={classes.detail}>
                  <label>
                    <strong>Nome:</strong>
                  </label>{" "}
                  {currentTutorial.nome}
                </div>
                <div className={classes.detail}>
                  <label>
                    <strong>CRM:</strong>
                  </label>{" "}
                  {currentTutorial.crm}
                </div>
                 <div className={classes.detail}>
                  <label>
                    <strong>Dt.Inscricao:</strong>
                  </label>{" "}
                  {currentTutorial.dtInscricao}
                </div>
                <div className={classes.detail}>
                  <label>
                    <strong>Telefone:</strong>
                  </label>{" "}
                  {currentTutorial.telefone}
                </div>
                <div className={classes.detail}>
                  <label>
                    <strong>Endereço:</strong>
                  </label>{" "}
                  {currentTutorial.endereco}
                </div>
                <div className={classes.detail}>
                  <label>
                    <strong>Sexo:</strong>
                  </label>{" "}
                  {currentTutorial.sexo}
                </div>

                <div className={classes.detail}>
                  <label>
                    <strong>Situação:</strong>
                  </label>{" "}
                  {currentTutorial.published ? "Ativo" : "Inativo"}
                </div>

                <Link
                  to={"/tutorials/" + currentTutorial.id}
                  className={classes.edit}
                >
                  Editar
              </Link>
              </div>
            ) : (
                <div>
                  <br />
                  <p className={classes.tutorial}>Selecione para consultar...</p>
                </div>
              )}
          </Grid>
        </Grid>
      </div>
    );
  }
}

export default withStyles(styles)(TutorialsList)
