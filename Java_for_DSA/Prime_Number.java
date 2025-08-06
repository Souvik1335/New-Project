import java.util.Scanner;
public class Prime_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to check: ");
        int a = sc.nextInt();

        for(int i = 0; i < a; i++){
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            int count = 0;
            for(int div = 1; div <= n; div++){
                if(n % div == 0){
                    count++;
                }
            }

            if(count == 2){
                System.out.println("This is a Prime Number");
            } else {
                System.out.println("This is not a Prime Number");
            }
        }
    }
}
