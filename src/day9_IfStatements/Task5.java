package day9_IfStatements;

public class Task5 {
    public static void main(String[] args) {
        /**
         Create a class called FieldTrip. Your school goes on a Field trip each year.
         The place you go will be based on your grade. Given a variable gradeNumber (1-6) figure out the
         details of your field trip. Print the information at the end.

         Data based on grade:

         grade - 1
         location -  Apple orchard
         number of groups - 3
         teacher in charge - Ms. Smith

         grade - 2
         location - Zoo
         number of groups - 7
         teacher in charge - Mr. Lee

         grade - 3
         location - Aquarium
         number of groups - 5
         teacher in charge - Ms. Wilson

         grade - 4
         location - Movie theater
         number of groups - 2
         teacher in charge - Ms. Reyes

         grade - 5
         location - Museum
         number of groups - 5
         teacher in charge - Ms. Lela

         grade - 6
         location - Six Flags
         number of groups - 8
         teacher in charge - Mr. Watt




         */
        int gradeNumber=3;
        String result="";

        if(gradeNumber>=1 && gradeNumber<=6){if(gradeNumber==1){result="location -  Apple orchard\n" +
                "         number of groups - 3\n" + "         teacher in charge - Ms. Smith";}
        else if (gradeNumber==2) {result="location - Zoo\n" + "         number of groups - 7\n" +
                "         teacher in charge - Mr. Lee";} else if (gradeNumber==3) {result="location - Aquarium\n" +
                "         number of groups - 5\n" + "         teacher in charge - Ms. Wilson";}
        else if (gradeNumber==4){result="location - Movie theater  \n" + "         number of groups - 2\n" +
                "         teacher in charge - Ms. Reyes";} else if (gradeNumber==5) {result="location - Museum \n" +
                "         number of groups - 5\n" + "         teacher in charge - Ms. Lela ";}else {result="location - Six Flags\n" +
                "         number of groups - 8\n" + "         teacher in charge - Mr. Watt";}

        }else{result="invalid numbers";}

        System.err.println("result = " + result);
    }

        }







