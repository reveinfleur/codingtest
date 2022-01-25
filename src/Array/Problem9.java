package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem9 {
    public static List<Integer> solution(List<Integer> list){
        List<Integer> answer = new ArrayList<>();

        int count = 1;

        for(int i=0; i<list.size(); i++){
            for(int j=0; j< list.size(); j++){
                if(list.get(i)< list.get(j)){ //1 1
                    count++;
                }
            }
            answer.add(count);
            count=1;
        }

        return answer;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }

        for(int x : solution(list)){
            System.out.print(x+" ");
        }

    }
}
