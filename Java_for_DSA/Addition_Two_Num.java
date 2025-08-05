import java.util.Scanner;
public class Addition_Two_Num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("The sum of those two number is : " +sum);
    }
}