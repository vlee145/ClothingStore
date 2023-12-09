import processing.core.PApplet;
import processing.core.PImage;

import java.util.ArrayList;

public class Clothing {
    protected String name;
    public double price;
    protected int size;
    protected String[] colors;
    protected String color;
    protected int quantity;
    public int x;
    public int y;
    private PImage picture;
    public Clothing(String n, double p,int s, String c , PImage picture){
        name = n;
        price = p;
        size = s;
        color = c;
        quantity = 1;
        image = picture;

    }
    public void draw(PApplet window, int x, int y){
        PImage resizedImage = image.copy();  // Create a copy to avoid modifying the original image
        resizedImage.resize(200, 200);
        window.image(resizedImage, x, y);
       //window.image(picture);
    }
    public boolean mouseReleased(int mouseX, int mouseY, int x,int y){
        if(mouseX >= x && mouseX <= x+200){
            if(mouseY >= y && mouseY <= y+200){
                return true;
            }
        } return false;
    }

    public double getPrice(){
        return price;
    }
    public void setQuantity(int q){
        quantity = q;
    }
    public void setColor(int index){
        color = colors[index];
    }






}
