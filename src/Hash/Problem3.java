package Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
    public static int N;
    public static int K;

    public static List<Integer> solution(int []arr){

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> answer= new ArrayList<>();

        for(int i=0; i<K-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        int lt = 0;
        for(int rt = K-1; rt<N; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt])-1);
            if(map.get(arr[lt])==0){
                map.remove(arr[lt]);
            }
            lt++;

        }

        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        N = sc.nextInt();
        K = sc.nextInt();
        int []arr  = new int[N];

        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }

        for(int x : solution(arr)){
            System.out.print(x+" ");
        }



    }
}
