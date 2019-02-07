package com.wizaripost.ltime.mail;

import javax.mail.Authenticator;

public interface IAuthenticatorProvider {

    Authenticator getAuthenticator();
}
