package day37_Inheritance.OtelTask;

import java.util.ArrayList;
import java.util.Arrays;

public class FrontOffice {


    public String manager;
    public String viceManager;
    public String humanResourceChef;

    public FrontOffice(String manager, String viceManager, String humanResourceChef, ArrayList<Recepsionist> recepsionists, ArrayList<SuitcaseCarier> suitcaseCariers, ArrayList<Waiter> waiters) {
        this.manager = manager;
        this.viceManager = viceManager;
        this.humanResourceChef = humanResourceChef;
        this.recepsionists = recepsionists;
        this.suitcaseCariers = suitcaseCariers;
        this.waiters = waiters;
    }

    ArrayList<Recepsionist>recepsionists=new ArrayList<>();
    ArrayList<SuitcaseCarier>suitcaseCariers=new ArrayList<>();
    ArrayList<Waiter>waiters=new ArrayList<>();



   public void addReceptionist( Recepsionist recepsionist){
       recepsionists.add(recepsionist);
   }
   public void addReceptionists(Recepsionist[]recepsionists){
       this.recepsionists.addAll(Arrays.asList(recepsionists));
       //this is way of adding new wariables in to the arraylist
   }
   public void removeWaiter(int age){
       waiters.removeIf(p->p.age==age);
   }
   public void addWaiter(Waiter waiter){
       waiters.add(waiter);

   }
   public void addWaiters(Waiter[] waiters){
       this.waiters.addAll(Arrays.asList(waiters));
   }
   public void addSuitcaseCarier(SuitcaseCarier suitcaseCarier){
       suitcaseCariers.add(suitcaseCarier);
   }
    public void removeSuitcaseCarrier(int age){
        waiters.removeIf(p->p.age==age);
    }
   public void addSuitcaseCariers(SuitcaseCarier []suitcaseCariers){
       this.suitcaseCariers.addAll(Arrays.asList(suitcaseCariers));
   }

    public String toString() {
        return "FrontOffice{" +
                "manager='" + manager +
                ", viceManager='" + viceManager +
                ", humanResourceChef='" + humanResourceChef +
                ", number of  recepsionists=" + recepsionists.size() +
                ", number of suitcaseCariers=" + suitcaseCariers.size() +
                ", number of waiters=" + waiters.size() +
                '}';
    }
}
