package two_pointer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
    public static int N;
    public static int K;

    public static int solution(List<Integer> list){
        int answer= 0;
        int flag = 0;

        for(int i=0; i<K; i++){
            flag += list.get(i);
        }
        answer=flag;

        for(int i = K; i<list.size(); i++){
            flag += (list.get(i)-list.get(i-K));
            answer= Math.max(answer, flag);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();

        List<Integer> list = new ArrayList<>();

       for(int i=0; i<N; i++){
           list.add(sc.nextInt());
       }

        System.out.println(solution(list));
    }
}
