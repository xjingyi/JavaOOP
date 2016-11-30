/**
 * Created by jxu on 11/8/2016.
 */

/**
public class DogsTestDrive {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[4];

        for (int i = 0; i <= 3; i++) {
            dogs[i] = new Dog();
        }
        int temp = 0;
        int bigSize = 0;
        int bigDog = 0;
        dogs[0].name = "SnowWhite";
        dogs[0].breed = "Labrador Retriever";
        dogs[0].size = 8;
        dogs[1].name = "John";
        dogs[1].breed = "German Shepherd";
        dogs[1].size = 7;
        dogs[2].name = "Penny";
        dogs[2].breed = "Yorkshire Terrier";
        dogs[2].size = 2;
        dogs[3].name = "Cookie";
        dogs[3].breed = "Siberian Husky";
        dogs[3].size = 6;
        dogs[1].bark();


        for (int i = 0; i <= 3; i++) {
            dogs[i].bark();
        }

        for (int i = 0; i <= 3; i++) {
            temp = dogs[i].size;
            if (temp > bigSize) {
                bigSize = temp;
                bigDog = i;
            }
        }

        System.out.print("The biggest dog is");
        System.out.println(dogs[bigDog].name);

        System.out.print("The biggest dog found by the function is");
        System.out.println(BiggestDog(dogs).name);
    }

    public static Dog BiggestDog(Dog dogs[]){
        int temp = 0;
        int bigSize = 0;
        int bigDog = 0;
        for (int i = 0; i < dogs.length; i++) {
            temp = dogs[i].size;
            if (temp > bigSize) {
                bigSize = temp;
                bigDog = i;
            }
        }
        return  dogs[bigDog];
    }
}
 */

