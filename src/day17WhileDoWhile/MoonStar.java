package day17WhileDoWhile;

public class MoonStar {
    public static void main(String[] args) {
        String n="star moon Star moon star Moon";
        int moonCount=0;
        int starCount=0;
        //this is the fori version of the question
     /*   for (int i = 0; i <=n.length()-4 ; i++) {
            String d=n.substring(i,i+4);
           d= d.toLowerCase();
            if(d.equals("star")){
                starCount++;
            }

        }
        System.out.println("starCount = " + starCount);

        for (int i = 0; i <=n.length()-4 ; i++) {
            String l=n.substring(i,i+4);
            l=l.toLowerCase();
            if(l.equals("moon")){
                moonCount++;
            }

        }
        System.out.println("moonCount = " + moonCount);


        System.out.println("...................................................");

*/
        while (n.contains("moon")||n.contains("star")){
            n=n.toLowerCase();

            if(n.contains("moon")){
                n=n.replaceFirst("moon", ".");
                moonCount++;

            }
            if(n.contains("star")){
                n=n.replaceFirst("star", ",");
                starCount++;
            }
        }
        System.out.println("starCount = " + starCount);
        System.out.println("moonCount = " + moonCount);



    }
}
