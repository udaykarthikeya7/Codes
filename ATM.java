import java.util.Scanner;

class ATM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // withdrawal amount
        double y = sc.nextDouble(); // account balance
        double rem = y;
        if (x > y-0.50) rem = y;
        else {
            if (x % 5 == 0) rem = y - x - 0.50;
        }

        System.out.println(String.format("%.2f", rem));

        sc.close();

    }
}