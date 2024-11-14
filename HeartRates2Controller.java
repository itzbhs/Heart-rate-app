/**
 *@author Henry Sule
 *@version May 7th 2024
 *This program will create an app that lets the user calculate some health data related to heart rates.
 */


/**
 * Sample Skeleton for 'HeartRates2App.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

//import time package to calculate age
import java.time.*;

public class HeartRates2Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="birthdayTextField"
    private TextField birthdayTextField; // Value injected by FXMLLoader

    @FXML // fx:id="ageTextField"
    private TextField ageTextField; // Value injected by FXMLLoader

    @FXML // fx:id="maxHRTextField"
    private TextField maxHRTextField; // Value injected by FXMLLoader

    @FXML // fx:id="targetHRRangeTextField"
    private TextField targetHRRangeTextField; // Value injected by FXMLLoader

    @FXML
    void calculateButton(ActionEvent event) {

	    //take input of birthday and format
        String[] parts = birthdayTextField.getText().split("/"); //break apart date using / to split
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        LocalDate dob = LocalDate.of(year, month, day);

	    //calculate current age
	    int age = Period.between(dob, LocalDate.now()).getYears();
    	ageTextField.setText(String.valueOf(age));

	    //Calculate Max HR and output
	    int maxHR = 220 - age;
    	maxHRTextField.setText(String.valueOf(maxHR));

	    //calculate target HR Range and output
	    int lower = maxHR/2; //calculate the lower bound
	    int upper = maxHR*85/100; //calculate the upper bound


	    String targetRange = lower + " - " + upper + " bpm";
    	targetHRRangeTextField.setText(targetRange);

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert birthdayTextField != null : "fx:id=\"birthdayTextField\" was not injected: check your FXML file 'HeartRates2App.fxml'.";
        assert ageTextField != null : "fx:id=\"ageTextField\" was not injected: check your FXML file 'HeartRates2App.fxml'.";
        assert maxHRTextField != null : "fx:id=\"maxHRTextField\" was not injected: check your FXML file 'HeartRates2App.fxml'.";
        assert targetHRRangeTextField != null : "fx:id=\"targetHRRangeTextField\" was not injected: check your FXML file 'HeartRates2App.fxml'.";

    }
}
