package ro.uvt;

public class AlignLeft implements AlignStrategy{

    public AlignLeft() {
    }

    @Override
    public void render(Paragraf p) {
        System.out.println("left " + p.getText());
    }
}
