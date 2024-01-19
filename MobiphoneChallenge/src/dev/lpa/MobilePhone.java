package dev.lpa;

import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;


    public MobilePhone(String number) {
        this.myNumber = number;
        myContacts = new ArrayList<>();
    }

    // method

    public boolean addNewContact(Contact p){
        for (var x : myContacts){
            if (x.getName().equals(p.getName())){
                return false;
            }
        }
        myContacts.add(p);
        return true;
    }

    public boolean removeContact(Contact p) {

        for (var x : myContacts){
            if (x.getName().equals(p.getName())) {
                myContacts.remove(p);
                return true;
            }
        }
        return false;
    }
    private int findContact(Contact p) {
        return myContacts.indexOf(p);
    }

    private int findContact(String name) {
        for (var x : myContacts){
            if (x.getName().equals(name)) {
                return myContacts.indexOf(x);
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int ex = findContact(name);
        return ex < 0 ? null : myContacts.get(ex);
    }

    public boolean updateContact(Contact old, Contact nw){
        int old_ind = findContact(old);
        if (old_ind < 0) return false;
        else if (findContact(nw) > 0) return false;

        myContacts.set(old_ind, nw);
        return true;
    }
    public void printContacts() {
        System.out.println("Contact List:");
        int i = 0;
        for (var x : myContacts) {
            System.out.println(++i + ". " + x.getName() + " -> " + x.getPhoneNumber());
        }
    }


}
