package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Problem11 {
    public static int n;

    public static int solution(int [][]arr){
        int answer = 0;
        int max = 0;

        for(int i=1; i<=n; i++){
            int count = 0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(arr[i][k]==arr[j][k]){
                        count++;
                        break;
                    }
                }
            }
            if(count>max){
                max=count;
                answer=i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [][]arr = new int[n+1][6];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println(solution(arr));

    }
}
