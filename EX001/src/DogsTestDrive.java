/**
 * Created by jxu on 11/8/2016.
 */
public class DogsTestDrive {
    public static void main(String[] args){
        Dog[] dogs = new Dog[4];
        int count=-1;
        while(count<4){
            dogs[count] = new Dog();
        }
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


        for (int i =-1; i <= 2; i++) {
            Dog temp = new Dog();
        }



    }

}
