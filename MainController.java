package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController implements Initializable {
	
	@FXML
	Button Enter;
	
	@FXML
	Button Done;
	
	@FXML
	TextField textField;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	

	ArrayList<String> studCourses = new ArrayList<>();
	
	public void enterCourse(ActionEvent event) {
		String newCourse = textField.getText();
		studCourses.add(newCourse);
		textField.setText("");
	}
	
	public void handle(ActionEvent event) {
		// Tyler was here :D
//		AnchorPane root;
		try 
		{
			FXMLLoader loader = new FXMLLoader(getClass().getResource("part2.fxml"));
			Parent root = loader.load();
			Part2Controller controller = loader.getController();
			controller.showInformation(0, studCourses.get(0));
			
			
			
			for(int i = 0; i < studCourses.size(); i++) 
			{
				// Tyler was here
//				controller.showInformation(0, studCourses.get(0));
				controller.showInformation(i, studCourses.get(i));
			}
			
			// Tyler was here :D
//			root = (AnchorPane)FXMLLoader.load(getClass().getResource("part2.fxml"));
//			Stage window = (Stage) Done.getScene().getWindow();
//			window.setScene(new Scene(root, 750, 500));
			
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.setTitle("Scene 2 window");
			stage.show();
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		

	}

	
	
}
