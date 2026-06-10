package com.example.practica1jfxkmendoza;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private ComboBox<String> Rol;

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
}
