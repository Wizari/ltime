package com.wizaripost.ltime.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class AuthenticatorProviderFromMemory implements IAuthenticatorProvider {

    private String pas = "";
    @Override
    public Authenticator getAuthenticator() {
        if (pas == "") {
            System.out.println("Введите пароль своей почты");
        }

        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("give4me2pain@gmail.com", pas);
            }
        };
        return auth;
    }
}
