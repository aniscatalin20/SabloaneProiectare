package ro.uvt.models;

public class ImageProxy implements Element {
    String imgname;
    Imagine realImage;

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

    public String getImgname() {
        return imgname;
    }

    public void accept(Visitor v) {
        v.visitImageProxy(this);
    }
}
