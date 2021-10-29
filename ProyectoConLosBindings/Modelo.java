package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Modelo {
	private DoubleProperty precio;
	private StringProperty producto;
	
	public Modelo(Double precio,String producto) {
		this.precio=new SimpleDoubleProperty(precio);
		this.producto=new SimpleStringProperty(producto);
	}
	
	public String getProducto() {
		return producto.get();
	}
	
	public Double getPrecio() {
		return precio.get();
	}
	
	public void setPrecio(Double precio) {
		this.precio.set(precio);
	}
	
	public void setProducto(String producto) {
		this.producto.set(producto);
	}
	
	public DoubleProperty precioDoubleProperty() {
		return precio;
	}
	
	public StringProperty productoStringProperty() {
		return producto;
	}
	
	
}
