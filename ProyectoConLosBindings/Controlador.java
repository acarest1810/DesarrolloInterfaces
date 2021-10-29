package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class Controlador {
	@FXML
	private TextField nProducto;
	@FXML
	private TextField precioVenta;
	@FXML
	private Button boton;
	@FXML
	private Button suma;
	@FXML
	private Label datoFinal;
	@FXML
	private Label productoFinal;
	
	Modelo datos;
	
	public void initialize() {
		datos=new Modelo(0.0,"");
		datoFinal.textProperty().bind(datos.precioDoubleProperty().asString());
		precioVenta.setText("0");
		productoFinal.textProperty().bindBidirectional(datos.productoStringProperty());
		productoFinal.textProperty().bind(nProducto.textProperty());
		datos.precioDoubleProperty().addListener((obervable,valorAntiguo,valorNuevo) ->{
			if(valorNuevo.doubleValue()<0) {
				datoFinal.setStyle("-fx-text-fill:red");
			}
		});
	}
	@FXML
	public void pulsacion(ActionEvent event) {
		if(event.getSource()==boton) {
			System.out.println(nProducto.getText()+" "+precioVenta.getText());
			datos.setPrecio(Double.valueOf(precioVenta.getText()));
		}
	}

}
