package StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class Problem3 {

    public static int solution(int[][] board, int[] moves){
        int answer=0;
        Stack<Integer> stack = new Stack<>();

        for(int move : moves){
            for(int i=0; i< board.length; i++){
                if(board[i][move-1]!=0){
                    int tmp = board[i][move-1];
                    board[i][move-1]=0;
                    if(!stack.isEmpty()&& tmp==stack.peek()){
                        answer+=2;
                        stack.pop();
                    }
                    else {
                        stack.push(tmp);
                    }
                    break;
                }
            }

        }

        return answer;
    }
    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(bufferedReader.readLine());

        int [][]board = new int[N][N];
        for(int i=0; i<N; i++){
            String []token = bufferedReader.readLine().split(" ");
            for(int j=0; j<N; j++){
              board[i][j]=Integer.parseInt(token[j]);
            }
        }

        int M =  Integer.parseInt(bufferedReader.readLine());
        st = new StringTokenizer(bufferedReader.readLine());
        int []moves = new int[M];
        for(int i=0; i<M; i++)
        {
            moves[i]=Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(board, moves));
    }
}