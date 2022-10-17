package ua.andriy.danilevskyy.hillel.phonebook;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PhoneBook {

    private final Set<Record> records = new HashSet<>();

    public void add(Record record) {
        if (record.getName() == null || record.getPhoneNumber() == null) {
            throw new IllegalArgumentException();
        }
        records.add(record);
    }
    public void getPrint() {
        for (Record record : records) {
            System.out.println(record.getName() + " " + record.getPhoneNumber());
        }
        System.out.println();
    }


    public Record find(String name) {
        Record foundRecord = null;
        for (Record record : records) {
            if (record.getName().equals(name)) {
                foundRecord = record;
                break;
            }
        }
        return foundRecord;
    }



}