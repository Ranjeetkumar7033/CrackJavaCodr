import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

import javax.sound.midi.SoundbankResource;
import javax.swing.SizeRequirements;
import javax.swing.plaf.synth.SynthDesktopIconUI;
import javax.swing.plaf.synth.SynthStyleFactory;

/*public class Dubalicat {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the  value of s and e");
        int s=sc.nextInt();
        int e=sc.nextInt();
        int a;
    
        for(a=s;a<=e;a++){
            int org=a;
            int n=a;
            int rev=0;
            while(n>0){
                int last=n%10;
                rev=rev*10+last;
                n=n/10;
            }
            if(org==rev){
                System.out.println(a);
            }
        }
    }
    
}*/
/*public class Dubalicat {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a power of b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int pow=1;
        for(int i=1;i<=b;i++){
            pow=pow*a;
          // System.out.println(pow);
        }
        System.out.println(pow);
    }
}


/*public class Dubalicat {
public static void main(String[] args) {
    int no=153;
    int t1=no;
    int lang=0;
    while(t1!=0){
        lang=lang+1;
        t1=t1/10;
        
    }
    int t2=no;
    int arm=0;
    while(t2 !=0){
        int mul=1;
        int rem=t2%10;
        for(int i=1;i<=lang;i++){
            mul=mul*rem;
            
        }
        arm=arm+mul;
        t2=t2/10;


    }
    if(arm==no){
        System.out.println("This is Armstrong no");
    }
    else{
        System.out.println("This is not Armstrons no");
    }
}
}*/
/*public class Dubalicat {
*public static void main(String[] args) {
    int no=6;

    for(no=6;no<=1000;no++){
        int t=0;
    for(int i=2;i<no-1;i++){
        if(no%i==0){
            t=t+1;
        }
    
    }
    if(t==0){
        System.out.println(no);
    }
}
 
}
}*/

/*public class Dubalicat {
public static void main(String[] args) {
    int n1=0,n2=1,n3;
    System.out.print(n1 +" "+ n2);
    for(int i=2; i<10;i++){
    n3=n1+n2;
    System.out.print(" "+n3);
    n1=n2;
    n2=n3;
}}
}*/

/*class Dubalicat{
    static int n1=0,n2=1,n3=0;
    static   void fibonaci(int count){
        if(count>0){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
            fibonaci(count-1);
        }
    }
    public static void main(String[] args) {
        int count=10;
        System.out.println(n1);
        System.out.println(n2);
        fibonaci(count-2);
        
    }
}*/
/*class Dubalicat{
    void fibonaci(int no){
        int n1=0,n2=1,n3;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2 ;i<no;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the fibonaci no");
        int n=sc.nextInt();
        Dubalicat o=new Dubalicat();
        o.fibonaci(n);
    }
}*/
/*class Dubalicat{ 
    static int fact=1;
    static void factorial(int n){
        if(n>=1){
            fact=fact*n;
        
            factorial(n-1);
        }
       // System.out.println(fact);
    }
    public static void main(String[] args) {
        factorial(5);
        System.out.println(fact );
    }
}*/
/*class Dubalicat{
  public static void main(String[] args) {
    int no=145;
    int org =no;
    
    int d;
    int sum=0;
    while(no>0){
        int f=1;
        d=no%10;
        for(int i=1;i<=d;i++){
            f=f*i;
        }
        sum=sum+f;
        no=no/10;
        
    }
    System.out.println(sum+" ==" +org);
    if(org==sum){
        System.out.println("this is strong no");
    }
    else {
        System.out.println("this is not strong no");
    }
  }
}
*/
/*class Dublicat{
    static int n1=0,n2=1,n3=0;
    static void fibonaci(int count){
        if(count>0){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
            fibonaci(count-1);
        }
    }
    public static void main(String[] args) {
       // int count =10;
        System.out.println(n1);
        System.out.println(n2);
        fibonaci(10-2);
        
        
    }
}*/

