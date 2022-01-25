package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {
    public static void solution(int n)
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        int a = 1, b= 1, c;
        for(int i=2; i<n; i++){
            list.add(list.get(i-2)+list.get(i-1));

        }
        for (int x : list){
            System.out.print(x+" ");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        solution(n);




    }
}
