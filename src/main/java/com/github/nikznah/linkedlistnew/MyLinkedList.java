package com.github.nikznah.linkedlistnew;

public class MyLinkedList<T> {

    private static class Entry<T> {

        T element;
        Entry<T> next;
        Entry<T> prev;

        Entry(T element) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }


    private Entry<T> head = null;

    public int size() {
        Entry<T> i;
        int size = 0;
        for (i = head; i != null; i = i.next) {
            size++;
        }
        return size;
    }


    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * @param obj элемент добавления
     */
    public void add(T obj) {
        if (isEmpty()) {
            System.out.println("Создание 1-го элемента");
            head = new Entry<T>(obj);
        } else {
            Entry<T> i = head,i1= head.prev;
            Entry<T> entry = new Entry<T>(obj);
            while (i.next != null) {
                i = i.next;
            }
            i.next = entry;
            entry.next = null;
        }
    }

    /**
     * @param obj входной параметр
     * @return удаление данных
     * Возвращает true/false
     */
    public boolean remove(T obj) {
        Entry<T> i = head, i1 = null;
        boolean check = false;
        if (isEmpty()) {
            return false;
        }
        while (i != null) {
            if (i.element.equals(obj)) {
                if (i1 == null) {
                    head = head.next;
                } else {
                    i1.next = i.next;
                }
                check = true;
            }
            i1 = i;
            i = i.next;
        }
        return check;
    }

    public void printLinkList() {
        Entry<T> p;
        for (p = head; p != null; p = p.next) {
            System.out.printf("%s,Next: %s,Prev: %s --->\n", p.element, p.next, p.prev);
        }
    }
}


