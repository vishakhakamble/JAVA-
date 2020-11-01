import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice;
        int doit;
        Management management=new Management();

        do {
            System.out.println("Choose an option");
            System.out.println("1.Add Products");
            System.out.println("2.View Products");
            System.out.println("3.Sort By Price");
            System.out.println("4.Delete By Name");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    management.addProduct();
                    break;
                }
                case 2: {
                    management.displayProducts();
                    break;
                }
                case 3:{
                    management.sortAndDisplay();
                    break;
                }

                case 4:{
                    management.delete();
                    break;
                }
                default: {
                    System.out.println("please select a valid option");
                }
            }

            System.out.println("do u want to continue? 1-yes/ 0-no");
            doit=sc.nextInt();

        }
        while(doit==1);


    }
}
