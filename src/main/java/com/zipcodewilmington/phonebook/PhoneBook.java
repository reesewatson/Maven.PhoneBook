package com.zipcodewilmington.phonebook;

import java.util.*;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    private Map<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new TreeMap<String, ArrayList<String>>();
    }

    public Map<String, ArrayList<String>> getPhoneBook() {
        return phoneBook;
    }

    public void add(String name, String phoneNumber) {
        /*If the name already exists in the phonebook, retrieve that name and return it with number.
        Else create a new arraylist, add number to it, then put that list into the phonebook map.*/

        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNumber);
        } else {
            List<String> numbers = new ArrayList();
            numbers.add(phoneNumber);
            phoneBook.put(name, (ArrayList<String>) numbers);
        }
    }


    public void addAll(String name, String... phoneNumbers) {
        /*If the name already exists in the phonebook, retrieve that name and return it with numbers.
        Else create a new arraylist, add numbers to it, then put that list into phonebook map.*/

        if (phoneBook.containsKey(name)) {
            Collections.addAll(phoneBook.get(name), phoneNumbers);
        } else {
            List<String> numbers = new ArrayList();
            Collections.addAll(numbers, phoneNumbers);
            phoneBook.put(name, (ArrayList<String>) numbers);
        }
    }

    public void remove(String name, String phoneNumber) {
        /*Try--If the name already exists in the phonebook, retrieve that name and remove it.
        Catch--Null pointer exception. Print out an error prompt: "Name/number does not exist in this phonebook."*/
        try {
            if (phoneBook.get(name).size() == 1) {
                phoneBook.remove(name);
            } else {
                phoneBook.get(name).remove(phoneNumber);
        } } catch (NullPointerException exception) {
            System.out.println("Sorry, this name and number do not exist within this Phonebook.");
        }
    }

    public void removeAll(String name) {
        phoneBook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phoneBook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return phoneBook.get(name);
    }

    public String reverseLookup(String phoneNumber) {
        for (String name : phoneBook.keySet()) {
            if (phoneBook.get(name).contains(phoneNumber)) {
                return name;
            }
        } return "Cannot find the name associated with this number.";
    }

    public List<String> getAllContacts() {
        return new ArrayList<String>(phoneBook.keySet());
    }

    public void display() {
        for (Map.Entry<String, ArrayList<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": ");
            for (String number : entry.getValue()) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        PhoneBook testBook = new PhoneBook();
        testBook.add("David", "302-210-9787");
        testBook.add("Eric", "302-668-5682");
        testBook.add("Ryane", "302-893-1991");
        testBook.add("Ajah", "646-893-9005");
        testBook.add("Shannon", "908-667-4535");
        testBook.display();
    }
}


