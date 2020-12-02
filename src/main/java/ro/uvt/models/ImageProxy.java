package ro.uvt.models;

import ro.uvt.services.AlignStrategy;

public class ImageProxy implements Element, AlignStrategy {
    String imgname;
    Imagine realImage;
    private AlignStrategy align;

//    @Override
//    public void render() {
//        if (realImage == null){
//            realImage = new Imagine(imgname);
//        }
//        realImage.render();
//    }
    public ImageProxy(String imgname){
        this.imgname = imgname;
        this.realImage = null;
    }

    public Imagine getRealImage() {
        if (realImage == null){
            realImage = new Imagine(imgname);
        }
        return realImage;
    }

    public AlignStrategy getAlign() {
        return align;
    }

    public String getImgname() {
        return imgname;
    }

    public void accept(Visitor v) {
        v.visitImageProxy(this);
    }

    @Override
    public void render(Paragraf p) {

    }
}
