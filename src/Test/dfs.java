package Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class dfs {
    public static int pointer;
    public static int edges_num;
    public static int[][] solution;
    public static boolean[] dfs_flag;
    public static boolean[] bfs_flag;
    public static int startPoint;
    public static Stack<Integer> stack = new Stack<>();
    public static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        pointer = sc.nextInt()+1;
        edges_num = sc.nextInt();
        startPoint = sc.nextInt();

        solution = new int[pointer][pointer];
        dfs_flag = new boolean[pointer];
        bfs_flag = new boolean[pointer];

        for(int i = 0; i< edges_num; i++){
            int head = sc.nextInt();
            int tail = sc.nextInt();
            solution[head][tail] = 1;
            solution[tail][head] = 1;
        }

        DFS(startPoint);

        BFS(startPoint);
    }

    public static void DFS(int startPoint){
        dfs_flag[startPoint] = true;
        while(!stack.empty()){
            int curVertex = stack.pop();
            System.out.print(curVertex+" ");
            for(int i = 0; i<pointer; i++){
                if(solution[curVertex][i] == 1 && !dfs_flag[i]){
                    DFS(i);
                }
            }
        }
    }

    public static void BFS(int startPoint) {
        queue.offer(startPoint);
        bfs_flag[startPoint] = true;
        while (!queue.isEmpty()) {
            int curVertex = queue.poll();
            System.out.print(curVertex + " ");
            for (int i = 0; i < pointer; i++) {
                if (solution[curVertex][i] == 1 && !bfs_flag[i]) {
                    queue.offer(i);
                    bfs_flag[i] = true;
                }
            }
        }
    }
    static class Node{
        int start;
        int end;
    }
}

