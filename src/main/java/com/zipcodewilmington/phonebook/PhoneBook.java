package com.zipcodewilmington.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    private Map<String, List<String>> map = new TreeMap<String, List<String>>();

    /**
     * @param name of person to check against
     * @return true if the person's name has been entered into the map
     */
    public Boolean hasEntry(String name) {
        return map.containsKey(name);
    }

    /**
     * @param name
     * @param phoneNumber
     */
    public void add(String name, String phoneNumber) {
        if(hasEntry(name)) {
            List<String> theirPhoneNumbers = lookup(name);
            theirPhoneNumbers.add(phoneNumber);
        } else {
            List<String> phoneNumberList = new ArrayList<String>();
            map.put(name, phoneNumberList);
            phoneNumberList.add(phoneNumber);
        }
    }

    public void add(String name, String... phoneNumbers) {
        for (int i = 0; i < phoneNumbers.length; i++) {
            String phoneNumber = phoneNumbers[i];
            this.add(name, phoneNumber);
        }
    }

    /**
     * @param name of person to look up
     * @return list of phone numbers associated with `name`
     */
    public List<String> lookup(String name) {
        return this.map.get(name);
    }

    /**
     * @param number
     * @return
     */
    public String reverseLookup(String number) {
        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> phoneNumbers = entry.getValue();
            if(phoneNumbers.contains(number)) {
                String name = entry.getKey();
                return name;
            }
        }
        return null;
    }
}


