package ro.uvt;

public class AlignRight implements AlignStrategy{

    public AlignRight() {
    }

    @Override
    public void render(Paragraf p) {
        System.out.println("right " + p.getText());
    }
}
