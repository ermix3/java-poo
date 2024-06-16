package org.ermix;

import org.ermix.ex1.Cheval;
import org.ermix.ex1.ChevalCourse;
import org.ermix.ex2.Cylindre;
import org.ermix.ex2.Disque;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting the application...");

        System.out.println("\n---------------- Ex1 -------------------");
        System.out.println("---------------- Création d'un Cheval");
        Cheval ch1 = new Cheval();
        ch1.setNom("cheval 1");
        ch1.setCouleur("Black");
        ch1.setAnnneeNaissance(1990);

        System.out.println("---------------- Création d'un Cheval course");
        ChevalCourse chevalCourse = new ChevalCourse();
        chevalCourse.setNom("Cheval 2");
        chevalCourse.setCouleur("White");
        chevalCourse.setAnnneeNaissance(2002);
        chevalCourse.setNombreCourses(10);

        System.out.println("\n---------------- Ex2 -------------------");
        System.out.println("---------------- Création d'un Disque");
        Disque disque = new Disque(10.3);
        System.out.println(disque.getDiametre());
        System.out.println(disque.getsurface());

        System.out.println("---------------- Création d'un Cylindre");
        Cylindre cylindre = new Cylindre(12, 12);
        System.out.println(cylindre.getsurface());
        System.out.println(cylindre.getVolume());

        System.out.println("Ending the application...");
    }
}