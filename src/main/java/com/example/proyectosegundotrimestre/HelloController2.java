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
    private TextField nombre;
    @FXML
    private TextField apellidos;
    @FXML
    private TextField nif;
    @FXML
    private TextField codigoPostal;
    @FXML
    private TextField correoElectronico;
    @FXML
    private TextField modulos;

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

    public HelloController2(String nombreTexto, String apellidosTexto, String nifTexto, String cpTexto, String correoTexto, ArrayList<String> modulosListaParametro) {
        this.nombreTexto = nombreTexto;
        this.apellidosTexto = apellidosTexto;
        this.nifTexto = nifTexto;
        this.cpTexto = cpTexto;
        this.correoTexto = correoTexto;
        for(int i =0; i<modulosListaParametro.size();i++) {
            this.modulosLista.add(modulosListaParametro.get(i).toString());
        }
    }
}