import java.util.Scanner;




public class Food
{
    
    int a = 100;
    int b = 100;
    int c = 100;
    int d = 120;
    int e = 130;
    int f = 300;
    int ch;
    int quantity;
    String again;
    static int ths;

    Scanner sc = new scanner(System.in);
    

    public void displayMenu()
    {
        System.out.println("**********Welcome to the world of RadhaKRishna restourant**********");
        System.out.println("____________1.a____________100/-");
        System.out.println("____________2.b____________100/-");
        System.out.println("____________3.c____________100/-");
        System.out.println("____________4.d____________120/-");
        System.out.println("____________5.e____________1030/-");
        System.out.println("____________6.f____________300/-");
        System.out.println("             Exit                ");
        System.out.println("What you want to ordered today?");

    }

    public void order()
    {
        while (true) {

            System.out.print("Enter your choice");
            Integer = sc.nextInt();
            switch (ch) {
                case 1:
                System.out.println("You have ordered a");
                System.out.println();
                System.out.println("Enter your desired quantity");
                quantity = sc.nextInt();
                total = total*a;
                    
                    break;
    
                    case 2:
                System.out.println("You have ordered b");
                System.out.println();
                System.out.println("Enter your desired quantity");
                quantity = sc.nextInt();
                total = total*b;
                    
                    break;
    
                    case 3:
                System.out.println("You have ordered c");
                System.out.println();
                System.out.println("Enter your desired quantity");
                quantity = sc.nextInt();
                total = total*c;
                    
                    break;
    
                    case 4:
                System.out.println("You have ordered d");
                System.out.println();
                System.out.println("Enter your desired quantity");
                quantity = sc.nextInt();
                total = total*d;
                    
                    break;
    
                    case 5:
                System.out.println("You have ordered e");
                System.out.println();
                System.out.println("Enter your desired quantity");
                quantity = sc.nextInt();
                total = total*e;
                    
                    break;

                    case 6:
                System.out.println("You have ordered f");
                System.out.println();
                System.out.println("Enter your desired quantity");
                quantity = sc.nextInt();
                total = total*f;
                    
                    break;

                    case 7:
                    System.exit(1);
                    break;

            
                default:
                    break;
    
                
            }

            System.out.println();
            System.out.print("DO wish to order anything else from our restourant(Y/N) : ");
            again = sc.next();
            if(again.equalsIgnoreCase("Y"))
            order();
            else if(again.equalsIgnoreCase(N));
            
            
        }
       
    }
}
