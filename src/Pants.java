import processing.core.PImage;

public class Pants extends Clothing{
    private String material;

    public Pants(String n, double p,int s, String co, String m,PImage i){
        super(n,p,s,co, i);
        material = m;
    }


}
