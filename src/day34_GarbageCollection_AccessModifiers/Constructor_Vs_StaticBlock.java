package day34_GarbageCollection_AccessModifiers;

import java.lang.reflect.Constructor;

public class Constructor_Vs_StaticBlock {


    static {
        System.out.println("Static block");
    }

    public Constructor_Vs_StaticBlock() {//not printed bcs there are not yet object identified
        System.out.println("Constrauctor");
    }

    public static void main(String[] args) {

        new Constructor_Vs_StaticBlock();
        new Constructor_Vs_StaticBlock();
        new Constructor_Vs_StaticBlock();
        new Constructor_Vs_StaticBlock();







    }





}
