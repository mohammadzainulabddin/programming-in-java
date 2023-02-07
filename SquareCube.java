
import java.util.Scanner;
public class SquareCube
{
public static void main(String args[] )
{
int num;
System.out.print("Enter an integer number:\n");
Scanner obj=new Scanner(System.in );
num=obj.nextInt();
System.out.println("Square of "+ num + " is: "+ Math.pow(num,2));
System.out.println("Cube of "+ num + " is: "+ Math.pow(num, 3));
}
}
