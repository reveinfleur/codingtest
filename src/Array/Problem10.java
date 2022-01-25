package Array;

import java.util.*;

public class Problem10 {
    public static int solution(int [][]arr){
        List<Integer> answer = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();

        int sum = 0;
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                sum += ints[j];
            }
            answer.add(sum);
            sum = 0;
        }
        answer2.add(Collections.max(answer));
        answer.clear();


        for(int i=0; i< arr.length; i++){
            for (int[] ints : arr) {
                sum += ints[i];
            }
            answer.add(sum);
            sum = 0;
        }
        answer2.add(Collections.max(answer));

        for(int i=0; i< arr.length; i++){
            sum+=arr[i][i];
        }
        answer2.add(sum);

        for(int i = arr.length-1; i==0; i--){
            sum+=arr[i][i];
        }
        answer2.add(sum);



        return Collections.max(answer2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][]arr = new int[n][n];
        int []arr2 = {1, 2, 3};
        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println(solution(arr));
    }
}
