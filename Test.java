import java.lang.reflect.Array;
import java.math.BigInteger;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthScrollBarUI;

//System.out.println(v2.and(v3));

/*for(;;){
    System.out.println("Ranjeet");
}
*/

/*do{
    System.out.println("hey");
}while(true);*/
/*for(int i=10; i<=22;i++){
   // System.out.println(i);
    if(i==18){
    continue;
    }
    System.out.println(i);
}*/
/* 
for(int k=1;k<=6;k++){
    for(int l=1;l<=k;l++){
        System.out.print(" "+l);
    }
    System.out.println("");
}

for(int i=6;i>=1;i--){
    for(int j=1;j<=i;j++){
       // System.out.println(i+" "+j);
       System.out.print(" "+j);
    }
    System.out.println();
   // System.out.println(i
}
  
}
}*/
/*for(int i =4;i<=12;i++){
   // System.out.println(i);
    if(i==10){
        continue;
    }
   System.out.println(i);
}*/
//outer loop  
/* for(int i=1;i<=3;i++){    
    //inner loop  
    for(int j=1;j<=3;j++){    
        if(i==1&&j==1){    
            //using continue statement inside inner loop  
            continue;
        }    
        System.out.println(i+" "+j);    
    }    
}    
}}*/

/*class Test{
    static void printSpiralPattern(int size)  
{  
//create two variables row and col to traverse rows and columns  
int row = 0, col = 0;  
int boundary = size - 1;  
int sizeLeft = size - 1;  
int flag = 1;  
//variables r, l, u and d are used to determine the movement  
// r = right, l = left, d = down, u = upper  
char move = 'r';  
//creating a 2D array for matrix  
int[][] matrix =new int [size][size];  
for (int i = 1; i < size * size + 1; i++)  
{  
    //assigning values  
    matrix[row][col] = i;  
//switch-case to determine the next index  
switch (move)  
{  
//if right, go right  
case 'r':  
    col += 1;  
    break;  
//if left, go left  
case 'l':  
    col -= 1;  
    break;  
//if up, go up  
case 'u':  
    row -= 1;  
    break;  
//if down, go down  
case 'd':  
    row += 1;  
    break;  
}  
//checks if the matrix has reached the array boundary  
if (i == boundary)  
    {  
        //adds the left size for the next boundary  
        boundary = boundary + sizeLeft;  
        //decrease the size left by 1, if 2 rotations have been made  
        if (flag != 2)  
        {  
        flag = 2;  
        }  
        else  
        {  
        flag = 1;  
        sizeLeft -= 1;  
        }  
        //switch-case to rotate the movement  
        switch (move)  
        {  
        //if right, rotate to down  
        case 'r':  
            move = 'd';  
            break;  
        // if down, rotate to left  
        case 'd':  
            move = 'l';  
            break;  
        // if left, rotate to up  
        case 'l':  
            move = 'u';  
            break;  
        // if up, rotate to right  
        case 'u':  
            move = 'r';  
            break;  
        }  
    }  
    }  
//printing the spiral matrix or pattern  
//outer for loop for rows  
    for (row = 0; row < size; row++)  
    {  
        //inner for loop for columns  
        for (col = 0; col < size; col++)  
            {  
                int n = matrix[row][col];  
                if(n < 10)  
                    System.out.print(n +" ");  
                else  
                    System.out.print(n +" ");  
            }  
        System.out.println();  
    }  
}  
//driver Code  
public static void main(String args[])  
{  
//size of the array?s row and column  
int size = 5;  
System.out.println("Spiral Matrix or Pattern is: \n");  
//calling the method that prints the spiral pattern or matrix   
printSpiralPattern(size);  
}  
}
*/
/*class Test{
    int id;
    String name;
    void same(int id ,String name){
        this.id=id;
        this.name=name;
        System.out.println("Employee Name"+name);
        System.out.println("Employee id.....>"+id);

    }
public static void main(String[] args) {
    System.out.println("Enter the value n and id");
    Scanner sc =new Scanner(System.in);

    int i=sc.nextInt();
    
    String n=sc.nextLine();
    Test o =new Test();
    o.same(i, n);
    
}
}*/

