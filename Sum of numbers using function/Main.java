import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner s1 = new Scanner(System.in);
      int n = s1.nextInt();
      int sum=sum_digits(n);
      System.out.println(sum);
	    
	}
   public static int  sum_digits(int n)
   {
     int sum1=0;
     for(int i=1;i<=n;i++)
     {
       sum1= sum1+i;
     }
     return sum1;
   }
}