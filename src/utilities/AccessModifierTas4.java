package utilities;

import day40_FinalKeyWordAndProtectedMethod.ProtectedAccessModifier;

public class AccessModifierTas4 extends ProtectedAccessModifier {

    public static void main(String[] args) {


        //System.out.println(AccessModifierTas4.name1);//default is not visible outside the package
        System.out.println(AccessModifierTas4.name2);//protected is not always visible outside the package just on condition that this class should be subclass

        AccessModifierTas4.method2();
        //AccessModifierTas4.method1;




    }
}
