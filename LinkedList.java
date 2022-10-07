package org.Example;

public class LinkedList {
    Node head;

    public class Node {

        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);

        if (head == null)
            head = newNode;
        else {
            Node temp = head;
            head = newNode;
            head.next = temp;

        }
    }

    public void addLast(Object data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        if(head == null)
            System.out.println("No elements to display...");
        else if(head.next == null)
            System.out.println(head.data);
        else {
            Node temp = head;
            while(temp != null) {
                if(temp.next != null)
                    System.out.print(temp.data +"->");
                else
                    System.out.print(temp.data +"\n");
                temp = temp.next;
            }
        }
    }




    public void search(Object searchData) {
        if (head.data == searchData)
            System.out.println(searchData + " is Found");
        else {
            Node temp = head;

            boolean isFound = false;

            while (temp != null) {
                if (temp.data == searchData) {
                    isFound = true;
                    break;
                }

                temp = temp.next;
            }

            if (isFound == true)
                System.out.println(searchData + " is Found");
            else
                System.out.println(searchData + " is not found..");
        }
    }

    public int size() {
        int count = 0;

        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;

    }

}
