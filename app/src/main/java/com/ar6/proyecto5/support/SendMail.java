package com.ar6.proyecto5.support;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail extends AsyncTask<Void,Void,Void> {

    // Definicion de las variables que se emparejaran con los objetos de la vista
    private String varV4tiaddress;
    private String varV4tisubject;
    private String varV4timesage;
    private String varV4tisuaddress;
    private String varV4tisupassword;
    private Context varContext;
    private Session varSession;

    //Progressdialog to show while sending email
    private ProgressDialog progressDialog;

    public SendMail(Context varContext, String varV4tiaddress, String varV4tisubject, String varV4timesage, String varV4tisuaddress, String varV4tisupassword) {
        this.varV4tiaddress = varV4tiaddress;
        this.varV4tisubject = varV4tisubject;
        this.varV4timesage = varV4timesage;
        this.varV4tisuaddress = varV4tisuaddress;
        this.varV4tisupassword = varV4tisupassword;
        this.varContext = varContext;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog = ProgressDialog.show(varContext,"Sending message","Please wait...",false,false);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        //Dismissing the progress dialog
        progressDialog.dismiss();
        //Showing a success message
        Toast.makeText(varContext,"Message Sent",Toast.LENGTH_LONG).show();
    }

    @Override
    protected Void doInBackground(Void... params) {

        Properties varProperties = new Properties();
        //varProperties.put("mail.smtp.auth","true");
        ///varProperties.put("mail.smtp.starttls.enable","true");
        //varProperties.put("mail.smtp.host","smtp.gmail.com");
        //varProperties.put("mail.smtp.port","587");

        varProperties.put("mail.smtp.host", "smtp.gmail.com");
        varProperties.put("mail.smtp.socketFactory.port", "465");
        varProperties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        varProperties.put("mail.smtp.auth", "true");
        varProperties.put("mail.smtp.port", "465");

        Session varSession = Session.getInstance(varProperties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(varV4tisuaddress,varV4tisupassword);
            }
        });

        try {
            if(varSession != null){
                MimeMessage varMessage = new MimeMessage(varSession);
                varMessage.setFrom(new InternetAddress(varV4tisuaddress));
                varMessage.addRecipient(Message.RecipientType.TO,new InternetAddress(varV4tiaddress));
                varMessage.setSubject(varV4tisubject);
                varMessage.setText(varV4timesage);

                Transport.send(varMessage);
            }
        }
        catch (Exception e){
            e.printStackTrace();
            //Toast.makeText(varContext,e.getMessage(),Toast.LENGTH_LONG).show();
        }

        return null;

    }

}
