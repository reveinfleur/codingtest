package Hash;

import java.util.*;

public class Problem5 {
    public static int N;
    public static int K;
    public static int solution(int []arr){
        int answer=  -1;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    treeSet.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }

        int i = 0;
        for(int x : treeSet){
            i++;
            if(i == K){
                answer = x;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();

        int []arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr));



    }
}
