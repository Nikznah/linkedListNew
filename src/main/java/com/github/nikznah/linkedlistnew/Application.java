package com.github.nikznah.linkedlistnew;

public class Application {

    public static void main(String[] args) {

        MyLinkedList<Person> myLinkedList = new MyLinkedList<>();
        Person person1 = new Person("1", 24);
        Person person2 = new Person("2", 23);
        Person person3 = new Person("3", 23);
        Person person4 = new Person("4", 23);
        Person person5 = new Person("5", 23);
        Person person6 = new Person("6", 23);

        myLinkedList.add(person1);
        myLinkedList.add(person2);
        myLinkedList.add(person3);
        myLinkedList.add(person4);
        myLinkedList.add(person5);
        myLinkedList.add(person6);

        myLinkedList.get(4);
        myLinkedList.replace(3,new Person("7",23));
        myLinkedList.remove(1);
        myLinkedList.printLinkList();

//        myLinkedList.printLinkList();
    }
}
