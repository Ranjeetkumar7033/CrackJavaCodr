import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.plaf.synth.SynthScrollBarUI;

/*import java.util.Scanner;

public class CheckException extends RuntimeException{
    CheckException(String msg){
        super(msg);
    }

}
class Num{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no");
      
        int n=sc.nextInt();
        try{
      if(n>0){
        System.out.println("it is posetive Intiger");

        }else{
            throw new  CheckException("it is not posetive intiger");

            
        }}catch(Exception e){
            e.printStackTrace();
            e.fillInStackTrace();
            System.out.println("Welcome in java tutorial");
            for(int i=2;i<=7;i++){
                System.out.println(i);
            }
        }
    }
    }*/
  /*   class CheckException{
        public static void main(String[] args) {
           try{ ReadandWrite o=new ReadandWrite();
            o.readFile();
            o.saveFile();}catch(Exception e){
                e.fillInStackTrace();
                e.printStackTrace();
                System.out.println("hey");
            }
        }

    }
    class ReadandWrite{
        void readFile()throws FileNotFoundException{
            String text="this is demo";
            FileInputStream fis=new FileInputStream("d:/abc.text");

        }
        void saveFile()throws FileNotFoundException{
            String text="this is demo";
            FileOutputStream fos=new FileOutputStream("d:/xyz.text");

        }
    }*/
   /*  class CheckException{
        void m(){
            int a=0,b=4;
            System.out.println(b/a);
        }
        void n(){
            System.out.println("hey");
            m();
        }
        void l(){
            System.out.println("hello");
            n();
        }
        void o(){
           try{ System.out.println("Good");
            l();}catch(ArithmeticException e){
                e.printStackTrace();
            }
        }
        public static void main(String[] args) {
            CheckException o1=new CheckException();
            o1.o();
            
        }
    }*/
    /*class CheckException{
        void m()throws IOException{
        }
    }
    class M{
        public static void main(String[] args) throws IOException{
            CheckException o =new CheckException();
            o.m();
            System.out.println("nornmal flow");
            
        }
    }*/
    /*class CheckException{
        void love()throws IOException{
            throw new IOException("device is error");
        }
        public static void main(String[] args) throws IOException{
            CheckException o=new CheckException();
           try{ o.love();
            System.out.println("hello");}catch(IOException e){
                e.printStackTrace();
                e.toString();
                System.out.println("hellow");
            }
        }
    }*/
    /* */ /*class A{
        void m()throws ArithmeticException{

        }
    }
    class B extends A{
        void m() throws Exception{// here only declear Arthimetic exception thats mean un check exception
            System.out.println("this is child class");

        }
    }
    class CheckException{
        public static void main(String[] args) {
           try{B o=new  B();
            o.m();}catch(Exception e){
                e.printStackTrace();
            }
        }
    }
*/
/*class CheckException{
    void m(){
        System.out.println("ranjeet kumar singh");
    }
   static class B{
        void sum(){
            System.out.println("9687");
        }
        public static void main(String[] args) {
            CheckException.B outer=new CheckException.B();
            outer.sum();
            
            
            
        }
    }
}*/
/*class CheckException{
   static class A{int a=10;}
   static class B{String str="Ranjeet";}
   static class C{char v='a';}
    class D{float b=99;}
    class E{double b=8685;}
public static void main(String[] args) {
        
    
    CheckException.A o1 =new CheckException.A();
    CheckException.B o2=new CheckException.B();
    CheckException.C o3=new CheckException.C();
    CheckException o =new CheckException();
     
    D o4=o.new D();
    E o5=o.new E();
    System.out.println(o1.a+".."+o2.str+""+o3.v+"--" + o4.b+o5.b);}
}*/
class A{
    interface I{}
    enum E{}
    @interface Ann{}
}

interface I{
    class A{}
    enum E{}
    @interface Ann{}
}
enum Abc{;
    interface I{}
    enum E{}
    @interface Ann{}
}
@interface P{
    interface I{}
    enum E{}
    @interface Ann{}
}

//abstract class Scf{
  // abstract void mon();
