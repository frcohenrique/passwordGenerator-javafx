package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import model.entities.PasswordGenerator;

public class MainViewController implements Initializable {

	private PasswordGenerator passGenerator = new PasswordGenerator();
	
	@FXML
	private Button btGenerate;
	@FXML
	private TextField txtPassLength;
	@FXML
	private Label labelPassword;
	
	public void onBtGenerateAction() {
		labelPassword.setText("");
		int passLength = Integer.parseInt(txtPassLength.getText());
		if (passLength < 8 || passLength > 26) {
			Alerts.showAlert("ERROR! Input is too long!", null, 
					"Input is too long!\nInput a number from 8 to 26.", AlertType.ERROR);
			
		}
		else {
			PasswordGenerator.generateRandomPassword(passLength);
			labelPassword.setText(passGenerator.getPasswordResult());
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeConstraints();
	}
	
	private void initializeConstraints() {
		Constraints.setTextFieldInteger(txtPassLength);
		Constraints.setTextFieldMax(txtPassLength, 2);
	}
	
}
