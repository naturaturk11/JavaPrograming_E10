package day15ForLoop;

public class StringCaseSensivities {
    public static void main(String[] args) {

        String str= " ";//wide spaces shapes
        boolean r=str.isEmpty();
        boolean r1=str.isBlank();
        System.out.println(r);
        System.out.println(r1);


        System.out.println(".....................................................");

        boolean r3=str.isBlank();
        System.out.println(r3);


       String  str2= "Cydeo    ";
        System.out.println("str2 = " + str2);
        System.out.println(str2.isBlank());


        System.out.println("......................................................");

        String  str3= "Cydeo";
        String  str4= "CyDeo";
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));


        System.out.println("...................................................");

       String sentence= "My favorite programming language is Java";

       boolean hasCSharp=sentence.contains("C#");
       boolean hasJava=sentence.contains("Java");
       boolean hasJva3= sentence.toLowerCase().contains("java");





       System.out.println(hasCSharp);
       System.out.println(hasJava);
        System.out.println(hasJva3);



        System.out.println("...........................................................");

String input= "I love JaVa";
String input2= "Java";

        System.out.println(input.equals(input2));
        System.out.println(input.equalsIgnoreCase(input2));

        System.out.println(input.contains("Java"));
        System.out.println(input.toLowerCase().contains("java"));//one way ignore-case sensitivity
        System.out.println(input.toUpperCase().contains("JAVA"));//SECOND WAY OF IGNORE CASE SENSITIVITY


        System.out.println(".....................................................");
        String a="Wooden Spoon";
        boolean x=a.startsWith("Woo");
       boolean y=a.endsWith("Spoon");
       boolean z=a.toLowerCase().startsWith("woo");//this is method for using ignore case sensetiveness
       boolean t=a.toUpperCase().endsWith("SPOON");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);











    }



}
