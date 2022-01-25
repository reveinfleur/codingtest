package Test;

import java.util.Scanner;

public class PLAE2 {
    public static int solution(int n){
        int answer = 0;
        String input = String.valueOf(n);

        String op = input.substring(n);

        answer = Integer.parseInt(op);

        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(solution(n));

    }

}
