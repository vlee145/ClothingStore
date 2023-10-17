
import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {
    ArrayList<Clothing> clothes = new ArrayList<>();
    int width;
    boolean objectClicked;
    public void settings(){
        size(700,600);
    }
    public void setup(){
        objectClicked = false;
        width = 210;
        clothes.add(new Pants("Jeans", 205.99,2,3,"Blue",1,"Denim"));
        clothes.add(new Pants("Leggings", 105.99,2,1,"Black",1,"Spandex"));
        clothes.add(new Pants("Jorts", 125.99,2,3,"Blue",1,"Denim"));
        clothes.add(new Pants("Cargo", 325.99,2,3,"Black",1,"Denim"));
        clothes.add(new Pants("Jorts", 125.99,2,3,"Blue",1,"Denim"));
        clothes.add(new Pants("Jorts", 125.99,2,3,"Blue",1,"Denim"));

    }
    public void draw(){
        int x = 40;
        int y = 50;
        int n = 2;

        for (int i = 0; i < clothes.size(); i++) {
            Clothing curr = clothes.get(i);
                curr.x = x;
                curr.y = y;
                curr.draw(this, curr.x, curr.y);
                x += width;
                if (ifPast(curr.x,curr.y)){
                    y += width + 30;
                    x = 40;
                }
        }
        if(objectClicked == true){
            clear();
        }

    }
    public void template(Clothing c){
        rect( );
    }
    public boolean ifPast(int x, int y){
        if(x+width+40 >= 700){
            return true;
        }return false;
    }
    public Clothing whichItem(int index, ArrayList<Clothing> c){
        return c.get(index);
    }

    public void mouseReleased(){
        int clothing = 0;
        for (int i = 0; i < clothes.size(); i++) {
            Clothing curr = clothes.get(i);
           if(curr.mouseReleased(mouseX, mouseY, curr.x, curr.y)){
               clothing = i;
               objectClicked = true;
            }
        }
        System.out.println(clothing);

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
