import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import java.util.Random;

/**
 * PassWordPane.java
 * @author Veronica Tsarkova
 * @since 10/02/18
 * Demonstrates the use of a TextField and a GridPane.
*/

public class PassWordPane extends GridPane
{
    private Label titleLabel, nameLabel, dateLabel, password;
    private TextField name, date;

    /**
     * Sets up a GUI containing 4 labels and 2 text fields for the user to
     * enter their name and 6-digit number. Based on the information entered,
     * the program creates a password for the user.
    */
    public PassWordPane()
    {
        Font font = new Font(18);

        Label titleLabel = new Label("Tsarkova's Password Creator");
        titleLabel.setFont(font);

        Label nameLabel = new Label("Your Name:");
        nameLabel.setFont(font);
        GridPane.setHalignment(nameLabel, HPos.RIGHT);

        Label dateLabel = new Label("6-digit Date:");
        dateLabel.setFont(font);
        GridPane.setHalignment(dateLabel, HPos.RIGHT);

        password = new Label("   ");
        password.setFont(font);
        GridPane.setHalignment(password, HPos.CENTER);

        name = new TextField();
        name.setFont(font);
        name.setPrefColumnCount(10);
        name.setAlignment(Pos.CENTER);
        name.setOnAction(this::processReturn1);

        date = new TextField();
        date.setFont(font);
        date.setPrefColumnCount(10);
        date.setAlignment(Pos.CENTER);
        date.setOnAction(this::processReturn2);

        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: yellow");

        add(titleLabel, 0, 0);
        add(nameLabel, 0, 1);
        add(name, 1, 1);
        add(dateLabel, 0, 2);
        add(date, 1, 2);
        add(password, 0, 3);
    }

    /**
     * No action happens when the user presses the return key while
     * in the text field. The user must enter the 6-digit number in
     * order for the program to generate his/her password.
    */
    public void processReturn1(ActionEvent event)
    {

    }

    /**
     * Generates and displays the password based on the data entered (name and 6-digit number)
     * when the user presses the return key while in the text field. The program creates the
     * password according to the following algorithm:
     *
     * 1. firts two letters of the name
     * 2. plus a period
     * 3. plus a 1-2 digit positive random number
     * 4. plus last 4 digits of date
    */
    public void processReturn2(ActionEvent event)
    {
        String firstName = (name.getText());
        String firstTwo = firstName.substring(0,2);
        Random generator = new Random();
        int birthDate = Integer.parseInt(date.getText());
        int randomNumber = generator.nextInt(100) + 1;
        int lastFourDigits = birthDate % 10000;

        password.setText(firstTwo + "." + randomNumber + lastFourDigits);
     }
}
