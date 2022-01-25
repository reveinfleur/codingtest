package StringProblem;

import java.util.Locale;
import java.util.Scanner;

public class Problem8 {
    public static String solution(String input){

        input=input.toUpperCase().replaceAll("[^A-Z]", "");

        StringBuilder sb = new StringBuilder(input);

        String tmp = sb.reverse().toString();

        if(input.equals(tmp)){
            return "YES";
        }
        else{
            return "NO";
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(solution(input));

    }
}
