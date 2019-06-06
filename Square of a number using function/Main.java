import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	   Scanner s1 = new Scanner(System.in);
       int n = s1.nextInt();
       int sqrt = sqr(n);
       System.out.println(sqrt);
	} 
   public static int sqr(int n)
   {
     int srt = n*n;
     return srt;
   }
}