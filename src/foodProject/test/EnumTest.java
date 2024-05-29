package foodProject.test;

import foodProject.enums.Enum;

public class EnumTest {



    public static void main(String[] args) {
        Enum[] days = Enum.values();
        String str = "   Hello     World     !!!!    ";
        String[] arrStr = str.trim().replaceAll("\\s{2,}", " ").split(" ");
        for (String string : arrStr) {
            System.out.println(string);
        }

        System.out.println("\n" + str.trim().replaceAll("\\s{2,}", " "));

//        for (Enum en : days) {
//            System.out.println(en.getFullName());
//        }

        System.out.println(Enum.FR.getFullName());
    }

}
