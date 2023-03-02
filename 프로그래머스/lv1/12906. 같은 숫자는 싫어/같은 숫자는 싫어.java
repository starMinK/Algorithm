import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            //System.out.println(list.get(list.size()-1) );
            if( i == 0 ){
                list.add(arr[i]);
                continue;
            }
            
            if(list.get(list.size()-1) != arr[i]){
                list.add(arr[i]);
            }
        }
        
        return list;
    }
}