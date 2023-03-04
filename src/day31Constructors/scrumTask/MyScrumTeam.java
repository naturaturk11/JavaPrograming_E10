package day31Constructors.scrumTask;

public class MyScrumTeam {
    /*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */


    public static void main(String[] args) {


        //4 testers objects
         Tester tester1=new Tester("Mark",11,"QE",110000);
        Tester tester2=new Tester("MERYEM",12,"SDET",120000);
        Tester tester3=new Tester("MarkUS",13,"SE",113000);
        Tester tester4=new Tester("Markly",14,"SDET",120000);

        Tester[] testers={tester2,tester3,tester4};

        //4 developers objects
        Developer developer1=new Developer("olga",15,"Java Developer",125000);
        Developer developer2=new Developer("oltan",16,"Java master",180000);
        Developer developer4=new Developer("orga",17,"Senior Developer",200000);
        Developer developer5=new Developer("osman",18,"Software Developer",165000);

        Developer[]developers={developer2,developer4,developer5};

      //1 ScrumTeam objects

        ScrumTeam scrum=new ScrumTeam("Natalia","Kerem","Anna",14);
        System.out.println(scrum);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addDeveloper(developers);
        scrum.addTesters(testers);


        System.out.println(scrum);


        System.out.println("...............................................................");

        for (Tester eachTester:scrum.testerList){
            System.out.println(eachTester.name+": "+eachTester.salary);
        }
        System.out.println("............................................................");
        for (Developer eachDeveloper : scrum.developerList) {
            System.out.println(eachDeveloper.name+": "+eachDeveloper.salary);
        }


        scrum.removeTester(12);
        scrum.removeDeveloper(17);
        System.out.println(scrum);

    }
}
