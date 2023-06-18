import Builders.IPhoneBuilder;
import Builders.Iphone;
import Builders.PhoneBuilder;
import Factories.IphoneFactory;

public class Main2 {
    public static void main(String[] args){
        IphoneFactory iphoneFactory = new IphoneFactory();
        Iphone iPhone = iphoneFactory.createIphone(new IPhoneBuilder());
        System.out.println(iPhone.getCameraPixels());
    }

}
