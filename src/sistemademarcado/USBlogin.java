package sistemademarcado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 * @author John Granados
 */
public class USBlogin {

    public void usblogin() {

        String s[] = new String[7];
        String line = null;
        String[] array = {"A86B-A918", "207D-46AA","4C52-6F65"};
        String[] DriveLetters = {"D", "E", "F", "G", "H", "I", "J"};
        boolean comprobar = false;

        for (int i = 0; i < DriveLetters.length; i++) {

            try {
                Process p = Runtime.getRuntime().exec("cmd /C vol " + DriveLetters[i] + ":");
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(p.getInputStream()));

                while ((line = in.readLine()) != null) {
                    s[i] = line;
                }
                p.destroy();

            } catch (IOException e) {
                e.printStackTrace();
            }

            s[i] = s[i].replace("Volume Serial Number is ", "");
            s[i] = s[i].trim();

        }

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (s[i].equals(array[j])) {
                    //new Login().setVisible(true);
                    comprobar = true;
                } 
                
                if (comprobar == true) {
                    new Login().setVisible(true);
                    break;
                }

            }
        }
        
         if (comprobar == true) {
            new Login().setVisible(true);
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Usb Key no válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
       
    }
}
