package com.learn.mycart.helper;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {
	public void sendMail(String to,String name)  {
		System.out.println("Inside sendMail");
		String subject="Successfully registered";
		String message="Hey "+name+", you have been successfully registered";
		final String from="varunbyadav1196@gmail.com";
		String host="smtp.gmail.com";
		//fetch system properties
		Properties propertes = System.getProperties();
		System.out.println("Properties "+propertes);
		propertes.put("mail.smtp.host", host);
		propertes.put("mail.smtp.port", "465");
		propertes.put("mail.smtp.ssl.enable","true");
		propertes.put("mail.smtp.auth","true");
		//getting session object
		Session session=Session.getInstance(propertes, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, "V@jysb2019");
			}
		});
		session.setDebug(true);
		
		//compose the message
		MimeMessage m = new MimeMessage(session);
		try {
			m.setFrom(from);
			m.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
			m.setSubject(subject);
			m.setText(message);
			Transport.send(m);
			System.out.println("Send success");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed");
			e.printStackTrace();
		}
		
		
		//send the message
		
	}
}
