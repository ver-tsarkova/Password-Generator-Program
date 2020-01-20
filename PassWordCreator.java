import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * PassWordCreator --- GUI application that displays a password based on user input into 2 TextFields
 * @author Veronica Tsarkova
 * @since 10/02/18

 * Write a GUI application PassWordCreator.java that displays a password based on user input into 2 TextFields
 * (user's first name and birth date.) Input comes from the user entering a name into the first TextField (followed by enter)
 * and a 6-digit date into the second TextField(followed by enter.) The password is generated according to the following algorithm:
 *
 * first 2 letters of name
 * plus a period
 * plus a 1-2 digit positive random number
 * plus last 4 digits of date
*/

public class PassWordCreator extends Application
{

    // The start method launches the password creator application.
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(new PassWordPane(), 550, 300);

        primaryStage.setTitle("Password Creator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // The main method is used to call the launch method of the Application class. The launch method calls the start method.
    public static void main(String[] args)
    {
        launch(args);
    }
}
