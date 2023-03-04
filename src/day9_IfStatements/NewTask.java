package day9_IfStatements;

public class NewTask {
    public static void main(String[] args) {
/** 3.1 declare the following variables:
 hourlyRate, weeklyHours, stateTaxRate, federalTaxRate


  2-use the given info in above variables to calculate the followings:
 1. salaryBeforeTax
 2. stateTax
 3. federalTax
 4. totalTax
 5. salaryAfterTax

 Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52*/

    int haurlyRate=65;
    int weeklyHours= 40;
    double stateTaxRate=0;
    double federalTaxRate=26.2;

    int salaryBeforeTax=weeklyHours*haurlyRate*52;
    double stateTax= salaryBeforeTax*stateTaxRate/100;
    double federalTax=salaryBeforeTax*federalTaxRate/100;
    double totalTax=stateTax+federalTax;
    double salaryAfterTax= salaryBeforeTax-totalTax;

        System.out.println("salaryBeforeTax = " + "$"+salaryBeforeTax);
        System.out.println("stateTax = " + stateTax);
        System.out.println("salaryAfterTax = " + salaryAfterTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("salaryAfterTax = " + salaryAfterTax+"$");











    }
}
