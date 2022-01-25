package StringProblem;

import java.util.Scanner;

public class Problem2 {
    public static String solution(String input){
        String answer="";

        for(char x: input.toCharArray()){
            if(Character.isLowerCase(x)){
                answer+=Character.toUpperCase(x);
            }
            else {
                answer+=Character.toLowerCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        System.out.println(solution(input));
    }
}
