import java.util.Scanner;
class Price 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Item Name: ");
               String name = scanner.nextLine();
        System.out.print("Enter the unit Price: ");
               double itemprice = scanner.nextDouble();
        System.out.print("Enter the Quantity: ");
               int quan = scanner.nextInt();
        double cost = itemprice * quan;
               System.out.println("The Total cost will be"    +cost+    "rupees");
    
    }
}