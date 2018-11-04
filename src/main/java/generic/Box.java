package generic;

public class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "Box{" +
                "content=" + content +
                '}';
    }

    public T getContent() {
        return content;
    }
}
