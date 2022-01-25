package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem3 {
    private static int[] solution(int N, int []arr){

        for (int i=1; i<N; i++){
            int tmp = arr[i], j;
            for(j=i-1; j>=0; j--){
                if(arr[j]>tmp)
                    arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(bufferedReader.readLine());

        st = new StringTokenizer(bufferedReader.readLine());

        int []arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        for(int x : solution(N, arr)){
            System.out.print(x+" ");
        }


    }
}
