package EagerInitialization;

public class SingletonMain {

    public static void main(String args[]){
        EagerSingleton Singleton =  EagerSingleton.getInstance();
        System.out.println(Singleton.hashCode());
    }
}
