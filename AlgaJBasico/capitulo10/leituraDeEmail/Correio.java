package com.capitulo10.leituraDeEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Correio {

    static void enviar(String para, String assunto, String msg) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
//        email.setSmtpPort(25);
        email.setSslSmtpPort("465");
        email.setAuthenticator(new DefaultAuthenticator("henemesis", "silencedpain"));
        email.setSSLOnConnect(true);
        email.setFrom("Thiago <henemesis@gmail.com>");
        email.setSubject(assunto);
        email.setMsg(msg);
        email.addTo(para);
        email.send();
        System.out.println("Foi enviado");
    }
}
