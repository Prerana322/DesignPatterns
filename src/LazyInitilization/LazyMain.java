package LazyInitilization;

public class LazyMain {

    public static void main(String args[]){
        LazySingleton Singleton1 = LazySingleton.getInstance();
        System.out.println(Singleton1.hashCode());
    }
}
