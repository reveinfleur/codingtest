package two_pointer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem5 {
    public static int N;
    public static int M;
    public static int rt=0;
    public static int lt=0;
    public static int solution(List<Integer> list){
        int answer= 0;
        int sum = 0;

        for(rt=0; rt<M; rt++){
            sum += list.get(rt);
            if(sum==N){
                answer++;
            }
            while (sum>=N){
                sum -= list.get(lt++);
                if(sum==N){
                    answer++;
                }
            }

        }


        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = (N/2)+1;
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=N; i++){
            list.add(i);
        }


        System.out.println(solution(list));
    }
}
