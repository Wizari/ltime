package com.wizaripost.ltime.mail;

import javax.mail.MessagingException;

public interface IMailApi {

    void sendMail(String recipient, String subject, String content) throws MessagingException;

}
