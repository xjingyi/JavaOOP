/**
 * Created by jxu on 11/30/2016.
 */
public class AnimalTest {
    public static void main(String[] args) {

         Dog dogg = new Dog();
        dogg.setSize(4);
         dogg.makeNoise();
         Cat catt = new Cat();
        catt.setSize(6);
         catt.makeNoise();
        boolean size = dogg.isBigger(catt);
        System.out.println(size);

}
}
