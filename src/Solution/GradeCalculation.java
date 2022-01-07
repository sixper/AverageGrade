package Solution;

import java.sql.SQLOutput;
import java.util.*;


public class GradeCalculation {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.print("Matematik notunuzu giriniz: ");
        int math = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        int physic = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        int chemistry = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        int turkish = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        int history = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        int music = input.nextInt();


        int grade = (math + physic + chemistry + turkish + history + music) / 6;

        System.out.println("\nNot ortalamanız: " + grade + "\n");

        if(grade >= 60)
            System.out.println("Sınıfı geçtiniz.");
        else
            System.out.println("Sınıfta kaldınız.");

    }
}
