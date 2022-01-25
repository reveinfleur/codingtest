package StringProblem;

import java.util.Scanner;

public class Problem9 {
    public static int solution(String input){
        input = input.replaceAll("[^0-9]", "");

        int tmp = Integer.parseInt(input);

        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        System.out.println(solution(input));

    }
}
