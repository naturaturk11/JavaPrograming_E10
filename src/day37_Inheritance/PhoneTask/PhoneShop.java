package day37_Inheritance.PhoneTask;

public class PhoneShop {


    public static void main(String[] args) {


        Iphone iphone=new Iphone("iphone 12 pro","6.7 inches",1200,"black");

        Samsung samsung=new Samsung("Galaxy s 19","6 inches",1452,"white");

        Nokia nokia=new Nokia("Brick","4 inches",50,"gray");

        System.out.println("iphone = " + iphone);
        System.out.println("nokia = " + nokia);
        System.out.println("samsung = " + samsung);

        iphone.call(911);
        iphone.text(859);
        iphone.faceTime(2152556,"hotmes@gmail.com");


        System.out.println("............................................");

        samsung.call(911);
        samsung.text(542136);
        samsung.freeze();

        System.out.println("...................................");

        nokia.selfDefense();


        System.out.println("..................................");

        System.out.println(Iphone.hasBattery);//İS A WAY OF CALLıNG STATİC CLASS
        System.out.println(Phone.hasBattery);//İS A WAY OF CALLıNG STATİC CLASS
        System.out.println(Samsung.hasBattery);//İS A WAY OF CALLıNG STATİC CLASS
        System.out.println(Nokia.hasBattery);//İS A WAY OF CALLıNG STATİC CLASS


    }
}
