import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      String str = s.nextLine();
      int freq[]=new int[26];
      for(int i=0;i<26;i++)
      {
        freq[i]=0;
      }
      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)>='a' && str.charAt(i)<='z')
        {
          freq[str.charAt(i)-'a']++;
        }
      else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
      {
        freq[str.charAt(i)-'A']++;
      }
      }
      for(int i=0;i<26;i++)
      {
        if(freq[i]==0)
        {
          char ch = (char)(i+ 'a');
          System.out.print(ch  + " ");
        }
      }
    }
}
   