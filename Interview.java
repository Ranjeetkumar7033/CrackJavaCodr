 import java.nio.charset.MalformedInputException;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/*public class Interview {
    // find out prime no 1 to between 1000
    
    public static void main(String[] args) {
    
    for(int i=1;i<1000;i++){
        int t=0;
        
        for(int j=2;j<=i-1;j++){
            if(i%j==0){
                t=t+1;
                
            }
        }
        if(t==0){
            System.out.println(i);
        
        } 
    
}}}*/
//find out reverse any no
/*public class Interview{
    public static void main(String[] args) {
        int a=234798;
        int n=a;
        int rem;
        int rev=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
           // System.out.println(rev);
            
        }
        System.out.println(rev);

    }
}
    */
    /*import java.util.Scanner;;
    public class Interview{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please  Enter any no ");
            int a=sc.nextInt();
            int n=a;
            int rem;
            int rev=0;
            while(n>0){
                rem=n%10;
                rev=rev*10+rem;
                n=n/10;
               // System.out.println(rev);
                
            }
            if(a==rev){
                System.out.println("This is planindrome no");

            }else{
                System.out.println("this is not palindrome no");
            }
    
        }
    }*/
    /*import java.util.Scanner;;
    public class Interview{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please  Enter any no ");
            int b =sc.nextInt();
        for(int a=10; a<=b;a++){
            int n=a;
            int rem;
            int rev=0;
            while(n>0){
                rem=n%10;
                rev=rev*10+rem;
                n=n/10;
               // System.out.println(rev);
                
            }
            if(a==rev){
            
             System.out.println(a);   
            }
        } 
    }}
    Please  Enter any no :100

11
22
33
44
55
66
77
88
99
    /*class C{
        public static void main(String[] args) {
            int a =2;
            int t1=a;
            int lang=0;
            while(t1!=0){
                lang=lang+1;
                t1=t1/10;
               // System.out.println(lang);
            }
            int t2=a;
        
            int s=0;
            while(t2!=0){
              int  mul=1;
                int rem=t2%10;
                for(int i =1;i<=lang;i++){
                    mul=mul*rem;
                    s=s+mul;
                }
               t2=t2/10;
                
            }
            if(a==s){
                System.out.println("this is Armstrong no");
            }
            else{
                System.out.println("This is not Armstrong no");
            }
        }
    }
    /*class Interview{
        public static void main(String[] args) {
            int a=145;
           int t1=a;
          int  arm=0;
           while(t1!=0){
            int rem=t1%10;
           // System.out.println(rem);
           int fact=1;
           for(int i=1;i<=rem;i++){
            fact=fact*i;
            

           }
           arm=arm+fact;
           
            t1=t1/10;
        }
        if(arm==a){
            System.out.println("this is  strong no");
        }
        else{
            System.out.println("this is not strong nos");
        }
    }}
    this is  strong no
    /*import java.util.Scanner;
    class Interview{
        public static void main(String[] args) {
            System.out.println("Enter the b of a power");
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the value of a");
            int a=sc.nextInt();
            System.out.println("Enter the value of b");
            int b=sc.nextInt();
            int pow=1;
            for(int i=1;i<=b;i++){
              
              pow=pow*a;
              
            }
            System.out.println( "show the a of power b==>"+pow);

            }
        }
    

        Enter the b of a power
Enter the value of a
2
Enter the value of b
3
show the a of power b==>8
    /*class Interview{
        public static void main(String[] args) {
        String str="mam";
        String st1="";
        for( int i=str.length()-1;i>=0;i--){
           // System.out.println(i);
        st1=st1+str.charAt(i);

        }
    if(str.equals(st1)){
        System.out.println("This is palindrome no");
    }
    else{
        System.out.println("This is not palindrome no");
    }
        
        }
    }
    output:
    This is palindrome no
    //swapping programing without third variable
    /*class Interview{
        public static void main(String[] args) {
            int a=10;
            int b=12;
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("a=10  "+a);
            System.out.println("b=12  "+b);
        }
    }

    a=10  12
b=12  10
    /* class Interview{
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter a");
            int a=sc.nextInt();
            System.out.println("Enter b:");
            int b=sc.nextInt();
            System.out.println("Enter c:");
            int c=sc.nextInt();
            a=a+b+c;
            b=a-(b+c);
            c=a-(b+c);
            a=a-(b+c);
            System.out.println("......................");
            System.out.println("A=="+a);
            System.out.println("B=="+b);
            System.out.println("C=="+c);
        }
    }

    Enter a
2
Enter b:
6
Enter c:
8
......................
A==8
B==2
C==6
   /*  class Interview{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Count the digits");
            long a=sc.nextLong();
            int count=0;
            while(a>0){
                count++;
                a=a/10;
            }
            System.out.println("Total digits show="+count);
        }
    }
    Count the digits
3535366
Total digits show=7
   /* * public class Interview{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String value");
        String s=    sc.nextLine();
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')){
                count++;

            }
        }
        System.out.println("no of words="+count);
                
            }
        }
        Enter the String value
 i am going to school
no of words=6
    
    /*class Interview{
        static void fact(long n){
            int f=1;
            for(int i=1;i<=n;i++){
                
                f=f*i;
            }
            System.out.println(f);
        }

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the any nos");
            long n1=sc.nextLong();
            fact(n1);
            
        } 
    }
    Enter the any nos
6
720
   /* class Interview{public static void main(String[] args) {
        String st="I am going to school in mp";
        int count=0;
        for(int i=0;i<st.length()-1;i++){
            if((st.charAt(i)==' ')&&(st.charAt(i+1)!=' ')){
                count++;

            }
            
        
        }
        System.out.println("Total no of words="+count);
        
    }}
    Total no of words=6
    /*class  Interview{
        static int f=1;
       static void fact(int n){
            if(n>=1){
            f=f*n;
            fact(n-1);
            }
            
        }
        

        public static void main(String[] args) {
            fact(5);
            System.out.println(f);
            
        }
    }
    output=120
    /*class Interview{
        static int n1=0,n2=1,n3;
        static void fibonaci(int n){
            if(n>0){
                n3=n1+n2;
                System.out.println(n3);
                n1=n2;
                n2=n3;
                fibonaci(n-1);
            }
        }
        public static void main(String[] args) {
            System.out.println(n1);
            System.out.println(n2);
            fibonaci(10);
            
        }
    }

    0
1
1
2
3
5
8
13
21
34
55
89
  /* * class Interview{
        static int sum=0;
        static void sumnatural(int n){
            if(n>0){
                System.out.println(n);
                sum=sum+n;
                sumnatural(n-1);
            }
        }
        public static void main(String[] args) {
            sumnatural(10);
            System.out.println("Sum of Natural nos="+sum);
            
        }
    } 
    10
9
8
7
6
5
4
3
2
1
Sum of Natural nos=55
    /*class Interview{
        static int count=0;
        static void naturalno(int n){
            if(n>0){
                count++;
                System.out.println(count);
                naturalno(n-1);
            }
                
            
        }
        public static void main(String[] args) {
            naturalno(10);
        }
    }
    1
2
3
4
5
6
7
8
9
10
   /* * class Interview{
        static int count=0;
        static void table(int n){
            if(n>0){
                count++;
                System.out.println(count+ " x " + " 2 " + " = "+count*2);
                table(n-1);
            }
                
            
        }
        public static void main(String[] args) {
            table(10);
        }
    }
1 x  2  = 2
2 x  2  = 4
3 x  2  = 6
4 x  2  = 8
5 x  2  = 10
6 x  2  = 12
7 x  2  = 14
8 x  2  = 16
9 x  2  = 18
10 x  2  = 20
   /* * class Interview{
        public static void main(String[] args) {
            for(int i=1;i<=5;i++){
                for(int k=5;k>=i;k--){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print( "*");
                }
                System.out.println();

            }
        }
    }
    *
    **
   ***
  ****
 *****
   /*  class Interview{
        public static void main(String[] args) {
            for(int i=1;i<=5;i++){
                for(int k=i;k<=i;k++){
                    System.out.print("  ");
                }
                for(int j=5;j>=i;j--){
                    System.out.print( " * ");
                }
                System.out.println();

            }}
        *  *  *  *  * 
        *  *  *  *
        *  *  *
        *  *
        *
    }
    
       /*   class Interview{
                public static void main(String[] args) {
                    for(int i=1;i<=10;i++){
                        for(int j=1;j<=i;j++){
                            System.out.print( " * ");
                        }
                        System.out.println();
        
                    }

                    for(int i=1;i<=10;i++){
                        for(int j=9;j>=i;j--){
                            System.out.print( " * ");
                        }
                        System.out.println();
        
                    }
                }
            }
        



 
 *  *  *  *  *
 *  *  *  *  *  * 
 *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  * 
 *  *  *  *
 *  *  *
 *  *
 *
       /* * class Interview{
            public static void main(String[] args) {
                for(int i=1;i<=10;i++){
                    for(int g=9;g>=i;g--){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++){
                        System.out.print( " * ");
                    }
                    System.out.println();
                }
                for(int i=1;i<=10;i++){
                    for(int g=9;g>=i;g--){
                        System.out.print(" ");
                    }
                    for(int j=9;j>=i;j--){
                        System.out.print( " * ");
                    }
                    System.out.println();
    
                }
            }
        }
       /*class Interview{
            public static void main(String[] args) {
                for(int i=1;i<=9;i++){
                    for(int k=9;k>=i;k--){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++){
                        System.out.print(" *");
                    }
                    System.out.println();
                }
                for(int i=1;i<=10;i++){
                    for(int k=1;k<i;k++){
                        System.out.print(" ");
                    }
                    for(int j=10;j>=i;j--){
                        System.out.print(" *");
                    }
                    System.out.println();
                }
                
            }
            }  * 
              * *
             * * *
            * * * *     
            * * * * *    
           * * * * * *   
          * * * * * * *  
         * * * * * * * * 
        * * * * * * * * *
       * * * * * * * * * *
        * * * * * * * * *
         * * * * * * * *
          * * * * * * *
           * * * * * *
            * * * * *
             * * * *
              * * *
               * *
                *

/*class Interview{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
        
            for(int j=10;j>=1 ;j--){
                if(j>i){
                    System.out.print(" ");
                }else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }





     
        *
        * *
       * * *
      * * * *
     * * * * *
    * * * * * *
   * * * * * * *
  * * * * * * * *
 * * * * * * * * *
* * * * * * * * * *      
    }
    }
  
  /*class Interview{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            
            for(int j=1;j<=i;j++){
                if(i>=2&&j<=i-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }}
            }
            



            *
 *
  *
   *
    *
     *
      *
       *
        *
         *
            /*class Interview{
                public static void main(String[] args) {
                    for(int i=0;i<10;i++){
                        for(int j=0;j<10;j++){
                            if(i==j||i+j==10-1){
                                System.out.print("*");
                            }else{
                                System.out.print(" ");
                            }
                         
                        }
                        System.out.println();
                    }
                }
            }
        
            *        *
 *      *
  *    *
   *  *
    **
    **
   *  *
  *    *  
 *      *
*        *
        /*class Interview{
            public static void main(String[] args) {
                int a=10,b=20,c=90 ;
                if(a>b||b>c){
                    System.out.println(20);
                }
                else{
                    System.out.println("5");
                }
            }
        }
        */
        /*class Interview{
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the car no");
                int num=sc.nextInt();
                if(num<1000||num>9999){
                    System.out.println(num+"is not valid car  number");
                }else{
                    int sum=0;
                    while(num>0){
                        sum +=num%10;
                        num=num/10;
                    }
                    if(sum%3==0||sum%5==0||sum%7==0){
                        System.out.println("this is lucky no");
                    }else{
                        System.out.println("Sorry is is not lucky no");
                    }
                }
                
            }
        }*/
   /* * class Interview
    {
        public static int count=2;
        static boolean isLuckyNo(int n){
            if(count>n)
            return true;
            if(n%count==0)
            return false;
            n=n-(n/count);
            count++;
            return isLuckyNo(n);
        }
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
System.out.println("Enter The no");
int num=sc.nextInt();
if(isLuckyNo(num))
System.out.println(num+ " "+"is Lucky no");
else
System.out.println(num+" "+"is not Lucky no");
            
            
        }
    }
     Enter The no
7
7 is Lucky no    
    
   /* * class Interview{
        public static void main(String[] args) {
            for(int i =0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(i==j||i+j==10-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
*        *
 *      *
  *    *
   *  *
    **
    **
   *  *
  *    *
 *      *
*        *
    


    /*class Interview{
        public static void main(String[] args) {
            for(int i =1;i<=10;i++){
                for(int j=1;j<=10 ;j++){
                    if(i>=2&&j>=2&&i<=9&&j<=9){
                        System.out.print("   ");
                    }else{
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            }
        }
    }
+  +  +  +  +  +  +  +  +  + 
 +                          +
 +                          +
 +                          +
 +                          +
 +                          +
 +                          +
 +                          +
 +                          +
 +  +  +  +  +  +  +  +  +  + 
   /* * class Interview extends Thread{
        public void run(){
            try {
                for(int i =1;i<=10;i++){
                    for(int j=1;j<=10 ;j++){
                        if(i>=2&&j>=2&&i<=9&&j<=9){
                            System.out.print("   ");
                        }else{
                            System.out.print(" "+j+" ");
                        }
                    }
                    System.out.println();
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }
        public static void main(String[] args) {
            Interview t=new  Interview();
            t.start();
        }}
1  2  3  4  5  6  7  8  9  10 
 1                          10 
 1                          10 
 1                          10 
 1                          10 
 1                          10 
 1                          10 
 1                          10 
 1                          10 
 1  2  3  4  5  6  7  8  9  10 
   /*  class Interview{
        public static void main(String[] args) {
            for(int i =1;i<=10;i++){
                for(int j=1;j<=i ;j++){
                    System.out.print("     "+j);
                    
                }
                System.out.println();
            }
        }
        }
    1  
     1     2
     1     2     3
     1     2     3     4
     1     2     3     4     5
     1     2     3     4     5     6
     1     2     3     4     5     6     7
     1     2     3     4     5     6     7     8
     1     2     3     4     5     6     7     8     9
     1     2     3     4     5     6     7     8     9     10
        /* * class Interview{
            public static void main(String[] args) {
                for(int i =10;i>=1;i--){
                    for(int j=1;j<=i ;j++){
                        System.out.print("     "+i);
                        
                    }
                    System.out.println();
                }
            }
            }
            10     10     10     10     10     10     10     10     10     10
     9     9     9     9     9     9     9     9     9
     8     8     8     8     8     8     8     8
     7     7     7     7     7     7     7
     6     6     6     6     6     6
     5     5     5     5     5
     4     4     4     4
     3     3     3
     2     2
     1
            /*class Interview{
                public static void main(String[] args) {
                    for(int i =1;i<=7;i++){
                        for(int j=1;j<=i ;j++){
                            System.out.print("  "+j);
                            
                        }
                        System.out.println();
                    }
                }}
 1                
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
 16 17 18 19 20 21           
                */
                
               /*  class Interview{
                    public static void main(String[] args) {
                       try{
                        int count=0;
                        for(int i =1;i<=6;i++){
                            for(int j=1;j<=i ;j++){
                                count++;
                                System.out.print(" "+count);
                                Thread.sleep(500);
                                
                            }
                            System.out.println();
                        }}catch(Exception e){
                            e.printStackTrace();
                        }
                    }
                    }
                    1
                    2 3
                    4 5 6
                    7 8 9 10
                    11 12 13 14 15
                    16 17 18 19 20 21
                  /* * class Interview{
                        public static void main(String[] args) {
                           try{
                            int count=0;
                            for(int i =6;i>=1;i--){
                                for(int j=i;j>=1 ;j--){
                                    count++;
                                    System.out.print("   "+count);
                                    Thread.sleep(500);
                                    
                                }
                                System.out.println();
                            }}catch(Exception e){
                                e.printStackTrace();
                            }
                        }
                        }
    1   2   3   4   5   6
   7   8   9   10   11
   12   13   14   15
   16   17   18
   19   20
   21
                      /* * class Interview{
                            public static void main(String[] args) {
                               try{
                                
                                for(int i =1;i<=6;i++){
                                    for(int j=i;j>=1 ;j--){
                                        
                                        System.out.print(" "+j);
                                        Thread.sleep(500);
                                        
                                    }
                                    System.out.println();
                                }}catch(Exception e){
                                    e.printStackTrace();
                                }
                            }
                            }
                            output right angle
 1                           1
 2 1
 3 2 1
 4 3 2 1
 5 4 3 2 1
 6 5 4 3 2 1
PS C:\Users\o
                            /*class Interview{
                                public static void main(String[] args) {
                                   try{
                                    int count=0;
                                    for(int i =1;i<=10;i++){
                                        for(int j=1;j<=10 ;j++){
                                            count++;
                                            System.out.print("    "+count);
                                            Thread.sleep(300);
                                            
                                        }
                                        System.out.println();
                                    }}catch(Exception e){
                                        e.printStackTrace();
                                    }
                                }
                                }
                              output  /*1    2    3    4    5    6    7    8    9    10
    11    12    13    14    15    16    17    18    19    20
    21    22    23    24    25    26    27    28    29    30
    31    32    33    34    35    36    37    38    39    40
    41    42    43    44    45    46    47    48    49    50
    51    52    53    54    55    56    57    58    59    60
    61    62    63    64    65    66    67    68    69    70
    71    72    73    74    75    76    77    78    79    80
    81    82    83    84    85    86    87    88    89    90
    91    92    93    94    95    96    97    98    99    100
 */
                               /* * class Interview{
                                    public static void main(String[] args) {
                                       try{
                                        int count=0;
                                        for(int i =1;i<=4;i++){
                                            for(int j=1;j<=i ;j++){
                                                count++;
/*                                                 System.out.print(j+" ");
1                 
1 1 2 1 
1 2 1 2 2 1 3 2 1 
1 3 2 1 2 3 2 1 3 3 2 1 4 3 2 1  */                  /*             Thread.sleep(500);
                                                for(int k=i-1;k>=1;k--){
                                                    System.out.print(k+" ");
                                                }
                                                
                                            }
                                            System.out.println();
                                        }}catch(Exception e){
                                            e.printStackTrace();
                                        }
                                    }
                                    }*/
                                 /* *  class Interview{
                                        public static void main(String[] args) {
                                           try{
                                    
                                            for(int i =1;i<=10;i++){
                                                int no=i;
                                                for(int j=1;j<=i ;j++){
                                                
                                                    System.out.print(no+" ");
                                                    no=no+10-j;
                                                    Thread.sleep(100);
                                                }
                                                System.out.println();
                                            }}catch(Exception e){
                                                e.printStackTrace();
                                            }
                                        }
                                        }
                                        /*
1                                        1 
2 11 
3 12 20 
4 13 21 28 
5 14 22 29 35 
6 15 23 30 36 41 
7 16 24 31 37 42 46 
8 17 25 32 38 43 47 50 
9 18 26 33 39 44 48 51 53 
10 19 27 34 40 45 49 52 54 55 
                                         
  // Arrays Programs here that you can watch                                       */
