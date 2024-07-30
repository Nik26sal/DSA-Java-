package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class isomorphic_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss = sc.nextLine();
        if (s.length() != ss.length()) {
            System.out.println("false");
        }
        else{
            int c = 0;
            HashMap<Character,Character> s1 = new HashMap<>();
            for(int i =0;i<s.length();i++){
                char d = s.charAt(i);
                char f = ss.charAt(i);
                if(s1.containsKey(d)){
                    if(!s1.get(d).equals(f)){
                        c = 1;
                        break;
                    }
                }
                else{
                    s1.put(d,f);
                }
            }
            if (c == 1) {
                System.out.println("false");
            } else {
                System.out.println("true");  // Change "false" to "true"
            }

        }
    }
}
