package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1 {
    private static int[] solution(int n, int []arr){

        for(int i=0; i<n-1; i++){
            int idx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        return arr;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int []arr = new int[n];

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        for(int i=0; i<n; i++){
            arr[i] =Integer.parseInt(st.nextToken());
        }

        for(int x : solution(n, arr)){
            System.out.print(x+" ");
        }




    }
}
