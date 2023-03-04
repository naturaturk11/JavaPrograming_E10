package day37_Inheritance.OtelTask;

import java.util.ArrayList;
import java.util.Arrays;

public class OtelObject {

    public static void main(String[] args) {
        String otelName="Palace otel";

        Manager manager=new Manager("Antony",46,'M',"Manager",10000,22,true,otelName);
        ViceManager viceManager=new ViceManager("Linda",41,'F',"Vice MANAGER",8500,23,true,otelName);
        HumanResourceChef humanResourceChef=new HumanResourceChef("Gyle",38,'F',"Human Resource Chef",8500,24,true,otelName);



        Waiter waiter1=new Waiter("mery",36,'F',"CHEF WAİTER",2500,1,true,otelName);
        Waiter waiter2=new Waiter("Emre",28,'M',"Senior",2000,2,true,otelName);
        Waiter waiter3=new Waiter("EmMY",29,'F',"Senior",2000,3,true,otelName);
        Waiter[]waiters={waiter1,waiter2,waiter3};
        System.out.println(Arrays.toString(waiters));

        Recepsionist recepsionist1=new Recepsionist("AKIN",29,'M',"Number1",2200,4,true,otelName);
        Recepsionist recepsionist2=new Recepsionist("BERKIN",33,'F',"Number2",2200,5,true,otelName);
        Recepsionist recepsionist3=new Recepsionist("TARKAN",29,'M',"Number3",2200,6,true,otelName);
        Recepsionist []recepsionists={recepsionist1,recepsionist2,recepsionist3};
        System.out.println(Arrays.toString(recepsionists));

        SuitcaseCarier suitcaseCarier1=new SuitcaseCarier("HALİT",42,'M',"NUM1",1250,7,true,otelName);
        SuitcaseCarier suitcaseCarier2=new SuitcaseCarier("TAHA",45,'M',"NUM2",1250,8,true,otelName);
        SuitcaseCarier suitcaseCarier3=new SuitcaseCarier("NURE",40,'M',"NUM3",1250,9,true,otelName);
        SuitcaseCarier[]suitcaseCariers={suitcaseCarier1,suitcaseCarier2,suitcaseCarier3};
        System.out.println(Arrays.toString(suitcaseCariers));

        Chef chef1=new Chef("Carlos",46,'M',"GROSS CHEF",5500,10,true,otelName);
        Chef chef2=new Chef("Laure",35,'F',"VİCE CHEF",4500,11,true,otelName);
        Chef[]chefs={chef1,chef2};
        System.out.println(Arrays.toString(chefs));

        SweetMaker sweetMaker1=new SweetMaker("Linda",33,'F',"SweetMaker",3000,12,true,otelName);
        SweetMaker sweetMaker2=new SweetMaker("Rana",30,'F',"SweetMaker",3000,13,true,otelName);
        SweetMaker[]sweetMakers={sweetMaker1,sweetMaker2};
        System.out.println(Arrays.toString(sweetMakers));

        DishCleaner dishCleaner1=new DishCleaner("Yavuz",35,'M',"Disch wascher",1800,14,true,otelName);
        DishCleaner dishCleaner2=new DishCleaner("ABUBEKR",41,'M',"Disch wascher",1800,15,true,otelName);
        DishCleaner[]dishCleaners={dishCleaner1,dishCleaner2};
        System.out.println(Arrays.toString(dishCleaners));

       //FrontOffice frontOffice=new FrontOffice(manager,viceManager,humanResourceChef);

        for (Recepsionist eachOfRecepsionist : recepsionists) {
            System.out.println(eachOfRecepsionist.name+" as a "+eachOfRecepsionist.jobTitle+" at "+otelName+" is working");
        }
        System.out.println("............................................................");

        for (Waiter eachOfWaiter : waiters) {
            eachOfWaiter.name.toUpperCase();
            if(eachOfWaiter.name.startsWith("m")){
                System.out.println(eachOfWaiter);
                System.out.println(".....................................................");

                for (SuitcaseCarier  eachOfSuitcaseCarier : suitcaseCariers) {
                    eachOfSuitcaseCarier.name.toUpperCase();
                    if(eachOfSuitcaseCarier.gender=='M')
                        System.out.println(eachOfSuitcaseCarier);
                }
                System.out.println(".................................................");

                for (Chef eachOfchef : chefs) {
                    if(eachOfchef.salary>1500 && eachOfchef.gender=='M')
                        System.out.println(eachOfchef);
                }
                System.out.println("..............................................");
               recepsionist3.name.toUpperCase();
               recepsionist2.name.toUpperCase();
                recepsionist3.registerNewGuests();
                recepsionist2.knowOtelRegSystem();

                System.out.println("............................................");

                waiter1.cloth();
                waiter2.languages();
                System.out.println(".......................................");



            }
        }




}}
