package ro.uvt;

import java.util.List;
import java.util.ArrayList;
public class Section implements Element{

    private String sectionTitle;
    private List<Element> content;
    public Section() {
        this(null);
    }


    public Section(String sectionTitle) {
        this.sectionTitle = sectionTitle;
        this.content = new ArrayList<Element>();

    }


    public String getSectionTitle() {
        return sectionTitle;
    }

    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }
    @Override
    public void add(Element elm) {
        content.add(elm);
    }
    @Override
    public void remove (Element elm)
    {
        content.remove((elm));
    }
    @Override
    public Element getElement(int i)
    {
        return content.get(i);
    }

    protected List<Element> getContent() {
        return content;
    }

    @Override
    public void render() {
        System.out.println(sectionTitle);
        content.forEach(Element::render);
    }
}
