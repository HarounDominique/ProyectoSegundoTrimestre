package com.example.proyectosegundotrimestre;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    //BOTONES
    @FXML
    private Button mostrarButton;
    @FXML
    private Button cancelarButton;
    //DATOS PERSONALES
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
    //MÓDULOS
    @FXML
    private CheckBox diCheckBox;
    @FXML
    private CheckBox adCheckBox;
    @FXML
    private CheckBox progCheckBox;
    @FXML
    private CheckBox bdCheckBox;
    @FXML
    private CheckBox pmCheckBox;

    Alumno a = new Alumno();

    @FXML
    protected void onCancelarButtonClick() {
        //limpiar contenido de text fields
        nombreTextField.setText("");
        apellidosTextField.setText("");
        nifTextField.setText("");
        codigoPostalTextField.setText("");
        correoElectronicoTextField.setText("");
        //limpiar modulos
        diCheckBox.setSelected(false);
        adCheckBox.setSelected(false);
        bdCheckBox.setSelected(false);
        progCheckBox.setSelected(false);
        pmCheckBox.setSelected(false);
        //resetear horas modulos alumno
        a.setHorasModulos(0);
    }
    //EVENTOS
    @FXML
    protected void onDiCheck() {
        //anhade las horas correspondientes al total de horas
        if (diCheckBox.isSelected()) {
            a.setHorasModulos(a.getHorasModulos()+100);
            if(!a.comprobarHoras()){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Se ha superado el límite de horas en la selección de módulos");
                alert.setHeaderText(null);
                alert.setContentText("El máximo de horas totales es 300, los módulos seleccionados no deben exceder esta cantidad de horas.");

                alert.showAndWait();
            }
        } else {
            a.setHorasModulos(a.getHorasModulos()-100);
        }
    }
    @FXML
    protected void onAdCheck() {
        //anhade las horas correspondientes al total de horas
        if (adCheckBox.isSelected()) {
            a.setHorasModulos(a.getHorasModulos()+100);
            if(!a.comprobarHoras()){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Se ha superado el límite de horas en la selección de módulos");
                alert.setHeaderText(null);
                alert.setContentText("El máximo de horas totales es 300, los módulos seleccionados no deben exceder esta cantidad de horas.");

                alert.showAndWait();
            }
        } else {
            a.setHorasModulos(a.getHorasModulos()-100);
        }
    }
    @FXML
    protected void onBdCheck() {
        //anhade las horas correspondientes al total de horas
        if (bdCheckBox.isSelected()) {
            a.setHorasModulos(a.getHorasModulos()+100);
            if(!a.comprobarHoras()){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Se ha superado el límite de horas en la selección de módulos");
                alert.setHeaderText(null);
                alert.setContentText("El máximo de horas totales es 300, los módulos seleccionados no deben exceder esta cantidad de horas.");

                alert.showAndWait();
            }
        } else {
            a.setHorasModulos(a.getHorasModulos()-100);
        }
    }
    @FXML
    protected void onProgCheck() {
        //anhade las horas correspondientes al total de horas
        if (progCheckBox.isSelected()) {
            a.setHorasModulos(a.getHorasModulos()+100);
            if(!a.comprobarHoras()){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Se ha superado el límite de horas en la selección de módulos");
                alert.setHeaderText(null);
                alert.setContentText("El máximo de horas totales es 300, los módulos seleccionados no deben exceder esta cantidad de horas.");

                alert.showAndWait();
            }
        } else {
            a.setHorasModulos(a.getHorasModulos()-100);
        }
    }
    @FXML
    protected void onPmCheck() {
        //anhade las horas correspondientes al total de horas
        if (pmCheckBox.isSelected()) {
            a.setHorasModulos(a.getHorasModulos()+100);
            if(!a.comprobarHoras()){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Se ha superado el límite de horas en la selección de módulos");
                alert.setHeaderText(null);
                alert.setContentText("El máximo de horas totales es 300, los módulos seleccionados no deben exceder esta cantidad de horas.");

                alert.showAndWait();
            }
        } else {
            a.setHorasModulos(a.getHorasModulos()-100);
        }
    }
}