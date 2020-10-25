package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.MalformedURLException;

public class Controller {
    public ImageView Kartinki;
    public TextField Bykva;
    public Button buttonOk;
    public Label Slovo;
    public int Oshbki=0;

    public void OtvetOkClicked(ActionEvent otvetok){
        String Bariant = Bykva.getText();
        String Slova = Slovo.getText();
    }

    public boolean Proverka(String Barianti,String Slova){
        boolean daiklinet;

        char[] rob = Slova.toCharArray();
        char[] Variant = Barianti.toCharArray();
        for(int a=0;a<189819;a++)
        {
            while (rob[a]==Variant[0]){
             daiklinet=true;
             break;
            }
        }
        daiklinet=false;
        if(daiklinet==false)
        {
            File txt = new File("C:\\Users\\Ученик\\Desktop\\Картинки\\"+Oshbki+".jpg");
            Image kart = null;
            try {
                kart = new Image(txt.toURI().toURL().toString());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            Kartinki.setImage(kart);
            }
        return daiklinet;
    }

}
