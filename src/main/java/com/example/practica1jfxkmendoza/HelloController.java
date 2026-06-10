package com.example.practica1jfxkmendoza;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {

    @FXML
    private ComboBox<String> Rol;
    @FXML
    private Button botonIngresar;
    @FXML
    private Button botonSalir;

    @FXML
    /// Aquí es donde se puede inicializar las listas o configurar los valores iniciales de las varibles
    public void initialize(){
        Rol.getItems().addAll("Administrador","Cajero");
        Rol.setValue("Administrador");
        Rol.setOnAction(e -> {
            String rolSeleccionado = Rol.getValue();
            System.out.println("Rol elegido: " + rolSeleccionado);
        });
    }
    @FXML
    private void accionIngresar() throws IOException {
        String rolSeleccionado = Rol.getValue();

        Stage stage = new Stage();
        Parent root;

        if ("Administrador".equals(rolSeleccionado)) {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/practica1jfxkmendoza/Administrador.fxml")));
            stage.setTitle("Panel Administrador");
        } else if ("Cajero".equals(rolSeleccionado)) {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/practica1jfxkmendoza/Cajero.fxml")));
            stage.setTitle("Panel Cajero");
        } else {
            return;
        }

        stage.setScene(new Scene(root));
        stage.show();

        // cerrar login
        Stage currentStage = (Stage) botonIngresar.getScene().getWindow();
        currentStage.close();

    }
    @FXML
    private void accionSalir() {
        javafx.application.Platform.exit();
    }

    public class AdministradorController {
        // Lógica futura para administrador
    }

    public class CajeroController {
        // Lógica futura para cajero
    }

}
