import java.util.Scanner;
class Main {
	public static void main (String[] args){
   Scanner s1 = new Scanner(System.in);
      int n = s1.nextInt();
      while (n > 100)
      {
         n = n / 10;
      }
      int second_digit = n % 10;
      System.out.println(second_digit);
    }
}