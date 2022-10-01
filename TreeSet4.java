import javax.sound.midi.SoundbankResource;
import javax.swing.SortingFocusTraversalPolicy;
import javax.swing.plaf.synth.SynthScrollBarUI;

/*import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class TreeSet4{  
 public static void main(String args[]){  
  TreeSet set=new TreeSet();
         set.add("A");  
         set.add("o");  
         set.add("C");  
         set.add("D");  
         set.add("E");
         set.add("E") ;
         
        /* List l2=new ArrayList<>();
         l2.add(33);
         l2.add(7);
         l2.add(55);
         l2.add(99);
         l2.add(22);
         set.addAll(l2);
         */
     /*   Iterator itr=set.iterator();
        while(itr.hasNext()){
                System.out.println(itr.next());
        }
         TreeSet t=new TreeSet<>();
        
System.out.println(set);

         t.add(4);
         System.out.println(t);
           
 }}*/
 /*import java.util.Iterator;
import java.util.Vector;
 class TreeSet4{
        public static void main(String[] args) {
                Vector v=new Vector<>();
                v.add(66);
                v.add("f");
                v.add(77);
                v.add("Ranjeet");
                v.add(33);
                Iterator itr=v.iterator();
                while(itr.hasNext()){
                        System.out.println(itr.next());
                }
                Vector v1=new Vector<>();
                v1.add(1000);
                v1.add(5000);
                v1.add(786865768);
                v.addAll(v1);
                System.out.println(v);
        }

 }*/
 /*import java.util.Stack;
 import java.util.Iterator;
 class TreeSet4{
public static void main(String[] args) {
        Stack v=new Stack<>();
        v.add(66);
        v.add("f");
        v.add(77);
        v.add("Ranjeet");
        v.add(33);
       // v.pop();
        v.push("Ranajipoor");
        System.out.println(v);
        Iterator itr=v.iterator();
        while(itr.hasNext()){
                System.out.println(itr.next());
        }
        
}
 }*/
 /*import java.util.PriorityQueue;
 import java.util.Iterator;
import java.util.PriorityQueue;
 class TreeSet4{
        public static void main(String[] args) {
                Queue v=new PriorityQueue<>();
                     
                v.add(77);
                v.add(55);
                v.add(99);
                v.add(22);
                v.add(10);
               // v.remove();
               System.out.println("peek===>"+v.peek());
               System.out.println("this head========>"+v.element());
                v.poll();
                System.out.println(v);
                Iterator itr=v.iterator();
                while(itr.hasNext()){
                        System.out.println(itr.next());
                }
        }
 } */
 /*import java.util.TreeSet;

import javax.annotation.processing.SupportedSourceVersion;
import javax.imageio.ImageTranscoder;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.Iterator;
 class TreeSet4{
        public static void main(String[] args) {
                TreeSet v=new TreeSet<>();
                v.add(77);
                v.add(55);
                v.add(99);
                v.add(22);
                v.add(10);
                v.add(10);
                System.out.println(v.tailSet(55));
                System.out.println(v.headSet(99));
                System.out.println(v.subSet(10, 99));
               // v.remove();
             /* *  System.out.println(v.spliterator());
               System.out.println(v.first());
               System.out.println(v.clone());
               System.out.println(v.add(550));
               System.out.println(v.floor(2)+"....");
               System.out.println(v.isEmpty());
               System.out.println(v.ceiling(550));*/
             /* *System.out.println(v.pollFirst()+" is first small");
               System.out.println(v.pollLast()+"   is higher");
               Iterator it=v.iterator();
               while(it.hasNext()){
                System.out.println("  ...... "+it.next());
                
               }
               Iterator itr=v.descendingIterator();
               while(itr.hasNext()){
                System.out.println(itr.next());
               }
        }
 }*/
 /*import java.util.HashSet;
import java.util.Iterator;
 class TreeSet4{
        public static void main(String[] args) {
                HashSet v=new HashSet<>();
                v.add(77);
                v.add(55);
                v.add(99);
                v.add(22);
                v.add(10);
                v.add(77);
                v.add(55);
                v.add(99);
                v.add(22);
                v.add(10);
               // v.remove();
               // v.remove();
               Iterator itr =v.iterator();
               while(itr.hasNext()){
                System.out.println(itr.next());
                
               }
        }
 }*/
 /*import java.util.Deque;
 class TreeSet4{
        public static void main(String[] args) {
                Deque<String> deque=new ArrayDeque<String>();
deque.add("Gautam");  
deque.add("Karan");  
deque.add("Ajay"); 
deque.addLast("RanjeetKumar singh");
deque.pop();
deque.removeLast();
System.out.println(deque);
for(String s:deque){
        System.out.println(s.codePointAt(2));
}
                        */
