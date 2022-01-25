package StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem7 {
    private static String solution(String needSubject, String N){
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();

        for(char x : needSubject.toCharArray()){
            queue.offer(x);
        }

        for(char x : N.toCharArray()){
            if(queue.contains(x)){
                if(x!= queue.poll()){
                    return "NO";
                }
            }
        }
        if(!queue.isEmpty()){
            return "NO";
        }

        return answer;

    }
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String needSubject = bufferedReader.readLine();

        String N = bufferedReader.readLine();

        System.out.println(solution(needSubject, N));



    }
}
