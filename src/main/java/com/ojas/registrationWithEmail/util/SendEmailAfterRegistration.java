package com.ojas.registrationWithEmail.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.ojas.registrationWithEmail.model.UserRegistration;

@Component
public class SendEmailAfterRegistration {
	@Autowired
	private JavaMailSender javaMailSender;

	public void sendmail(UserRegistration userRegistration) throws MessagingException {
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);

		helper.setTo(userRegistration.getUseremail());
		helper.setSubject("User Registration");
		helper.setText("User successfully registered\n" + " FirstName:" + userRegistration.getFirstname()
				+ "\nLastname:" + userRegistration.getLastname() + "\nRole:" + userRegistration.getUserrole());

		javaMailSender.send(message);

	}

}
