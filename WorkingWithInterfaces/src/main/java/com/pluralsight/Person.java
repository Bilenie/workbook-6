package com.pluralsight;

public class Person implements Comparable<Person>{

    private String firstName;
    private String lastName;
    private int age;

    //Generate constructor

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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
    //we implement the Comparable interface and override the compareTo method now we dont need to pass in we have default sort
//    @Override
//    public int compareTo(Person otherItem){
//        return Integer.compare(this.age, otherItem.age);
//        //return this.getName().compareToIgnoreCase(otherItem.getName());
//        // tell it how it will compare it for me.)
//    }

    @Override
    public int compareTo(Person name) {
        return this.getLastName().compareToIgnoreCase(name.getLastName());//organize object in the list in alphabetical order of the lastname
        //so if the last name of object one in the list come before the other it will be printed first.
    }
}
