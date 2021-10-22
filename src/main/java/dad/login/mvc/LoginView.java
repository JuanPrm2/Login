package dad.login.mvc;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

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
		

		GridPane interfaz= new GridPane();
		interfaz.addRow(0,usuarioLabel,usuarioTextField);
		interfaz.addRow(1,contraseniaLabel,contraseniaPasswordField);
		interfaz.addRow(2,usarCheckBox,usarLabel);
		interfaz.addRow(3,acceder,cancelar);
		interfaz.setAlignment(Pos.CENTER);
		
		
	}

	public TextField getUsuarioTextField() {
		return usuarioTextField;
	}

	public Label getUsuarioLabel() {
		return usuarioLabel;
	}

	public Label getContraseniaLabel() {
		return contraseniaLabel;
	}

	public Label getUsarLabel() {
		return usarLabel;
	}
// posible error
	public CheckBox getUsarCheckBox() {
		return usarCheckBox;
	}

	public PasswordField getContraseniaPasswordField() {
		return contraseniaPasswordField;
	}

	public Button getAcceder() {
		return acceder;
	}

	public Button getCancelar() {
		return cancelar;
	}
}
