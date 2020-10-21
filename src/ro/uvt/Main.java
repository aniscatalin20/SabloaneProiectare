package ro.uvt;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hi!");

        //  Section section = new Section();
        List<Autor> autori = Arrays.asList(new Autor("George Mart"));

        //Carte c = new Carte(autori, "Cartea");
        //c.add(new Paragraf());
        //Section s1 = new Section();
        //s1.add(new Imagine());
        //c.add(s1);
        //c.createCapitol("Introducere", Arrays.asList(new Paragraf(), new Imagine(), new Tabel(), new Tabel()));

        // c.render();

        long startTime = System.currentTimeMillis();
        Element img1 = new ImageProxy ("Pamela Anderson");
        Element img2 = new ImageProxy ("Kim");
        Element img3 = new ImageProxy ("Kirby");

        Section section1 = new Section ("Front");
        section1.add(img1);

        Section section2 = new Section ("Summer");
        section2.add(img2);
        section2.add(img3);

        Carte book = new Carte (autori, "Cartea");
        book.add(section1);
        book.add(section2);

        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime - startTime) + "milliseconds");

        startTime = System.currentTimeMillis();
        section1.render();
        endTime = System.currentTimeMillis();

        System.out.println("Printing of the section 1 took " + (endTime - startTime) + "milliseconds");

        startTime = System.currentTimeMillis();
        section1.render();
        endTime = System.currentTimeMillis();

        System.out.println("Printing again the section 1 took " + (endTime - startTime) + "milliseconds");


        startTime = System.currentTimeMillis();
        section2.render();
        endTime = System.currentTimeMillis();

        System.out.println("Printing of the section 2 took " + (endTime - startTime) + "milliseconds");

    }
}
