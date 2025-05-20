package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList <Person> myFamily = new ArrayList<>();

        myFamily.add(new Person("Bilenie", "Tilahun", 50));
        myFamily.add(new Person("Eyob", "Mengistu",60));
        myFamily.add(new Person("Abrish", "Belayhun" ,70));
        myFamily.add(new Person("Heldana", "Gebremariyam",80));
        myFamily.add(new Person("Eden", "Mengistu", 90));
        myFamily.add(new Person("Asteway","Nigussie", 100));

        Collections.sort(myFamily);// compare by string

        for(Person i : myFamily){
            System.out.println(i.getFirstName() + " - " + i.getLastName() + " - " + i.getAge());
        }

    }
}
