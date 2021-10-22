package dad.login.mvc;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.event.ActionEvent;

public class LoginController {

	private LoginModel model= new LoginModel();
	private LoginView view= new LoginView();
	
	
	public LoginController(){
		
	view.getUsuarioTextField().textProperty().bindBidirectional(model.usuarioProperty());
	view.getContraseniaPasswordField().textProperty().bindBidirectional(model.contraseñaProperty());
	view.getUsarCheckBox().selectedProperty().bindBidirectional(model.chechBoxProperty());
	
	view.getAcceder().setOnAction(e->accederButtonAction(e));
	view.getCancelar().setOnAction(e->cancelarButtonAction (e));
	
	}
	private void accederButtonAction(ActionEvent e) {
		AuthService auth= model.chechBoxProperty()? new LdapAuthService():new FileAuthService();
	}
	private void cancelarButtonAction(ActionEvent e) {
		
	}

	public LoginModel getModel() {
		return model;
	}


	public LoginView getView() {
		return view;
	}
}
