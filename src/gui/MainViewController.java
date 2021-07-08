package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainViewController implements Initializable {

	@FXML
	private Button btGenerate;
	@FXML
	private TextField txtPassLenght;
	@FXML
	private Label labelPassword;
	
	public void onBtGenerateAction() {
		System.out.println("onBtGenerateAction");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeConstraints();
	}
	
	private void initializeConstraints() {
		Constraints.setTextFieldInteger(txtPassLenght);
		Constraints.setTextFieldMax(txtPassLenght, 2);
	}
	
}
