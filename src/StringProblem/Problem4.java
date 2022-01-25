package StringProblem;

import java.util.*;

public class Problem4 {
    public static List<String> solution(List<String> input){
        List<String> answer = new ArrayList<>();

        for (String s : input) {
            answer.add(new StringBuilder(s).reverse().toString());
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        List<String> input = new ArrayList<>();

        for(int i=0; i<count; i++){
            input.add(sc.next());
        }

        for(String s: solution(input)){
            System.out.println(s);
        }


    }
}
