package StringProblem;

import java.util.Scanner;

public class Problem10 {
    public static int[] solution(String s, char t){
        int []answer = new int[s.length()];
        int count=1000;

       for(int i=0; i<s.length(); i++){
           if(s.charAt(i)==t){
               count=0;
               answer[i]=count;

           }
           else{
               count++;
               answer[i]=count;
           }
       }
       count=1000;

       for(int i=s.length()-1; i>=0; i--){
           if(s.charAt(i)==t){
               count=0;
           }
           else {
               count++;
               answer[i] = Math.min(answer[i], count);
           }

       }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char t = sc.next().charAt(0);

        for(int c : solution(s, t)){
            System.out.print(c+" ");
        }
    }
}
