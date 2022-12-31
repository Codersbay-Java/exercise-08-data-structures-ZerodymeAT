package com.codersbay.part1;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class PhoneBook {
    private ArrayList<Person> contacts = new ArrayList<>();

    public int addContact(Person contact) {
        contacts.add(contact);
        return contacts.size()-1;
    }
    public String getNumberfromIndex(int index) {
        return contacts.get(index).getCellnumber();
    }
    public Person deleteContact(int i) {
        return contacts.remove(i);
    }
    public void updateContact(int i, Person update) {
        contacts.set(i,update);
    }
    public String getContact(int i) {
        String outputGetContact = "[" + Integer.toString(i) + "] " + contacts.get(i);
        return outputGetContact;
    }

    public int size() {
        return contacts.size();
    }
    public void phoneBookSearch(PhoneBook phoneBook, int i) {
        String choicesSearch = ("N - Nächstes Telefonbuchelement" +"\n"+ "P - Vorheriges Telefonbuchelement" +"\n"+ "X - Um das Blätter zu beenden");
        System.out.println(choicesSearch);
        int phoneBookSize = contacts.size()-1;
        char choise = userInputScanner();
        if (choise == 'N'){
            if (i == phoneBookSize){
                System.out.println("Letzen Konktakt im Telefonbuch");
                System.out.println(getContact(i));
                phoneBookSearch(phoneBook, i);
            } else {
                i++;
                System.out.println(getContact(i));
                phoneBookSearch(phoneBook, i);}
        } else if (choise == 'P') {
            if (i < 0){
                System.out.println("Erster Kontakt im Telefonbuch");
                System.out.println(getContact(0));
                i = 0;
                phoneBookSearch(phoneBook, i);
            } else {
                i--;
                System.out.println(getContact(i));
                phoneBookSearch(phoneBook, i);
            }
        } else if (choise == 'X') {
            Menu.messages(phoneBook);
        } else {
            System.out.println("Error - eingegebener Wert falsch");
            phoneBookSearch(phoneBook, i);
        }


    }
    private char userInputScanner(){
        Scanner scanner = new Scanner(System.in);
        char userCharInput = toUpperCase(scanner.next().charAt(0));
        return userCharInput;
    }
    @Override
    public String toString(){
        String output = "";
        for (int i = 0; i < contacts.size(); i++) {
            output += "[" + Integer.toString(i) + "] " + contacts.get(i) + "\n";
        }
        return output;
    }

}
