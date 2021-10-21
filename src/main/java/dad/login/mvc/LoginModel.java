package dad.login.mvc;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginModel {

	private StringProperty usuario= new SimpleStringProperty();
	private StringProperty contraseña= new SimpleStringProperty();
	
	public LoginModel() {
		
		
	}

	public StringProperty getUsuario() {
		return usuario;
	}

	public void setUsuario(StringProperty usuario) {
		this.usuario = usuario;
	}

	public StringProperty getContraseña() {
		return contraseña;
	}

	public void setContraseña(StringProperty contraseña) {
		this.contraseña = contraseña;
	}
	
}
