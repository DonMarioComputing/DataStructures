//package utils;
//
//public class LinkedList {
//    private int size;
//    private Node first;
//    private Node last;
//
//    public LinkedList(){
//        first = null;
//        last = null;
//        size = 0;
//    }
//
//
//    private static class Node {
//        private String data;
//        private Node next;
//
//        public Node(String data) {
//            this.data = data;
//            this.next = null;
//
//        }
//    }
//
//    public void add(String element) {
//        if (element == null) {
//            throw new IllegalArgumentException("cannot add null to list");
//        }
//important part, refer more
//        Node newNode = new Node(element);
//        if (first == null) {
//            first = newNode;
//
//        } else {
//            last.next = newNode;
//        }
//
//        last = newNode;
//        size++;
//
//    }
// //till here
//
//    public String getFirst(){
//        if (isEmpty()){
//            return null;
//        }
//        return first.data;
//    }
//
//    public String getLast() {
//        if (isEmpty()) {
//            return null;
//        }
//            return last.data;
//        }
//
//
//
//        public boolean isEmpty() {
//            if (first == null) {
//                return true;
//            }
//            return false;
//        }
//    }
//
//    public String get(int index) {
//        if (index < 0 || index >= size) {
//            throw new IndexOutOfBoundsException("Supplied index outside bounds of list - was" + index + ",list ends"
//                    + "" + "at" + (size - 1));
//        }
//        Node current = first;
//        for (int i = 0; i < index; i++) {
//            current = current.next;
//        }
//        return current.data;
//
//    }
//
//    public void add(int index,String element){
//
//
//indexOf() - takes in value to be located, returns position of first instance
//
//}
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

    private static class Node{
        private String data;
        private Node next;

        public Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(String element){
        validateForNullElement(element);

        Node newNode = new Node(element);
        if(first == null){
            first = newNode;
        }else{
            last.next = newNode;
        }

        last = newNode;
        size++;
    }

    private static void validateForNullElement(String element) {
        if(element == null){
            throw new IllegalArgumentException("Cannot add null to list");
        }
    }

    public String getFirst(){
        if(isEmpty()){
            return null;
        }
        return first.data;
    }

    public String getLast(){
        if(isEmpty()){
            return null;
        }
        return last.data;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        if(first == null){
            return true;
        }
        return false;
    }

    public String get(int index){
        validateIndexOutOfBounds(index);

        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    private void validateIndexOutOfBounds(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Supplied index outside bounds of list - was " + index + ", list ends" +
                    " " +
                    "at " + (size-1));
        }
    }

//    public void add(int index, String element){
//        validateForNullElement(element);
//        validateIndexForAdd(index);
//
//        Node newNode = new Node(element);
//
//        if(index == 0){
//            newNode.next = first;
//            first = newNode;
//
//            if(size == 0){
//                last = newNode;
//            }
//        } else {
//            Node current = first;
//
//            for(int i = 0; i < index - 1; i++){
//                current = current.next;
//            }
//
//            newNode.next = current.next;
//            current.next = newNode;
//
//            if(index == size){
//                last = newNode;
//            }
//        }
//
//        size++;
//    }

    public void add(int index, String element){
        // VALIDATION
        // Validate element to confirm good AND real data : validateForNull
        validateForNullElement(element);
        // Validate index to confirm position is within list : validateIndexOutOfBounds
        validateIndexOutOfBounds(index);

        if(index == 0){
            Node newNode = new Node(element);
            newNode.next = first;
            first = newNode;
        }else {
            Node newNode = new Node(element);

            Node current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }


    // todo: indexOf() - takes in value to be located, returns position of first instance
    public int indexOf(String element){
        validateForNullElement(element);

        Node current = first;
        int index = 0;

        while(current != null){
            if(current.data.equals(element)){
                return index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }



    // todo: set()

    public void set(int index, String element){
        validateIndexOutOfBounds(index);
        validateForNullElement(element);

        Node current = first;

        for(int i = 0; i < index; i++){
            current = current.next;
        }

        current.data = element;
    }

    // todo: contains()

    public boolean contains(String element){
        validateForNullElement(element);
        return indexOf(element) != -1;
    }
    // todo: clear()

    public void clear(){
        first = null;
        last = null;
        size = 0;
    }

    // todo: toArray()

    public String[] toArray(){
        String[] array = new String[size];
        Node current = first;

        for(int i = 0; i < size; i++){
            array[i] = current.data;
            current = current.next;
        }

        return array;
    }




}