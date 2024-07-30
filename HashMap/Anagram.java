package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss = sc.nextLine();
        if (s.length() != ss.length()) {
            System.out.println("false");
        } else {
            HashMap<Character, Integer> s1 = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char d = s.charAt(i);
                if (s1.containsKey(d)) {
                    s1.put(d, s1.get(d) + 1);
                } else {
                    s1.put(d, 1);
                }
            }
            HashMap<Character, Integer> s2 = new HashMap<>();
            for (int i = 0; i < ss.length(); i++) {
                char d = ss.charAt(i);
                if (s2.containsKey(d)) {
                    s2.put(d, s2.get(d) + 1);
                } else {
                    s2.put(d, 1);
                }
            }
            if (s1.equals(s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
