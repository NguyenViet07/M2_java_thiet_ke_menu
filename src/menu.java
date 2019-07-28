import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        System.out.println("Menu");
        System.out.println("1. ve hinh tam giac ");
        System.out.println("2. ve hinh vuong ");
        System.out.println("3. ve hinh chu nhat ");
        System.out.println("0. Exit ");

        while (choice!=0){
            System.out.print("lua chon cua ban: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("hinh tam giac");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("hinh vuong");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("hinh chu nhat");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
                    break;
            }

        }

    }
}
