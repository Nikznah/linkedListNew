package com.github.nikznah.linkedlistnew;

public class MyLinkedList<T> {

    private static class Node<T> {

        T element;
        Node<T> next;
        Node<T> prev;

        Node(T element) {
            this.element = element;
        }
    }


    private Node<T> head = null;

    public int size() {
        Node<T> i;
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
            head = new Node<>(obj);
        } else {
            Node<T> n = head;
            Node<T> node = new Node<>(obj);
            while (n.next != null) {
                n = n.next;
            }
            node.prev = n;
            n.next = node;
        }
    }

    /**
     * @param obj входной параметр
     *            Возвращает true/false
     */
    public boolean remove(T obj) {
        Node<T> n = head;
        if (isEmpty()) {
            return false;
        }
        while (n != null) {
            if (n.element.equals(obj)) {
                unlink(n);
                return true;
            }
            n = n.next;
        }
        return false;
    }

    /**
     * @param index индекс удаляемого обьекта
     */
    public boolean remove(int index) {
        if (!isEmpty() && index <= size() && index > 0) {
            Node<T> n = head;
            if (index < (size()) >> 1) {
                unlink(n);
            } else {
                System.out.println(index);
                for (int i = 0; i < index; i++) {
                    if (i == (index - 1)) {
                        unlink(n);
                    }
                    n = n.next;
                }
            }
            return true;
        } else {
            throw new IllegalArgumentException("Некорректный индекс:" + index);
        }
    }

    /**
     * @param index индекс ноды
     * @param obj   новый элемент
     */
    public void replace(int index, T obj) {
        if (!isEmpty() && index <= size() && index > 0) {
            Node<T> n = head;
            if (index < (size()) >> 1) {
                n.element = obj;
            } else {
                for (int i = 0; i < index; i++) {
                    if (i == (index - 1)) {
                        n.element = obj;
                    }
                    n = n.next;
                }
            }
        } else {
            throw new IllegalArgumentException("Некорректный индекс:" + index);
        }
    }

    public T get(int index) {
        if (!isEmpty() && index <= size() && index > 0) {
            Node<T> n = head;
            if (index < (size()) >> 1) {
                return n.element;
            } else {
                for (int i = 0; i < index; i++) {
                    if (i == (index - 1)) {
                        return n.element;
                    }
                    n = n.next;
                }
            }
        } else {
            throw new IllegalArgumentException("Некорректный индекс:" + index);
        }
        return null;
    }

    /**
     * Вывод листа на экран
     */
    public void printLinkList() {
        Node<T> p;
        for (p = head; p != null; p = p.next) {
            System.out.printf("%s,Next: %s,Prev: %s --->\n", p.element, p.next, p.prev);
        }
    }

    /**
     * @param n заменяемый элемент
     */
    private void unlink(Node<T> n) {
        if (n.prev == null) {
            head = n.next;

            if (head != null) {
                head.prev = null;
            }
        } else {
            n.prev.next = n.next;

            if (n.next != null) {
                n.next.prev = n.prev;
            }
        }
    }
}


