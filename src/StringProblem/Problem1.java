package StringProblem;

import java.util.Locale;
import java.util.Scanner;

public class Problem1 {
    public static int solution(String line,char search){
        int answer = 0;

        for (int i = 0; i < line.length(); i++) {
            if (search == line.charAt(i)) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String line = sc.next();

            String linetouppser = line.toLowerCase(Locale.ROOT);

            char search = sc.next().toLowerCase(Locale.ROOT).charAt(0);

            System.out.println(solution(linetouppser, search));

    }
}
