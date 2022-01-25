package two_pointer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem6 {
    public static int N;
    public static int k;
    public static int lt =0 ;
    public static int rt = 0;
    public static int solution(List<Integer> list){
        int answer=0;
        int count =0;
        int lt = 0;

        for(rt = 0; rt<N; rt++){
            if(list.get(rt)==0){
                count++;
            }
            while (count>k){
                if(list.get(lt)==0){
                    count--;
                }
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            list.add(sc.nextInt());
        }

        System.out.println(list);

        System.out.println(solution(list));
    }
}
