package dad.login.mvc;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginModel {

	private StringProperty usuario= new SimpleStringProperty();
	private StringProperty contrasenia= new SimpleStringProperty();
	private BooleanProperty chechBox= new SimpleBooleanProperty();
	public LoginModel() {
		
		
		
		
	}
	public final StringProperty usuarioProperty() {
		return this.usuario;
	}
	
	public final String getUsuario() {
		return this.usuarioProperty().get();
	}
	
	
	
	public final StringProperty contraseniaProperty() {
		return this.contrasenia;
	}
	
	public final String getContrasenia() {
		return this.contraseniaProperty().get();
	}
	
	
	public final BooleanProperty chechBoxProperty() {
		return this.chechBox;
	}
	
	public final boolean getChechBox() {
		return this.chechBoxProperty().get();
	}
	public void setUsuario(String usuario) {
		this.usuario.set(usuario);;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia.set(contrasenia);
	}
	
	

	
	
}
