package Phone;

public class OperatingFactory {
    public OS getInstance(String str){
        if(str.equals("Android"))
            return new Android();
        else
            return new IOS();
    }
}