/*class Test{
    int n;
    static void evenoddCheck(int n){
        if(n%2==0){
            System.out.println("this is even no");
        }
        else{
            System.out.println("this is odd no");
        }
    }public static void main(String[] args) {
        System.out.println("Enter the any the value check for even or odd");
        Scanner sc =new Scanner(System.in);
        int no= sc.nextInt();
        evenoddCheck(no);
    }
}*/
/*class Test{
    int pass;
    public int getPasword(){
        return pass;
    }
    public void setPasword(int pass){
        this.pass=pass;
    }
    public static void main(String[] args) {
        Test o=new Test();
        o.setPasword(9899);
        System.out.println("this is pass.."+o.getPasword());
    }
}*/

/* abstract class Test{
    abstract void sum();

}
class A extends Test{
    void sum(){
        System.out.println("this abstract class and method");
    }
    public static void main(String[] args) {
        A o=new A();
        o.sum();
    }
}*/
/*class Test{
    int age;
    Test(int age){
        if(age>18){
            System.out.println("this candidates eligiable for vote");
        }
        else{
            System.out.println("This candidates is not eligiable for vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any candidtes age for vote eligible or not eligiable");
        int a=sc.nextInt();

        Test o =new Test(a);
    }

}*/
/*class Test{
String  name;
    int age;
    Test(String name , int age){
        this.age=age;
        this.name=name;
    }
    Test(Test s){
        name=s.name;
        age=s.age;
    }
    void display(){
        System.out.println("This employee age and name..>"+age+"<>"+name);
    }
    public static void main(String[] args) {

        Test o=new Test("ranjeet",11);
        o.display();
    }
}*/
/*class Test{
    int age;
    String name;
    Test(String name ,int age){
        this.name=name;
        this.age=age;
    }
    Test(){

    }
    void display(){
        System.out.println(age+"<...............>"+name);
    }
    public static void main(String[] args) {
        Test o=new Test("ranjeet",12);
        Test o1=new Test();
        o1.age=o.age;
        o1.name=o.name;
        o1.display();
        o.display();
    }
}*/
/*ss Test{
    int id;  
String name;  
Address address;  
  
public Test(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}  
  
public static void main(String[] args) {  
Address address1=new Address("gzb","UP","india");  
Address address2=new Address("gno","UP","india");  
  
Test e=new Test(111,"varun",address1);  
Test e2=new Test(112,"arun",address2);  
e.display();
e2.display();
}}
 class Address {  
    String city,state,country;  
      
    public Address(String city, String state, String country) {  
        this.city = city;  
        this.state = state;  
        this.country = country;  
    }  
      
    }  */

/*  class Test{
        public static void main(String[] args) {
            
            System.out.println("h");
            Bank o=new Bank();
            Sbi o1=new Sbi();
            PUNB o2=new PUNB();
            AxCIS o3=new AxCIS();
            ICI o4=new ICI();
            System.out.println(o.getintrest());
            System.out.println(o1.getintrest());
            System.out.println(o2.getintrest());
            System.out.println(o3.getintrest());
            System.out.println(o4.getintrest());
            
            
        }
    }
    class Bank{
        int getintrest(){
            return 0;
        }
    }
    class Sbi extends Bank{
        int getintrest(){
            return 4;
        }
    }
    class PUNB extends Bank{
        int getintrest(){
            return 9;
        }
    }
    class ICI extends Bank{
        int getintrest(){
            return 66;
        }
    }
    class AxCIS extends Bank{
        int getintrest(){
            return 8;
        }
    }*/
/*class Test{
        public static void main(String[] args) {
        
            
             int sum=0;
             int j=122;
             
             for( j=112;j<=1000;j++){
                int b=j;
                int a=j;
            while(a!=0){
                int f=1;
                int d=a%10;
                for(int i=1;i<=d;i++){
                    f=f*i;
                }
                sum=sum+f;
                a=a/10;

            }
            if(sum==b){
                System.out.println(b);
            }
        }
        }
    }*/
/* lass Test implements Cloneable{  
        int rollno;  
        String name;  
          
        Test(int rollno,String name){  
        this.rollno=rollno;  
        this.name=name;  
        }  
          
        public Object clone()throws CloneNotSupportedException{  
        return super.clone();  
        }  
          
        public static void main(String args[]){  
        try{  
        Test s1=new Test(101,"amit");  
          
        Test s2=(Test)s1.clone();  
          
        System.out.println(s1.rollno+" "+s1.name);  
        System.out.println(s2.rollno+" "+s2.name);  
          
        }catch(CloneNotSupportedException c){}  
          
        }  
        }  */
