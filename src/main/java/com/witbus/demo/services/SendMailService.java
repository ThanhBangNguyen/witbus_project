package com.witbus.demo.services;


import com.witbus.demo.dto.MailObject;
import org.springframework.mail.SimpleMailMessage;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.io.IOException;

public interface SendMailService {
    void sendSimpleMessage(MailObject mailObject)  throws AddressException, MessagingException, IOException;

}