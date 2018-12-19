package threadsobservator;

public class Calculator implements Runnable {

    private int a;
    private int b;
    private ThreadObservator threadObservator;


    public Calculator(int a, int b,ThreadObservator threadObservator) {
        this.a = a;
        this.b = b;
        this.threadObservator = threadObservator;
    }

    public Calculator(int a,int b){
        this.a=a;
        this.b=b;
    }

    public Runnable add(){

        return () -> {
            System.out.println(a+b);
            System.out.println(Thread.currentThread().getName());

        };
    }
 //   public Runnable subtract(){
//        System.out.println(Thread.currentThread().getName());
//        return () -> {
//            System.out.println(a-b);
//            System.out.println(Thread.currentThread().getName());
//        };
//    }
//    public Runnable divide(){
//
//        return () -> System.out.println(a/b);
//    }
//    public Runnable multiply(){
//
//        return () -> System.out.println(a*b);
//    }

    @Override
    public void run() {
        System.out.println("Im calculators run() "+Thread.currentThread());

        System.out.println(a+b);

        System.out.println("Zakończyłem run() Calculator "+Thread.currentThread());

        if(threadObservator!=null){
            threadObservator.notifyThis(new Calculator(5,10));
        }

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
