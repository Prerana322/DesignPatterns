package EagerInitialization;

public class EagerSingleton {
    private static final EagerSingleton Instance = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return Instance;
    }
}
