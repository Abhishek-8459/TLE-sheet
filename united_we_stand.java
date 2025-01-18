import java.util.Scanner;

public class united_we_stand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int y = 0 ; y < t ; y++){
            int n = sc.nextInt();
            int[] arr=new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i]=sc.nextInt();
            }
            boolean check = true;
            for(int  i = 0 ; i<n-1 ; i++){
                if(arr[i]!=arr[i+1]){
                    check=false;
                    break;
                }
            }

            if(check){
                System.out.println(-1);
            }
            else{
                int min =Integer.MAX_VALUE;
                for(int i = 0 ; i < n ; i++){
                    if(arr[i]<min){
                        min=arr[i];
                    }
                }

                int count = 0;
                for(int i = 0 ; i < n ; i++){
                    if(arr[i]==min){
                        count++;
                    }
                }
                System.out.print(count+" "+(n-count));
                System.out.println();
                for(int i = 0 ; i < count ; i++){
                    System.out.print(min+" ");
                }
                System.out.println();
                for(int i = 0 ; i < n ; i++){
                    if(arr[i]!=min){
                        System.out.print(arr[i]+" ");
                    }
                    else {
                        continue;
                    }
                }
                System.out.println();
            }
        }
    }
}
