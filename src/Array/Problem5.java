package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem5 {
    public static int solution(int n){

        int count = 0;
        int []arr = new int[n+1];

        for(int i=2; i<=n; i++){
            if(arr[i]==0){
                count++;
                for(int j=i; j<=n; j=j+i){ //2
                    arr[j]=1;
                }
            }
        }

        return count;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}
