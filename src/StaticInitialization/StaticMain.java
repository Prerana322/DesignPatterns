package StaticInitialization;

public class StaticMain {

    public static void main(String args[]){
        StaticSingleton Singleton2 =  StaticSingleton.getInstance();
        StaticSingleton Singleton3 =  StaticSingleton.getInstance();
        System.out.println(Singleton2.hashCode());
        System.out.println(Singleton3.hashCode());
    }
}
