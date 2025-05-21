package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        //Step 1
        ArrayList<Person> myFriends = new ArrayList<>();//Create a list

        //Create new person and add it to the list

        myFriends.add(new Person("Bilenie", "Tilahun", 50));
        myFriends.add(new Person("Eyob", "Mengistu", 60));
        myFriends.add(new Person("Abrish", "Belayhun", 70));
        myFriends.add(new Person("Heldana", "Gebremariyam", 80));
        myFriends.add(new Person("Eden", "Mengistu", 90));
        myFriends.add(new Person("Asteway", "Nigussie", 100));
        myFriends.add(new Person("Brian", "Miller", 28));
        myFriends.add(new Person("Griffin", "Roberts", 29));
        myFriends.add(new Person("Jack ", "Skjong-Nilsen", 24));
        myFriends.add(new Person("Joshua", "Vickers", 24));

        //Step 2

        //Prompt user to for name to search
        Scanner myScanner = new Scanner(System.in);

        System.out.println(" Search for First Name : \n ");
        String firstName = myScanner.nextLine();
        System.out.println(" Search for Last Name : \n ");
        String lastName = myScanner.nextLine();


        ArrayList<Person> filteredName = new ArrayList<>();

        for (Person p : myFriends) {
            if (p.getFirstName().equalsIgnoreCase(firstName) || p.getLastName().equalsIgnoreCase(lastName)) {
                filteredName.add(p);
            }
        }

        for (Person p : filteredName) {
            System.out.println(p.getFullName());
        }
        //Step 3
        //Calculate the average age of all people in the original list and display it

        int total = 0;
        for (Person p : myFriends) {
            total += p.getAge();

        }
        double average = total/ myFriends.size();
        System.out.println(" The average is : " +  average);
    }

    }






