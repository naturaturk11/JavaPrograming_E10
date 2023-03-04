package day35Encapsulation.encapsulation;

public class Person {



  private String name;
   private int age;

   public String getName(){
       return name;
   }

   public void setName(String name){
       if(name.contains("z")){
           return;
       }
       this.name=name;
   }

    public int getAge(){

       return age;
    }

    public void setAge(int age){
     if(age<=0 || age>150){
    System.err.println("ınvalid age: "+age);
    System.exit(0);
}
       this.age=age;
}










}
