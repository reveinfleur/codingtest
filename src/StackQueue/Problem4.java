package StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem4 {
    public static int solution(String input){
        int answer= 0;

        Stack<Integer> stack = new Stack<>();

        for(char x : input.toCharArray()){
            if(Character.isDigit(x)){
                stack.push(x-48);
            }
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x =='+')stack.push(lt+rt);
                else if(x=='-')stack.push(lt-rt);
                else if(x=='*')stack.push(lt*rt);
                else if(x=='/')stack.push(lt/rt);
            }
        }
        answer = stack.get(0);
        return answer;



    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();

        System.out.println(solution(input));


    }
}
