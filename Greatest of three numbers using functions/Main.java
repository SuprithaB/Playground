import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner s = new Scanner(System.in);
      int n1=s.nextInt();
      int n2= s.nextInt();
      int n3 = s.nextInt();
      int result = greatest(n1,n2);
      System.out.println(greatest(result,n3));
      
	}
   public static int greatest(int n1,int n2)
   {
     int max =0;
     if(n1>n2)
     {
       max=n1;
     }
     else
     {
       max= n2;
     }
     while(max>=1)
     {
       return max;
     }
     return 0;
   }
  
}