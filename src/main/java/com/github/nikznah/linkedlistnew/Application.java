package com.github.nikznah.linkedlistnew;

public class Application {

    public static void main(String[] args) {

        MyLinkedList<Person> myLinkedList = new MyLinkedList<>();
        Person person1 = new Person("Никита", 24);
        Person person2 = new Person("Кирилл", 23);

        myLinkedList.add(person1);
        myLinkedList.add(person2);

        System.out.println(myLinkedList.size());
        myLinkedList.printLinkList();
    }
}
