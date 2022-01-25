package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Problem12 {
    public static int n;
    public static int m;
    public static int answer = 0;


    public static int solution(int[][] arr){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int cnt = 0;
                for(int k=0; k<m; k++){
                    int pi = 0, pj=0;
                    for(int s=0; s<n; s++){
                        if(arr[k][s]==i){
                            pi=s;
                        }
                        if(arr[k][s]==j){
                            pj=s;
                        }
                    }
                    if(pi<pj){
                        cnt++;
                    }


                }
                if(cnt==m){
                    answer++;
                }

            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr));



    }
}
