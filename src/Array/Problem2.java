package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
    public static int solution(List<Integer> input){

        int answer = 0;
        int max = input.get(0);

        for(int i=1; i<input.size(); i++){

            if(input.get(i)>max){
                answer++;
            }
            max = input.get(i);


        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> input = new ArrayList<>();

        for(int i = 0; i<n; i++){
            input.add(sc.nextInt());
        }

        System.out.println(solution(input));

    }

}
