package enumexcercise2;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ShopTesting {

    private Shop shop;

    @BeforeEach
    void setUp() {
            shop = new Shop();
    }

    @Test
    void checkIfListAddMethodAddsCoats() {


        Coat coat = new Coat();
        shop.addCoat(coat);

        Assert.assertTrue(shop.coats.contains(coat));

    }

    @Test
    void checkIfListReturnsListWithGivenColourCoats() {

        Shop shop = new Shop();
        Coat coat = new Coat();
        coat.setColor(Color.RED);
        Coat coat1 = new Coat();
        coat1.setColor(Color.RED);
        Coat coat2 = new Coat();
        coat2.setColor(Color.RED);
        Coat coat3 = new Coat();
        coat3.setColor(Color.BLUE);
        shop.addCoat(coat);
        shop.addCoat(coat1);
        shop.addCoat(coat2);
        shop.addCoat(coat3);

        List<Coat> coatList = new ArrayList<>();
        coatList.add(coat);
        coatList.add(coat1);
        coatList.add(coat2);

        Assert.assertEquals(coatList,shop.giveAllGivenCoatsWithParameters("RED"));

    }

}
