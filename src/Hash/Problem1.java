package Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Problem1 {
    public static int N;

    public static char solution(String input){
        char answer=' ';
        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : input.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
           if(map.get(key)>max){
               max=map.get(key);
               answer = key;
           }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N= sc.nextInt();
        String input = sc.next();

        System.out.println(solution(input));
    }
}
