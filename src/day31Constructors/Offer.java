package day31Constructors;

public class Offer {

    /*1. Create a custom class named Offer
				Attributes:
						location, companyName, jobTitle, salary, hasBenefit,
						 hasPTO, isWFH, isFullTime

				Actions:
					setInfo(): sets all the instance variables
					toString(): returns the full info of the Offer Object
*/





        public String location;
        public String companyName;
        public String JobTitle;
        public double salary;
        public boolean hasBenefit;
        public boolean hasPTO;
        public boolean isWHF;
        public boolean isFullTime;

        /*
        second way of creating class objects

        public String location,companyName,JobTitle;
           public boolean hasBenefit,hasPTO,isWHF,isFullTime;
           public double salary;
        */


        //do not forget change to the setINFO
        public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWHF, boolean isFullTime) {
            this.location = location;
            this.companyName = companyName;
            JobTitle = jobTitle;
            this.salary = salary;
            this.hasBenefit = hasBenefit;
            this.hasPTO = hasPTO;
            this.isWHF = isWHF;
            this.isFullTime = isFullTime;






        }



        public String toString() {
            return "Offer{" +
                    "location='" + location + '\'' +
                    ", companyName='" + companyName + '\'' +
                    ", JobTitle='" + JobTitle + '\'' +
                    ", salary=+$" + salary +
                    ", hasBenefit=" + hasBenefit +
                    ", hasPTO=" + hasPTO +
                    ", isWHF=" + isWHF +
                    ", isFullTime=" + isFullTime +
                    '}';
        }







    }












