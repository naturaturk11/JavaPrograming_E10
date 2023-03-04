package day37_Inheritance.ResturanTask;

import java.util.ArrayList;
import java.util.Arrays;

public class RestaurantObject {
    public static void main(String[] args) {

        Waiter waiter1=new Waiter("George",25,'M',"Usa",12451525l,4,80000,true,48);
        Waiter waiter2=new Waiter("Hnage",26,'F',"UK",22546566l,5,90000,true,40);
        Waiter waiter3=new Waiter("Sergie",27,'M',"Brazil",336526l,6,50000,true,25);
        Waiter waiter4=new Waiter("Gabriel",28,'F',"Germany",425899665l,7,60000,true,32);
        Waiter waiter5=new Waiter("Murat",29,'M',"Egypt",4146569875l,8,100000,true,48);

        Waiter[] waiters={waiter1,waiter2,waiter3,waiter4,waiter5};
        ArrayList<Waiter>waiters1=new ArrayList<>(Arrays.asList(waiters));


        for (Waiter waiter : waiters1) {
            if(waiter.workOursWeekly>40)
                System.out.println(waiter);
        }
        System.out.println(".....................................");
        for (Waiter waiter : waiters1) {
            if(waiter.registeredCountry.equalsIgnoreCase("usa"))
                System.out.println(waiter);
        }
        System.out.println(".......................");
        for (Waiter waiter : waiters1) {
            if(waiter.gender=='M')
                System.out.println(waiter);
        }
        System.out.println("...............................................");

        for (Waiter waiter : waiters1) {
            if(waiter.theExperiancedYear>=5)
                System.out.println(waiter);
        }

       waiter5.languages();


    }
}
