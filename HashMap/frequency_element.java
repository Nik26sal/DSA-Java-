package hashmap;

import java.util.HashMap;

public class frequency_element {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,1,4,1};
        HashMap<Integer,Integer> s = new HashMap<>();
        int i =0;
        while(i<arr.length){
            if(s.containsKey(arr[i])){
                int d = s.get(arr[i]);
                s.put(arr[i],d+1);
            }
            else{
                s.put(arr[i],1);
            }
            i++;
        }
        System.out.println(s.entrySet());
    }
}
