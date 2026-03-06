package utils;

public class LinkedList {
    private int size;
    private Node first;
    private Node last;

    public LinkedList(){
        first = null;
        last = null;
        size = 0;
    }


    private static class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;

        }
    }

    public void add(String element) {
        if (element == null) {
            throw new IllegalArgumentException("cannot add null to list");
        }
//important part, refer more
        Node newNode = new Node(element);
        if (first == null) {
            first = newNode;

        } else {
            last.next = newNode;
        }

        last = newNode;
        size++;

    }
 //till here

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Supplied index outside bounds of list - was" + index + ",list ends"
                    + "" + "at" + (size - 1));
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;

    }

    //todo:  indexOf() - takes in value to be located, returns position of first instance

}
