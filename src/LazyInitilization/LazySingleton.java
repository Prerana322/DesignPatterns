package LazyInitilization;

public class LazySingleton {
    private static LazySingleton Instance;

    private LazySingleton(){ }

    public static LazySingleton getInstance(){
        if(Instance == null)
            Instance = new LazySingleton();
        return Instance;
    }
}