/*    class Test{
            enum T{
                A,B,HJH,HJJ,GHFJHG,FHFHG,CHFH,VHNJGJ,FHFHD,FHFHFHF,RED,YELLOW,PINK,PATATO,TAMATO
            }
            public static void main(String[] args) {
            T o=T.FHFHFHF;
                System.out.println(o);
                for(T O:T.values()){
                    System.out.println(O+"   "+O.ordinal());
                }
            }
        }*/
/* import java.time.LocalDate;
        class Test{
            public static void main(String[] args) {
                LocalDate o=LocalDate.now();
                System.out.println(o);
            }
            
        }*/
/*  import java.time.LocalTime;
        class Test{
            public static void main(String[] args) {
                LocalTime o=LocalTime.now();
                System.out.println(o);
            }
        }*/
/* import java.time.LocalDateTime;
        class Test{
            public static void main(String[] args) {
                LocalDateTime o =LocalDateTime.now();
                System.out.println(o);
            }
        }*/
/*import java.time.*;
class Test{
    public static void main(String[] args) {
    MonthDay month = MonthDay.now();  
    LocalDate date = month.atYear(1994);  
    System.out.println(date);} 
}*/
/*import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class Test{
    public static void main(String[] args) {
        LocalDateTime o=LocalDateTime.now();
        System.out.println("before formatting"+" "+o);
        DateTimeFormatter o1=DateTimeFormatter.ofPattern("dd-MM-yyyy-HH:mm:ss");
        String formattedDate = o.format(o1);
        System.out.println("After+"+formattedDate);

    }
} 
*/

/*import java.util.ArrayList;
class Test{
    public static void main(String[] args) {
        ArrayList <String>car=new ArrayList<String>();
        car.add("BMW");
        car.add("THAR");
        car.add("FARARI");car.add("BELURO");
        car.add("NANO");
       /*  for(String i:car){
            System.out.println(i);
        }
        Iterator it=car.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}*/
/*import java.util.ArrayList;
class Test{
    public static void main(String[] args) {
        ArrayList <Integer>age=new ArrayList<Integer>();
        age.add(61);
        age.add(51);
        age.add(112);
        age.add(11);
        age.add(101);
        age.add(110);
        Iterator itr =age.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }





    }
}*/
/*import java.util.LinkedList;
class Test{
    public static void main(String[] args) {
        LinkedList <Integer>age=new LinkedList<Integer>();
        age.add(61);
        age.add(51);
        age.add(112);
        age.add(11);
        age.add(101);
        age.add(110);
        age.add(11);
        Iterator itr =age.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());}}*/
/*  import java.util.Vector;
            class Test{
            public static void main(String args[]){  
                Vector<String> v=new Vector<String>();  
                v.add("Ayush");  
                v.add("Amit");  
                v.add("Ashish");  
                v.add("Garima");  
                Iterator<String> itr=v.iterator();  
                while(itr.hasNext()){  
                System.out.println(itr.next());  
                }  
                }  }*/
/*   import java.util.Stack;
                class Test{
                    public static void main(String[] args) {
                    
                            Stack<String> s=new Stack<String>();  
                            s.add("Ayush");  
                            s.add("Amit");  
                            s.add("Ashish");  
                            s.add("Garima"); 
                            s.push("jjjjj"); 
                            Iterator<String> itr=s.iterator();  
                            while(itr.hasNext()){  
                            System.out.println(itr.next());  
                            }  
                            }  
                            
                    }*/
/*   import java.util.PriorityQueue;
                class Test{
                    public static void main(String[] args) {
                        PriorityQueue<String> queue=new PriorityQueue<>();  
queue.add("Amit Sharma");  
queue.add("Vijay Raj");  
queue.add("JaiShankar");  
queue.add("Raj");  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
System.out.println("iterating the queue elements:");  
Iterator itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
                    }
                }*/
