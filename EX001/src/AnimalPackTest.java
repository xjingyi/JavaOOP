/**
 * Created by jxu on 11/30/2016.
 */
public class AnimalPackTest {
    public static void main(String[] args) {
        int[] s ={1,6,8,3};
        AnimalPack animals = new AnimalPack();
        animals.makeArray(s.length);
        for (int i = 0 ; i<s.length ; i++){
            int type=(int)(Math.random() * 2) + 0;
            if (type==1){
                Dog t = new Dog();
                t.setSize(s[i]);
                animals.addAnimal(i,t);
            }

            else {
                Cat t = new Cat();
                t.setSize(s[i]);
                animals.addAnimal(i,t);
            }


        }
        animals.makeNoise();
        Animal bigg = animals.biggestAnimal();
        System.out.println(bigg.getSize());


    }
}
