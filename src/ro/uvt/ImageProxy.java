package ro.uvt;

public class ImageProxy implements Element {
    String imgname;
    Imagine realImage;

    @Override
    public void render() {
        if (realImage == null){
            realImage = new Imagine(imgname);
        }
        realImage.render();
    }
    public ImageProxy(String imgname){
        this.imgname = imgname;
        this.realImage = null;
    }
}