/*  import java.util.Deque;
                class Test{
                    public static void main(String[] args) {
                        Deque <String>d=new ArrayDeque<String>(); 
                        d.add("Ajay");
                        d.add("Ranjeet");
                        d.add("Ranjan");
                        d.add("Chandan");
                        d.remove();
                        d.element();
                            
                      /*   for(String str:d){
                            System.out.println(str);
                        }
                        Iterator itr =d.iterator();
                        while(itr.hasNext()){
                            System.out.println(itr.next());
                        }
                    }
                }
*/
/*import java.util.HashSet;
class Test{
    public static void main(String[] args) {
        HashSet<Integer>age=new HashSet<Integer>();
        age.add(11);
        age.add(22);
        age.add(11);
        age.add(11);
        age.add(13);
        age.add(66);
        //age.clear();
        
        Iterator itr=age.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}*/

/* 
class Test{
    static int n1=0,n2=1,n3=0;
    void show(int count){
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(""+n3);
            show(count-1);
        }
    }
    public static void main(String[] args) {
        Test o=new Test();
        System.out.println(n1);
        System.out.println(n2);
    o.show(20);
    }
}*/

/*class Test{
    
    static int fact=1;
    void showFact(int no){
        if(no>=1){
            fact=fact*no;
            
            showFact(no-1);
            
        }
       // System.out.println(fact);
        
    }
    public static void main(String[] args) {
        Test o =new Test();
        o.showFact(5);
        System.out.println("The show the factorial no....> "+fact);
        
    }

}
/*lass Test{
    static int fact=1;
    public static void main(String[] args) {
     int no=5;
     Test o1=new Test();
     
     o1.showFact(no) ;  
     System.out.println(fact);
    }
    void showFact(int no){
        if(no>=1){
            fact=fact*no;
            showFact(no-1);
        }
    }
}*/
/*class Test{
    static void s(){
        System.out.println("i");
        s();
    }
    public static void main(String[] args) {
        s();
    }
}*/
/* 
class Test{
    static int fact=1;
    void showFact(int no){
        if(no>=1){
            fact=fact*no;
            showFact(no -1);
        }
    }
    public static void main(String[] args) {
        Test o=new Test();
        o.showFact(5);
        System.out.println(fact);
    }
}*/
/* 
class Test{
    static int c=0;
    static void s(int n){
        c++;
        if(c<=10){
            System.out.println(c*n);
            s(n);
        }
    }
    public static void main(String[] args) {
    
        s(3);
    }

}*/
/* 
class Test{
    public static void main(String[] args) {
        for(int no=1;no<=200;no++){
        int t=0;
        for(int i=2;i<=no-1;i++){
            if(no%i==0){
                t=t+1;

            }
        }
        if(t==0){
            System.out.println(no);
        }
    }
}}
*/
/* 
class Test{
    public static void main(String[] args) {
        int a=10;
        while(a<=100){
            int org=a;
            int rev=0;
            int n=a;
            while(n>0){
                int last=n%10;
                rev=rev*10+last;
                n=n/10;
            }
            if(rev==org){
                System.out.println(org);

            }
            a++;
        }
    }
}*/
/* 
class Test{
    public static void main  (String[] args) {
        int a=10;
        for(a=10;a<=100;a++){
            int org=a;
            int rev=0;
            int n=a;
            while(n>0){
                int last=n%10;
                rev=rev*10+last;
                n=n/10;
            }
            if(rev==org){
                System.out.println(org);

            }
            
        }
    }
}*/
/*class Test{
    public static void main(String[] args) {
        System.out.println("hey");
        int a=10;
        for(a=10;a<=100;a++){
            int org=a;
            int n=a;
            int last;
            int rev=0;
        while(n>0){
            last=n%10;
            rev=rev*10+last;
            n=n/10;
        }
        if(org==rev){
            System.out.println(org);

        }
        }
    
    }
}*/
/* 
class Test{
    public static void main(String[] args) {
        System.out.println("hey");
        int a=10;
        for(a=10;a<=100;a++){
            int org=a;
            int n=a;
            int last;
            int rev=0;
        while(n>0){
            last=n%10;
            rev=rev*10+last;
            n=n/10;
        }
        if(org==rev){
            System.out.println(org);

        }
        }
    
    }


}*/
/*class Test{
    public static void main(String[] args) {
        System.out.println("Enter any no for check armstrong no or not");
        Scanner sc =new Scanner(System.in);
        int no=sc.nextInt();
    
        int t1=no;
        int lang=0;
        while(t1!=0){
            lang=lang+1;
            t1=t1/10;
        }
        int t2=no;
        int arm=0;
        while(t2!=0){
            int mul=1;
            int rem=t2%10;
            for(int i=1;i<=lang;i++){
                mul=mul*rem;
                
            }
            arm=arm+mul;
            t2=t2/10;
        }
        if(arm==no){
            System.out.println("This is armstrong no ");
        }
        else{
            System.out.println("this is not armstrong no");
        }
    }
}*/

