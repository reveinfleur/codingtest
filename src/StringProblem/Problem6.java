package StringProblem;

import java.util.Scanner;

public class Problem6 {
    public static String solution(String input){
        String answer="";

        for(int i=0; i<input.length(); i++){
            if(input.indexOf(input.charAt(i))==i){
                //(a)==0
                answer+=input.charAt(i);
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(solution(input));
    }
}
