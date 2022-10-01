import java.util.Scanner;

class VotingException extends RuntimeException{
    VotingException(String msg){
        super(msg);
    }
    
}
class Voating{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your age");
        int age=sc.nextInt();
        try{if(age<18){
            throw new VotingException("you are not eligible for vote");
        }else {
            System.out.println("You Can vote successfully");
        }}catch(VotingException e){
            //e.getStackTrace();
            e.printStackTrace();
        } 
        System.out.println("hello");
    }
}