//}
/*class Test_Anonmious{
    public static void main(String[] args) {
Scf s=new Scf() {
    void mon(){
        System.out.println("hello friends");
    }


    
};
s.mon();
}
}*/
/*interface Po{
    void eat();
}
class B{
    public static void main(String[] args) {
        Po o12=new Po() {
          public  void eat(){
            System.out.println("hello everyone");
          }
            
        };
        o12.eat();
    }
}*/
/*class CheckException{
    private int data=30;
    void display(){
        System.out.println("hello");
        class local{
            void mss(){
                System.out.println("welcome");
                System.out.println(data);
            }
        }
        local o=new local();
        o.mss();
    }
    public static void main(String[] args) {
    CheckException o1=new CheckException();
    o1.display();
}}*/
/*interface Showable{  
    void show();  
    interface Message{  
     void msg();  
    }  
  }  
  class TestNestedInterface1 implements Showable.Message{  
   public void msg(){System.out.println("Hello nested interface");}  
    
   public static void main(String args[]){  
    Showable.Message message=new TestNestedInterface1();//upcasting here  
    message.msg();  
   }  
  }  */
  /*class CheckException extends Thread{
   public void run(){
    System.out.println("this is thread");
   }
   public static void main(String[] args) {
    CheckException t=new CheckException();
    t.start();
   }
  }*/
  /*class CheckException implements Runnable{
    public void run(){
        System.out.println("by throw the runnable interface");

    }

    public static void main(String[] args) {
        System.out.println("welcome in javaprogramming ");
        CheckException t =new CheckException();
        Thread th=new Thread(t);
        th.start();
        Acx o=new Acx();
        Thread o1=new Thread(o);
        o1.start();
    
    }
  }
  class Acx implements Runnable{
    public void run(){
        System.out.println("second task");
    }

  }*/
 /* class CheckException extends Thread{
public void run(){
    try {
        for(int i=1;i<44;i++){System.out.println(i);}
        Thread.sleep(1000);

    } catch (Exception e) {
        //
    }
}
public static void main(String[] args) {
    Thread t=new Thread();
    t.start();
}
  }
*/
/*class Thread1{
    public static void main(String[] a) {
        Thread t=new Thread("Ranjeet");
        t.start();
        //String str=t.getName();
        System.out.println(t.getName());
        
    }
}*/


/*public class CheckException implements Runnable  
{    
public void run()  
{    
System.out.println("Now the thread is running ...");    
}    
    
// main method  
public static void main(String argvs[])  
{   
// creating an object of the class MyThread2  
Runnable r1 = new CheckException();   
  
// creating an object of the class Thread using Thread(Runnable r, String name)  
Thread th1 = new Thread(r1, "My new thread");    
  
// the start() method moves the thread to the active state  
th1.start();   
  
// getting the thread name by invoking the getName() method  
String str = th1.getName();  
System.out.println(str);  
}    
}
 */

