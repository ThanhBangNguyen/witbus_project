package com.witbus.demo;

import com.witbus.demo.dto.MailObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import java.net.PasswordAuthentication;
import java.util.Date;
import java.util.Properties;

@SpringBootApplication
@RestController
public class WitBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(WitBusApplication.class, args);

    }

}
