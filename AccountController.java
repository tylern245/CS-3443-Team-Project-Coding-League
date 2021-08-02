package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class AccountController 
{
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	private HashMap<String, String> hMap = new HashMap<String, String>();
	
	@FXML
	private TextField username2;
	
	@FXML
	private PasswordField password2;
	
	@FXML
	public void handle2(ActionEvent event) throws IOException {
		String x = username2.getText();
		String y = password2.getText();
		
		// Tyler was here :D
		hMap.put(x, y);
		System.out.println(hMap);
		
		// Tyler was here :D
//		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
	
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
		Parent root = loader.load();
		LoginController loginController = loader.getController();
		loginController.sendToLogin(x, y);
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root,600,400);
		stage.setScene(scene);
		
		stage.show();
    }
	
	
	@FXML
	public void switchToScene1(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root,600,400);
		
		stage.setScene(scene);
		stage.show();
	}
}
