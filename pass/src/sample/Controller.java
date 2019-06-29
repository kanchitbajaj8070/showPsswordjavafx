package sample;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

import static javafx.scene.input.MouseEvent.MOUSE_PRESSED;

public class Controller implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                tf.setText(pl.getText());
              tf.setVisible(true);
              pl.setVisible(false);
                System.out.println(tf.getText());
            }
        };
        EventHandler<MouseEvent> eventHandlere = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                pl.setText(tf.getText());
                pl.setVisible(true);
                tf.setVisible(false);

                System.out.println(pl.getText());
            }
        };

       // tf.visibleProperty().bind(pc.selectedProperty());
        //pl.textProperty().bindBidirectional(tf.textProperty());//for check box  implementation
                                                                   // comment below 2 lines and uncomment these lines
        pb.addEventHandler(MouseEvent.MOUSE_PRESSED,eventHandler);//this is for button eye implementation
         pb.addEventHandler(MouseEvent.MOUSE_RELEASED,eventHandlere);

    }
    @FXML
    private PasswordField pl;

    @FXML
    private TextField tf;
    @FXML
    private Button pb;

    @FXML
    private CheckBox pc;


    public void handleCheck(ActionEvent actionEvent) {
        if(pc.isSelected()) {
            tf.setText(pl.getText());
            pl.setVisible(false);
        }
        else
        {
            pl.setVisible(true);

        }
        System.out.println(tf.getText());
        System.out.println(pl.getText());
    }

    public void handleAction(MouseEvent event) {

    }
}
