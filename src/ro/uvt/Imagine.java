package ro.uvt;

import java.util.concurrent.TimeUnit;

public class Imagine implements Element{
    String nume;


    public Imagine(String nume) {
        this.nume = nume;
        try {
            TimeUnit.SECONDS.sleep(5);
        }  catch (InterruptedException e){
            e.printStackTrace();
        }
    }



    public void render(){
        System.out.format("Imagine %s \n", nume);
    }


}
