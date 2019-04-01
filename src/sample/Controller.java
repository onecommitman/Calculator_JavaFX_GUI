package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textField1;

    public void btn1Action(ActionEvent actionEvent) {
        textField1.setText("1");
    }

    public void btn2Action(ActionEvent actionEvent) {
    }

    public void btn3Action(ActionEvent actionEvent) {
    }

    public void btnPlusAction(ActionEvent actionEvent) {
    }
}
