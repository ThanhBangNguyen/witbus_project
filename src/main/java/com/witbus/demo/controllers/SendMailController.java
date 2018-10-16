package com.witbus.demo.controllers;

import com.witbus.demo.dto.MailObject;
import com.witbus.demo.services.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;


@RestController
public class SendMailController {
    @Autowired
    private  SendMailService sendMailService;
    @RequestMapping(value="/send", method=RequestMethod.POST)
    public String sendEmail(@RequestBody MailObject mailObject) throws AddressException, MessagingException, IOException {
        sendMailService.sendSimpleMessage(mailObject);
        return "Email sent successfully";
    }



}
