import java.util.Scanner;
public class Main{
public static int gcd(int n1,int n2)
  {
    int temp =0;
    if(n1<n2)
    {
      temp =n1;
    }
    else
    {
      temp =n2;
    }
    while(temp>=1)
    {
       if((n1%temp ==0) && (n2%temp==0))
       {
         return temp;
       }
       --temp;
    }
    return 0;
  }
  
	public static void main (String[] args){
      Scanner s1 = new Scanner(System.in);
      int n1 = s1.nextInt();
      int n2 = s1.nextInt();
      int n3= s1.nextInt();
      int result = gcd(n1,n2);
      System.out.println(gcd(result,n3));
      
	  
	}
}
