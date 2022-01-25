package StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem8 {
    static class Person{
        int id;
        int priority;
        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }
    private static int solution(int n, int m, int []arr){
        int answer= 1;
        Queue<Person> queue = new LinkedList<>();

        for (int i=0; i<n; i++){
            queue.offer(new Person(i, arr[i]));
        }
        while (!queue.isEmpty()){
            Person tmp = queue.poll();
            for(Person x : queue){
                if(x.priority>tmp.priority){
                    queue.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                if(tmp.id==m){
                    return answer;
                }
                else {
                    answer++;
                }
            }

        }


        return answer;

    }
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(bufferedReader.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(solution(n, m, arr));



    }
}
