package Hash;

import java.util.HashMap;
import java.util.Scanner;

public class Problem2 {
    public static String solution(String input, String input2){
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : input.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        for(char x : input2.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0){
                return "NO";
            }
            map.put(x, map.get(x)-1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String input2 = sc.next();

        System.out.println(solution(input, input2));
    }
}
