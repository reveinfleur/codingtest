package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10_1 {
    public static int n;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static int solution(int[][] arr){
        int answer = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag = true;
                for(int k=0; k<4; k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n &&arr[i][j]<=arr[nx][ny] ){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    answer++;
                }

            }
        }
        return answer;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int [][]arr = new int[n+1][n+1];



        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println(solution(arr));


        System.out.println(Arrays.deepToString(arr));



    }

}
