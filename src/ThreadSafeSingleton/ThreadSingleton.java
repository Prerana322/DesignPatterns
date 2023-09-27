package ThreadSafeSingleton;

public class ThreadSingleton {
    private static ThreadSingleton Instance;

    private ThreadSingleton(){

    }

    public static ThreadSingleton getInstance() {
        if(Instance == null) {
            synchronized (ThreadSingleton.class) {
                if (Instance == null) {
                    Instance = new ThreadSingleton();
                }
            }
        }
        return Instance;
    }
}
