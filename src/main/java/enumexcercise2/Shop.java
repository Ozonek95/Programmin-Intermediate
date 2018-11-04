package enumexcercise2;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Shop {
   @VisibleForTesting
    public List<Coat> coats;

    Shop() {
        this.coats = new ArrayList<>();
    }

    void addCoat(Coat coat){
        coats.add(coat);
    }

    List<Coat> giveAllGivenCoatsWithParameters(String color){

        return coats.stream()
                .filter(c->c.getColor().equals(Color.valueOf(color)))
                .collect(Collectors.toList());
    }
    List<Coat> giveAllGivenCoatsWithParameters(String color,String material, String size){
        return coats.stream()
                .filter(c->c.getColor().equals(Color.valueOf(color.toUpperCase())))
                .filter(c->c.getMaterial().equals(material.toUpperCase()))
                .filter(c->c.getSize().equals(size.toUpperCase()))
                .collect(Collectors.toList());
    }

}
