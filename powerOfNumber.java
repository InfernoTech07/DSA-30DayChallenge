import java.util.Scanner;
public class powerOfNumber {
    public static void main(String args[]){
        int n,p,result=1;
        System.out.print("Enter Number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print("Enter power:");
        p=sc.nextInt();

        for(int i=1;i<=p;i++){
            result=n*result;
        }
        System.out.print("result:"+result);


    }
    
}
