package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem8 {
    private static int solution(int []arr, int M, int N){
        int answer = 0;
        Arrays.sort(arr);

        int lt = 0, rt = N-1;
        while (lt<=rt){
            int mid = (lt+rt)/2;
            if(arr[mid]==M){
                answer = mid+1;
                break;
            }
            if (arr[mid]>M) {
                rt = mid-1;
            }
            else {
                lt = mid+1;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = null;
        StringTokenizer st2 = null;

        st1 = new StringTokenizer(bufferedReader.readLine());

        int N =  Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        int []arr = new int[N];

        st2 = new StringTokenizer(bufferedReader.readLine());

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(solution(arr, M, N));
    }
}
