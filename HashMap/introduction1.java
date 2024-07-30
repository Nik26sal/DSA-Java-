package hashmap;


import java.util.HashMap;
import java.util.Map;

public class introduction1 {
    public static void main(String[] args) {
        //Question 1:Create a HashMap using java Hashmap class to store the following pairs(person ,age) and display them?
        //syntax
        Map<String, Integer> a = new HashMap<>();

        //insertion key+value=entry;
        a.put("Akash",21);
        a.put("Yash",16);
        a.put("Lav",17);
        a.put("Rishika",19);
        a.put("Harry",18);

        //Getting value of a key from hashmap.
        System.out.println(a.get("Yash"));//16
        System.out.println(a.get("rahul"));//null

        //Changing/updating value of a key int the Hashmap
        a.put("Akash",25);//Hashmap key are always unique

        //removing key pair from hashmap
        a.remove("Akash");//return key if not exist return null

        //Checking if a key exists in amap
        a.containsKey("Aksah");
        a.containsKey("Yash");

        // Adding a new entry only if the new key doesn't exist already
        a.putIfAbsent("Yash",30);

        //Get all keys in the Hashmap
        System.out.println(a.keySet());

        //Get all values in the Hashmap
        System.out.println(a.values());

        //Get all entries in the Hashmap
        System.out.println(a.entrySet());

        //Traversing all methods in hashmap- multiple methods

//        for(String i:a.keySet()){
//            System.out.printf("age of %s is %d\n", i, a.get(i));
//        }


//        for(String i : a.keySet()){
//            System.out.println("age of " + i + " is " + a.get(i));
//        }

//        for(Map.Entry<String,Integer> e: a.entrySet()){
//            System.out.println("age of " + e.getKey() + " is " + e.getValue());
//        }

        for(var e : a.entrySet()){
            System.out.println("age of " + e.getKey() + " is " + e.getValue());
        }





    }
}
