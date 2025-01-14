package TLE;
import java.util.*;
public class Two_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int y = 0 ; y < t ; y++){
            int n = sc.nextInt();
            int  a= sc.nextInt();
            int b = sc.nextInt();
            if(a+b+2<=n){
                System.out.println("Yes");
            }
            else if(a==b && b==n){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
