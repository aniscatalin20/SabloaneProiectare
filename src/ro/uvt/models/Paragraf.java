package ro.uvt.models;

import ro.uvt.services.AlignLeft;
import ro.uvt.services.AlignStrategy;

public class Paragraf implements Element, Visitee{
    private String text;
    private AlignStrategy align;


    public Paragraf(String s) {
        this.text = s;
        this.align = new AlignLeft();
    }

//    @Override
//    public void render() {
//        this.align.render(this);
//    }


    public AlignStrategy getAlign() {
        return align;
    }

    public void setAlign(AlignStrategy align) {
        this.align = align;
    }


    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy align) {
        this.align = align;
    }

    @Override
    public void accept(Visitor v) {
        v.visitParagraf(this);
    }
}