/*import java.util.ArrayList;
import java.util.Collection;
class TreeSet4{
        public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add("A");
        al.add(3);
        al.add(77);
        al.add("Ranjeet");
        al.add("Age of your dog");
        al.add(55);
        al.forEach((n)-> {System.out.println(n);});



}*/
 /*class TreeSet4{
        public static void main(String[] args) {
                ArrayList al=new ArrayList<>();
                al.add(0,66);
                al.add(1, 22);
                al.add(0, 55);
                al.add(77);
                al.add(88);
                ArrayList o=new ArrayList<>(al);
                o.add(77);
                o.add(55);
                o.add(66);
                o.add(100);
               /// al.removeAll(o);
               // al.cle
ListIterator it=o.listIterator();
while(it.hasNext()){
        System.out.println(it.next());}
        System.out.println(".............Previous");
        while(it.hasPrevious()){
                System.out.println(it.previous());
        }
        System.out.println("With the help traverse order");
        for(int i=0;i<o.size();i++){
                System.out.println(o.get(i));
        }
        Collections.sort(o,Collections.reverseOrder());
        System.out.println("lamda function");
        o.forEach((n)->{System.out.println(n);});
        System.out.println("for ech");
        for(Object e:o){
                System.out.println(e);
        }
        System.out.println("repeat elements");
        o.retainAll(al);
        System.out.println(o);
        Iterator itr=o.iterator();
        while(itr.hasNext()){
                System.out.println(itr.next());
        }

        }
        

        
 }*/
 /*import java.util.*;;
 class TreeSet4{
        public static void main(String[] args) {
List<String> l = new ArrayList<String>();  
        l.add("Mango");  
        l.add("Banana");  
        l.add("Mango");  
        l.add("Apple");  
        System.out.println(l);  
        Set<String> s = new LinkedHashSet<String>(l);  
        System.out.println(s);  
    }  
} */
import java.util.*;
class TreeSet4{
        public static void main(String[] args) {
              /*   ArrayList o=new ArrayList<>(Arrays.asList(11,22,33,44,55,66,66,55));
                System.out.println(o);
                int a[]=o.toArray(new int[o.size()]);
                for(Object u:o){
                        System.out.println(u);
                }
                ArrayList o1=new ArrayList<>(Arrays.asList(11,222,33,44,555,666,777,88));
                for(Object i:o1){
                        System.out.println(i);
                }
                System.out.println("show only common elements");
                o.retainAll(o1);
                System.out.println(o);*/
            //    Bar o6=new Bar();
              //  o6.printText();
     //   }
//} 
/*interface Foo{
        abstract void m();
}
class Bar implements Foo{
        @Override
      public  void m(){
                String b="ikjhkj";

        }
}*/
/*class Foo{
        static String text="Foo";
}
class Bar extends Foo{
        void printText(){
                System.out.println(Foo.text);
        }
}*/
/*String s1=new String("java11");
String s2="java11";
String s3=s1.intern();
System.out.println(s1==s2);
System.out.println(s1==s3);*/


        //}}
    /* *   String text="hiheyhello";
        int index=text.lastIndexOf("h",4);
        System.out.println(index);
}}*/
/*List<String> fruitList = new ArrayList<>();  
//adding String Objects to fruitsList ArrayList  
fruitList.add("Mango");  
fruitList.add("Banana");  
fruitList.add("Apple");  
fruitList.add("Strawberry");  
fruitList.add("Pineapple");
System.out.println(fruitList.size());
String str[]=fruitList.toArray(new String[fruitList.size()]);
for(String s:str){
        System.out.println(s);
        List l2=new LinkedList<String>();
        l2=Arrays.asList(str);
        System.out.println(l2);
}
        }}*/
        try {
                System.out.println(1);
                System.out.println(10);     
                           System.out.println(15);
                           System.out.println(100);
                           System.out.println(1/0);
                           System.out.println(111);
                           System.out.println(133);






        } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
        
        }
}}