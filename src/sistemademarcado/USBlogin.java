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

        String s = "";
        String line = null;
        String[] array = {"A86B-A918"};
        String[] DriveLetters ={"E","F","G","H","I","J"};
        
        try {
            Process p = Runtime.getRuntime().exec("cmd /C vol "+DriveLetters[2]+":");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            while ((line = in.readLine()) != null) {
                s = line;
                
            }
            p.destroy();

        } catch (IOException e) {
            e.printStackTrace();
        }

        s = s.replace("Volume Serial Number is ", "");
        s = s.trim();
        System.out.println(s);

        for (int i = 0; i < array.length; i++) {

            if (s.equals(array[i])) {

                new Login().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usb Key no válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
}