//* 
/*class Test{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter b of power a");
        int a =sc.nextInt();
        int b=sc.nextInt();

        int pow=1;
        for(int i=1;i<=b;i++){
            pow=pow*a;

        }
        System.out.println( "show b of power a....> "+pow);

        
    }
} */
/* 
class Test{
    static int c=0;
    static void sum(){
        c++;
        if(c<=10){
           //7 System.out.println(c);
            
            sum();

        }
    
    }
    public static void main(String[] args) {
    
        sum();
      //  System.out.println(c);
        
    }
}*/
/* 
class Test{
    static int n1=0,n2=1,c;
    public static void main(String[] args) {
        System.out.println(n1);
        System.out.println(n2);
        printfibo(12);
        
    }
    static void printfibo(int i){
        if(i>=1){
            c=n1+n2;
            System.out.println(""+c);
            n1=n2;
            n2=c;
            printfibo(i-1);
        }

    }
}*/
/* 
class Test{
    private int pasword;
    public int getPasword(){
        return pasword;
    }
    public void setPasword(int pasword){
        this.pasword=pasword;
    }
    public static void main(String[] args) {
        Test o=new Test();
        o.setPasword(9999566);
        System.out.println("passsword....>"+o.getPasword());
    }

}*/
/* 
class Test{
    int a ,b ,c,d;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the four nos ");
        int e=sc.nextInt();
        int f=sc.nextInt();
        int g=sc.nextInt();
        int h=sc.nextInt();

        Test o=new Test();
        o.Sum(e, f, g);
        o.mul(e, f, g, h);
        
        
    }
    void Sum(int a,int b ,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("Total sum of three nos..>"+(a+b+c));
    }
    void mul(int a, int b ,int c,int d){
        this.Sum(a, b, c);
        this.d=d;
        System.out.println("Show Here Multiplication..==>"+a*b*c*d);
    }

}*/
/*class Test{
    int a ,b;
    public static void main(String[] args) {
        System.out.println("Enter sum of two nos..");
        Scanner sc =new Scanner(System.in);
        int d=sc.nextInt();
        int c=sc.nextInt();
        sum(c, d);
        System.out.println(sum(c, d));
    }
    static int sum(int a, int b){
        return a+b;
    }
}*/
/* 
class Test{
    public static void main(String[] args) {
        System.out.println("Enter Any string ");
        Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
    

        String sp="";
        for(int i=str.length()-1;i>=0;i--){
            sp=sp+str.charAt(i);

        }
        if(sp.equals(str)){
            System.out.println("This is palindrom no");
        }
         else{
            System.out.println("this is not palindrome no");
        }
    }
}*/
/* 
class Test{
    static int n1=0,n2=1,n3;
    public static void main(String[] args) {
        System.out.println(n1);
        System.out.println(n2);
        sum(10);

    }
    static void sum(int i){
        if(i>=1){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
            sum(i-1);
        }
    }*/
//class Test{
    //public static void main(String[] args) {
        /* 
        System.out.println("Enter any no check even or odd:n");
        int a=7;
        int b=9;
        int min=(a<b)?a:b;
        System.out.println(min);
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        String check=(n%2==0)?"this is even no":"this is odd no";
        System.out.println(check);*/
       /*  System.out.println("Please Enter your pin no");
        Scanner sc=new Scanner(System.in);
        int passsword=sc.nextInt();
        String s=(passsword==1234)?"Available balance 4000.7":"Invalid pin";
        System.out.println(s);*/
       /*  System.out.println("Enter the any aplphbet letter then after check vowel and consonant");
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        switch(str){
            case "A":
            System.out.println("This is Vowel");
            break;
            case "E":
            System.out.println("This is Vowel");
            break;
            case "I":
            System.out.println("This is Vowel");
            break;
            case "O":
            System.out.println("This is Vowel");
            break;
            case "U":
            System.out.println("This is Vowel");
            break;
            case "a":
            System.out.println("This is Vowel");
            break;
            case "e":
            System.out.println("This is Vowel");
            break;
            case "i":
            System.out.println("This is Vowel");
            break;
            case "o":
            System.out.println("This is Vowel");
            break;
            case "u":
            System.out.println("This is Vowel");
            break;
            default:
            System.out.println("This is Consonant");



        }

       }
}*/


