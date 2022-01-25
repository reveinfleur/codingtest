package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem9 {
    private static int count(int []arr, int capacity){
        int cnt = 1;
        int sum = 0;
        for(int x : arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            }
            else {
                sum+=x;
            }
        }

        return cnt;

    }
    private static int solution(int n, int m, int []arr){
        int answer= 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr, mid)<=m){
                answer=mid;
                rt = mid-1;
            }
            else {
                lt = mid+1;
            }
        }//DFFD 2c 3c


        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = null;

        st1 = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        int []arr = new int[n];

        st1 = new StringTokenizer(bufferedReader.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        System.out.println(solution(n, m, arr));

    }
}
