package com.zipcodewilmington.phonebook;
import junit.framework.TestCase;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class PhoneBookTest extends TestCase {


    /**
     * Created by leon on 1/23/18.
     */


    @Test
    public void addTest() {

        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Nancy";
        String ph1 = "302-893-2783";
        phoneBook.add("Nancy", "302-893-2783");

        //When
        phoneBook.add(name, ph1);
        ArrayList actual = (ArrayList) phoneBook.lookup(name);

        //Then
        Assert.assertEquals(ph1, actual);
    }

    @Test
    public void addTest2() {

        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Joel";
        String ph1 = "732-567-8888";
        phoneBook.add("Joel", "732-567-8888");

        //When
        phoneBook.add(name, ph1);
        ArrayList actual = (ArrayList) phoneBook.lookup(name);

        //Then
        Assert.assertEquals(ph1, actual);
    }

    @Test
    public void removeAllTest() {

        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Carl";
        String ph1 = "908-234-6754";
        String ph2 = "908-765-4579";
        phoneBook.addAll(name, ph1, ph2);

        //When
        phoneBook.removeAll(name);
        ArrayList actual = (ArrayList) phoneBook.lookup(name);


        //Then
        Assert.assertNull(actual);

    }

    @Test
    public void removeAllTest2() {

        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Joey";
        String ph1 = "908-668-8976";
        String ph2 = "908-668-0907";
        phoneBook.addAll(name, ph1, ph2);

        //When
        phoneBook.removeAll(name);
        ArrayList actual = (ArrayList) phoneBook.lookup(name);


        //Then
        Assert.assertNull(actual);

    }

    @Test
    public void lookupTest() {

        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "David";
        String ph1 = "302-567-6758";
        phoneBook.add(name, ph1);

        //When
        ArrayList actual = (ArrayList) phoneBook.lookup(name);

        //Then
        Assert.assertEquals(ph1, actual);

    }

    @Test
    public void lookupTest2() {

        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Brian";
        String ph1 = "302-561-9004";
        phoneBook.add(name, ph1);

        //When
        ArrayList actual = (ArrayList) phoneBook.lookup(name);

        //Then
        Assert.assertEquals(ph1, actual);

    }

    @Test
    public void reverseLookupTest() {

        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Bobbie";
        String ph1 = "908-387-2678";
        phoneBook.add(name, ph1);

        //When
        String actual = phoneBook.reverseLookup(ph1);

        //Then
        Assert.assertEquals(name, actual);
    }

    @Test
    public void reverseLookupTest2() {

        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Alyssa";
        String ph1 = "646-410-2737";
        phoneBook.add(name, ph1);

        //When
        String actual = phoneBook.reverseLookup(ph1);

        //Then
        Assert.assertEquals(name, actual);
    }
}



