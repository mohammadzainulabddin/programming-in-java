import java.util.Scanner;
import java.io.*;
public class FibonaciiSeries {
public static void main(String[] args){
int my_input, i, sum;
System.out.println("Required packages have been imported");
Scanner my_scanner = new Scanner(System.in);
System.out.println("A reader object has been defined ");
System.out.println("Enter the value of N: ");
my_input = my_scanner.nextInt();
int fibonacci[] = new int[2 * my_input + 1];
fibonacci[0] = 0;
fibonacci[1] = 1;
sum = 0;
for (i = 2; i <= 2 * my_input; i++) {
fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
d
if (i % 2 == 0)
sum += fibonacci[i];
}
System.out.printf("Even sum of fibonacci series till number %d is %d" , my_input, sum);
 }
}