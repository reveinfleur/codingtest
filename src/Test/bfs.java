package Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //4. 6
        int m = sc.nextInt();
        int size = n * m;
        LinkedList<Integer> queue = new LinkedList<>();
        int[] list = new int[size];
        int emptyCount = 0;

        for (int i = 0; i < size; i++) { //
            int input = sc.nextInt();
            list[i] = input;
            if(input == 0) emptyCount += 1;
            else if(input == 1) queue.offer(i);
        }

        if(emptyCount == 0){
            System.out.println(0);
            return;
        }else{
            int day = -1;
            int changes = 0;
            while(!queue.isEmpty()) { // day count
                day += 1;
                int queue_size = queue.size();
                for(int q = 0; q< queue_size; q++){
                    int i = queue.poll(); //23
                    System.out.println(i); //23+4 && list[23+4]
                    if (i + n < size && list[i + n] == 0) { // 위
                        list[i+n] = day+2;
                        queue.offer(i + n); //x +
                        changes += 1;
                    }
                    if (i - n >= 0 && list[i - n] == 0) { // 아래
                        list[i-n] = day+2;
                        queue.offer(i - n); // x-
                        changes += 1;
                    }
                    if (i + 1 < size && (i + 1) % n != 0 && list[i + 1] == 0) { // 오른쪽
                        list[i+1] = day+2;
                        queue.offer(i + 1);// y+
                        changes += 1;
                    }
                    if (i - 1 >= 0 && (i - 1) % n != n - 1 && list[i - 1]  == 0) { // 왼쪽
                        list[i-1] = day+2;
                        queue.offer(i - 1); //y-
                        changes += 1;
                    }
                }
            }
            if(changes != emptyCount){
                System.out.println(-1);
            }
            else{
                System.out.println(day);
            }
        }
    }
}



