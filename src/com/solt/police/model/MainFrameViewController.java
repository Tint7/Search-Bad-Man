package com.solt.police.model;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainFrameViewController implements Initializable{

    @FXML
    private Label title;

    @FXML
    private StackPane stackpane;
    
    @FXML
    private HBox policedata;

    @FXML
    private HBox respondentdata;

    @FXML
    private HBox searchrespondent;

    @FXML
    private HBox mainexit;
    @FXML
    void searchrespondent(MouseEvent event) {
    	
    }
    @FXML
    void exit(MouseEvent event) {
    	Platform.exit();    	
    }

    @FXML
    void respondentview(MouseEvent event) {
    	loadView("RespondentView.fxml", "Respondent Data");
    	
    }
    @FXML
    void policedataview(MouseEvent event) {
    	
    	loadView("PoliceDataView.fxml", "Police Data");
    }
    @FXML
    void searchrespondentview(MouseEvent event) {
    	loadView("SearchRespondentView.fxml", "Searching Respondent");
    }
    public static void showview() {
    	try {
    		Parent root = FXMLLoader.load(MainFrameViewController.class.getResource("MainFrameView.fxml"));
        	Stage stage = new Stage();
        	stage.setScene(new Scene(root));
        	stage.show();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
    public void loadView(String viewname, String title) {
    	
		try {
			Parent view = FXMLLoader.load(getClass().getResource(viewname));
			stackpane.getChildren().clear();
	    	stackpane.getChildren().add(view);
	    	this.title.setText("");
	    	this.title.setText(title);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		loadView("PoliceDataView.fxml", "Police Data");
		
	}
	
}
