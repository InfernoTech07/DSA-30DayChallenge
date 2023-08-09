import java.util.Scanner;
public class Armstrong {

    public void ArmstrongNumber(int num){
         int temp=num;
        int sum=0;
        //System.out.println("Enter number:");
        //Scanner sc=new Scanner(System.in);
        //num=sc.nextInt();
       
        while(num>0){
            int digit=num%10;
            sum=sum+(digit*digit*digit);
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }


    }
    public static void main(String args[]){
        Armstrong a=new Armstrong();
        a.ArmstrongNumber(153);

    }

    
    
}
