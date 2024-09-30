import java.util.Scanner;
class Bank {
    
    float acbal=10000;
    Scanner scannerobj=new Scanner(System.in);
    public void withdraw(){
        System.out.println("please enter multipules of 100");
       int wamt=scannerobj.nextInt(); 
        if(wamt%100==0) {
        acbal=acbal-wamt;
        System.out.println("Available bal: "+acbal);
        }
        else{
                System.out.println("Please enter multiples of 100");
        }
        
    }
    public void deposite(){
        int damt=71000;
        System.out.println("please enter multipules of 100");
        int deposite=scannerobj.nextInt();
        if(damt%100==0){
            if(damt<=100000){
        acbal=acbal+damt;
        System.out.println("Available bal: "+acbal);
            }
            else{
                System.out.println("Deposite limit is 100000 only");
            }
        }
        else{
            System.out.println("Please enter multiples of 100");
        }
    }
    
   public void viewOptions(){
       System.out.println("Welcome to ABC Bank");
       System.out.println("1. Deposite");
       System.out.println("2. withdraw");
       System.out.println("choose the option from the above options");
       
       int option=scannerobj.nextInt();
       if(option==1){
           deposite();
       }
       else if(option==2){
           withdraw();
       }
      
   }
    public void validate(){
        int pin=1234;
        System.out.println("please enter your pin number");
        int userpin=scannerobj.nextInt();
        if(pin==userpin)
        {
           viewOptions();
            
        }
        else
        {
             System.out.println("Invalid pin");
        }
    }
    
    public static void main(String args[]){
        
        Bank obj=new Bank();
        obj.validate();
        
        
        
        
    }
}