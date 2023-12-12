
import processing.core.PApplet;
import processing.core.PImage;

import java.util.ArrayList;
import java.util.HashMap;

public class Main extends PApplet {
    ArrayList<Clothing> clothes = new ArrayList<>();
    ArrayList<Clothing> pants = new ArrayList<>();
    ArrayList<Clothing> tops = new ArrayList<>();
    ArrayList<Clothing> shoes = new ArrayList<>();
    ArrayList<Clothing> dress = new ArrayList<>();
    ArrayList<Clothing> acc = new ArrayList<>();
    PImage baggyJeans, flareLeggings, jorts, cargoPants, cargoShorts, flareJeans, hoodie, zipUp, tShirt, longSleeve, blouse, cropTop, bowlingShoes, runningShoes, highHeels, boots, sneakers, slides, bodycon, midi, maxi, mini, floral, fancy ;
    int clothing, width, clothingDeletedIndex, x, y;
    boolean objectClicked, homePage, cartClicked, topsPage, shoesPage, accPage, dressPage, cartDelete, checkOutPage;
    Cart cart;
    ArrayList<Clothing> cartClothes = new ArrayList<>();
    HashMap<Integer, String> sizes = new HashMap();

    public void settings(){
        size(700,600);
    }

    public void setup(){
        baggyJeans = loadImage("baggyJeans.png");
        flareLeggings = loadImage("flareLeggings.png");
        jorts = loadImage("jorts.png");
        cargoPants = loadImage("cargoPants.png");
        flareJeans = loadImage("flareJeans.png");
        cargoShorts = loadImage("cargoShorts.png");
        hoodie = loadImage("hoodie.png");
        zipUp = loadImage("zipUp.png");
        tShirt = loadImage("shortSleeve.png");
        longSleeve = loadImage("longSleeve.png");
        blouse = loadImage("blouse.png");
        cropTop = loadImage("cropTop.png");
        bowlingShoes = loadImage("bowling.png");
        runningShoes = loadImage("running.png");
        sneakers = loadImage("sneaker.png");
        slides = loadImage("slides.png");
        boots = loadImage("boots.png");
        highHeels = loadImage("highHeels.png");
        bodycon = loadImage("bodyCon.png");
        midi = loadImage("midi.png");
        mini = loadImage("mini.png");
        maxi = loadImage("maxi.png");
        floral = loadImage("floral.png");
        fancy = loadImage("fancy.png");
        objectClicked = false;
        x = 130;
        y = 13;
        checkOutPage = false;
        homePage = true;
        cartClicked = false;
        topsPage = false;
        shoesPage = false;
        cartDelete = false;
        clothing = 0;
        width = 210;
        pants.add(new Pants("Baggy Jeans", 205.99,2,"Grey","Denim",baggyJeans));
        pants.add(new Pants("Flare Leggings", 105.99,2,"Black","Spandex" , flareLeggings));
        sizes.put(1,"S");
        sizes.put(2, "M");
        sizes.put(3,"L");
        pants.add(new Pants("Jorts", 125.99,2,"Blue","Denim",jorts));
        pants.add(new Pants("Cargo Pants", 325.99,2,"Grey","Denim",cargoPants));
        pants.add(new Pants("Flare Jeans", 125.99,2,"Blue","Denim",flareJeans));
        pants.add(new Pants("Cargo Shorts", 125.99,2,"Brown","Denim",cargoShorts));
        tops.add(new Tops("Hoodie", 400,2,"Grey",hoodie));
        tops.add(new Tops("Zip Up", 350.99,2,"Black",zipUp));
        tops.add(new Tops("Tshirt", 149.99,2,"Grey",tShirt));
        tops.add(new Tops("Long Sleeve", 215,2,"Brown",longSleeve));
        tops.add(new Tops("Blouse", 450,2,"Cream",blouse));
        tops.add(new Tops("Crop Top", 201.78,2,"Beige",cropTop));
        shoes.add(new Shoes("Bowling Shoes", 1000,2,"Black",bowlingShoes));
        shoes.add(new Shoes("Running Shoes", 100.92,2,"White",runningShoes));
        shoes.add(new Shoes("High Heels", 862.28,2,"Blue",highHeels));
        shoes.add(new Shoes("Boots", 452,2,"Black",boots));
        shoes.add(new Shoes("Slides", 182,2,"Blue",slides));
        shoes.add(new Shoes("Sneakers", 1000,2,"Black",sneakers));
        dress.add(new Dress("Bodycon", 136,2,"Glittery",bodycon));
        dress.add(new Dress("Maxi", 392,2,"Multicolored",maxi));
        dress.add(new Dress("Mini", 129,147,"Emerald",mini));
        dress.add(new Dress("Midi", 265,2,"Pink",midi));
        dress.add(new Dress("Floral", 275,2,"MultiColored",floral));
        dress.add(new Dress("Fancy", 3821,2,"Blue",fancy));
    }