/*class CheckException extends Thread{

    public void run(){
        
        System.out.println(Thread.currentThread().getName());
        
    }
    public static void main(String[] args) {
        CheckException t=new CheckException();
        t.start();
        CheckException t1=new CheckException();
        t1.start();
        CheckException t2=new CheckException();
        t2.start();
        CheckException t3=new CheckException();
        t3.start();
        CheckException t4=new CheckException();
        t4.start();
        
    }
}
*/
/*class CheckException extends Thread{
    public void run(){
        System.out.println("Enter your name");
Thread.currentThread().setName("Ranjeet");
        System.out.println(Thread.currentThread().getName());
    }
}
class B extends Thread{
    public void run(){
System.out.println("Enter Your age");
System.out.println(Thread.activeCount());
    }
}
class  C extends Thread{
    public void run(){
        System.out.println("Enter your DOB");
    }
}
class D extends Thread{
    public void run(){
        System.out.println("successful create id"+currentThread());
        
    }
}
class Book{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        CheckException o=new CheckException();

        o.start();
        
        B o1=new B();
        
        o1.start();
        C o2=new C();
        o2.start();
        D o3=new D();
        o3.start();
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(o.isAlive());
    }
}
*/
/*class CheckException extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("this is deamon thread");
        }else{
            System.out.println("it is not deamon thread");
        }
        
    }
    public static void main(String[] args) {
        System.out.println("main thread");
        CheckException o=new CheckException();
        o.setDaemon(true);
        o.start();
    }

}
*/
/*class CheckException extends Thread
 {
    public void run(){
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("daemon thread");
    

    }
    public static void main(String[] args) {
        System.out.println("main thread");
        CheckException o1=new CheckException();
        o1.setDaemon(true);
        o1.start();
    }
 }*/
 /*public class CheckException extends Thread{  
    public void run(){  
    /*  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
      System.out.println("daemon thread work");  
     }  
     else{  
     System.out.println("user thread work");  
    }  */
   /*  System.out.println(Thread.currentThread().isDaemon());
    }  
    public static void main(String[] args){  
     CheckException t1=new CheckException();//creating thread  
     CheckException t2=new CheckException();  
     CheckException t3=new CheckException();  
     
     t1.setDaemon(true);//now t1 is daemon thread  
    
       
     t1.start();//starting threads  
     t2.start();  
     t3.start();  

    }}*/
  /*  public class CheckException extends Thread{
        public void run(){
            if(Thread.currentThread().isDaemon()){
                System.out.println("This is Thread");
            }else{
                System.out.println("This not thread");
            }
        }
        public static void main(String[] args) {
            CheckException t1=new CheckException();
            t1.setDaemon(false);
            t1.start();
        }
    } */
    /*public class CheckException extends Thread{
        public void run(){
            System.out.println("child tgread"+ Thread.currentThread().getPriority());
        }
        public static void main(String[] args) {
            System.out.println("ur");
            System.out.println(Thread.currentThread().getPriority());
            Thread.currentThread().setPriority(10);
            CheckException t1=new CheckException();
            t1.setPriority(1);
            t1.start();
          CheckException  t2=new CheckException();
          t2.setPriority(MIN_PRIORITY);
          t2.setPriority(NORM_PRIORITY);
          t2.setPriority(MAX_PRIORITY);
          t2.start();
            
          
        }
    }
*/
/*class CheckException{
    public static void main(String[] args)throws Exception{
        try {
            for(int i=1;i<=22;i++){
               // Thread.sleep(1000);
                System.out.println(i);
                Thread.sleep(10000);
            
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}

*/
/*class CheckException extends Thread{
    public void run(){
        Thread.yield(); 
        for(int i=1;i<=20;i++){
            System.out.println(i+""+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        CheckException t1=new CheckException();
        t1.start();
        Thread.yield();
        for(int j=2;j<=9;j++){
            System.out.println(j+"=="+ Thread.currentThread().getName());
        }
    }
}*/
/*class CheckException extends Thread{
    public void run(){
try{ for (int i=1;i<=5;i++){
     System.out.println("this is child thread"+i);
        Thread.sleep(1000);}}catch(Exception e){
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) throws InterruptedException {
        CheckException t1=new CheckException();
        t1.start();
        t1.join();
        try {
            for(int i=1;i<=5;i++){
                System.out.println(i  +"main thread");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}*/

