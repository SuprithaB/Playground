import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner s1 = new Scanner(System.in);
      int num = s1.nextInt();
      int cp_num = num;
      int sum =0;
      while(num > 0)
      {
        int rem = num % 10 ;
        int fact =1;
        for(int i=1;i<=rem;i++)
        {
          fact = fact*i;
        }
        sum = sum+fact;
        num = num/10;
      }
      if(cp_num==sum)
      {
         System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      
	}
}