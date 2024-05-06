package co.edu.uniquindio.poo;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GUIController{
    private Stage stage;
    private CuentaBancaria cuentaBancaria;
    
    @FXML
    private TextField apellidosTitularField;

    @FXML
    private Button crearCuenta;

    @FXML
    private TextField nombreTitularField;

    @FXML
    private TextField numeroCuentaField;

    @FXML
    private TextField saldoInicialField;

    @FXML
    private TextField tipoCuentaField;

    @FXML
    public void crearCuenta(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Mensaje.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage1 = new Stage();
        stage1.setScene(scene);
        try {
            // Obtiene los datos ingresados en los campos de texto de la interfaz
            String nombre = nombreTitularField.getText();
            String apellidos = apellidosTitularField.getText();
            int numeroCuenta = Integer.parseInt(numeroCuentaField.getText());
            double saldoInicial = Double.parseDouble(saldoInicialField.getText());
            String tipoCuenta = tipoCuentaField.getText();
        

            // Crear titular y cuenta bancaria
            Titular titular = new Titular(nombre, apellidos); 
            switch (tipoCuenta.toLowerCase()) {
                case "corriente":
                    cuentaBancaria = new CuentaCorriente(titular, numeroCuenta, saldoInicial, true, 50000);
                    break;
                case "ahorros":
                    cuentaBancaria = new CuentaAhorros(titular, numeroCuenta, saldoInicial, true, 50000);
                    break;
                default:
                    mostrarMensajeEnVentana("Tipo de cuenta no válido.");
                    return;
            }
            mostrarMensajeEnVentana("Cuenta creada: " + cuentaBancaria.getNumeroCuenta());
        } catch (NumberFormatException e) {
            mostrarMensajeEnVentana("Los datos ingresados en el numero de cuenta y saldo inicial no son validos, por favor digite datos númericos");
        }
        
    }
    
    private void mostrarMensajeEnVentana(String mensaje) {
        try {
            // Mostrar ventana de mensaje
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mensaje.fxml"));
            Parent root = loader.load();

            // Obtener el controlador de la ventana de mensaje
            MensajeController mensajeController = loader.getController();
            mensajeController.setMensaje(mensaje);

            // Configurar y mostrar la escena en una nueva ventana
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Mensaje de Creación de Cuenta");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setStage(Stage miStage) {
        stage = miStage; 
     }
}

