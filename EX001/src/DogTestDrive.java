/**
 * Created by jxu on 11/8/2016.
 */
public class DogTestDrive {
    public static void main(String[] args) {

        /** EX02
         *  Dog d = new Dog();
         d.setSize(6);
         System.out.println(d.getSize());
         Dog d2 = new Dog();
         d2.setSize(5);
         System.out.println(d.isBigger(d2));
         */

        int[] s ={1,6,8,3};
        DogPack dogs = new DogPack();
        dogs.makeArray(s.length);
        System.out.println(dogs.getSize());
        for (int i = 0 ; i<s.length ; i++){
            Dog d = new Dog();
            d.setSize(s[i]);
            dogs.addDog(i, d);
        }
        Dog biggest = dogs.biggestDog();
        System.out.println(biggest.getSize());
    }

}