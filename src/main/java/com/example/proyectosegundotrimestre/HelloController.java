package com.example.proyectosegundotrimestre;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

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
    //INSTANCIA ALUMNO
    Alumno a = new Alumno();


    //EVENTOS
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

    @FXML
    protected void onMostrarButtonClick() {
        if (nombreTextField.getText().isBlank() || apellidosTextField.getText().isBlank() ||
                nifTextField.getText().isBlank() || codigoPostalTextField.getText().isBlank() ||
                correoElectronicoTextField.getText().isBlank()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Datos personales incompletos");
            alert.setHeaderText(null);
            alert.setContentText("Para poder realizar la matrícula todos los campos deben ser cubiertos.");

            alert.showAndWait();
        } else if (a.getHorasModulos() > 300) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Se ha superado el límite de horas en la selección de módulos");
            alert.setHeaderText(null);
            alert.setContentText("El máximo de horas totales es 300, los módulos seleccionados no deben exceder esta cantidad de horas. Para poder realizar la matrícula no deben superarse las 300 horas.");

            alert.showAndWait();
        } else {
            a.setNombre(nombreTextField.getText());
            a.setApellidos(apellidosTextField.getText());
            a.setNif(nifTextField.getText());
            a.setCodigoPostal(codigoPostalTextField.getText());
            a.setCorreoElectronico(correoElectronicoTextField.getText());
            if (diCheckBox.isSelected()) {
                a.getModulos().add("Diseño de interfaces");
            }
            if (adCheckBox.isSelected()) {
                a.getModulos().add("Acceso a datos");
            }
            if (bdCheckBox.isSelected()) {
                a.getModulos().add("Base de datos");
            }
            if (progCheckBox.isSelected()) {
                a.getModulos().add("Programación");
            }
            if (pmCheckBox.isSelected()) {
                a.getModulos().add("Programación multimedia");
            }
            System.out.println(a.toString());
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view2.fxml"));
                HelloController2 controller = new HelloController2(a.getNombre(), a.getApellidos(), a.getNif(), a.getCodigoPostal(), a.getCorreoElectronico(), a.getModulos());
                loader.setController(controller);
                Scene scene = new Scene(loader.load());
                Stage stage = new Stage();
                stage.setTitle("Datos alumno");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    protected void onDiCheck() {
        //anhade las horas correspondientes al total de horas
        if (diCheckBox.isSelected()) {
            a.setHorasModulos(a.getHorasModulos() + 100);
            if (!a.comprobarHoras()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Se ha superado el límite de horas en la selección de módulos");
                alert.setHeaderText(null);
                alert.setContentText("El máximo de horas totales es 300, los módulos seleccionados no deben exceder esta cantidad de horas.");

                alert.showAndWait();
            }
        } else {
            a.setHorasModulos(a.getHorasModulos() - 100);
        }
    }

    @FXML
    protected void onAdCheck() {
        //anhade las horas correspondientes al total de horas
        if (adCheckBox.isSelected()) {
            a.setHorasModulos(a.getHorasModulos() + 100);
            if (!a.comprobarHoras()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Se ha superado el límite de horas en la selección de módulos");
                alert.setHeaderText(null);
                alert.setContentText("El máximo de horas totales es 300, los módulos seleccionados no deben exceder esta cantidad de horas.");

                alert.showAndWait();
            }
        } else {
            a.setHorasModulos(a.getHorasModulos() - 100);
        }
    }

    @FXML
    protected void onBdCheck() {
        //anhade las horas correspondientes al total de horas
        if (bdCheckBox.isSelected()) {
            a.setHorasModulos(a.getHorasModulos() + 100);
            if (!a.comprobarHoras()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Se ha superado el límite de horas en la selección de módulos");
                alert.setHeaderText(null);
                alert.setContentText("El máximo de horas totales es 300, los módulos seleccionados no deben exceder esta cantidad de horas.");

                alert.showAndWait();
            }
        } else {
            a.setHorasModulos(a.getHorasModulos() - 100);
        }
    }

    @FXML
    protected void onProgCheck() {
        //anhade las horas correspondientes al total de horas
        if (progCheckBox.isSelected()) {
            a.setHorasModulos(a.getHorasModulos() + 100);
            if (!a.comprobarHoras()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Se ha superado el límite de horas en la selección de módulos");
                alert.setHeaderText(null);
                alert.setContentText("El máximo de horas totales es 300, los módulos seleccionados no deben exceder esta cantidad de horas.");

                alert.showAndWait();
            }
        } else {
            a.setHorasModulos(a.getHorasModulos() - 100);
        }
    }

    @FXML
    protected void onPmCheck() {
        //anhade las horas correspondientes al total de horas
        if (pmCheckBox.isSelected()) {
            a.setHorasModulos(a.getHorasModulos() + 100);
            if (!a.comprobarHoras()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Se ha superado el límite de horas en la selección de módulos");
                alert.setHeaderText(null);
                alert.setContentText("El máximo de horas totales es 300, los módulos seleccionados no deben exceder esta cantidad de horas.");

                alert.showAndWait();
            }
        } else {
            a.setHorasModulos(a.getHorasModulos() - 100);
        }
    }
}