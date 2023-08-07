import java.util.Scanner;
public class CountDigit {
    public static void main(String args[]){
        int n;
        int count=0;
        System.out.println("Enter number");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();

        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);


    }
    
}
