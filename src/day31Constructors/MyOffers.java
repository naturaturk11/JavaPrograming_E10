package day31Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {


    public static void main(String[] args) {

/*2. Create a class named MyOffers:

				2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
*/


      Offer Offer1=new Offer();
      Offer1.setInfo("VA","Amazon","SDET",110000,true,true,true,true);
      Offer Offer2=new Offer();
      Offer2.setInfo("CA","Sony","QA",120000,true,false,false,true);
      Offer Offer3=new Offer();
      Offer3.setInfo("FL","Aplle","QE",125000,true,true,true,true);
      Offer Offer4=new Offer();
      Offer4.setInfo("TX","Copitol One","SM",115500,false,false,false,false);
      Offer Offer5=new Offer();
      Offer5.setInfo("WA","Bank OF Amarica","BA",130000,true,true,true,true);



        System.out.println(Offer1);
        System.out.println(Offer2);
        System.out.println(Offer3);
        System.out.println(Offer4);
        System.out.println(Offer5);


      System.out.println(".................................................................................");


        Offer[] myOffers={Offer1,Offer2,Offer3,Offer4,Offer5};

      ArrayList<Offer>fullTİmeOffers=new ArrayList<>(Arrays.asList(myOffers));

      fullTİmeOffers.removeIf(p->!p.isFullTime);//removes if the Offer is not full time
      System.out.println(fullTİmeOffers.size());


      ArrayList<Offer>localOffers=new ArrayList<>(Arrays.asList(myOffers));
      localOffers.removeIf(p->!(p.location.equals("VA")||p.location.equals("CA")));//REMOVES THE OFFER İF THE OFFER FROM LOCAL AREA
      System.out.println(localOffers.size());

      for (Offer localOffer : localOffers) {
        System.out.println(localOffer.companyName+":"+localOffer.salary);
      }







    }
}
