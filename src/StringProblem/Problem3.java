package StringProblem;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static String solution(String input) {
        String answer="";

        String[] arr = input.split(" ");
        int max=0;
        int count=0;
        for(int i=0; i<arr.length; i++){
            count = arr[i].length();
            if(count>max){
                max=count;
                answer = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(solution(input));
    }
}
