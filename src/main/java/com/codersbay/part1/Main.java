package com.codersbay.part1;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = Datensatz.telefonregister();
        Menu.messages(phoneBook);
    }
}