    public void draw(){
        if(homePage == true) {
            clothes = pants;
            clear();
            background(255);

            fill(0);
            rect(580, 13, 70, 33);
            rect(50, 13, 70, 33);
            fill(255);
            text("Cart", 597, 33);
            text("LOGO", 65, 33);
            fill(0);
            for (int x0 = 130; x0/(70+10) <= 5; x0 += 70 + 10) {
                rect(x0,13,70,33);
            }
            //cart button
            fill(255, 0, 0);
            text("PANTS", 140, 33);
            fill(255);
            text("TOPS", 225, 33);
            text("DRESSES", 296, 33);
            text("SHOES", 385, 33);
            text("ACC", 465, 33);
        }if(topsPage == true){
                clear();
                background(255);

                fill(0);
                rect(580, 13, 70, 33);
                rect(50, 13, 70, 33);
                fill(255);
                text("Cart",597,33);
                text("LOGO",65,33);
                fill(0);
//                rect(130, 13, 70, 33);
//                rect(210, 13, 70, 33);
//                rect(290, 13, 70, 33);
//                rect(370, 13, 70, 33);
//                rect(450, 13, 70, 33);
            for (int x0 = 130; x0/(70+10) <= 5; x0 += 70 + 10) {
                rect(x0,13,70,33);
            }
                clothes = tops;
                fill(255,0,0);
                text("TOPS",225,33);
                fill(255);
                text("PANTS",140,33);
                text("DRESSES",296,33);
                text("SHOES",385,33);
                text("ACC",465,33);
            } else if (shoesPage == true){
                clear();
                background(255);
            clothes = shoes;
                fill(0);
                rect(580, 13, 70, 33);
                rect(50, 13, 70, 33);
                fill(255);
                text("Cart",597,33);
                text("LOGO",65,33);
                fill(0);
            for (int x0 = 130; x0/(70+10) <= 5; x0 += 70 + 10) {
                rect(x0,13,70,33);
            }
                fill(255,0,0);
                text("SHOES",385,33);
                fill(255);
                text("PANTS",140,33);
                text("DRESSES",296,33);
                text("TOPS",225,33);
                text("ACC",465,33);
            } else if (dressPage == true){
                clear();
                background(255);
            clothes = dress;
                fill(0);
                rect(580, 13, 70, 33);
                rect(50, 13, 70, 33);
                fill(255);
                text("Cart",597,33);
                text("LOGO",65,33);
                fill(0);
            for (int x0 = 130; x0/(70+10) <= 5; x0 += 70 + 10) {
                rect(x0,13,70,33);
            }

                fill(255,0,0);
                text("DRESSES",296,33);
                fill(255);
                text("PANTS",140,33);
                text("SHOES",385,33);
                text("TOPS",225,33);
                text("ACC",465,33);
            } else if (accPage == true){
            clothes = acc;
                clear();
                background(255);
                fill(0);
                rect(580, 13, 70, 33);
                rect(50, 13, 70, 33);
                fill(255);
                text("Cart",597,33);
                text("LOGO",65,33);
                fill(0);
            for (int x0 = 130; x0/(70+10) <= 5; x0 += 70 + 10) {
                rect(x0,13,70,33);
            }
                fill(255,0,0);
                textSize(15);
                text("ACC",465,33);
                fill(255);
                text("PANTS",140,33);
                text("SHOES",385,33);
                text("TOPS",225,33);
                text("DRESSES",296,33);

                fill(0);
                text("NO ITEMS FOUND", 270,250);
            }

            //clothing display
            displayPage(clothes);

            if (objectClicked == true) {
                homePage = false;
                clear();
                display(whichItem(clothing, clothes), clothes);
            }
            if(cartClicked == true){
                clear();
                cart(cartClothes);
                if(cartDelete){
                    System.out.println("ran");
                    clear();
                    cart(cartClothes);
                    cartDelete = false;
                }
        }  if(checkOutPage == true){
                background(255);
            text("you cannot check out because you have an invalid bank balance", 70,100);
            textSize(50);
            text("X",20,20);
        }
    }

