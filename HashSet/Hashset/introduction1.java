package Hashset;

import java.util.HashSet;

public class introduction1 {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        for(var i: set){
            System.out.println(i);
        }
    }
}
