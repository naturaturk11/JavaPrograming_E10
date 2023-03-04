package day30CustomClass;

public class EmployeeObject {


    public static void main(String[] args) {


        Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();
        Employee employee5=new Employee();


        employee1.setInfo("Henry",'M',43,12345678,"Manager",25000,true);
        employee2.setInfo("Harry",'M',40,12345687," viseManager",15000,true);
        employee3.setInfo("Hilary",'F',44,12655678,"HRManager",20000,false);
        employee4.setInfo("Huclcy",'F',47,12365478,"SalesManager",23000,true);
        employee5.setInfo("Huseyn",'M',45,12345679,"ExpertForExport",21000,true);


        Employee[] employees={employee1,employee2,employee3,employee4,employee5};

        int countFullTime=0;
        int countPartTime=0;
        double maxSalary=employees[0].salary;
        double minSalary=employees[0].salary;



        for (Employee eachEmployee : employees) {
            if(eachEmployee.isFullTime){
               countFullTime++;
            }else{
                countPartTime++;
            }

            
            

            if(eachEmployee.salary>maxSalary){
                maxSalary=eachEmployee.salary;
            }


            if(eachEmployee.salary<minSalary){
                minSalary=eachEmployee.salary;
            }
            


        }






        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("minSalary = " + minSalary);
        System.out.println("maxSalary = " + maxSalary);

    }
}
/*


Employee Class:
		Attributes:
			name, id, gender, jobTitle, salary, isFullTime(boolean)
		Actions:
			toString(): to be able to print each employee object
			setInfo(): to be able to set all the attributes
			work()...
 */