package basics;

 class A{
public A(){
    System.out.println("A ");
}

}
class B extends A{
    public B(){
        System.out.println("B ");
        }
        }

        public class Test23 extends B{
    public Test23(){
        System.out.println("C ");
    }


            public static void main(String[] args) {
                B obj=new B();
            }}