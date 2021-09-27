import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxPrueba extends Application{
	public void start(Stage stage) throws IOException{
		HBox raiz = new HBox();
	    raiz.setSpacing(10);
	    HBox caja1= new HBox();
	    HBox caja2= new HBox();
	    Button boton1=new Button("Caja1");
	    Button boton2=new Button("Caja2");
	    caja1.getChildren().add(boton1);
	    caja2.getChildren().add(boton2);
	    raiz.getChildren().addAll(caja1,caja2);
	    Scene scene = new Scene(raiz, 320, 240);
	    stage.setTitle("PruebaHBox");
	    stage.setScene(scene);
	    stage.show();
	}

	 public static void main(String[] args) {
	        launch(args);
	    }
}
