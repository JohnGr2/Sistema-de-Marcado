/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemademarcado;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Expression autor is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class EmailSender {
    
    public static boolean sendmail(String from, String password, String message, String to[]){
        
        String host = "smtp.gmail.com";
        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host",host);
        props.put("mail.smtp.user",from);
        props.put("mail.smtp.password",password);
        props.put("mail.smtp.port", 25);
        props.put("mail.smtp.auth","true");
        
        Session session = Session.getDefaultInstance(props, null);
        MimeMessage mimeMessage = new MimeMessage(session);
        try {
            mimeMessage.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];
            
            for (int i = 0; i < to.length; i++) {
                
                toAddress[i] = new InternetAddress(to[i]);
                
            }
            
            for (int i = 0; i < toAddress.length; i++) {
                
                mimeMessage.addRecipient(RecipientType.TO, toAddress[i]);
            
                
            }
            
            mimeMessage.setSubject("Contraseña de Sistema de Marcado");
            mimeMessage.setText(message);
            
            Transport transport = session.getTransport("smtp");
            transport.connect(host,from,password);
            transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
            transport.close();
            return true;
        } catch (MessagingException ex) {
            Logger.getLogger(EmailSender.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
