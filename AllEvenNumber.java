import java.util.*;
public class AllEvenNumber {
    public static void main(String args[]){
        int n;
        System.out.print("Enter Number:");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();

        for(int i=0;i<=n;i=i+2){
            System.out.print(i+" ");

        }
    }
}
