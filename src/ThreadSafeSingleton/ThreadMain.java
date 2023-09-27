package ThreadSafeSingleton;

public class ThreadMain {
    public static void main(String args[]){
        ThreadSingleton Singleton4 = ThreadSingleton.getInstance();
        System.out.println(Singleton4.hashCode());
    }
}
