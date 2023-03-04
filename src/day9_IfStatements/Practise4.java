package day9_IfStatements;

public class Practise4 {


    public static void main(String[] args) {

        String name1= "ayse";
        String name2= "fatma";
        String name3= "zeynep";
        int durationAyse=40;
        int durationFatma=20;
        int durationZeynep=30;
        boolean isAyseWin= durationAyse<durationFatma && durationAyse<durationZeynep;
        boolean isFatmaWin= durationFatma<durationAyse && durationFatma<durationZeynep;
        boolean isZeynepWin= durationZeynep<durationAyse && durationZeynep<durationFatma;

        if(isAyseWin){
            System.out.println(name1+" will win the race as first");
        } else if (isFatmaWin) {
            System.out.println(name2+" will win the race first");
        }else{
            System.out.println(name3+ " will win the race as first");
        }

        }


    }

