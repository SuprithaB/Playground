import java.util.Scanner;
class Main {
	public static void main (String[] args){
	 Scanner s1 = new Scanner(System.in);
      int n = s1.nextInt();
      for(int count = 1; count<=n;count++)
      {
        if(count % 2 == 1)
          System.out.println(count);
        count = count + 1;
      }
      
	}
}