package ro.uvt.models;

import java.awt.*;

public class RandomContentVisitor implements Visitor{

    @Override
    public void visitBook(Carte carte) {
        System.out.println(carte.getTitlu());
        System.out.println(carte.getAutori());
        carte.getContent().forEach(copil->copil.accept(this));
    }

    @Override
    public void visitParagraf(Paragraf paragraf) {
        paragraf.getAlign().render(paragraf);
    }

    @Override
    public void visitSection(Section section) {
        System.out.println(section.getSectionTitle());
        section.getContent().forEach(copil->copil.accept(this));
    }

    @Override
    public void visitTable(Tabel tabel) {
        System.out.print("Tabel \n");
        tabel.accept(this);
    }

    @Override
    public void visitImagine(Imagine image) {
        image.accept(this);

    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imageProxy.getRealImage().accept(this);

    }
}
