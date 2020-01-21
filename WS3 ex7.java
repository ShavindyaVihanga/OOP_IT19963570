import java.util.Scanner;
class Convert 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in LKR: ");
               double LKR = scanner.nextDouble();
       
       
    double Dollar = LKR / 182.26;
    double Pound  = LKR / 222.74;
    double Euro   = LKR / 206.36;
    
    System.out.println(+LKR+ "LKR =  " +Dollar+  " $" );
    System.out.println(+LKR+ "LKR =  " +Pound+  " Pounds" );
    System.out.println(+LKR+ "LKR =  " +Euro+  " Euros" );
    }
}