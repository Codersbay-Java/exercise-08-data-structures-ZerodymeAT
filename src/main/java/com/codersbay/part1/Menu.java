package com.codersbay.part1;

import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class Menu {
    public static void messages(PhoneBook phoneBook) {
        System.out.println("Willkommen im Telefonbuch" + "\n"
                + "Drücken sie folgende Test für:" + "\n"
                + "S - Durchsucht das Telefonbuch" + "\n"
                + "I - Um einen Eintrag im Telefonbuch zu ergänzen" + "\n"
                + "D - Um einen Eintrag im Telefonbuch zu löschen" + "\n"
                + "U - Um einen Eintrag im Telefonbuch zu aktualisieren" + "\n"
                + "A - Um das ganze Telefonbuch auszugeben" + "\n"
                + "X - Um die App zu beenden");
        Scanner menuInputScanner = new Scanner(System.in);
        char mainMenu = toUpperCase(menuInputScanner.next().charAt(0));

        if (mainMenu == 'S') {
            System.out.println("=== Blättermodus ===");
            int i = -1;
            phoneBook.phoneBookSearch(phoneBook, i);
        } else if ((mainMenu == 'I')) {
            System.out.println("=== Eintrag ins Telefonbuch ===");
            addPerson(phoneBook);
            Menu.messages(phoneBook);
        } else if (mainMenu == 'D') {
            System.out.println("=== Löschen einer Person ===");
            delPerson(phoneBook);
            Menu.messages(phoneBook);
        } else if (mainMenu == 'U') {
            System.out.println("=== Aktualisieren einer Person ===");
            updPerson(phoneBook);
            Menu.messages(phoneBook);
        } else if (mainMenu == 'A') {
            System.out.println(phoneBook);
            Menu.messages(phoneBook);
        } else if (mainMenu == 'X') {
            System.out.println("---------BYE---------");
        } else {
            System.out.println("Error - eingegebener Wert falsch");
            Menu.messages(phoneBook);
        }

    }

    private static void updPerson(PhoneBook phoneBook) {
        String updSurname;
        String updLastname;
        String updPhonenumber;
        System.out.println("Welche Person möchten sie aktualisieren? Geben sie die ID innerhalb der Klammer [ ] ein");
        System.out.println(phoneBook);
        int userID = Integer.parseInt(manipulationScanner());
        System.out.println("Möchten sie " + phoneBook.getContact(userID) + " ändern?" + "\n" + "( Y / N )");
        char updChoise = manipulationScanner().toUpperCase().charAt(0);
        if (updChoise == 'Y') {
            System.out.println("Geben sie den neuen Vornamen ein:");
            updSurname = manipulationScanner();
            System.out.println("Geben sie den neuen Nachname ein:");
            updLastname = manipulationScanner();
            System.out.println("Geben sie die neue Telefonnummer ein");
            updPhonenumber = manipulationScanner();
            Person updnew = new Person(updSurname, updLastname, updPhonenumber);
            phoneBook.updateContact(userID, updnew);
            System.out.println("=== Person wurde aktualisiert ===");
        } else if (updChoise == 'N') {
            System.out.println("Falsche Person erwischt?");
            updPerson(phoneBook);
        } else if (updChoise == 'X') {
            System.out.println("- zurück ins Hauptmenü -");
        } else {
            System.out.println("Error - eingegebener Wert falsch");
            updPerson(phoneBook);
        }
    }

    private static void delPerson(PhoneBook phoneBook) {
        System.out.println("Welche Person möchten sie löschen? Geben sie die ID innerhalb der Klammer [ ] ein");
        System.out.println("Geben Sie 'X' ein um diesen Modus zu verlassen");
        System.out.println(phoneBook);
        int userID = Integer.parseInt(manipulationScanner());
        if (userID <= phoneBook.size() && userID >= 0) {
            System.out.println("Möchten sie " + phoneBook.getContact(userID) + " wirklich löschen?" + "\n" + "( Y / N )");
            char delChoise = manipulationScanner().toUpperCase().charAt(0);
            if (delChoise == 'Y') {
                phoneBook.deleteContact(userID);
                System.out.println("=== Person wurde gelöscht ===");
            } else if (delChoise == 'N') {
                System.out.println("Falsche Person erwischt?");
                delPerson(phoneBook);
            } else if (delChoise == 'X') {
                System.out.println("- zurück ins Hauptmenü -");
            } else {
                System.out.println("Error - eingegebener Wert falsch");
            }
        } else {
            System.out.println("Error - eingegebener Wert falsch");
            delPerson(phoneBook);
        }


    }

    private static void addPerson(PhoneBook phoneBook) {
        String addSurname;
        String addLastname;
        String addPhonenumber;
        System.out.println("Geben sie den Vornamen ein:");
        addSurname = manipulationScanner();
        System.out.println("Geben sie den Nachname ein:");
        addLastname = manipulationScanner();
        System.out.println("Geben sie die Telefonnummer ein");
        addPhonenumber = manipulationScanner();
        Person addnew = new Person(addSurname, addLastname, addPhonenumber);
        phoneBook.addContact(addnew);
        System.out.println("=== Person wurde eingetragen ===");
    }

    private static String manipulationScanner() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }
}