/*class Test{
    public static void main(String[] args) {
        System.out.println("Enter Any Alphabets");
       Scanner sc =new Scanner(System.in);
        
        String ch=sc.nextLine();
        String s=(ch=="A"||ch=="E"||ch=="I"||ch=="O"||ch=="U"||ch=="a"||ch=="e"||ch=="i"||ch=="o"||ch=="u")?"This is vowel":"this is consonanats";
        System.out.println(s);
    }
}*/

/*class Test{
    public static void main(String[] args) {
        int i=0;
        do{
            System.out.println(i);
            i++;}
            while(i<=12);
        
    }
}*/

/*class Test{
    public static void main(String[] args) {
      /*  for(int i=0 ;i<=12;i++){
            System.out.println(i);
        if(i==4){
          // System.out.println(i); 
        break;
        }

        }*/
       /* a:
        for(int i=0;i<=7;i++){
        b:
        for(int j=0; j<9;j++){
        c:
        for(int k=0;k<8;k++){
       // System.out.println(k);
        if(k==3){
            continue a;
        }
        System.out.println(i);

        
    }
}}}}*/
// Java code to explain how to generate OTP
/*public class Test {
    //declaring a of return type String
    //which on calling provides the otp
        public static String generateOTP()
        { //int randomPin declared to store the otp
            //since we using Math.random() hence we have to type cast it int
            //because Math.random() returns decimal value
            int randomPin =(int) (Math.random()*90000 )+1000;
            String otp = String.valueOf(randomPin);
            return otp; //returning value of otp
        }
                public static void main(String args[])//method to call and print otp
        {
            String otpSting =generateOTP();//function calling
            System.out.println("Please don't share Your otp: "+otpSting);
        }
    }// Here we are using Math.random() function.
    // class in Java
    */

   /* class Test{
        public static void main(String[] args) {
            char c=10;
            char c1=7;
            char h=65;
            System.out.println(h);
            System.out.println(c+c1);
            short t=3,t2=5;
            int int1=22,int2=99;
            float f=67,f1=68;
            int1=c+c1;
            f=int1+int2;
            int1=int1+int2;
            System.out.println(f);
            byte g='A';
            System.out.println(g);
            
             System.out.println(int1);
            int2=int1+int2;
            int ar[]={65,66,67,68};
            for(int e:ar){
                System.out.println(e);
            }
            for(char i=65;i<=256;i++){
                System.out.println(i);
            }
            for(byte i='A';i<='Z';i++){
                System.out.println(i);
            }
        }
    }*/
    
    //class Test{
      //  int u=77;
       // public static void main(String[] args) {
          /*  if (args.length > 0) {
            System.err.println("usage: myapp");
            System.exit(1);
            }
            // Run the application
            System.out.println("It worked");*/
          /*  if (args.length != 2) {
                System.err.println("usage: myapp <arg1> <arg2>");
                System.exit(1);
                }
                // Run the application
                System.out.println("It worked: " + args[0] + ", " + args[1]);*/
               // public static void main(String[] args) {
                    
  /*   int a=245;
    int v =2_4_5;
    System.out.println(a=v);
    System.out.println(a==v);
    System.out.println(a+v);
    char t='\n';
    long u=1234567888812347897L;
    System.out.println(t);
    
char doubleQuote = '"';
char singleQuote = '\'';
System.out.println(doubleQuote+" "+singleQuote);
for (int i = 0; i <= 26; i++) {
    char letter = (char) ('a' + i);
    System.out.print(letter);
   }
   int b=1234567898;
   System.out.println(b);

        }
    }*/

 /*   String lineFromCsvFile = "Mickey;Bolton;12345;121216";
String[] dataCells = lineFromCsvFile.split(";");
// Result is dataCells = { "Mickey", "Bolton", "12345", "121216"};
System.out.println(dataCells);
    String s="Ranjeet;poor ;jacjkk";
  String []c=  s.split(";");
  System.out.println(c);
  String sc="Ranjeet";
  System.out.println(sc.split(","));

    
}}*/
/*class Test{
    public static void main(String[] args) {
        String c[]="I ;am ;coming ;in ;home".split(";");
        System.out.println(c);
        
        String sc=" i am going to school";
        StringTokenizer o= new StringTokenizer(sc);
        while(o.hasMoreTokens()){
            System.out.println(o.nextToken());
        }
        
    }
}*/
import java.util.*;
//class Test{
    //public static void main(String[] args) {
       /*  String name="Ranjeet";
        System.out.println(name);
        StringBuffer sb=new StringBuffer(name);
      name= sb.reverse().toString();
      System.out.println(name);*/
      /*StringBuffer sb=new StringBuffer("Ranjeet");
     String f =sb.reverse().toString();
     System.out.println(f);*/
    // String name="          My name is Ranjeet Kumar      ";
  // String g = name.trim();
  // System.out.println(g);
 // String s=name.repeat('e');
 // System.out.println(s);
