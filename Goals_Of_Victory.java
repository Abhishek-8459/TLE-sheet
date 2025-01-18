import java.util.Scanner;

public class Goals_Of_Victory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int y = 0 ; y < t ; y++){
            int n = sc.nextInt();
            int[] arr=new int[n-1];
            for(int i = 0 ; i < n-1 ; i++){
                arr[i]=sc.nextInt();
            }
            int ans = 0;
            for(int i = 0 ; i < n-1 ; i++){
                ans+=arr[i];
            }
            System.out.println(ans*-1);
        }
    }
}
