package StringProblem;

import java.util.Locale;
import java.util.Scanner;

public class Problem7 {
    public static String solution(String input){
        String answer="";

        String input2 = input.toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder(input2);
        if(input2.equals(sb.reverse().toString())){
            answer="YES";
        }
        else{
            answer="NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(solution(input));

    }
}
