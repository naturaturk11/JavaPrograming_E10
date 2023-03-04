package day17WhileDoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

String str="Java Java Pyhton Pyhton";
int frequency= 0;


     while(str.contains("Java")){
            str=str.replaceFirst("Java" , "");
            frequency++;
        }

        System.out.println(frequency);


        System.out.println("..............................................................");


     String sentence="cat Cat cat cat Cat cat dog dog CAT CAT CAT dog dog";
             sentence=sentence.toLowerCase();//firstly converted to lower case to avoi the risk for complex case problem
     int countCat=0;

     while (sentence.contains("cat")){
         sentence=sentence.replaceFirst("cat", "");
          countCat++;
     }
        System.out.println("countCat = " + countCat);

        System.out.println("...............................................");

        String s="cat Cat cat cat Cat cat dog DOG DOG dog CAT CAT CAT dog dog ";
        s=s.toLowerCase();
        int catCAOUNT=0;
        int dogCaount=0;


        while(s.contains("cat")|| s.contains("dog")){


            if(s.contains("cat")){
                s=s.replaceFirst("cat", "");
                catCAOUNT++;

            }
            if(s.contains("dog")){
                s=s.replaceFirst("dog", "");
                dogCaount++;

            }
        }


        System.out.println("dogCaount = " + dogCaount);
        System.out.println("catCAOUNT = " + catCAOUNT);




    }

}

