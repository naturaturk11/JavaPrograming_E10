package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("hi");
    }

    static {//it is the first run before anything

        System.out.println("Static block");

    }

    static {//it is the first run before anything

        System.out.println("Static block1");


    }
}