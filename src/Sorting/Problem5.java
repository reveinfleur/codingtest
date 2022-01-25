package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem5 {
    private static String solution(int n, int[] arr){
        String answer = "U";

        Arrays.sort(arr);

        for(int i=0; i<n-1; i++){
            if(arr[i] ==arr[i+1]){
                return "D";
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = null;

        int n = Integer.parseInt(bufferedReader.readLine());

        int []arr = new int[n];

        st1 = new StringTokenizer(bufferedReader.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        System.out.println(solution(n, arr));




    }
}
