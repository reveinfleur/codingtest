package two_pointer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {
    public static int N;
    public static int M;
    public static int lt=0;
    public static int rt=0;
    public static int solution(List<Integer> list){
        int answer= 0;
        int count = 0;
        for(int rt=0; rt<N; rt++){
            answer+=list.get(rt);
            System.out.println(answer);
            if(answer==M){
                count++;
            }
            while (answer>=M){
                answer-=list.get(lt++);
                if(answer==M){
                    count++;
                }
            }

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            list.add(sc.nextInt());
        }

        System.out.println("count"+solution(list));


    }
}
