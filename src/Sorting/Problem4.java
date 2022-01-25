package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem4 {
    private static int[] solution(int S, int N, int []arr){

        int []cache = new int[S];

        for(int x : arr){
            int pos = -1;
            for(int i=0; i<S; i++){
                if(cache[i]==x){ //cache hit
                    pos=i;
                }
            }
            if(pos==-1){ //cache miss
                for(int i=S-1; i>=1; i--){
                   cache[i]=cache[i-1];
                }
                cache[0]=x;
            }
            else {
                for(int i=pos; i>=1; i--){
                    cache[i]=cache[i-1];
                }
                cache[0]=x;
            }
        }



        return cache;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st =null;
        StringTokenizer st2 = null;

        st = new StringTokenizer(bufferedReader.readLine());

        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int []arr = new int[N];

        st2 = new StringTokenizer(bufferedReader.readLine());

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for(int x : solution(S, N, arr)){
            System.out.print(x + " ");
        }



    }
}
