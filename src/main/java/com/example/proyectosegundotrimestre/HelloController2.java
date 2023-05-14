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
    private ArrayList<String> modulosLista;

    @FXML
    protected void onCerrarButtonClick() {
        System.exit(1);
    }

    public HelloController2(String nombreTexto, String apellidosTexto, String nifTexto, String cpTexto, String correoTexto, ArrayList modulosLista) {
        this.nombre.setText(nombreTexto);
        this.apellidos.setText(apellidosTexto);
        this.nif.setText(nifTexto);
        this.codigoPostal.setText(cpTexto);
        this.correoElectronico.setText(correoTexto);
        for(int i =0; i<modulosLista.size();i++) {
            this.modulos.setText(modulosLista.get(i).toString());
        }
    }
}