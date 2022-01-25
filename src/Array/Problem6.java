package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//스트링으로 입력받음
//빌더 사용해서 리버스

public class Problem6 {
    public static boolean primeTest(int res){

        if(res==1){
            return false;
        }
        else{
            for(int i=2; i<res; i++){
                if(res%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static List<Integer> solution(List<Integer> list){

        List<Integer> answer = new ArrayList<>();

        for(int i=0; i< list.size(); i++){
           int tmp = list.get(i);
           int res = 0;
           while (tmp>0){
               int t = tmp%10;
               res = res*10 +t;
               tmp = tmp/10;
           }
            if(primeTest(res)) {
                answer.add(res);
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        for(int s : solution(list)){
            System.out.print(s+" ");
        }
    }
}
