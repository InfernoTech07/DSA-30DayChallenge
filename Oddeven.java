import java.util.Scanner;
public class Oddeven {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        n=sc.nextInt();

        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
    
}
