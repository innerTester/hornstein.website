package email.resource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

public class Sender {
	
	public static void sendMail(Session rotem,String sendTo) throws MessagingException, FileNotFoundException, IOException, GeneralSecurityException	{
		System.setProperty("mail.mime.base64.ignoreerrors", "true");
		Properties props = new Properties();
		String finalUrlContent = null;
		
		
		
		Session session = rotem;
		
		
		
		MailSSLSocketFactory sf= new MailSSLSocketFactory();
		sf.setTrustAllHosts(true); 
		
				
		
		String myEmail = "info@hornstein.website";
		
		
		
		
		
		
		 MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(myEmail));

         // Set To: header field of the header.
         message.addRecipients(Message.RecipientType.CC, 
                 InternetAddress.parse(sendTo));
         String msg ="What are you waiting for my nigga shigga welcome to our website";
         message.setContent(msg, "text/html; charset=utf-8");
         message.setSubject("NewTube - Music Chrome Extension");
 		
 		 Transport.send(message);
 		 System.out.println("Mail Sent");
         
         
         

      
         System.out.println("Sent message successfully....");
	}
{};

public static Session authorizeWebShopEmail() throws MessagingException {
    Session session = null;
    final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
    Properties props = System.getProperties();
    props.setProperty("mail.smtp.host", "server247.web-hosting.com");
    props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
    props.setProperty("mail.smtp.socketFactory.fallback", "false");
    props.setProperty("mail.smtp.port", "465");
    props.setProperty("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.auth", "true");
    props.put("mail.debug", "true");
    props.put("mail.store.protocol", "smtp");
    props.put("mail.transport.protocol", "smtp");
    final String username = "info@hornstein.website";
    final String password = "04510451q";
    session = Session.getDefaultInstance(props, new Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
        }
    });
    return session;
}

}
