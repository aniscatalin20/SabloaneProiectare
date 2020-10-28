package ro.uvt;

public class Paragraf implements Element{
    private String text;
    private AlignStrategy align;


    public Paragraf(String s) {
        this.text = s;
        this.align = new AlignLeft();
    }

    @Override
    public void render() {
        this.align.render(this);
    }

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy align) {
        this.align = align;
    }
}
