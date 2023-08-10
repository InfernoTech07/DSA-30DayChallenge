import java.util.Scanner;
public class Fibonaci {

    public static void main(String args[]){
        int term;
        int a=0,b=1,c;
        //a=num1 , b= num2 ,c= next num

        System.out.print("enter term:" );
        Scanner sc=new Scanner(System.in);

        term=sc.nextInt();
        for(int i=1;i<=term;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
    
}
