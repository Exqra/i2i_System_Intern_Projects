package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MainController {
	
	@FXML
	private Text first_name_label;
	@FXML
	private Text last_name_label;
	@FXML
	private Text university_label;
	@FXML
	private Text department_label;
	@FXML
	private Text class_label;
	@FXML
	private Text city_label;
	
	
	@FXML
	private TextArea first_name_in;
	@FXML
	private TextArea last_name_in;
	@FXML
	private TextArea university_in;
	@FXML
	private TextArea department_in;
	@FXML
	private TextArea class_in;
	@FXML
	private TextArea city_in;
	
	@FXML
	private Button button;
	
	public void add(ActionEvent event){
		
		try
		{
			
		String insertIntern = "INSERT INTO JAVA_TABLE VALUES ('" + first_name_in.getText() + "', '"
				+ last_name_in.getText() + "', '"
				+ university_in.getText() + "', '"
				+ department_in.getText() + "', "
				+ class_in.getText() + ", '"
				+ city_in.getText() + "')";


		Connection conn = getConnection();
		PreparedStatement preparedStatement = conn.prepareStatement(insertIntern);
		
		preparedStatement.executeUpdate();
		System.out.println("Update successful.");
		}
		catch(SQLException ex)
		{
			System.out.println("Update failed.");
			ex.printStackTrace();
		}
		
		
		
	}

	private Connection getConnection() throws SQLException{
		// TODO Auto-generated method stub
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		Connection conn = DriverManager.getConnection( "jdbc:oracle:thin:@192.168.99.100:4911:", "SYSTEM", "oracle"); 
		return conn;
	}
	
	
}
