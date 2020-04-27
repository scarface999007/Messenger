package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.util.Date;

public class Controller {

    public TextArea textArea;
    public TextField textField;

    public void sendMessage(){
        if(!textField.getText().isEmpty()){
            if(textArea.getText().isEmpty()){
                textArea.setText(String.valueOf(new Date()));
            } else {
                textArea.appendText(String.valueOf(new Date()));
            }
            textArea.appendText(": " + textField.getText() + "\n");
            textField.setText("");
        }
    }

    public void send(ActionEvent actionEvent) {
        sendMessage();
    }

    public void keyPressed(KeyEvent keyEvent) {
        if(keyEvent.getCode().getName().equals("Enter")){
            sendMessage();
        }
    }
}