/*String f =name.replace("R", "M");
//f=name.replaceAll("Effort", "My Name");
System.out.println(f);
System.out.println(f);
// This does the same thing as the StringBuilder example above
int one = 1;
String color = "red";

System.out.print(f.format("One=%d, colour=%s%n", one, color));
// Prints "One=1, Colour=red" followed by the platform's line separator
// The same thing using the `String.format` convenience method
System.out.print(String.format("One=%d, color=%s%n", one, color));

    }*/
    //BigInteger value1 = new BigInteger("10");
//BigInteger power = value1.pow(3);
//System.out.println(power);
//BigInteger v2=new BigInteger( "5");
//BigInteger v3=new BigInteger("6");
//BigInteger mul=value1.multiply(v2);
//BigInteger mu=mul.multiply( v3);
//System.out.println(mu );
/*import java.util.*;
class Test{
 public static void main(String args[]){
 
  TreeSet<String> al=new TreeSet<String>();
  al.add("Ravi");
  al.add("Vijay");
  al.add("Ravi");
  al.add("Ajay");

  Iterator<String> itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());}
    
   
  }
 }
}*/
/*import java.util.HashMap;
class Test{
    public static void main(String[] args) {
        HashMap <String,Integer>item=new HashMap<String,Integer>();
        item.put("R", 44);
        item.put("P", 22);
        item.put("U", 99);
        item.put("W", 990);
        System.out.println(item);
        for(String s:item.keySet()){
            System.out.println(s+",,,,,,,,,,,,,,,"+item.get(s));

        }
    }
}
*/
/*import java.util.ArrayList;
class Test{
    public static void main(String[] args) {
        ArrayList <Integer> age=new ArrayList<Integer>();
        age.add(11);
        age.add(22);
        age.add(10);
        age.add(7);
        ArrayList <Integer> ag=new ArrayList<Integer>();
        ag.add(11);
        ag.add(202);
        ag.add(100);
        ag.add(70);
        age.addAll(ag);
        System.out.println(age);
    
    }
}*/
/*class Test{
    public static void main(String[] args) {
        System.out.println("Enter any no for check armstrong no or not");
        Scanner sc =new Scanner(System.in);
        int no=sc.nextInt();
    
        int t1=no;
        int lang=0;
        while(t1!=0){
            lang=lang+1;
            t1=t1/10;
        }
        int t2=no;
        int arm=0;
        while(t2!=0){
            int mul=1;
            int rem=t2%10;
            for(int i=1;i<=lang;i++){
                mul=mul*rem;
                
                
            }
            arm=arm+mul;
            t2=t2/10;
        }
        if(arm==no){
        
            System.out.println("This is armstrong no ");
        }
        else{
            System.out.println("this is not armstrong no"+arm);
        }
    }
}*/
class Test{
    public static void main(String[] args) {
        String []s={"a","h","j"};
        for(String i:s){
            System.out.println(i);
        }
    }
}