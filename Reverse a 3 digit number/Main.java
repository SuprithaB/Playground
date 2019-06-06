import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s1=new Scanner(System.in);
    int n1=s1.nextInt();
    int rev=0;
    while(n1!=0)
    {
      int d=n1%10;
      rev=rev*10+d;
      n1=n1/10;
    }
    System.out.println(rev);
  }
}