package StringProblem;

import java.util.Scanner;

public class Problem11 {
    public  static String solution(String input){
        String answer="";
        input = input+" ";


        int count = 1 ;

        for(int i=0; i<input.length()-1; i++) {

            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            }
            else {
                answer+=input.charAt(i);
                if(count>1){
                    answer+=String.valueOf(count);
                    count=1;
                }

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
