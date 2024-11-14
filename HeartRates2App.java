// Main application class that loads and displays the GUI
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Change the class name
public class HeartRates2App extends Application {
   @Override
   public void start(Stage stage) throws Exception {
      Parent root = 
         FXMLLoader.load(getClass().getResource("HeartRates2App.fxml")); //Change the .fxml file

      Scene scene = new Scene(root); // attach scene graph to scene
      stage.setTitle("Heart Rates App"); // Change the Title Bar
      stage.setScene(scene); // attach scene to stage
      stage.show(); // display the stage
   }

   public static void main(String[] args) {
      // create an object and call its start method
      launch(args); 
   }
}
