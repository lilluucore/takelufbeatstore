package com.takeluf.model;

public class ContactForm {
    private String name;
    private String surname;
    private String phone;
    private String telegram;

    // Конструкторы, геттеры и сеттеры

    public ContactForm(String name, String surname, String phone, String telegram) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.telegram = telegram;
    }

    // Геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    @Override
    public String toString() {
        return "ContactForm{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", telegram='" + telegram + '\'' +
                '}';
    }
}
