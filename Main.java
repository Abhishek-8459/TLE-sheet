import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
//        StringBuilder  = new StringBuilder();

        for(int y = 1 ; y <=t ; y++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr= new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i]=sc.nextInt();
            }
           int[] ans = new int[n+1];
            ans[0]=(k-arr[n-1])*2;
            ans[1]=(arr[0]);
            int j = 2;
            for(int i = n-1 ; i >0 ; i--){
                    ans[j] = arr[i] - arr[i - 1];
                j++;
            }

            int max = ans[0];
            for(int i:ans){
                if(i>max){
                    max =i;
                }
            }
            System.out.println(max);

           }



        sc.close();
    }
}
