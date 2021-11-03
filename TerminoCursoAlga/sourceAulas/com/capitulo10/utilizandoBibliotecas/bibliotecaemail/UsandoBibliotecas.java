package com.capitulo10.utilizandoBibliotecas.bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class UsandoBibliotecas {

    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator("henemesis", "silencedpain"));
        email.setSSLOnConnect(true);
        email.setFrom("henemesis@gmail.com");
        email.setSubject("Aula sobre o uso de bib de 3º");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("henemesis@gmail.com");
        email.send();
    }
}