/*class CheckException extends Thread{
    public static Thread t;
    public void run(){
        
try{ for (int i=1;i<=5;i++){
    t.join();
    
     System.out.println("this is child thread"+i);
        Thread.sleep(1000);}}catch(Exception e){
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) throws InterruptedException {
         t=Thread.currentThread();
        CheckException t1=new CheckException();
        t1.start();
    
        try {
            for(int i=1;i<=5;i++){
                System.out.println(i  +"main thread");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
*/
/*class Medical extends Thread{
    public void run(){
        try {
            System.out.println("Medical start");
            Thread.sleep(1000);
            System.out.println("Medical is completed");
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
/*class Testdriver extends Thread{
    public void run(){
        try {
            System.out.println("drving test start");
            Thread.sleep(1000);
            System.out.println("Driving is also completed");
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
class Officercheck extends Thread{
    public void run(){
        try {
            System.out.println("officer done singnature");
            Thread.sleep(1000);
            System.out.println("Successfully completed Driving lisance");
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
class CheckException{
    public static void main(String[] args) throws Exception {
        Medical t1=new Medical();
        t1.start();
        t1.join();
        Testdriver t2=new Testdriver();
        t2.start();
        t2.join();
        Officercheck t3 =new Officercheck();
        t3.start();
    }
}
*/
/*class CheckException extends Thread{
    public void run(){
       // System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
try{ for (int i=1;i<=5;i++){
     System.out.println("this is child thread"+i);
        Thread.sleep(1000);}}catch(Exception e){
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) throws InterruptedException {
        CheckException t1=new CheckException();
        t1.start();
       t1.interrupt();
    }
}
*/
/*class B{
    public static void main(String[] args) {
System.out.println("Hello");
    }
}*/
/*class BookTheaterSeat{
    int TotalSeats=20;
     synchronized void bookseat(int seats){
        if(TotalSeats>=seats){
        System.out.println(seats+   "=" +  "Seats booked Successfully");
        TotalSeats=TotalSeats-seats;
        System.out.println("Seats left"+ "="+  TotalSeats);}else{
            System.out.println("Sorry seats can't  be book");
            System.out.println("Seats Left:"+ " ="+TotalSeats);
        }
    }

}
 class MovieBookApp extends Thread{
    static BookTheaterSeat b;
    int seats;
    public void run(){
        b.bookseat(seats);
    }
    public static void main(String[] args) {
        b=new BookTheaterSeat();
        MovieBookApp ok=new MovieBookApp();
        ok.seats=18;
        ok.start();
        MovieBookApp amit=new MovieBookApp();
        amit.seats=10;
        amit.start();
    }
}
*/
  /*class BookTheaterSeat{
    int TotalSeats=20;
      void bookseat(int seats){
     synchronized(this) {if(TotalSeats>=seats){
        System.out.println(seats+   "=" +  "Seats booked Successfully");
        TotalSeats=TotalSeats-seats;
        System.out.println("Seats left"+ "="+  TotalSeats);}
        else{
            System.out.println("Sorry seats can't  be book"); 
            System.out.println("Seats Left:"+ " ="+TotalSeats);
        }}
    }

}
 class MovieBookApp extends Thread{
    static BookTheaterSeat b;
    int seats;
    public void run(){
        b.bookseat(seats);
    }
    public static void main(String[] args) {
        b=new BookTheaterSeat();
        MovieBookApp ok=new MovieBookApp();
        ok.seats=18;
        ok.start();
        MovieBookApp amit=new MovieBookApp();
        amit.seats=10;
        amit.start();
    }
}
*/
//Let's see an example to print the classloader name  
/*public class CheckException 
{  
    public static void main(String[] args)  
    {  
        // Let's print the classloader name of current class.   
        //Application/System classloader will load this class  
        Class c=CheckException.class;  
        System.out.println(c.getClassLoader());  
        //If we print the classloader name of String, it will print null because it is an  
        //in-built class which is found in rt.jar, so it is loaded by Bootstrap classloader  
        System.out.println(String.class.getClassLoader());  
    }  
}  */
//class CheckException {
   // public static void main(String[] args) {
       /*  int a =10;
        double b=a;
        System.out.println(b);*/
      /* *  int a=130;
        byte b= (byte)a;
        System.out.println(a);
        System.out.println(b);
        int s=1864356667;
        float j=876544323;
        long o=1234567789634633533l;
        
        System.out.println(s);
    }
}  */
/*for(char g=65; g<=100;g++){
    for(char j=g; j<=g;j++){
        System.out.print(g);
    }
    System.out.println();
}

}}*/
/*int i=0;
    do{
        System.out.println(i);
        i++;
    }  while(i<10) ; 
int a=10;  
int b=5;  
int c=20;  
System.out.println(a<b&&a++<c);//false && true = false  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a<b&a++<c);//false && true = false  
System.out.println(a); 
    }}
*/
/*class B{
    public static void main(String[] args) {
        int no=5;
        int t=0;
        for(int i=2;i<no-1;i++){
            if(no%i==0){
                t=t+1;
            }
        
        }
        if(t==0){
            System.out.println("this is prime no");
        }else{
            System.out.println("This is  not prime no");
        }
}}*/
/*class V{public static void main(String[] args) {
    

    
    for(int no=2;no<=200;no++){
        int t=0;
    for(int i=2;i<no-1;i++){
        if(no%i==0){
            t=t+1;
        }
    
    }
    if(t==0){
        System.out.print("  "+no);
    }}
}}
*/







































