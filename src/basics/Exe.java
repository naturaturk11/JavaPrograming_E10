package basics;

public class Exe {
    public static void main(String[] args) {

        String str="Hello world";
        str=str.replace("o","i");
        System.out.println("str = " + str);


        String a="one upon a time we were happy";
        a=a.replace("upon","new");
        System.out.println("a = " + a);
        a=a.replace("new","upon");
        System.out.println("a = " + a);



        String r="this is a goal of our company";
        r=r.replaceFirst("l","y");
        System.out.println("r = " + r);


        String t="the number you have called cannot reach the moment";
        t= t.substring(4);
        System.out.println("t = " + t);
      t=  t.substring(t.indexOf("re"));
        System.out.println("t = " + t);
        t.substring(t.indexOf("e",t.indexOf("t")));
        System.out.println("t = " + t);
        t=t.substring(5,13);
        System.out.println("t = " + t);
        t=t.substring(t.indexOf("t"),t.indexOf("om"));
        System.out.println("t = " + t);

        String d=" ";
        boolean f=d.isEmpty();
        boolean g=d.isBlank();
        System.out.println("f = " + f);
        System.out.println("g = " + g);


    }
}
