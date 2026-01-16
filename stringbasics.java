
public class stringbasics {
    public static void main(String[] args) {
        // String s="java";
        // for(int i=0;i<s.length();i++)
        // {
        //   System.out.print(s.charAt(i));
        // }
        // palindrome
        // String s="gadag";
        // String palin="";
        // for(int i=s.length()-1;i>=0;i--)
        // {
        //     palin=palin +s.charAt(i);
        // }
        // if(s.equals(palin))
        // {
        //     System.out.println("yes! it is palindrome");
        // }
        // else{
        //     System.out.println("not a palindrome");
        // }

        // character count
        // String s="banana";
        // for(int i=0;i<s.length();i++)
        // {
        //     char c =s.charAt(i);
        //     int count=0;
        //     for(int j=0;j<s.length();j++)
        //     {
        //         if(s.charAt(j) == c)
        //         {
        //             count++;
        //         }      
        //     }
        //     System.out.println(c +" " +count);
        // }
        
        //check plaindrome without reversing
        String s= "gada";
        int start=0;
        int end=s.length()-1;
        boolean ispalindrome=true;
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                ispalindrome=false;
                break;
            }
            start++;
            end--;
        }
          if(ispalindrome)
            {
                System.out.println("yes it is");
            }
            else{
                System.out.println("not a plaindrome");
            }
    }
    
}
