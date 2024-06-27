package com.email.controller;

import com.email.model.EmailRequest;
import com.email.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class EmailController {
    @Autowired
    private EmailService emailService;
   @GetMapping("/welcome")
    public  String welcome(){
        return "Hello this is my email app";
    }
    // api to send email
    @PostMapping("/sendEmail")
    public ResponseEntity<?> sendEmail(@RequestBody EmailRequest emailRequest){
        System.out.println(emailRequest);
        boolean result = this.emailService.sendEmail(emailRequest.getSubject(), emailRequest.getMessage(), emailRequest.getTo());
        if (result){
            return  ResponseEntity.ok("emailSent Successfully");
        } else {
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email not sent!");
        }


    }
}