    public void displayPage(ArrayList<Clothing> clothes) {
        int x = 40;
        int y = 70;
        for (int i = 0; i < clothes.size(); i++) {
            Clothing curr = clothes.get(i);
            curr.x = x;
            curr.y = y;
            curr.draw(this, curr.x, curr.y);
            fill(0);
            textSize(15);
            text(curr.name, x + 10, y + width + 10);
            String price = Double.toString(curr.price);
            text(price, x + 150, y + width + 10);
            x += width;
            if (ifPast(curr.x, curr.y)) {
                y += width + 30;
                x = 40;
            }
        }
    }

    public void cart(ArrayList<Clothing> cartClothes){
        int x = 100;
        int y = 125;
        int size = 150;
        double totalPrice = 0;
        clear();
        background(255);
        textSize(50);
        text("Cart", 300, 50);
        for (int i = 0; i < cartClothes.size(); i++) {
            Clothing c = cartClothes.get(i);
            textSize(14);
            text(c.name + " in the color " + c.color, x + size + 30, y + 20);
            PImage resizedImage = c.image.copy();  // Create a copy to avoid modifying the original image
            resizedImage.resize(size, size);
            image(resizedImage, x, y);
            fill(255);
            text("delete", 560, y+20);
            fill(0);
            text(c.price +" dollars", x + size +30,y+60);
            text(c.quantity +" piece(s)", x + size + 30, y+80 );
            text(sizes.get(c.size), x + size + 30, y + 40);
            y = y + x + 80;
            totalPrice += c.price * c.quantity;
        }

        fill(0);
        textSize(40);
        text("x", 20,40);
        text("Total: $" + totalPrice, 200, 500);
        //checkout button
        rect(500, 500, 160, 50);
        textSize(25);
        fill(255);
        text("Checkout", 513, 526);
    }

    public void display(Clothing c, ArrayList<Clothing> clothes){
        background(255);
        PImage resizedImage = c.image.copy();  // Create a copy to avoid modifying the original image
        resizedImage.resize(400, 400);
        image(resizedImage, 20,50);
        fill(0);
        textSize(30);
        text(c.name, 440, 70);
            for (int x = 450; x + 80 <= 700; x += 80) {
                rect(x, 270, 70, 40);
        }
        fill(0);
        rect(450,330,70,40);
        rect(610,330,70,40);
        fill(255);
        rect(520,330,90,40);
        rect(450, 390,230,40);
        rect(450, 200,230,40);
        rect(450, 130,230,40);
        fill(0);
        String price = c.price + "";
        text(price, 505,165);
        fill(255);
        text("+",475,360);
        text("-", 635,360);

        if(clothes.get(clothing).size == 1) {
            fill(255,0,0);
            text("S", 475, 300);
            fill(255);
            text("M", 555, 300);
            text("L", 635, 300);
        }  if(clothes.get(clothing).size==2) {
            fill(255,0,0);
            text("M", 555, 300);
            fill(255);
            text("S", 475, 300);
            text("L", 635, 300);
        } if(clothes.get(clothing).size == 3){
            fill(255,0,0);
            text("L", 635, 300);
            fill(255);
            text("S", 475, 300);
            text("M", 555, 300);
        }

        fill(0);
        text(c.quantity, 555,360);
        text(c.color, 525, 235);
        text("Add to Cart", 475, 420);
        textSize(40);
        text("X", 20,40);
    }

    public boolean ifPast(int x, int y){
        if(x+width+40 >= 700){
            return true;
        }return false;
    }

    public Clothing whichItem(int index, ArrayList<Clothing> c){
        return c.get(index);
    }

    public void cartDelete(int clothingDeletedIndex){
        cartClothes.remove(clothingDeletedIndex);
    }

