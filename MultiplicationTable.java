import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Multiplication Table of "+num);
        for(int i=1;i<=num;i++)
        {
            System.out.println(i+"*"+num+"="+i*num);
        }
    }
}