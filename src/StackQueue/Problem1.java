package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Problem1 {
    private static String solution(String input){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
       for(char x : input.toCharArray()){
           if(x=='('){
               stack.push(x);
           }
           else {
               if(stack.isEmpty()){
                   return "NO";
               }
               stack.pop();
           }
        }
       if(!stack.isEmpty()){
           return "NO";
       }
       return answer;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(solution(input));
    }
}
