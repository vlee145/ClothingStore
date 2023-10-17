import processing.core.PApplet;

import java.util.ArrayList;

public class Clothing {
    protected String name;
    protected double price;
    protected int size;
    protected String[] colors;
    protected String color;
    protected int quantity;
    public int x;
    public int y;
    public Clothing(String n, double p,int s,int colors, String c, int q){
        name = n;
        price = p;
        size = s;
        this.colors = new String[colors];
        color = c;
        quantity = q;

    }
    public void draw(PApplet window, int x, int y){
       window.rect(x,y,200,200);
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
