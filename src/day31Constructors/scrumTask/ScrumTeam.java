package day31Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    /*
create a class called ScrumTeam
   Attributes:
        String PO, BA, SM;
        ArrayList<Tester> testersList = new ArrayList<>();
        ArrayList<Developer> devopsList = new ArrayList<>();
        int daysOfSprint;
       Add A constructor that can set the fileds PO, BA, and SM
     Actions:
          addTester(Tester tester): adds the given tester to the testers ArrayList
          addTesters(Tester[] testers): adds the given testers to the testers ArrayList
          addDeveloper(Developer developer): adds the given developer to the developers ArrayList
          addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList
          removeTester(long employeeID): removes the given tester from the testers ArrayList
          removeDeveloper(long employeeID): removes the developer from the developers ArrayList
          toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */

 public  String PO,BA,SM;
 public ArrayList<Tester>testerList=new ArrayList<>();
 public ArrayList<Developer>developerList=new ArrayList<>();
 public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester){
        testerList.add(tester);
    }
    public void addTesters(Tester[] testers){
        testerList.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        developerList.add(developer);

    }

    public void addDeveloper(Developer[] developers){
        developerList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID){
        testerList.removeIf(p->p.employeeID==employeeID);
    }
    public void removeDeveloper(int employeeID){
        developerList.removeIf(p->p.employeeID==employeeID);

   }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total of testers=" + testerList.size() +
                ", total number developers=" + developerList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
