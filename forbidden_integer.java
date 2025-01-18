import java.util.Scanner;

public class forbidden_integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int y=0;y<t;y++){
            int n= sc.nextInt();
            int k= sc.nextInt();
            int x=sc.nextInt();
            if(x!=n && n<=k){
                System.out.println("Yes");
                System.out.println(1);
                System.out.println(n);
            }
            else if(k==1){
                System.out.println("No");
            }
            else if(x!=1){
                System.out.println("Yes");
                System.out.println(n);
                for(int i = 0 ; i < n ; i++){
                    System.out.print(1+" ");
                }
                System.out.println();
            }
            else if(n%2==0 && x!=2 && 2<=k){
                System.out.println("Yes");
                System.out.println(n/2);
                for(int i = 0 ; i < n/2 ; i++){
                    System.out.print(2+" ");
                }
                System.out.println();
            }
            else if(k>=3)  {
                System.out.println("Yes");
                System.out.println((n/2));
                for(int i = 1 ; i <=(n/2)-1 ; i++){
                    System.out.print(2+" ");
                }
                System.out.print(3);
                System.out.println();
            }
            else{
                System.out.println("No");
            }
        }
    }
}
