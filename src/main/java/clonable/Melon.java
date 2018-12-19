package clonable;

public class Melon {
    private String color;
    private String taste;

    public  Melon (){

    }
    public Melon(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
