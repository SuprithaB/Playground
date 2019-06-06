import java.util.*;
public class Main
{
    public static void main(String args[])
    {
      Scanner s =new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
     int freq[]=new int[n];
      
      int dex=repeated_element(a,n,freq);
      int max=max_index(freq,n,dex);
      System.out.println(max);
    }
    	public static int repeated_element(int arr[], int n, int freq[])
    {
        int i;
        int count=0;
        int freq_idx = 0;
        for(i = 0; i < n ; i++)
        {
            if(arr[i] == 1)
            {
                count++;
            }
            if((arr[i] == 0) || (i == n-1))
            {
                freq[freq_idx] = count;
                count = 0;
                freq_idx++;
            }
        }
        return freq_idx-1;
    }
    public static int max_index(int freq[], int n, int idx)
    {
        int max_no = 0;
        if((freq[0] > freq[1]) || (idx == 0))
        {
            max_no = freq[0];
        }
        else
        {
            max_no = freq[1];
        }
        for(int i = 2; i < idx ; i++)
        {
            if(max_no < freq[idx])
            { 
                max_no = freq[idx];
            }
        }
    return max_no;
    }

    }
