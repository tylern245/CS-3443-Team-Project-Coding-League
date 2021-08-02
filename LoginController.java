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


public class LoginController implements EventHandler<ActionEvent>{
	
	private Stage stage;
	private Scene scene;
	private Parent root;

	private HashMap<String, String> hMap = new HashMap<String, String>();
	
	@FXML
	private Button button1;
	
	@FXML
	private Button button2;
	
	@FXML
	private TextField username1;
	
	@FXML
	private TextField username2;
	
	@FXML
	private PasswordField password1;
	
	@FXML
	private PasswordField password2;
	
	@FXML
	private Label wrongLogIn;
	
	@Override
	public void handle(ActionEvent event) {
		String q = username1.getText();
		String w = password1.getText();

		//System.out.println(hMap.containsKey(q));
		if(!hMap.containsKey(q) || !hMap.containsValue(w)) {
			wrongLogIn.setText("Wrong username or password.");
		}
	}
	
	// moved to AccountController.java
	/*
	@FXML
	public void handle2(ActionEvent event) throws IOException {
		String x = username2.getText();
		String y = password2.getText();
		
		// Tyler was here :D
//		hMap.put(x, y);
//		System.out.println(hMap);
		
		student.addUserLogin(x, y);
		
		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root,600,400);
	
		stage.setScene(scene);
		stage.show();
    }
    */
	
	// moved to AccountController.java
	/*
	@FXML
	public void switchToScene1(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root,600,400);
		
		stage.setScene(scene);
		stage.show();
	}
	*/
	
	@FXML
	public void switchToScene2(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("Account.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root,600,400);
		
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void printHashMap()
	{
		System.out.println(hMap);
	}
	
	public void sendToLogin(String user, String pass)
	{
		hMap.put(user, pass);
	}
	
	
		
}
