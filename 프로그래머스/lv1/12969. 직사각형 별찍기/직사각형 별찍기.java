import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String answer = "";
        for (int j =0; j <b; j ++){
            for (int i =0; i< a ; i++){
                answer += "*";
            }
            if ( j != b){
                answer += "\n";
            }
        }
        
        
        System.out.println(answer);
    }
}