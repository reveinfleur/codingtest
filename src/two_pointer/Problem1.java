package two_pointer;
import java.util.*;

public class Problem1 {

    public static List<Integer> solution(int []arr, int []brr){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i : arr){
            answer.add(i);
        }
        for(int i : brr){
            answer.add(i);
        }

        Collections.sort(answer);
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []arr = new int[N];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int []brr = new int[M];

        for(int i=0; i<brr.length; i++){
            brr[i] = sc.nextInt();
        }

        for(int x : solution(arr, brr)){
            System.out.print(x+" ");
        }
    }
}
