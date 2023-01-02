package com.codersbay.part1;

public class Datensatz {
    public static PhoneBook telefonregister(){
        PhoneBook contacts = new PhoneBook();
        Person luwa = new Person("Lukas", "Wais","012327946042");
        Person algu = new Person("Alexander", "Gruber","01235677949");
        Person ansi = new Person("André", "Siegert","01233022268");
        Person dopa = new Person("Dominik", "Paschinger","01231108554");
        Person kuoe = new Person("Kurt", "Oeffner","012372519267");
        Person rero = new Person("Rebecca", "Rottensteiner","01236095566");
        Person tobi = new Person("Tobias", "Bichler","01232782663");
        Person seob = new Person("Sebastian", "Otter-Bäck","012322565945");
        contacts.addContact(luwa);
        contacts.addContact(algu);
        contacts.addContact(ansi);
        contacts.addContact(dopa);
        contacts.addContact(kuoe);
        contacts.addContact(rero);
        contacts.addContact(tobi);
        contacts.addContact(seob);
        return contacts;
    }
}
