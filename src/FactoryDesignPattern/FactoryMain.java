package FactoryDesignPattern;

import Phone.OS;
import Phone.OperatingFactory;

public class FactoryMain {
    public static void main(String args[]){
        OperatingFactory Op = new OperatingFactory();
        OS obj = Op.getInstance("Android");
        obj.spec();
    }
}
