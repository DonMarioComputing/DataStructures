//package apps;
//
//import utils.DynamicArray;
//
//public class ShoppingList {
//
//    public static void main(String[] args) {
//
//        // 1. Create instance
//        DynamicArray list = new DynamicArray();
//
//        // 2. Add 10 hard-coded items
//        list.add("Milk");
//        list.add("Bread");
//        list.add("Eggs");
//        list.add("Butter");
//        list.add("Apples");
//        list.add("Chicken");
//        list.add("Rice");
//        list.add("Pasta");
//        list.add("Juice");
//        list.add("Chocolate");
//
//        // 3. Display contents using size() and get()
//        System.out.println("Shopping List:");
//        System.out.println("----------------");
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(i + ": " + list.get(i));
//        }
//
//        // 4. Find position of "Chocolate"
//        System.out.println("\nSearching for Chocolate...");
//
//        int position = list.indexOf("Chocolate");
//
//        if (position == -1) {
//            System.out.println("Chocolate not found in the list.");
//        } else {
//            System.out.println("Chocolate found at position: " + position);
//        }
//
//        // 5. Remove "Chocolate"
//        System.out.println("\nRemoving Chocolate...");
//
//        String removed = list.remove("Chocolate");
//
//        if (removed == null) {
//            System.out.println("Chocolate was not in the list.");
//        } else {
//            System.out.println("Removed item: " + removed);
//        }
//
//        // 6. Display updated list
//        System.out.println("\nUpdated Shopping List:");
//        System.out.println("----------------------");
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(i + ": " + list.get(i));
//        }
//    }
//}
