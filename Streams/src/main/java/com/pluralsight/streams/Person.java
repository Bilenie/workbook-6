package com.pluralsight.streams;

import java.util.List;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    //Generate constructor

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //derived method that return the full name
    public String getFullName() {
        return this.firstName + this.lastName;
    }

    //Generate a getter and setter


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Person getHighesAge(List<Person> myFriends) {

        //validation to print null if the list is empty
        if (myFriends.isEmpty()) {
            return null;
        }
        //from my list first get the first value to start the comparison and store it in box called most
        Person oldest = myFriends.get(0);

        //Then loop through the list to and compare line the item in order
        for (Person p : myFriends) {
            //set a condition to start to compare
            if (p.getAge() > oldest.getAge()) {
                oldest = p;
            }
        }
        return oldest;
    }

    public static Person getLowestAge(List<Person> myFriends) {
        //validation to print null or return 0 if the list is empty
        if (myFriends.isEmpty()) {
            return null;
        }
        //from my list first get the first value of the first item  to start the comparison and store it in box called least.
        Person youngest = myFriends.get(0);

        //Then loop through the list to compare it with our least box to line the item in order
        for (Person p : myFriends) {
            if (p.getAge() < youngest.getAge()) {
                youngest = p;
            }
        }
        return youngest;
    }


}







