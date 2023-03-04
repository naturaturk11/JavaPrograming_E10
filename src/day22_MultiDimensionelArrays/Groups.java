package day22_MultiDimensionelArrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {


		 		String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
		 		String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
		 		String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        System.out.println(Arrays.toString(batch25Group1));


        String[][]batch25Groups={batch25Group1, batch25Group2, batch25Group1};
        System.out.println(Arrays.deepToString(batch25Groups));

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

         String[][] batch24Groups={ batch24Group1, batch24Group2, batch24Group3};
        System.out.print(Arrays.deepToString(batch24Groups));
        System.out.println();

        String[][][] cydeoStudents={batch24Groups,batch25Groups};
        System.out.println(Arrays.deepToString(cydeoStudents));

        for (String[][] each2D : cydeoStudents) {
            for (String[]eachD : each2D) {
                for (String element : eachD) {
                    System.out.println(element+" ");
                }
            }
            System.out.println();
        }
        System.out.println();
            }
        }




