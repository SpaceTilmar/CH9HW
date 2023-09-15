package cake;

public class TasteTester {
    public static void main(String[] args){
        WeddingCake weddingCake = new WeddingCake();
        BirthdayCake birthdayCake = new BirthdayCake();
        Cake cake = new Cake();

        cake.setFlavor("Vanilla");
        cake.setPrice(12.99);

        birthdayCake.setFlavor("Chocolate");
        birthdayCake.setPrice(24.99);

        weddingCake.setFlavor("Ice Cream");
        weddingCake.setPrice(51.99);

        System.out.println(birthdayCake.getFlavor() + " " + birthdayCake.getPrice() + "\n" + cake.getFlavor() + " " + cake.getPrice() + "\n" + weddingCake.getFlavor() + " " + weddingCake.getPrice());
    }
}
