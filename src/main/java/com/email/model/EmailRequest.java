package com.email.model;

public class EmailRequest {
    private  String to;
    private  String subject;
    private  String message;

    public EmailRequest(String to, String subject, String message) {
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    public EmailRequest() {
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "EmailRequest{" +
                "to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
