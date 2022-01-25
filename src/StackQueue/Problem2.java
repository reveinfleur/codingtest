package StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem2 {
    private static String solution(String input){
        String answer="";
        Stack<Character> stack = new Stack<>();

        for(char x : input.toCharArray()){
            stack.push(x);
            if(x==')'){
                while (stack.peek()!='('){
                    stack.pop();
                }
                stack.pop();
            }

        }
        for (Character character : stack) {
            answer += character;
        }



        return answer;
    }
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input="";
        try {
            input = bufferedReader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(solution(input));
    }

}
