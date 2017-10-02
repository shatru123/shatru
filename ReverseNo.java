/*Progrm to Reverse String Word wise*/
import java.io.*;
class ReverseString
 { 
    public static void main(String args[]) throws IOException 
	{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string: ");
        String s = br.readLine();
		String[] arr = s.split(" ");    
      
		for ( String ss : arr)
			{
				
				int length = ss.length();
				
				String reverse = "";
				for (int i = length - 1; i >= 0; i--)
				{
				reverse = reverse + ss.charAt(i);
				}
				System.out.print(reverse+" ");
			}
      } 
}
