package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem8 {
    public static int solution(List<Integer> list){

        List<Integer> answer = new ArrayList<>();
        int count=0;
        int sum = 0;

        answer.add(list.get(0));

        for(int i=1; i<list.size(); i++){
            if(list.get(i)==0){
                answer.add(0);
                count=0;
            }
            if(list.get(i)==1&&list.get(i-1)==0){
                answer.add(1);
                count++;
            }
            if(list.get(i)==1&&list.get(i-1)==1){
                count++;
                answer.add(count);
            }
        }
        for(int s : answer){
            sum+=s;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            list.add(sc.nextInt());
        }
        System.out.println(solution(list));
    }
}