/*class Interview{
    static void sum(int[] no){
        int total=0;
        for(int i:no){
            total=total+i;

        }
        System.out.println("total sum of Array=="+total);
    }
    public static void main(String[] args) {
        Interview.sum(new int[]{11,22,33,44,55,66});
        
    }
}    */
/*class Interview{
    public static void main(String[] args) {
        int a[]=new int[6];
        System.out.println("Enter the Arrays value");
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        for(int j:a){
            System.out.print("  "+j);
        }
    }
}
Output:
Enter the Arrays value
11
22
13
12
44
10
 11 22 13 12 44 10*/
 /*class Interview{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Arrays value");
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        for(int j:a){
            System.out.print("  "+j);
        }
    }
}
Output:
Enter the Size of array
3
Enter the Arrays value
11
22
33
  11  22  33*/
/*class Interview{
    public static void main(String[] args) {
        int arr[]={33,3,4,5};  
        System.out.println("Printing original array:");  
        for(int i:arr)  
        System.out.println(i);  
          
        System.out.println("Printing clone of the array:");  
        int carr[]=arr.clone();  
        for(int i:carr)  
        System.out.println(i);  
          
        System.out.println("Are both equal?");  
        System.out.println(arr==carr);  
          
        }}*/
       /* * class Interview{
            public static void main(String[] args) {
                int arr[]={11,22,33,44,55};
                System.out.println("Show the Original Array");
                for(int i: arr){
                System.out.println(i);}
                System.out.println("new Array show");
                int b[]=arr.clone();
                for(int j:b){
                System.out.print("  "+j);
            }}
        }  */
        /*class Interview{
            
            public static void main(String[] args) {
                int arr[]={101,10,23,22,600,67,20};
                System.out.println("Without sorting");
                for(int ar:arr){
                    System.out.println(ar);
                }
                System.out.println("new Array int the form of bubblesorting");
                int n = arr.length;  
                int temp = 0;  
                 for(int i=0; i < n; i++){  
                         for(int j=1; j < (n-i); j++){  
                                  if(arr[j-1] > arr[j]){  
                                         //swap elements  
                                         temp = arr[j-1];  
                                         arr[j-1] = arr[j];  
                                         arr[j] = temp;  
                                 }  
                                  
                         }  
                 }  
                 for(int i=0; i < arr.length; i++){  
                    System.out.print(arr[i] + " ");  
            }  
          
            }  }
                    
        */
      /* *  class Interview{
            
            public static void main(String[] args) {
                int arr[]={101,10,23,22,600,67,20};
                System.out.println("Without sorting");
                for(int ar:arr){
                    System.out.println(ar);
                }
                System.out.println("new Array int the form of bubblesorting");
                int n = arr.length;  
                int temp = 0;  
                 for(int i=0; i < n; i++){  
                         for(int j=1; j < (n-i); j++){  
                                  if(arr[j-1] < arr[j]){  
                                         //swap elements  
                                         temp = arr[j-1];  
                                         arr[j-1] = arr[j];  
                                         arr[j] = temp;  
                                 }  
                                  
                         }  
                 }  
                 for(int i=0; i < arr.length; i++){  
                    System.out.print(arr[i] + " ");  
            }  
          
            }  }
          */
        /* *  class Interview{
            public static void main(String args []){
                int arr[]={12,100,20,33,554,13,56};
                int tem=0;
                int n=arr.length;
                for(int i=0;i<n;i++){
                for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                tem=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=tem;
                }}}
                for(int i=0;i<n;i++){
                System.out.println(" "+arr[i]);}
                System.out.println("Hello");
                }}
          */
        /* *  class Interview{
            public static void main(String args []){
                int arr[]={12,100,20,33,33,554,13,56};
                System.out.println("Without Sorting Array");
                for(int ar:arr){
                    System.out.print(ar +"  ");

                }
                System.out.println("  ");
            
                int tem=0;
                int n=arr.length;
                for(int i=0;i<n;i++){
                for(int j=1;j<n-i;j++){
                if(arr[j-1]<arr[j]){
                tem=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=tem;
                }}}
                System.out.println("Descending order");

                for(int i=0;i<n;i++){
                System.out.println(" "+arr[i]);}
                System.out.println("Hello");
                }}
          */
          // Remove  the Repeate elements
         /* * class Interview{
            public static void main(String[] args) {
                int ar[]={11,22,22,33,33,44,44,55,66,222,66};
                for(int i=0;i<=ar.length-1;i++){
                if(ar[i]!=ar[i+1]){
                    System.out.println(ar[i]);
                }

                }
            }
          }
          */
          // findout the largest value of array
          /*class Interview{
            public static void main(String[] args) {
                int arr[]={11,111,22,33,44,12,1000};
                int max=arr[0];
                for(int i=0;i<=arr.length-1;i++){
                    if(max<arr[i]){
                        max=arr[i];
                    }

                }
                System.out.println("This is largest elements of Array:"  +max);
            }
          }*/
        //Findout the smallest value of an Array
     /* *   class Interview{
            public static void main(String[] args) {
                int arr[]={11,111,22,33,44,12,1000,10};
                int min=arr[0];
                for(int i=0;i<=arr.length-1;i++){
                    if(min> arr[i]){
                        min=arr[i];
                    }

                }
                System.out.println("This is smallest elements of Array:"  +min);
            }
          }*/
         // Findout Even positions
        /* *  class Interview{
            public static void main(String[] args) {
                int arr[]={11,111,22,33,44,12,1000};
                for(int i=1;i<=arr.length-1;i=i+2){
                    
System.out.println(arr[i]);
                }
    
            }
          }
*/
// Findout Odd positions
/*class Interview{
    public static void main(String[] args) {
        int arr[]={11,111,22,33,44,12,1000};
        for(int i=0;i<=arr.length-1;i=i+2){
            
System.out.println(arr[i]);
        }

    }
  }
*/
// Findout Even positions
/*class Interview{
    public static void main(String[] args) {
        int arr[]={11,111,22,33,44,12,1000,6000};
        int sum=0;
        for(int i=1;i<=arr.length-1;i++){
            sum=sum+arr[i];
        }
System.out.println(" Sum of Element="+sum);
    }
  }
*/
/*class Interview{
public static int getThirdLargest(int[] a, int total){  
    int temp;  
    for (int i = 0; i < total; i++)   
            {  
                for (int j = i + 1; j < total; j++)   
                {  
                    if (a[i] > a[j])   
                    {  
                        temp = a[i];  
                        a[i] = a[j];  
                        a[j] = temp;  
                    }  
                }  
            }  
           return a[total-3];  
    }  
    public static void main(String args[]){  
    Scanner sc =new Scanner(System.in);
    int a []=new int [7];
    System.out.println("Enter the Array elements");
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
    int b[]=new int[8];
    System.out.println("Enter the Array elements");
    for(int i=0;i<b.length;i++){
        b[i]=sc.nextInt();
    }

    System.out.println("Third Largest: "+getThirdLargest(a,7));  
    System.out.println("Third Largest: "+getThirdLargest(b,8));  
    }} 

*/
class Interview{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array of Size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(a[j-1]>a[j]){
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("This is Ascending order");
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
    }
}



