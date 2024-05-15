package co.edu.uniquindio.poo;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUI extends Application {
    public void start (Stage miStage) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Diseño.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        miStage.setScene(scene);
        miStage.setTitle("CREAR CUENTA BANCARIA");
        GUIController  controller = loader.getController(); //Controlador- sirve como comunicacion, tiene toda la informacion 
        controller.setStage(miStage);
        miStage.show();
    }
}

    