/*class Dubalicat{
    static int f=1;
    static void factorial(int n){
        if(n>=1){
            f=f*n;
           // System.out.println(f);
            factorial(n-1);
        }
       
    }
    public static void main(String[] args) {
        factorial(5);
        System.out.println(f);
    }
}*/
/*class Dubalicat{
    static int sum=0,n1;
    static void s(int n ,int n2){
        if(n<=10){
            //sum=sum+n;
           // System.out.println(n);
           int table=n*n2;
           System.out.println(n+"x"+n2+"="+table);
            s(n+1,n2);
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any table");
        int tab=sc.nextInt();
        
        s(1,tab);
        
        
    }
}*/
/*class Dubalicat{
     static int s=0;
    static void num(int n){
        if(n<=10){
            s=s+n;
            System.out.println(n);
            num(n+1);
        }
        
    }
    public static void main(String[] args) {
        num(5);
        System.out.println(s+"<===.sum............>");
    }
}*/ 
/*class Dubalicat{
    public static void main(String[] args) {
        int a=10;
        for(a=10;a<=1000;a++){ 
            int n=a;
            int last;
            int rev=0;
            while(n>0){
                last=n%10;
                rev=rev*10+last;
                n=n/10;
            }
            if(rev==a){
                System.out.println(a);
            }
        }
    }}*/
   /*  class Dubalicat{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the any nos check for strons no or not strons no");
            int a=sc.nextInt();
            
            int n=a;
            int sum=0;
            while(n>0){
            
                int rem=n%10;
                int f=1;
                for(int i=1;i<=rem;i++){
                    f=i*f;
                    
                }
                sum=sum+f;
                n=n/10;
               // System.out.println(sum);
            }
            if(sum==a){
                System.out.println("this is strong nos");
            }
            else{
                System.out.println("this is not strong nos");
            }
            
            
        }
    }*/
    /*class Dubalicat{
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            String str="";
           // String str="Ranjeet";
            String s="";
            for(int i=str.length()-1;i>= 0;i--){
                s=s+str.charAt(i);
              // System.out.println(str.charAt(i));
            }
            if(s.equals(str)){
                System.out.println("this is palindrome");
            }else{
                System.out.println("This is not palindrome");
            }
        }
    } */
    /*class Dubalicat{
        public static void main(String[] args) {
            int a=15;
            int t1=a;
            int alg=0;
            while(t1!=0){
                
                alg=alg+1;
            //System.out.println(alg);
                t1=t1/10;
                

            }
            int t2=a;
           // int rem;
            int arm=0;
            while(t2!=0){
                int rem;
                int m=1;
                rem=t2%10;
                for(int i=1;i<=alg;i++){
                    m=m*rem;
                    

                }
                arm=arm+m;
                t2=t2/10;
            }
            if(a==arm){
                System.out.println("this is arn strong nos");
            }else{
                System.out.println("this is not arm strong");
            }
            
        }
    }*/
   /*  class Dubalicat{
        public static void main(String[] args) {
            int a=2000;
            int t1=a;
            int d;
            int l=0;
            while(t1!=0){
                 d=t1%10;
                System.out.println(d);
                l=l+1;
                t1=t1/10;
                System.out.println(l);

            }
            
        }
    }*/ 
  /*  class Dubalicat{
        public static void main(String[] args) {
            int n=25;
            for(int i=0;i<n;i++){
                for(int j=n;j<i;j--){
                    System.out.print((i%2)+" ");
                }
                System.out.println();
            }
        }
    }*/
   // cla//ss Dubalicat{
      //  public static void main(String[] args) {
            /*int a=10,b=30;
            a=a+b;*/
           // System.out.println(a);
           // System.out.println(a+b);
         /*   short a=10,b=50;
           a=(short)(a+b);
           System.out.println(a);*/
              //Using Label for outer and for loop  
    /*aa:  
    for(int i=1;i<=3;i++){  
        bb:  
            for(int j=1;j<=3;j++){  
                if(i==2&&j==2){  
                    break bb;  
                }  
                System.out.println(i+" "+j);  
            }  
    }  
        }
    }*/
    /*class Dubalicat{
        public static void main(String[] args) {
            aa:
            for(int i=1;i<=12;i++){
                if(i==6){
                   break aa;
                   //continue aa;
                }
                System.out.println(i);
            }
        }

    }*/
  /*  class Dublicat{
        public static void main(String[] args) {
            {
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter marks");
                int marks=sc.nextInt();
                if(marks>=38&&marks<55){
                    System.out.println("this is third division");
                }
                else if(marks>=60&& marks<70){
                    System.out.println("this is Second division");
                }
                else if(marks>=70&&marks<80){
                    System.out.println("this is first division");
                }
                else if(marks>=80&&marks<90){
                    System.out.println("this is Top ten");
                }
                else if(marks>=90&&marks<100){
                    System.out.println("this is First rank");
                }
                else{
                    System.out.println("this is fail");
                }
            }
        }
    }*/
   /*  class Dublicat{
        public static void main(String[] args) {
              //C - CSE, E - ECE, M - Mechanical  
        char branch = 'C';                 
        int collegeYear = 4;  
        switch( collegeYear )  
        {  
            case 1:  
                System.out.println("English, Maths, Science");  
                break;  
            case 2:  
                switch( branch )   
                {  
                    case 'C':  
                        System.out.println("Operating System, Java, Data Structure");  
                        break;  
                    case 'E':  
                        System.out.println("Micro processors, Logic switching theory");  
                        break;  
                    case 'M':  
                        System.out.println("Drawing, Manufacturing Machines");  
                        break;  
                }  
                break;  
            case 3:  
                switch( branch )   
                {  
                    case 'C':  
                        System.out.println("Computer Organization, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Fundamentals of Logic Design, Microelectronics");  
                        break;  
                    case 'M':  
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");  
                        break;  
                }  
                break;  
            case 4:  
                switch( branch )   
                {  
                    case 'C':  
                        System.out.println("Data Communication and Networks, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Embedded System, Image Processing");  
                        break;  
                    case 'M':  
                        System.out.println("Production Technology, Thermal Engineering");  
                        break;  
                }  
                break;  
        }  
    
            
        }
    }*/
   /* class Dublicat{
        void fact(int n){
            int f=1;
            for(int i=1;i<=n;i++){
                f=f*i;
            }
            System.out.println("Factorial..=>"+f);
        }
        public static void main(String[] args) {
            new Dublicat().fact(5);
            Trangle r1=new Trangle(),r2 =new Trangle(),r3 =new Trangle();
            r1.area(22, 66);
            r2.area(77, 99);
            r3.area(55, 55);
            r1.display();
            r2.display();;
            r3.display();
        }
    }
    class Trangle{
        int a,b;
        void area(int c , int d){
            a=c;
            b=d;
            
        }
        void display(){
            System.out.println(1/2*(a*b));
        }
    }*/

   /*  class Dublicat{
        int a;
        String name;

        Dublicat(int age , String n){
            a=age;
            name=n;
        }
        Dublicat(Dublicat s){
            a=s.a;
            name=s.name;

        }
        void display(){
            System.out.println("Name...>"+name+" "+"Age"+a);
        }
        {System.out.println("Default constructor");}
        public static void main(String[] args) {
         Dublicat o=new Dublicat(22,"ranjeet");
         Dublicat s1=new Dublicat(o);
         o.display();
         s1.display();

        }
    }*/
  /*  class Dublicat{

    String name;
 static   String coll_name="IES";
    int id;
    Dublicat(String name , int id){
    
        this.name=name;
        this.id=id;
    }
    void display(){
        System.out.println("Name of Student..>"+name+"  "+"CollageName...>"+coll_name+"  "+"id_Name...>"+id);
    }
    public static void main(String[] args) {
        Dublicat s1 =new Dublicat("Ranjeet", 30);
        Dublicat s2=new Dublicat("Ranjan Singh", 60);
        Dublicat s3=new Dublicat("Chandan", 66);
        Dublicat s4=new Dublicat("Raju", 7);
        
    
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        
    }
   }*/
   /*
   class Dubalicat{
    void m(){
        System.out.println("this is first");
    }
    void n(){
        System.out.println("this is not good");
        this.m();
    }
    public static void main(String[] args) {
        Dubalicat s1=new Dubalicat();
        s1.n();
    }
   }*/
   /*class Dubalicat{
    String name;
    String course;
    int id;
    float fee;
    Dubalicat(String name, String course ,int id){
        this.course=course;
        this.name=name;
        this.id=id;
    }
    Dubalicat(String name, String course ,int id ,float fee){
        this(name, course, id);
        this.fee=fee;
    }
    void display(){
        System.out.println("Name..>"+name+"   CourseName..>"+course+"   Id..>"+id+"   Fee...>"+fee);
    }
    public static void main(String[] args) {
        Dubalicat s1=new Dubalicat("Ranjeet", "Python", 11, 234455);
        s1.display();
        s1.display();
    }
   }*/
   /*class Address{
    String city,state,country;
    Address(String city , String state,String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
   }
   class Dublicat{
    String name;
    int age;
    int id;
    Address address;
    Dublicat(int age, String name ,int id,Address address){
        this.name=name;
        this.age=age;
        this.id=id;
        this.address=address;
    }
void display(){
    System.out.println("Name..>"+name+"   Age..>"+age+"  id..>"+id);
    System.out.println(address.city+"  "+address.state+"   "+address.country);
}
public static void main(String[] args) {
    Address address1=new Address("Gopalgan", "Bihar", "India");
    Address address2=new Address("Siwan", "Bihar", "India");
    Dublicat o=new Dublicat(22, "Ranjan singh", 33, address1);
    Dublicat o1=new Dublicat(44, "Chandan ojha", 55, address2);
    o.display();
    o1.display();
}
   }*/
   /*class Dubalicat{
    static void add(int a ,int b){
        System.out.println(a+b);
    }

    static void add(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        add(66);
        add(22, 44);
    }
   
   }*/
   /*class Dublicat{
    
     void add(int a , int b){
        System.out.println(a+b);

    }}
    class A extends Dublicat{
      @Override 
     void add(int c , int d){
        
            System.out.println(c+d);
            
        }
        public static void main(String[] args) {
            A o=new A();
            o.add(33, 78);
            o.add(33, 55);
        }
    }
    */
    /*class  Dublicat{
        private int a,b;
        private void sum(int a , int b){
            this.a=a;
            this.b=b;
            

        }
        void display(){
            System.out.println(a+b);
        }
        public static void main(String[] args) {
            Dublicat o =new Dublicat();
            o.sum(66, 88);
            o.display();
        }
    }*/
    /*class Dubalicat{
        private int pasword ,id;
        public int getPas(){
            return pasword;
        }
        public int getId(){
            return id;
        }
        public void setpas(int pasword){
            this.pasword=pasword;
        }
        public void setId(int id){
            this.id=id;
        }
        public static void main(String[] args) {
            Dubalicat o=new Dubalicat();
            o.setpas(12233);
            o.setId(77);
            System.out.println("Password..>"+o.getPas()+"  Id..>"+o.getId());
        }
    }
   */
  /*class Dubalicat implements Cloneable{
    int id;
    int age;
    Dubalicat(int id , int age){
        this.age=age;
        this.id=id;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) {
        try{
            Dubalicat o=new Dubalicat(55, 33);
            Dubalicat o1= (Dubalicat)o.clone();
            System.out.println(o.age+"  "+ o.id);
            System.out.println(o1.age+" .."+o1.id);
        }catch(Exception e){
            System.out.println();
        }
    }
  }*/
