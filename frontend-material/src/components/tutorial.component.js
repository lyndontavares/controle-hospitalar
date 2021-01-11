import React, { Component } from "react";
import TutorialDataService from "../services/tutorial.service";

import { styles } from "../css-common"
import { TextField, Button, withStyles } from "@material-ui/core";

class Tutorial extends Component {
    constructor(props) {
        super(props);
        this.onChangeTitle = this.onChangeTitle.bind(this);
        this.onChangeDescription = this.onChangeDescription.bind(this);
        this.getTutorial = this.getTutorial.bind(this);
        this.updatePublished = this.updatePublished.bind(this);
        this.updateTutorial = this.updateTutorial.bind(this);
        this.deleteTutorial = this.deleteTutorial.bind(this);

        this.state = {
            currentTutorial: {
                id: null,
                title: "",
                description: "",
                published: false
            },
            message: ""
        };
    }

    componentDidMount() {
        this.getTutorial(this.props.match.params.id);
    }

    onChangeTitle(e) {
        const title = e.target.value;

        this.setState(function (prevState) {
            return {
                currentTutorial: {
                    ...prevState.currentTutorial,
                    title: title
                }
            };
        });
    }

    onChangeDescription(e) {
        const description = e.target.value;

        this.setState(prevState => ({
            currentTutorial: {
                ...prevState.currentTutorial,
                description: description
            }
        }));
    }

    getTutorial(id) {
        TutorialDataService.get(id)
            .then(response => {
                this.setState({
                    currentTutorial: response.data
                });
                console.log(response.data);
            })
            .catch(e => {
                console.log(e);
            });
    }

    updatePublished(status) {
        var data = {
            id: this.state.currentTutorial.id,
            title: this.state.currentTutorial.title,
            description: this.state.currentTutorial.description,
            published: status
        };

        TutorialDataService.update(this.state.currentTutorial.id, data)
            .then(response => {
                this.setState(prevState => ({
                    currentTutorial: {
                        ...prevState.currentTutorial,
                        published: status
                    }
                }));
                console.log(response.data);
            })
            .catch(e => {
                console.log(e);
            });
    }

    updateTutorial() {
        TutorialDataService.update(
            this.state.currentTutorial.id,
            this.state.currentTutorial
        )
            .then(response => {
                console.log(response.data);
                this.setState({
                    message: "Atualizado com sucesso"
                });
            })
            .catch(e => {
                console.log(e);
            });
    }

    deleteTutorial() {
        TutorialDataService.delete(this.state.currentTutorial.id)
            .then(response => {
                console.log(response.data);
                this.props.history.push('/tutorials')
            })
            .catch(e => {
                console.log(e);
            });
    }

    render() {
        const { currentTutorial } = this.state;
        const { classes } = this.props

        return (
            <div>
                {currentTutorial ? (
                    <div className={classes.form}>
                        <h2>Tutorial</h2>
                        <form>
                            <div>
                                <TextField
                                    className={classes.textField}
                                    label="nome"
                                    name="nome"
                                    placeholder=""
                                    value={currentTutorial.nome}
                                    onChange={this.onChangeTitle}
                                    required
                                />
                            </div>
                            <div>
                                <TextField
                                    className={classes.textField}
                                    label="CRM"
                                    name="crm"
                                    placeholder=""
                                    value={currentTutorial.crm}
                                    onChange={this.onChangeDescription}
                                    required
                                />
                            </div>

                            <div className="form-group">
                                <label>
                                    <strong>Status: </strong>
                                </label>
                                {currentTutorial.published ? "Published" : "Pending"}
                            </div>
                        </form>
                        <div className={classes.buttonWrapper}>

                            <Button
                                type="submit"
                                className={`${classes.update} ${classes.button}`}
                                onClick={this.updateTutorial}
                            >
                                Gravar
                           </Button>

                            <Button
                                className={`${classes.delete} ${classes.button}`}
                                onClick={this.deleteTutorial}
                            >
                                Cancelar
                             </Button>


                        </div>
                        <p>{this.state.message}</p>
                    </div>
                ) : (
                        <div>
                            <br />
                            <p>Selecione para consultar...</p>
                        </div>
                    )}
            </div>
        );
    }
}

export default withStyles(styles)(Tutorial)
