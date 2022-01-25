package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem6 {
    private static ArrayList<Integer> solution(int N, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int []tmp = arr.clone();
        Arrays.sort(tmp);
        for(int i=0; i<N; i++){
            if(arr[i]!=tmp[i]){
                answer.add(i+1);
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(bufferedReader.readLine());

        int []arr = new int[N];

        st = new StringTokenizer(bufferedReader.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int x : solution(N, arr)){
            System.out.print(x + " ");
        }




    }
}
