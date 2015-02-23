package controleur;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;

public class Ctr implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	@FXML
	private Button dem;
	
	public void test(ActionEvent event){
		System.out.println("ok");
		

	}
	@FXML
	private ComboBox menu;
	public void climenu(ActionEvent event){
		System.out.println("menu bok");
		//String str=menu.getcon
	//System.out.println("  ..  "+str);
	}
}
