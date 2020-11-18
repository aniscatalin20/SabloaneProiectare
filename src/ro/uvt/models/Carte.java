package ro.uvt.models;

import java.util.List;

public class Carte extends Section{

    private List<Autor> autori;


    public Carte(List < Autor> autori, String titlu) {
        super(titlu);
        this.autori = autori;

    }


    public String getTitlu(){return getSectionTitle();}

    public void setTitlu(String titlu){
        this.setSectionTitle(titlu);
    }

    public List<Autor> getAutori() {
        return autori;
    }

    @Override
    public void accept(Visitor v) {
        v.visitBook(this);
    }

}
