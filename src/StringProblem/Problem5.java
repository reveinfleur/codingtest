package StringProblem;

import java.util.Scanner;

public class Problem5 {
    public static String solution(String input){
        String answer;

        char[] arr = input.toCharArray();
        int start=0;
        int end = arr.length-1;


        while (start<=end){
            if(!Character.isAlphabetic(arr[start])){
                start++;
            }
            else if(!Character.isAlphabetic(arr[end])){
                end--;
            }
            else { //특문일시

                char tmp = arr[end];
                arr[end] = arr[start];
                arr[start] = tmp;

                start++;
                end--;
            }
        }
        return answer = String.valueOf(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        System.out.println(solution(input));
    }
}
