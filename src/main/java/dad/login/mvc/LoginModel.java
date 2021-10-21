package dad.login.mvc;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginModel {

	private StringProperty usuario= new SimpleStringProperty();
	private StringProperty contraseña= new SimpleStringProperty();
	private StringProperty chechBox= new SimpleStringProperty();
	public LoginModel() {
		
		
	}
	public final StringProperty usuarioProperty() {
		return this.usuario;
	}
	
	public final String getUsuario() {
		return this.usuarioProperty().get();
	}
	
	
	
	public final StringProperty contraseñaProperty() {
		return this.contraseña;
	}
	
	public final String getContraseña() {
		return this.contraseñaProperty().get();
	}
	
	
	public final StringProperty chechBoxProperty() {
		return this.chechBox;
	}
	
	public final String getChechBox() {
		return this.chechBoxProperty().get();
	}
	
	

	
	
}
