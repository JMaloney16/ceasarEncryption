package mainpak;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;

import static mainpak.encDec.*;;

public class Controller {
    @FXML
    Button browse;
    @FXML
    Button newBrowse;
    @FXML
    Button encrypt;
    @FXML
    Button decrypt;
    @FXML
    TextField filepath;
    @FXML
    TextField newfile;
    @FXML
    TextField offset;

    encDec encClass;


    public File selectFile(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        File file = fileChooser.showOpenDialog(null);
        System.out.println("FILE CHOSEN: " + file);
        return file;
    }

    public void openFile() {
        filepath.setText(selectFile().toString());
    }
    public void openNewFile(){
        newfile.setText(selectFile().toString());
    }

    public void encryption(){
        int intOffset = (Integer.parseInt(offset.getText()));
        System.out.println(intOffset);

    }

}
