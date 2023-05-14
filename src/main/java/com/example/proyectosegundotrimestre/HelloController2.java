package com.example.proyectosegundotrimestre;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class HelloController2 {
    //BOTONES
    @FXML
    private Button CerrarButton;

    //DATOS PERSONALES
    @FXML
    private Label nombre = new Label("");
    @FXML
    private Label apellidos;
    @FXML
    private Label nif;
    @FXML
    private Label codigoPostal;
    @FXML
    private Label correoElectronico;
    @FXML
    private Label modulos;

    private String nombreTexto;
    private String apellidosTexto;
    private String nifTexto;
    private String cpTexto;
    private String correoTexto;
    private ArrayList<String> modulosLista = new ArrayList<>();



    @FXML
    protected void onCerrarButtonClick() {
        System.exit(1);
    }

    public HelloController2() {

    }

    public void setValues(String nombreTexto, String apellidosTexto, String nifTexto, String cpTexto, String correoTexto, ArrayList<String> modulosListaParametro){
        this.nombre.setText(nombreTexto);
        this.apellidosTexto = apellidosTexto;
        this.nifTexto = nifTexto;
        this.cpTexto = cpTexto;
        this.correoTexto = correoTexto;
        modulos.setText(String.join(", ", modulosListaParametro));
    }

}


