package com.example.proyectosegundotrimestre;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Button mostrarButton;
    @FXML
    private Button cancelarButton;

    @FXML
    private TextField nombreTextField;
    @FXML
    private TextField apellidosTextField;
    @FXML
    private TextField nifTextField;
    @FXML
    private TextField codigoPostalTextField;
    @FXML
    private TextField correoElectronicoTextField;

    @FXML
    protected void onCancelarButtonClick() {
        //limpiar contenido de text fields
        nombreTextField.setText("");
        apellidosTextField.setText("");
        nifTextField.setText("");
        codigoPostalTextField.setText("");
        correoElectronicoTextField.setText("");
    }
}