/*   class Dubalicat{
    public static void main(String[] args) {
        int a=99;
        Integer i=Integer.valueOf(a);
        Integer j=a;
        System.out.println(i+ " "+a+" "+j);
    }
  }*/
  /*class Dublicat{
    public static void main(String[] args) {
        Integer a=new Integer(7);
        int j=a.intValue();
        int k=a;
        System.out.println(k+" "+a+" "+j);
    }
  }*/
  /*class Dubalicat{
        int data=22;
        void change(int data){
            data=data+1000;
            
        }
        public static void main(String[] args) {
        Dubalicat op =new Dubalicat();
        System.out.println(op.data);
        op.change(200000000);
        }
    }
*/
/*class Dubalicat{
    int data=50;
    void change(Dubalicat op){
        op.data=op.data+100;
    }
    public static void main(String[] args) {
        Dubalicat op =new Dubalicat();
        System.out.println(op.data);
        op.change(op);
        System.out.println(op.data);
    }
}*/
/*class Dubalicat{
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++)  
System.out.println(args[i]);
    }
}*/
/*class Dubalicat{
    public static void main(String[] args) {
    int arr [][]=new int[3][3];
    arr[0][0]=1;  
arr[0][1]=2;  
arr[0][2]=3;  
arr[1][0]=4;  
arr[1][1]=5;  
arr[1][2]=6;  
arr[2][0]=7;  
arr[2][1]=8;  
arr[2][2]=9;  
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++){
        System.out.print("  "+arr[i][j]);
    }
    System.out.println();
}
}}*/
/*class Dublicat{
    static void min(int arr[]){  
        int min=arr[0];  
        for(int i=1;i<arr.length;i++)  
         if(min>arr[i])  
          min=arr[i];  
          
        System.out.println(min);  
        }  
          
                    public static void main(String args[]){  
        int a[]={33,3,4,5,44,555,-66};//declaring and initializing an array  
        min(a);//passin
    }
}*/
/*class Dublicat{
     public static void main(String[] args) {
        int a[][]={{11,22,33,44},{12,23,34,44},{67,78,89,90},{98,87,65,43}};
        int b[][]={{10,20,33,44},{12,23,30,40},{70,78,89,90},{98,87,65,43}};
        int c[][]=new int[4][4];
        
        for(int g=0;g<a.length;g++){
            for(int h=0;h<a.length;h++){
            System.out.print("  "+a[g][h]);

                }
                System.out.println();
            }
            System.out.println("<............................>");
            for(int k=0;k<b.length;k++){
                for(int m=0;m<a.length;m++){
                    System.out.print("  "+b[k][m]);
                }
                System.out.println();
            }


System.out.println("<.............................>");


        for(int i=0;i<a.length;i++){

            for(int j=0;j<b.length;j++){
                 c[i][j]=a[i][j]+b[i][j];
                 System.out.print("   "+c[i][j]);

                
            }
            System.out.println();
        }
        

    }
    }
*/
//class Dubalicat{
   /*  public static void main(String[] args) {
        
            //creating two matrices    
            int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
            int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
                
            //creating another matrix to store the multiplication of two matrices    
            int c[][]=new int[3][3];  //3 rows and 3 columns  
                
            //multiplying and printing multiplication of 2 matrices    
          for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
            c[i][j]=0;      
            for(int k=0;k<3;k++)      
            {      
            c[i][j]+=a[i][k]*b[k][j];      
            }//end of k loop  
            System.out.print(c[i][j]+" ");  //printing matrix element  
            }//end of j loop  
            System.out.println();//new line    
            }    
            }}  */
           /*  class Dublicat{
                public static void main(String[] args) {
                    int arr[]={1,22,3,4,55,66};
                    System.out.println("this is original Array");
                    for(int i:arr){
                        System.out.println(i);
                    }
                    System.out.println("printing clone of the array");
                    int arry[]=arr.clone();
                    for(int j:arry){
                        System.out.println(j);
                    }
                    System.out.println("Are both equal");
                    System.out.println(arr==arry);
                }*/
               /*  class Dubalicat{
                    public static void main(String[] args) {
                        Scanner sc=new Scanner(System.in);
                        System.out.println("Enter the size of array");
                        int n=sc.nextInt();

                        int arr[]=new int[n];
                        System.out.println("---------------------------------");
                        System.out.println("Enter any six element");
                    
                        for(int i=0;i<arr.length;i++){
                            arr[i]=sc.nextInt();
                        }
                        System.out.println("output of the array........................");
                        for(int j:arr){
                            System.out.print("  "+j*6);
                        }
                    }
                }*/
               /*  class Dublicat{
                    void arry(int arr[]){
                        System.out.println("..........................");
                        for(int i=0;i<arr.length;i++){
                            System.out.print("    "+arr[i]);
                            
                        }
                    }
                    public static void main(String[] args) {
                        int a[]=new int[4];
                        Scanner sc =new Scanner(System.in);
                        System.out.println("Enter the element");
                        for(int j=0;j<a.length;j++){
                             a[j]=sc.nextInt();
                        }
                        Dublicat o=new Dublicat();
                        o.arry(a);
                    }
                */    
              /*   class Dubalicat{
                    public static void main(String[] args) {
                        int arr[]={11,22,33,44,55};
                        for(int i:arr){
                            System.out.println(i);
                        }
                        System.out.println("...........................");
                        int ar[]=arr.clone();
                        for(int j:ar){
                            System.out.println(j);
                        }
                    }
                }*/
               /*  class Dubalicat{
                    public static void main(String[] args) {
                        int ar[]={1,2,3,4,5,6,7,8,9,10};
                        int sum=0;
                        int n=1;
                        for(int i:ar){
                            sum=sum+i;
                            n=n*i;
                        }
                        System.out.println(sum);
                        System.out.println(n);
                    }
                }*/
                /*class Dublicat{
                    public static void main(String[] args) {
                             //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8,3,5,5,7};  
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i]==arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  }}
    */

