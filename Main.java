import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            int count=0;
            for(int div=2;div*div<=n;div++){
                if(n%div==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("its a prime");
            }else{
                System.out.println("its not a prime");
            }
        }       
    }
}