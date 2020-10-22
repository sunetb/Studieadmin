package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Opret ny "tom" studerende og sæt felter
        Studerende s1 = new Studerende();
        s1.fornavn = "Søren";
        s1.efternavn = "Hansen";
        s1.studienr = 23456;
        s1.fag[0] = "Biologi";
        s1.fag[1] = "Kemi";

        //Opret ny studerende og overfør værdier til konstruktøren
        Studerende s2 = new Studerende("Hans", "bo", "Sørensen", 98765, "Psykologi", "Matematik");

        //Opret ny studerende med brugerinput
        Studerende s3 = opret();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



    }

    private static Studerende opret() {

        Scanner s = new Scanner(System.in);

        System.out.println("Opretter ny studerende...");
        Studerende stu = new Studerende();
        System.out.println("Skriv fornavn");
        stu.fornavn = s.nextLine();
        System.out.println("Skriv efternavn");
        stu.efternavn = s.nextLine();
        System.out.println("Skriv studienr");
        stu.studienr = Integer.parseInt(s.nextLine());
        System.out.println("Skriv Fag 1");
        stu.fag[0] = s.nextLine();
        System.out.println("Skriv fag 2");
        stu.fag[1] = s.nextLine();
        System.out.println("Færdig. Du har nu oprettet følgende studerende:");
        System.out.println(stu);
        System.out.println("Tryk enter for at acceptere, R for at redigere");
        return stu;
    }


}
