package clonableexercise1;

public class ItemClone  {
    private int a;

    public ItemClone(int a) {
        this.a = a;
    }


    public ItemClone(ItemClone itemClone) {
        this.a=itemClone.a;
    }
}
