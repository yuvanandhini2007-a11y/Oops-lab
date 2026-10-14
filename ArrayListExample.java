import java.util.*;

public class ArrayListExample {
    public static void main(String args[]) {
        ArrayList<String> obj1 = new ArrayList<String>();

        obj1.add("Ajeet");
        obj1.add("Harry");
        obj1.add("Chaitanya");
        obj1.add("Steve");
        obj1.add("Anuj");

        System.out.println("ArrayList obj1: " + obj1);

        obj1.add("Babu");
        obj1.add("Kamal");

        ArrayList<String> obj2 = new ArrayList<String>();
        obj2.add("Alice");
        obj2.add("Bob");
        obj2.add("Raj");

        obj1.addAll(obj2);
        System.out.println("After addAll: " + obj1);

        obj1.add(0, "Rahul");
        obj1.add(1, "Justin");
        System.out.println("After adding at index: " + obj1);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the search element:");
        String search = input.nextLine();

        System.out.println("Contains " + search + ": " + obj1.contains(search));

        obj1.remove("Chaitanya");
        obj1.remove("Harry");
        System.out.println("After removing names: " + obj1);

        obj1.remove(1);
        System.out.println("After removing index 1: " + obj1);

        System.out.println("Enter the starting letter:");
        search = input.nextLine().toUpperCase();

        ArrayList<String> obj3 = new ArrayList<String>();

        for (int i = 0; i < obj1.size(); i++) {
            if (obj1.get(i).toUpperCase().startsWith(search)) {
                obj3.add(obj1.get(i));
            }
        }

        if (obj3.size() > 0) {
            System.out.println("Names starting with " + search + ": " + obj3);
        } else {
            System.out.println("No name starts with " + search);
        }

        input.close();
    }
}