/*class Dubalicat{
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55};
        System.out.println("original Array");
        for(int i:arr){
            System.out.println(i);
        }
        int car[]=arr.clone();
        System.out.println("this is old array");
        for(int j:car){
            System.out.println(j);
        }
        
    }
}*/
/*class duplicate{
    public static void main(String[] args) {
    int a[][]={{1,2,3},{4,5,6},{9,8,7}};
    int b[][]={{7,9,3},{2,5,6},{9,8,5}};
    int c[][]=new int [3][3];
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            System.out.print("  "+a[i][j]);

        }
        System.out.println();
    }
    System.out.println(".....................");
    for(int i=0;i<b.length;i++){
        for(int j=0;j<b.length;j++){
            System.out.print("  "+b[i][j]);
        }
System.out.println();
    }
    
System.out.println("..................................");
for(int i=0;i<a.length;i++){
    for(int j=0;j<b.length;j++){
        c[i][j]=a[i][j]+b[i][j];
        System.out.print("  "+c[i][j]);
    }
    System.out.println( );
}

}
} */
/*class duplicate{
    public static void main(String[] args) {
        
        int a[][]={{1,2,3},{4,5,6},{9,8,7}};
        int b[][]={{7,9,3},{2,5,6},{9,8,5}};
        int c[][]=new int [3][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print("  "+a[i][j]);
    
            }
            System.out.println();
        }
        System.out.println(".....................");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                System.out.print("  "+b[i][j]);
            }
    System.out.println();
        }
        
    System.out.println("..................................");
    for(int i=0;i<3;i++){    
        for(int j=0;j<3;j++){    
        c[i][j]=0;      
        for(int k=0;k<3;k++)      
        {      
        c[i][j]+=a[i][k]*b[k][j];      
        }//end of k loop  
        System.out.print(c[i][j]+" ");  //printing matrix element  
        }//end of j loop  
        System.out.println();//new line    
        }    
    
    }
    } */
  /*   class duplicate{
        public void sum(){
            System.out.println("this is public");
        }
        void jack(){
            System.out.println("g");
        }
        static void beforemain(){
            System.out.println("thids will be excuted main method before");
        }
       
        public static void main(String[] args) {
            duplicate o=new duplicate();
            o.jack();
            o.sum();
            System.out.println("this is main metho");
            beforemain();
            
        }
    }*/
   /*  class Dublicat{
        {
            System.out.println("instanceblock");
        }
        static{
            System.out.println("hello");
        }
        public static void main(String[] args) {
            System.out.println("hey");
            Dublicat o=new Dublicat();
        }
    }*/
    /*class duplicate{
        public static void main(String[] args) {
            B o=new B();
            o.show();
        }

    }
    class A{
        A show(){
            System.out.println("hello");
            return this;
        }
    }
    class B extends A{
        B show(){
            super.show();
            System.out.println("hey");
            return this;
        }
    }*/
    /*class duplicate{
       static final void sum(){
            System.out.println("");
        }
        final static void sum(int a, final int b){{
            
            System.out.println(a+b);
            
        }

        }
        public static void main(String[] args) {
            final int a=10;
            final int b=44;
        System.out.println(a+b);
        duplicate o =new duplicate();
        o.sum(22, 55);
        o.sum();
        }
    }*/
   /*  class duplicate{
       void m(){
            System.out.println("hey");
        }
     void m(int a){
        
            this.m();
            System.out.println(a);
        }
        public static void main(String[] args) {
            duplicate o=new duplicate();
            o.m(5);
        }
    }*/
   /*  class duplicate{
        public static void main(String[] args) {
          int a=10;
            a=40;
            double b=a;
            System.out.println(b);
            System.out.println(a);
            char c='a';
            int d=c;
            System.out.println(d);
          /*  
            for(short i ='A';i<='Z';i++){
            */
          //  }
           /* * for(char j=0;j<=200;j++){
                System.out.print("  "+j);
            }
        }
    }*/
   /*  class duplicate{
        public static void main(String[] args) {
             int a=33;
             a-=55;
             System.out.println(++a);
             System.out.println(++a);
             String name="Ranjeet";
             String lastname="Kumar singh";
             System.out.println(name+lastname);
             System.out.println(name.concat(lastname));
            // System.out.println("Ranjeet\rhey!");
             System.out.println("hel\blobook");
             String str="Jack\rbook";  
             System.out.println(str);
        }
    }*/
  /*  class duplicate{
    static int f=1;
    static void natureal(int n){
        if(n>=1){
            f=f*n;
            natureal(n-1);
            
        }}
        public static void main(String[] args) {
            natureal(5);
            System.out.println(f);
            
        }
    }*/
  /*   class duplicate{
         static int c=0;
        static void sum(int n){
        
            if(n>0){
                System.out.println(n);
                sum(n-1);
            }
        }
        public static void main(String[] args) {
            sum(10);
        }
    }*/  
  /*  class Dubalicat{
        protected int a=11;
        protected String str="Ranjeet";
        protected int id=747;
    }
    class B extends Dubalicat{
        private int Passwor=123;
        private String emaild="ranjeetkumarsiwan@gmail.com";


        public static void main(String[] args) {
            B o=new B();
            System.out.println(o.a+"   "+o.str+"   "+o.id);
            System.out.println(o.Passwor+" "+o.emaild);
        }
    }*/
   /*  abstract class Dublicat{
        String name="Ranjeet";
        float salary=6460088;
        public abstract void study();
    }
    class Main extends Dublicat{
        int passingyear=2016;
        public void study(){
            System.out.println("Do you study");
            int a=22;
            int b=77;
            System.out.println(a+b);

        }

    }
    class Second{
        public static void main(String[] args) {
            Main o=new Main();
            System.out.println(o.passingyear);
            o.study();
            System.out.println(o.name+"  Salary...>"+o.salary);
        }
    }*/