    public void mouseReleased() {
        //For buttons at top for switching clothing catagory
        if(mouseX >= 130 && mouseX <= 200 && mouseY >= 13 && mouseY <= 46){
                homePage = true;
                topsPage = false;
                dressPage=false;
                accPage=false;
                shoesPage=false;
                checkOutPage = false;
        } else if(mouseX >= 210 && mouseX <= 280 && mouseY >= 13 && mouseY <= 46){
                topsPage = true;
                homePage = false;
                dressPage=false;
                accPage=false;
                shoesPage=false;
                checkOutPage = false;
        } else if (mouseX >= 290 && mouseX <= 360 && mouseY >= 13 && mouseY <= 80) {
                dressPage = true;
                homePage = false;
                topsPage = false;
                accPage = false;
                shoesPage = false;
                checkOutPage = false;
        } else if(mouseX >= 370 && mouseX <= 440 && mouseY >= 13 && mouseY <= 46){
                shoesPage = true;
                homePage = false;
                dressPage=false;
                accPage=false;
                topsPage=false;
                checkOutPage = false;
        } else if(mouseX >= 450 && mouseX <= 520 && mouseY >= 13 && mouseY <= 46){
                accPage = true;
                homePage = false;
                dressPage=false;
                topsPage=false;
                shoesPage=false;
                checkOutPage = false;
        }if(objectClicked == false && cartClicked == false && checkOutPage == false && mouseX >= 580 && mouseX <= 650 && mouseY >=7 && mouseY <= 40){
                accPage = false;
                homePage = false;
                dressPage=false;
                topsPage=false;
                shoesPage=false;
                cartClicked = true;
        }
        //if pants page is true
         if(objectClicked == false && cartClicked == false){
            for (int i = 0; i < clothes.size(); i++) {
                Clothing curr = clothes.get(i);
                if (curr.mouseReleased(mouseX, mouseY, curr.x, curr.y)) {
                    clothing = i;
                    objectClicked = true;
                }
            }
            }

            System.out.println(clothing);
          if (objectClicked == true) {
            //object clicked is set to true whne they are on object page or looking at a specific clothing item
            //size button clicked

            if(mouseX >= 450 && mouseX <= 520 && mouseX >= 270 && mouseY <= 310){
                    Clothing curr = clothes.get(clothing);
                    curr.size = 1;
            } else if (mouseX >= 530 && mouseX <= 600 && mouseX >= 270 && mouseY <= 310){
                    Clothing curr = clothes.get(clothing);
                    curr.size = 2;
            } else if (mouseX >= 610 && mouseX <= 680 && mouseX >= 270 && mouseY <= 310){
                    Clothing curr = clothes.get(clothing);
                    curr.size = 3;
            }
            //quantity + button clicked
            rect(450,330,70,40);
            rect(610,330,70,40);
            if(mouseX >= 450 && mouseX <= 520&&mouseY >= 330 && mouseY <=370){
                    Clothing curr = clothes.get(clothing);
                    curr.quantity+=1;
            }
            //quantity - button clicked
            if(mouseX >= 610 && mouseX <= 680 && mouseY >= 330 && mouseY <=370){
                    Clothing curr = clothes.get(clothing);
                    if(curr.quantity > 0) {
                        curr.quantity -= 1;
                        System.out.println(curr.quantity);
                    } else {
                        curr.quantity = 0;
                    }
            }
                //add to cart button clicked
            if (mouseX >= 450 && mouseX <= 680 && mouseY >= 390 && mouseY <= 430) {
                    cartClothes.add(clothes.get(clothing));
                    cart = new Cart(cartClothes);
                    System.out.println(cartClothes.get(0));
                    cartClicked = true;
                    objectClicked = false;
                //exiting the object page and going back to homePage
            }  if (mouseX >= 0 && mouseX <= 100 && mouseY >= 0 && mouseY <= 100) {
                  objectClicked = false;
                  homePage = true;
            }
            //on the cart Page
        } else if (cartClicked == true) {
            //exit out of cart back to object page
            if (mouseX >= 0 && mouseX <= 100 && mouseY >= 0 && mouseY <= 100) {
                    cartClicked = false;
                    objectClicked = false;
                    homePage = true;
            }
            for (int y = 125; (y - 125)/180 < cartClothes.size(); y += 180) {
                if(mouseX >= 550 && mouseX <= 660 && mouseY > y && mouseY > y + 30){
                    clothingDeletedIndex = y;
                    System.out.println(y);
                    cartDelete(clothingDeletedIndex);
                    cartDelete = true;
                }
            }

            if(cartClicked == true && mouseX >= 500 && mouseX <= 660 && mouseY >=500 && mouseY <= 550){
                checkOutPage = true;
                cartClicked = false;
                System.out.println("checkout");
            }
          } else if (checkOutPage == true){
              text("you cannot check out because you have an invalid bank balance", 70,100);
              if(mouseX>=0 && mouseX<= 100 && mouseY >=0 && mouseY<=100){
                  checkOutPage = false;
                  cartClicked = true;
              }
          }
        }

    public static void main (String[]args){
            PApplet.main("Main");
        }
}


