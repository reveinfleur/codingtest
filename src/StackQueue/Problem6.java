package StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem6 {
    public static int solution(int N, int K){
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=N; i++){
            queue.offer(i);
        }
        while (!queue.isEmpty()){
            for(int i=1; i<K; i++){
                queue.offer(queue.poll());
            }
            queue.poll();
            if(queue.size()==1){
                answer= queue.poll();
            }
        }


        return answer;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();

        StringTokenizer st = new StringTokenizer(input);

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());




        System.out.println(solution(N, K));
    }
}
