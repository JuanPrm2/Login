package dad.login;

import dad.login.mvc.LoginController;
import dad.login.mvc.LoginView;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application{

	private LoginController controller;
	private LoginView view;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller= new LoginController();
		
		Scene scene= new Scene(controller.getView(),400,320);
		
		primaryStage.setTitle("Iniciar sesion");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
