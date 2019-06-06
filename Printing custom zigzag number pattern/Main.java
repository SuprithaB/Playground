import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner s1 = new Scanner(System.in);
      int n = s1.nextInt();
      for(int row=1;row<=n;row++)
      {
        for(int col=1;col<=n;col++)
        {
          if(((row % 2 == 0) && (col == 1)) 
	                || ((row % 2 == 1) && (col == n)))
          {
            System.out.print(row+1);
          }
          else
          {
            System.out.print(row);
          }
        }
        System.out.print("\n");
      }

	}
}