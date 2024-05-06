package co.edu.uniquindio.poo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class MensajeController {

    @FXML
    private Label mensajeLabel;

    public void setMensaje(String mensaje) {
        mensajeLabel.setText(mensaje);
    }
}

