package day37_Inheritance.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

   public ProductOwner PO;
   public  BusinnessAnaylyst BA;
   public ScrumMaster SM;
   public ArrayList<Tester>testers=new ArrayList<>();
   public ArrayList<Developer>developers=new ArrayList<>();

    public ScrumTeam(ProductOwner PO, BusinnessAnaylyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester){//only added one tester
        testers.add(tester);
    }

    public void addTesters(Tester[] testers){//added more testers
        this.testers.addAll(Arrays.asList(testers));//local vriable is having the same name with instance name
        //!!!!!!this
    }

    public void removeTester(int id){
        testers.removeIf(p->p.id==id);
    }

    public void addDeveloper(Developer developer){//only added one tester
        developers.add(developer);
    }
    public void addDeveloper(Developer[] developers){//added more testers
        this.developers.addAll(Arrays.asList(developers));//local variable is having the same name with instance name
        //!!!!!!this
    }
    public void removeDeveloper(int id){
        developers.removeIf(p->p.id==id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +//added name to call its name
                ", BA=" + BA.name +//added name to call its name
                ", SM=" + SM.name +//added name to call its name
                ", number of testers=" + testers.size() + //added size method to know the total size of testers
                ", number of developers=" + developers.size() +//added size method to know the total size of developers
                '}';
    }
}