/*class Dubalicat{
        int a=22;
        int b=99;
       class A{
        String name="Ranjeet";
        class C{
            int age=99;
        }
        }
        public static void main(String[] args) {
            Dubalicat outer=new  Dubalicat();
            Dubalicat.A obj=outer.new A();
            System.out.println(obj.name+"  "+outer.a+" 0"+outer.b);
        }
    }*/
  /*  class A{
        int a=99;
        static  class B{
            int b=996;
        }
    
    }
    class Dubalicat{
        public static void main(String[] args) {
        A.B out=new A.B();
        System.out.println(out.b+"  "+out.b);
        }
    }*/
 /*   abstract class A{
        public abstract void sound();
        int v=88;
        

        }

    class B extends A{
        public void sound(){
            System.out.println("this is method of abstract");
        }
    
    }
    class duplicate{
        public static void main(String[] args) {
            B o=new B();
            o.sound();
            System.out.println(o.v);
        }
    }*/
   /* interface I{
        public void sound();
        public void sleep();
    }
    interface I2{
        public void eat();
    }
   /*  interface I3{
        public void running();
    }*/
    /*interface Animal{
        public void sound();
        public void eat();
    }
    interface Animal1{
        public void forest() ;
    }
    interface D{
        public void d();
    }
    class P implements Animal,Animal1,D{
        public void sound(){
            System.out.println("h");
        }
        public void eat(){
            System.out.println("hey");
        }
        public void forest(){
            System.out.println("Animal live in forest");
        }
        public void d(){
            System.out.println("dog");
        }
    }
    class Dubalicat{
        public static void main(String[] args) {
            P o=new P();
            o.d();
            o.eat();
            o.forest();
            o.sound();
        
        }
    }*/
