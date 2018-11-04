package enumexcercise2;

public class CoatBuilder {
    Color color;
    Material material;
    Size size;

    public CoatBuilder(Color color) {
        this.color = color;
    }

    public CoatBuilder setMaterial(Material material) {
        this.material = material;
        return this;
    }

    public CoatBuilder setSize(Size size) {
        this.size = size;
        return this;
    }

    public Coat build() {
        return new Coat(color, material, size);
    }
}
