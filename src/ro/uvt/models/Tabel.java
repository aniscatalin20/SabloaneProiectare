package ro.uvt.models;

public class Tabel implements Element{
    String nume;

    public Tabel(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    //    @Override
//    public void render(){
//        System.out.print("Tabel \n");
//    }

    @Override
    public void accept(Visitor v) {
        v.visitTable(this);
    }
}
