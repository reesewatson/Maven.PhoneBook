package com.zipcodewilmington.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String number;
    private String address;
    private List personList;

    public Person(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public Person(List<String> personList){
        this.personList = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List getPersonList() {
        return personList;
    }

    public void setPersonList(List personList) {
        this.personList = personList;
    }
}
