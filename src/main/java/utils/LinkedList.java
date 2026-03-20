////package utils;
////
////public class LinkedList {
////    private int size;
////    private Node first;
////    private Node last;
////
////    public LinkedList(){
////        first = null;
////        last = null;
////        size = 0;
////    }
////
////
////    private static class Node {
////        private String data;
////        private Node next;
////
////        public Node(String data) {
////            this.data = data;
////            this.next = null;
////
////        }
////    }
////
////    public void add(String element) {
////        if (element == null) {
////            throw new IllegalArgumentException("cannot add null to list");
////        }
////important part, refer more
////        Node newNode = new Node(element);
////        if (first == null) {
////            first = newNode;
////
////        } else {
////            last.next = newNode;
////        }
////
////        last = newNode;
////        size++;
////
////    }
//// //till here
////
////    public String getFirst(){
////        if (isEmpty()){
////            return null;
////        }
////        return first.data;
////    }
////
////    public String getLast() {
////        if (isEmpty()) {
////            return null;
////        }
////            return last.data;
////        }
////
////
////
////        public boolean isEmpty() {
////            if (first == null) {
////                return true;
////            }
////            return false;
////        }
////    }
////
////    public String get(int index) {
////        if (index < 0 || index >= size) {
////            throw new IndexOutOfBoundsException("Supplied index outside bounds of list - was" + index + ",list ends"
////                    + "" + "at" + (size - 1));
////        }
////        Node current = first;
////        for (int i = 0; i < index; i++) {
////            current = current.next;
////        }
////        return current.data;
////
////    }
////
////    public void add(int index,String element){
////
////
////indexOf() - takes in value to be located, returns position of first instance
////
////}
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
//    private static class Node{
//        private String data;
//        private Node next;
//
//        public Node(String data){
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    public void add(String element){
//        validateForNullElement(element);
//
//        Node newNode = new Node(element);
//        if(first == null){
//            first = newNode;
//        }else{
//            last.next = newNode;
//        }
//
//        last = newNode;
//        size++;
//    }
//
//    private static void validateForNullElement(String element) {
//        if(element == null){
//            throw new IllegalArgumentException("Cannot add null to list");
//        }
//    }
//
//    public String getFirst(){
//        if(isEmpty()){
//            return null;
//        }
//        return first.data;
//    }
//
//    public String getLast(){
//        if(isEmpty()){
//            return null;
//        }
//        return last.data;
//    }
//
//    public int getSize(){
//        return size;
//    }
//
//    public boolean isEmpty(){
//        if(first == null){
//            return true;
//        }
//        return false;
//    }
//
//    public String get(int index){
//        validateIndexOutOfBounds(index);
//
//        Node current = first;
//        for (int i = 0; i < index; i++) {
//            current = current.next;
//        }
//
//        return current.data;
//    }
//
//    private void validateIndexOutOfBounds(int index) {
//        if(index < 0 || index >= size){
//            throw new IndexOutOfBoundsException("Supplied index outside bounds of list - was " + index + ", list ends" +
//                    " " +
//                    "at " + (size-1));
//        }
//    }
//
////    public void add(int index, String element){
////        validateForNullElement(element);
////        validateIndexForAdd(index);
////
////        Node newNode = new Node(element);
////
////        if(index == 0){
////            newNode.next = first;
////            first = newNode;
////
////            if(size == 0){
////                last = newNode;
////            }
////        } else {
////            Node current = first;
////
////            for(int i = 0; i < index - 1; i++){
////                current = current.next;
////            }
////
////            newNode.next = current.next;
////            current.next = newNode;
////
////            if(index == size){
////                last = newNode;
////            }
////        }
////
////        size++;
////    }
//
//    public void add(int index, String element){
//        // VALIDATION
//        // Validate element to confirm good AND real data : validateForNull
//        validateForNullElement(element);
//        // Validate index to confirm position is within list : validateIndexOutOfBounds
//        validateIndexOutOfBounds(index);
//
//        if(index == 0){
//            Node newNode = new Node(element);
//            newNode.next = first;
//            first = newNode;
//        }else {
//            Node newNode = new Node(element);
//
//            Node current = first;
//            for (int i = 0; i < index - 1; i++) {
//                current = current.next;
//            }
//            newNode.next = current.next;
//            current.next = newNode;
//        }
//        size++;
//    }
//
//
//    // todo: indexOf() - takes in value to be located, returns position of first instance
//    public int indexOf(String element){
//        validateForNullElement(element);
//
//        Node current = first;
//        int index = 0;
//
//        // for(int i = 0;i < size;i++){
//        //if(element.equalsIgnoreCase(current.data)){
//        //return i;
//        //}
//        //current = current.next;
//        //}
//        //return -1;
//        //}
//
//        while(current != null){
//            if(current.data.equals(element)){
//                return index;
//            }
//            current = current.next;
//            index++;
//        }
//
//        return -1;
//    }
//
//    public int lastIndexOf(String element){
//        validateForNullElement(element);
//
//        Node current = first;
//        int index = 0;
//        int lastIndex = -1;
//
//        while(current != null){
//            if(current.data.equals(element)){
//                lastIndex = index;
//            }
//            current = current.next;
//            index++;
//        }
//
//        return lastIndex;
//    }
//
//
//
//    // todo: set()
//
//    public void set(int index, String element){
//        validateIndexOutOfBounds(index);
//        validateForNullElement(element);
//
//        Node current = first;
//
//        for(int i = 0; i < index; i++){
//            current = current.next;
//        }
//
//        current.data = element;
//    }
//
//    // todo: contains()
//
//    public boolean contains(String element){
//        validateForNullElement(element);
//        return indexOf(element) != -1;
//    }
//
//    // todo: clear()
//
//    public void clear(){
//        first = null;
//        last = null;
//        size = 0;
//    }
//
//    // todo: toArray()
//
//    public String[] toArray(){
//        String[] array = new String[size];
//        Node current = first;
//
//        for(int i = 0; i < size; i++){
//            array[i] = current.data;
//            current = current.next;
//        }
//
//        return array;
//    }
//
//    public String remove(int index){
//        validateIndexOutOfBounds(index);
//
//        Node removedNode;
//
//        if(index == 0){
//            removedNode = first;
//            first = first.next;
//
//            if(size == 1){
//                last = null;
//            }
//        } else {
//            Node current = first;
//
//            for(int i = 0; i < index - 1; i++){
//                current = current.next;
//            }
//
//            removedNode = current.next;
//            current.next = removedNode.next;
//
//            if(index == size - 1){
//                last = current;
//            }
//        }
//
//        size--;
//        return removedNode.data;
//    }
//
//
//
// public boolean removeByValue(String value) {
//    if (first == null) return false;
//
//
//    if (first.data.equals(value)) {
//        if (first == last) {
//            first = last = null;
//        } else {
//            first = first.next;
//        }
//        size--;
//        return true;
//    }
//
//    Node current = first;
//    Node prev = null;
//
//    while (current != null) {
//        if (current.data.equals(value)) {
//            prev.next = current.next;
//
//            if (current == last) {
//                last = prev;
//            }
//
//            size--;
//            return true;
//        }
//
//        prev = current;
//        current = current.next;
//    }
//
//    return false;
//}
//

package utils;

public class LinkedList {
    private int size;
    private Node first;
    private Node last;

    public LinkedList() {
        clear();
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
        validateForNullElement(element);

        Node newNode = new Node(element);
        if (first == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }

        last = newNode;
        size++;
    }

    private static void validateForNullElement(String element) {
        if (element == null) {
            throw new IllegalArgumentException("Cannot add null to list");
        }
    }

    public String getFirst() {
        if (isEmpty()) {
            return null;
        }
        return first.data;
    }

    public String getLast() {
        if (isEmpty()) {
            return null;
        }
        return last.data;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        }
        return false;
    }

    public String get(int index) {
        validateIndexOutOfBounds(index);

        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    private void validateIndexOutOfBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Supplied index outside bounds of list - was " + index + ", list ends" +
                    " " +
                    "at " + (size - 1));
        }
    }

    public void add(int index, String element) {
        // VALIDATION
        // Validate element to confirm good AND real data : validateForNull
        validateForNullElement(element);
        // Validate index to confirm position is within list : validateIndexOutOfBounds
        validateIndexOutOfBounds(index);

        if (index == 0) {
            Node newNode = new Node(element);
            newNode.next = first;
            first = newNode;
        } else {
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

    /**
     * Validate a given index to check if it's within the boundaries of the data in the list (0 - size inclusive).
     *
     * @param index Index/position to validate as existing within this list
     * @throws IndexOutOfBoundsException if supplied index is < 0 or > size of list
     */
    private void validateIndexOutOfBoundsInclusive(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Supplied index outside bounds of list - was " + index
                    + ", last " + "allowable position to add: " + (size));
        }
    }

    /**
     * Add a new element at a specified position between 0 and size (inclusive).
     * This version of the action allows for adding AFTER the data within the list;
     * it uses the next possible index as its limit
     *
     * @param index   The position at which to insert the new element (0-size inclusive)
     * @param element The value to be inserted into the list
     * @throws IllegalArgumentException  if the element supplied is null
     * @throws IndexOutOfBoundsException if the index supplied is < 0 or > size of list
     */
    public void addInclusive(int index, String element) {
        // VALIDATION
        // Validate element to confirm good AND real data : validateForNull
        validateForNullElement(element);
        // Validate index to confirm position is within list (adding at end permitted) :
        // validateIndexOutOfBoundsInclusive
        validateIndexOutOfBoundsInclusive(index);

        Node newNode = new Node(element);

        if (size == 0) {            // If the list is empty
            first = newNode;
            last = newNode;
        } else if (index == 0) {    // If it's being added to the start
            newNode.next = first;
            first = newNode;
        } else if (index == size) {  // If it's being added at the end
            last.next = newNode;
            last = newNode;
        } else {                     // If it's being added anywhere else in between
            Node current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        // Element added, increase size metadata
        size++;
    }

    public String remove(int index) {
        validateIndexOutOfBounds(index);

        String removed = null;
        if (index == 0) {
            removed = first.data;
            if (first == last) {
                last = null;
            }
            first = first.next;
        } else {
            Node current = first;
            Node prev = null;

            for (int i = 0; i < index; i++) {
                prev = current;
                current = current.next;
            }
            removed = current.data;
            prev.next = current.next;

            if (index == size - 1) {
                last = prev;
            }
        }

        size--;
        return removed;
    }

    public boolean remove(String element) {


        return false;
    }

    public int indexOf(String element){
        validateForNullElement(element);

        Node current = first;
        for(int i = 0; i < size; i++){
            if(element.equalsIgnoreCase(current.data)){
                return i;
            }
            current = current.next;
        }

        return -1;
    }

    public int lastIndexOf(String element){
        validateForNullElement(element);

        int index = -1;

        Node current = first;
        for(int i = 0; i < size; i++){
            if(element.equalsIgnoreCase(current.data)){
                index = i;
            }
            current = current.next;
        }

        return index;
    }

    public boolean contains(String target){
        validateForNullElement(target);

        return indexOf(target) != -1;
    }


    public String set(int index, String value){
        validateIndexOutOfBounds(index);
        validateForNullElement(value);

        // Loop to specified position (where we want to replace data)
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        // Save old version that is being replaced
        String replaced = current.data;

        // Replace data with new value
        current.data = value;

        // return replaced information
        return replaced;
    }

    public void clear(){
        first = null;
        last = null;
        size = 0;
    }


    public String[] toArray(){
        // Create new array of same size as list
        String [] listArray = new String[size];
        // for each node in list
        Node current = first;
        for (int i = 0; i < size ; i++) {
            // Copy data from within current node into array at same position
            listArray[i] = current.data;
            current = current.next;
        }

        // Return array
        return listArray;
    }

    public void addAll(String [] values){
        if(values == null){
            throw new IllegalArgumentException("Array of values cannot be null");
        }

        // Loop through all values in the string array
        for (int i = 0; i < values.length; i++) {

            // Add each one that is not null into the current list
            add(values[i]);
        }
    }

    public LinkedList getSublist(int startIndex, int endIndex){
        // Return a new LinkedList made up of all elements between startIndex and endIndex (exclusive)
        throw new UnsupportedOperationException("Not done yet!");
    }
}
