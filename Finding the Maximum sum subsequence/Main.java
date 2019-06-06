import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
     int n=s.nextInt();
    int a[]=new int[20];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    System.out.println(sum_of(a,n));
    
  }
  public static int sum_of(int a[],int n)
  {
    int rsum,msum,i;
    rsum=a[0];
    msum=a[0];
    for(i=1;i<n;i++)
    {
      if(a[i]>a[i-1])
      {
        rsum+=a[i];
      }
      else
      {
        rsum=a[i];
      }
    }
      if(rsum>msum)
      {
        msum=rsum;
      }
      return msum;
    }
}