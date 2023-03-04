package day37_Inheritance.OtelTask;

import java.util.ArrayList;
import java.util.Arrays;

public class BackOffice {
    ArrayList<Chef>chefs=new ArrayList<>();
    ArrayList<SweetMaker>sweetMakers=new ArrayList<>();
    ArrayList<DishCleaner>dishCleaners=new ArrayList<>();

    public void addChef(Chef chef){
        chefs.add(chef);//only adding one chef
    }
    public void addChefs(Chef[]chefs){
        this.chefs.addAll(Arrays.asList(chefs));//added more variables into the arrayList
    }

    public void sweetMaker(SweetMaker sweetMaker){
        sweetMakers.add(sweetMaker);
    }
    public void addSweetMakers(SweetMaker[]sweetMakers){
        this.sweetMakers.addAll(Arrays.asList(sweetMakers));
    }

    public void addDishCleaner(DishCleaner dishCleaner){
        this.dishCleaners.add(dishCleaner);
    }
    public void addDishCleaners(DishCleaner[]dishCleaners){
        this.dishCleaners.addAll(Arrays.asList(dishCleaners));
    }

    public String toString() {
        return "BackOffice{" +
                "number of chefs=" + chefs.size() +
                ", number of  sweetMakers=" + sweetMakers.size() +
                ",number of  dishCleaners=" + dishCleaners.size() +
                '}';
    }
}
