package Hash;

import java.util.HashMap;
import java.util.Scanner;

public class Problem4 {
    public static String a;
    public static String b;
    public static int solution(){
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for(char x : b.toCharArray()){
            bm.put(x, bm.getOrDefault(x, 0)+1);
        }

        int lCount = b.length()-1;

        for(int i=0; i<lCount; i++){
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0)+1);
        }

        int lt=0;

        for(int rt = lCount; rt<a.length(); rt++){
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
            if(am.equals(bm)){
                answer++;
            }
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt))==0){
                am.remove(a.charAt(lt));
            }
            lt++;
        }



        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        a = sc.next();
        b = sc.next();

        System.out.println(solution());


    }
}
