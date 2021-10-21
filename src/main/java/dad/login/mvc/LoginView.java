package dad.login.mvc;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginView {

	private TextField usuarioTextField;
	private Label usuarioLabel,contraseniaLabel,usarLabel;
	private CheckBox usarCheckBox;
	private PasswordField contraseniaPasswordField;
	private Button acceder,cancelar;
	
	public LoginView() {
		super();
		

		usuarioTextField=new TextField();
		contraseniaPasswordField= new PasswordField();
		
		usuarioLabel=new Label();
		contraseniaLabel=new Label();
		usarLabel=new Label();
		usarCheckBox= new CheckBox();
		acceder=new Button();
		cancelar= new Button();
		
	}
}
