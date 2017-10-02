import java.io.*;
class ReverseStrExceptFstnLst
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
				int lastchar=length - 1;
				String reverse = "";
				for (int i = length - 2; i >= 1; i--)
				{
				reverse = reverse + ss.charAt(i);
				
				}
				System.out.print(ss.charAt(0)+ reverse+ss.charAt(lastchar)+" ");
				System.out.print(reverse+" ");
				length=0;
				lastchar=0;
			
			}

		
    } 
}