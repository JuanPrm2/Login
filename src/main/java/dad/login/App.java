package dad.login;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class App extends Application{

	private TextField usuraioTextField;
	private PasswordField contraseñaPasswordField;
	private Label usuarioLabel,contraseñaLabel,usarLabel;
	private CheckBox usarCheckBox;
	private Button acceder,cancelar;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
