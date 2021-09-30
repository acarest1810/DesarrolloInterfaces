import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ChoiceBoxPrueba extends Application{
	public void start(Stage stage) throws IOException{
		HBox raiz=new HBox();
		ChoiceBox<String> primerchoice=new ChoiceBox<String>();
		primerchoice.getItems().add("Hola");
		primerchoice.getItems().add("Adios");
		primerchoice.setValue("Hola");
		primerchoice.setOnMouseClicked(e ->{
			System.out.println("Se ha hecho click: "+e.toString());
		});
		primerchoice.setOnAction(e ->{
			System.out.println("Se ha hecho una acción: "+e.toString());
		});
		primerchoice.setOnKeyPressed(e ->{
			System.out.println("Se ha presionado una tecla: "+e.toString());
		});
		raiz.getChildren().add(primerchoice);
		Scene scene=new Scene(raiz,340,400);
		stage.setTitle("PruebaChoiceBox");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args){
		launch(args);
	}
}
