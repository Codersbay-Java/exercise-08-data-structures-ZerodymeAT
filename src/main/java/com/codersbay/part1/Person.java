package com.codersbay.part1;

public class Person {
    String surname;
    String lastname;
    String phonenumber;

    public Person(String surname, String lastname, String phonenumber) {
        this.surname = surname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
    }

    public String getCellnumber() {
        return phonenumber;
    }

    @Override
    public String toString(){
        return surname + " " + lastname + " " + phonenumber;
    }
}
