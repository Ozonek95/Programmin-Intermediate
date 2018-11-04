package enumexcercise2;

public class ShopDemo {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Coat coat = new Coat();
        coat.setColor(Color.BLUE);
        coat.setSize(Size.XL);
        coat.setMaterial(Material.POLYESTER);

        Coat coat2 = new Coat();
        coat2.setColor(Color.BLUE);
        coat2.setSize(Size.XL);
        coat2.setMaterial(Material.POLYESTER);

        Coat coat3 = new Coat();
        coat3.setColor(Color.BLUE);
        coat3.setSize(Size.XL);
        coat3.setMaterial(Material.POLYESTER);

        Coat coat4 = new Coat();
        coat4.setColor(Color.YELLOW);
        coat4.setSize(Size.L);
        coat4.setMaterial(Material.POLYESTER);


        Coat coat8 = new CoatBuilder(Color.YELLOW)
                .setMaterial(Material.COTTON)
                .setSize(Size.S)
                .build();

        Coat coat9 = new CoatBuilder(Color.RED).setSize(Size.XXL).build();

        System.out.println("FROM BUILDER");
        System.out.println(coat8);
        System.out.println(coat9);


        shop.addCoat(coat);
        shop.addCoat(coat2);
        shop.addCoat(coat3);
        shop.addCoat(coat4);


        System.out.println(shop.giveAllGivenCoatsWithParameters("BLUE"));
    }
}
