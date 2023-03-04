package day31Constructors;

public class CpitalOne {

    public static void main(String[] args) {

       BankAccount account1=new BankAccount();
       account1.setInfo("Hasan tepe",123456789);

        account1.deposit(1200);
        System.out.println(account1);


        account1.checkBalance();


        account1.withdraw(900);
        account1.checkBalance();

        BankAccount bankAccount2=new BankAccount();
        bankAccount2.setInfo("Aygun",1245698762);

        bankAccount2.deposit(10000);
        System.out.println(bankAccount2);

        bankAccount2.checkBalance();



    }
}
