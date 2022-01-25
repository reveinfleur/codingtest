package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem1 {
    public static List<Integer> solution(List<Integer> list){
        List<Integer> answer = new ArrayList<>();

        answer.add(list.get(0));
        for(int i=1; i< list.size(); i++){
            if(list.get(i)>list.get(i-1)){
                answer.add(list.get(i));
            }

        }
        return answer;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();


        for(int i=0; i<n; i++){
           list.add(sc.nextInt());
        }
        for(int x : solution(list)){
            System.out.print(x+" ");
        }
       // System.out.println(solution(list));
    }
}
