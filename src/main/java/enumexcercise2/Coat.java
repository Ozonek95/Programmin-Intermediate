package enumexcercise2;

public class Coat {
    private Color color;
    private Material material;
    private Size size;

    Coat(Color color, Material material, Size size) {
        this.color = color;
        this.material = material;
        this.size = size;
    }

    public Coat(CoatBuilder coatBuilder){
        this.material = coatBuilder.material;
        this.size = coatBuilder.size;
    }

    Coat() {
    }

    void setColor(Color color) {
        this.color = color;
    }


    void setMaterial(Material material) {
        this.material = material;
    }

    void setSize(Size size) {
        this.size = size;
    }

    Color getColor() {
        return color;
    }



    Material getMaterial() {
        return material;
    }

    Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Coat{" +
                "color=" + color +
                ", material=" + material +
                ", size=" + size +
                '}';
    }
}
