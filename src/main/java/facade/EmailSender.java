package facade;

import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {

    private EmailSettings emailSettings;

    public EmailSender(EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
    }

    public void sendEmail(EmailMessage message) {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", emailSettings.getHost());

        Session defaultInstance = Session.getDefaultInstance(properties);

        try {

            MimeMessage mimeMessage = new MimeMessage(defaultInstance);
            mimeMessage.setFrom(new InternetAddress(message.getFrom()));
            mimeMessage.addRecipient(
                    Message.RecipientType.TO, new InternetAddress(message.getTo()));
            mimeMessage.setSubject(message.getSubject());
            mimeMessage.setText(message.getText());

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
