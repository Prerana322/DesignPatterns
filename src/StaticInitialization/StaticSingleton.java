package StaticInitialization;

public class StaticSingleton {
        private static StaticSingleton Instance;

        private StaticSingleton(){
        }

        static {
            try {
                Instance=new StaticSingleton();
            } catch(Exception e){
                e.printStackTrace();
            }
        }

        public static StaticSingleton getInstance(){
            return Instance;
        }
}
