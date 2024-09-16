

public class day8 
{
    public static void main(String[] args) 
    {  
       String one = "the sky is blue";
       System.out.println("Reverse String : [" + reverseStringWordToWord(one)+"]");
       
       String two = "  hello world  ";
       System.out.println("Reverse String : [" + reverseStringWordToWord(two)+"]");
       
	} 
    
    private static String reverseStringWordToWord(String s)
    {
    	String[] splitArray = s.split(" ");
    	String Result = "";
    	for (int i = splitArray.length-1; i>=0 ; i--) 
    	{
			if(i>0)
			{
				Result += (splitArray[i] + " ");
			}
			else
			{
				Result += splitArray[i];	
			}
			
		}
    	return Result.trim();
    }
   
}
