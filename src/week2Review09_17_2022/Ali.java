package week2Review09_17_2022;

public class Ali {
    public static void main(String[] args) {
        float a= 100.987_6543f;
        short b= (byte) a;
        byte c = (byte)b;

        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        System.out.println(6+"3"+"$"+(6*3));

        double m= 123.45678;
        float n= (float) m;
        long s= (long) n;
        int ı= (int) s;
        short k=(short) ı;
        byte h=(byte) k;
        System.out.println(h);
        System.out.println(ı);
        System.out.println(s);
        System.out.println(n);

        int j= 125;
        double e=(double) j;
        float r= j;


        double ege= (double) 80/100;
        System.out.println(ege);
        double ege2=80/100;
        System.out.println(ege2);
        System.out.println(80/100);
        System.out.println(80.0/100);
        System.out.println((double)80/100);
        System.out.println((double)(80/100) );





        /*int m=3,n=2;
        long y=(m+n)*2/3%2;
        System.out.println(y);

        long  u = 30L;

        long  t= (short) u;
        System.out.println(t);*/


    }
}
