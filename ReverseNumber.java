import java.util.Scanner;
public class ReverseNumber {
    
    public static void main(String args[]){
         int num;
         int rev=0;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter Number:");
         num=sc.nextInt();

         while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
            
         }
         
         System.out.print("Reverse No:"+rev);
         
    }
}
