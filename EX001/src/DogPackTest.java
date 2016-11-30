/**
 * Created by jxu on 11/30/2016.
 */
public class DogPackTest {
    public static void main(String[] args) {

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
