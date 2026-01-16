import java.util.Scanner;

class logicalpart{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        // System.out.println("enter the number");
        // int num=in.nextInt();
      
        //     if(num%2==0)
        //     {
        //         System.out.println("evn");
        //     }
        //     else
        //     System.out.println("odd");

        // count a digit

        // int num=1256;
        // int count = 0;
        // while(num>0)
        // {
        //     count++;
        //     num=num/10;
        // }
        // System.out.println(count);

        // reverse a num
    //     int num=567;
    //     int rev=0;
    //     while(num>0)
    //     {
    //         int digit=num%10;
    //         rev=rev*10+digit;
    //         num=num/10;  
    //     }
    //    System.out.println(rev);

    // palindrome or not 

    //   int num=123;
    //   int reverse=0;
    //   int og=num;
    //   while(num>0)
    //   {
    //     int digit=num%10;
    //     reverse=reverse*10+digit;
    //     num=num/10;
    //   }
    //   if(og==reverse)
    //   {
    //     System.out.println("Given num is palindrome");
    //   }
    //   else{
    //     System.out.println("not a palindrome");
    //   }

        //     int i=1;
    //    while(i<=50)
    //    {
    //     if(i%2==0)
    //     {
    //         System.out.println(i);
    //     }
    //     i++;
    //    }
    int num=12575;
    int count=0;
   while(num>0)
    {
        count++;
        num=num/10;
    }
    System.out.println(count);
    }

// int num = 100;
// int rev = 0;

// while (num > 0) {
//     int digit = num % 10;
//     rev = rev * 10 + digit;
//     num = num / 10;
// }

// System.out.println(rev);
// }
    



    }
}