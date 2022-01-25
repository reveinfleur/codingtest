package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
    public static List<String> solution(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> playerA = new ArrayList<>();
        List<Integer> playerB = new ArrayList<>();
        List<String> answer = new ArrayList<>();

        for(int i = 0; i<n; i++){
            playerA.add(sc.nextInt());
        }
        for(int i = 0; i<n; i++){
            playerB.add(sc.nextInt());
        }
        for(int i = 0; i<n; i++){
            if(playerA.get(i)==playerB.get(i)){
                answer.add("D");
            }else if(playerA.get(i)==2&&playerB.get(i)==1){
                answer.add("A");
            }else if(playerA.get(i)==1&&playerB.get(i)==3){
                answer.add("A");
            }else if(playerA.get(i)==3&&playerB.get(i)==2){
                answer.add("A");
            }else{
                answer.add("B");
            }
        }
        return answer;

    }


    public static void main(String[] args) {


        for(String s : solution()){
            System.out.println(s);
        }

    }

}
