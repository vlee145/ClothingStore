import java.util.ArrayList;

public class Cart {
    private ArrayList<Clothing> items = new ArrayList<>();
    private double totalPrice;
    private double tax;
    private double shipping;
    public Cart(ArrayList<Clothing> clothes,double t, double s){
        items = clothes;
        tax = t;
        shipping = s;
    }

    public double calculatePrice(ArrayList<Clothing> c) {
        double price = 0;
        for (int i = 0; i < items.size(); i++) {
            Clothing a = items.get(i);
            price += a.getPrice();
        }
        totalPrice = price;
        return price + (price*tax);
    }
    public double calculateShipping(ArrayList<Clothing> c){
        return c.size() * 2.99;
    }






}
