import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.application.Application;
import javafx.stage.Stage;
public class PruebaRadioButton extends Application {
	public void start(Stage stage) {
		HBox raiz=new HBox();
		ToggleGroup grupo = new ToggleGroup();
	    RadioButton botonSi = new RadioButton("Si");
	    botonSi.setToggleGroup(grupo);
	    botonSi.setSelected(true);
	    RadioButton botonNo = new RadioButton("No");
	    botonNo.setToggleGroup(grupo);
	    raiz.getChildren().addAll(botonSi,botonNo);
	    botonSi.setOnMouseClicked(e ->{
			System.out.println("Se ha hecho click: "+e.toString());
		});
	    botonNo.setOnMouseClicked(e ->{
			System.out.println("Se ha hecho click: "+e.toString());
		});
	    Scene scene=new Scene(raiz,340,400);
		stage.setTitle("PruebaChoiceBox");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
