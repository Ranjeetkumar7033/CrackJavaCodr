import java.util.Scanner;

class  Account {
    int accontno;
    String name;
    float amount;
    void insert(int a , String n ,float atm){
        accontno=a;
        name=n;
        amount=atm;
        
    }

void deposite(float atm ){
    amount=amount+atm;
    System.out.println("Deposite..>"+atm);
}
void withdraw(float atm){
    if(amount<atm){
        System.out.println("insufficient balance");
    }
    else{
        amount=amount-atm;
        System.out.println("Withdraw"+atm);
    }

}
void checkbalance(){
    System.out.println("Available balance"+amount);
}
void display(){
    System.out.println("Enter Acoount..>"+accontno+" "+"Name...>"+name+" "+"Amount=="+amount);
}
public static void main(String[] args) {
    Account o=new Account();
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter card details");
    String s=sc.nextLine();
    int acc=sc.nextInt();
    float m=sc.nextFloat();
    

    o.insert(acc, s,m);
    o.deposite(300000);
    o.withdraw(7000);
    o.checkbalance();
    o.display();
    
}

    
}
