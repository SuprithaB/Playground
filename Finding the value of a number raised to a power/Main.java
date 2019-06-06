import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int base =s.nextInt();
        int expo=s.nextInt();
        int count=0,res=1;
        while(count<expo)
        {
          res=res*base;
          count++;
        }
      System.out.println(res);
    }
}