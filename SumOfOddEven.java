import java.util.*;
public class SumOfOddEven {
    public static void main(String args[]){
        int n;
        int sum=0;
        System.out.println("Enter Number Even or Odd: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        if(n%2==0){
             for(int i=0;i<=n;i=i+2){
                sum=sum+i;
                System.out.print(i+" ");

             }
             System.out.println("Sum of Even No: "+sum);
        }
        else{
            for(int i=1;i<=n;i=i+2){
                sum=sum+i;
                System.out.print(i+" ");
                

            }
            System.out.println("Sum of odd no:"+sum);

        }

    }
}
