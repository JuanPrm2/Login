package dad.login.mvc;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class LoginView extends GridPane{

	private TextField usuarioTextField;
	private Label usuarioLabel,contraseniaLabel,usarLabel;
	private CheckBox usarCheckBox;
	private PasswordField contraseniaPasswordField;
	private Button accederButton,cancelarButton;
	
	public LoginView() {
		super();
		

		usuarioTextField=new TextField();
		contraseniaPasswordField= new PasswordField();
		
		usuarioLabel=new Label("Usuario:");
		usuarioLabel.prefWidth(80);
		contraseniaLabel=new Label("Contraseña:");
		contraseniaLabel.prefWidth(80);
		usarLabel=new Label("Usar LDAP");
		usarCheckBox= new CheckBox();
		accederButton=new Button("Acceder");
		accederButton.setDefaultButton(true);
		cancelarButton= new Button("Cancelar");
		
		HBox checkBoxHBox= new HBox (usarCheckBox,usarLabel);
		checkBoxHBox.setAlignment(Pos.CENTER);
		checkBoxHBox.setSpacing(5);
		HBox botonesHBox= new HBox (accederButton,cancelarButton);
		botonesHBox.setAlignment(Pos.CENTER);
		botonesHBox.setSpacing(5);
		


		this.addRow(0,usuarioLabel,usuarioTextField);
		this.addRow(1,contraseniaLabel,contraseniaPasswordField);
		this.addRow(2,checkBoxHBox);
		this.addRow(3,botonesHBox);
		this.setVgap(5);
		this.setColumnSpan(botonesHBox, 2);
		this.setColumnSpan(checkBoxHBox, 2);
		this.setAlignment(Pos.CENTER);
		this.setPadding(new Insets(5));
		
		
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
		return accederButton;
	}

	public Button getCancelar() {
		return cancelarButton;
	}
}
