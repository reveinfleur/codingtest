package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class plae {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = null;
        StringTokenizer st2 = null;
        int n = Integer.parseInt(bufferedReader.readLine());

        int []arr = new int[n];

        st = new StringTokenizer(bufferedReader.readLine());

        for(int i=0; i< n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }


        int m = Integer.parseInt(bufferedReader.readLine());
        st2 = new StringTokenizer(bufferedReader.readLine());
        int [][]arr2 = new int[m][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                arr2[i][j]=Integer.parseInt(st2.nextToken());
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2));


    }
}
