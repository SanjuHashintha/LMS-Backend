package com.example.springsecuritymongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.ArrayList;

@Service
public class EmailClientService {

    @Autowired
    private JavaMailSender mailSender;
    public void sendSimpleEmail(String toEmail,
                                String body,
                                String subject){
        SimpleMailMessage message = new SimpleMailMessage();
        try{
            ArrayList<String> array = new ArrayList();
            array.add("shehani.9716@gmail.com");
            array.add("lasitheranga1@gmail.com");
            array.add("sanjuhashintha@gmail.com");
            message.setFrom("lms2022.spring@gmail.com");


            String[] ar = array.toArray(new String[array.size()]);  //2

            message.setTo(ar);
            message.setText(body);
            message.setSubject(subject);

            mailSender.send(message);
            System.out.println("mail send...");
        }catch (Exception e){
            System.out.println("error" + e.getMessage());
        }
    }

        public void sendEmailWithAttachments(String toMail,
                                         String body,
                                         String subject,
                                         String attachment){
        try{
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

            mimeMessageHelper.setFrom("lms2022.spring.gmail.com");
            mimeMessageHelper.setTo(toMail);
            mimeMessageHelper.setText(body);
            mimeMessageHelper.setSubject(subject);

            //add the attachments.
            FileSystemResource fileSystem = new FileSystemResource(new File(attachment));
            mimeMessageHelper.addAttachment(fileSystem.getFilename(), fileSystem);

            mailSender.send(mimeMessage);
            System.out.println("mail send with attachment...");
        }catch(Exception e){
            System.out.println("error : "+ e.getMessage());
        }
    }
}
