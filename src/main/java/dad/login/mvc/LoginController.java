package dad.login.mvc;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

	private LoginModel model= new LoginModel();
	private LoginView view= new LoginView();
	
	
	public LoginController(){
		
	view.getUsuarioTextField().textProperty().bindBidirectional(model.usuarioProperty());
	view.getContraseniaPasswordField().textProperty().bindBidirectional(model.contraseniaProperty());
	view.getUsarCheckBox().selectedProperty().bindBidirectional(model.chechBoxProperty());
	
	view.getAcceder().setOnAction(e->accederButtonAction(e));
	view.getCancelar().setOnAction(e->cancelarButtonAction (e));
	
	}
	private void accederButtonAction(ActionEvent e)  {
		AuthService auth= model.getChechBox()? new LdapAuthService():new FileAuthService();
		try {
			;
			if (auth.login(model.getUsuario(), model.getContrasenia())) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Login");
				alert.setHeaderText("Acceso permitido");
				alert.setContentText("Las credenciales de acceso son permitidas");
				alert.showAndWait();
				Platform.exit();
			}else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Login");
				alert.setHeaderText("Acceso denegado");
				alert.setContentText("El usuario y/o la contraseña no son validos");
				alert.showAndWait();
				model.setContrasenia("");
				model.setUsuario("");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}
	private void cancelarButtonAction(ActionEvent e) {
		Platform.exit();
	}

	public LoginModel getModel() {
		return model;
	}


	public LoginView getView() {
		return view;
	}
}
