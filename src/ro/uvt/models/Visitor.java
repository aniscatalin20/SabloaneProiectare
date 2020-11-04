package ro.uvt.models;

import java.awt.*;

public interface Visitor {
    void visitBook(Carte carte);
    void visitParagraf(Paragraf paragraf);
    void visitSection(Section section);
    void visitTable(Tabel tabel);
    void visitImagine(Image image);
    void visitImageProxy(ImageProxy imageProxy);

}
