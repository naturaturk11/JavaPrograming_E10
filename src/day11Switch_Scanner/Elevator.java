package day11Switch_Scanner;

public class Elevator {
    public static void main(String[] args) {

        int floorNumber= 2;
        String result="";

        switch (floorNumber){
            case 1:result="Floor 1 selected.Companies: Lobby,Verizon,Starbucks";
            break;
            case  2: result= "Floor 2 selected.Companies: Cybertech,NASA,Intelsat";
            break;
            case 3: result="Floor 2 selected.Companies:Lyft, BofA, Stake hause";
            break;
            default:
                System.out.println("invalid floor "+ floorNumber);;

        }

        System.out.println(result);







    }




}
