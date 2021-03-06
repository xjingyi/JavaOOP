/**
 * Created by jxu on 11/12/2016.
 */

import java.util.*;

public class DogPack {
    /*private Dog[] dogs;


    public void makeArray(int s) {
        dogs = new Dog[s];
    }

    public void addDog(int i, Dog d) {
        if (i>=0 && i<dogs.length) {
            dogs[i] = d;
        }
        else {
            System.out.println("Index is not valid - JX");
        }
    }

    public Dog getDog(int i) {
        return dogs[i];
    }

    public Dog biggestDog(){
        Dog temp = dogs[0];
        for (int i = 1; i<dogs.length ; i++){
            if (dogs[i].isBigger(temp)==true){
                temp = dogs[i];
            }
        }
        return temp;
    }
    */
    private ArrayList<Dog> dogs;
    public void makeArray(int s) {
        dogs = new ArrayList<Dog>(s);
    }
    public int getSize() {
        return dogs.size();
    }
    public void addDog(int i, Dog d) {
        dogs.add(i , d);
    }

    public Dog biggestDog(){
        Dog temp = dogs.get(0);
        for (int i = 1; i<dogs.size() ; i++){
            if (dogs.get(i).isBigger(temp)==true){
                temp = dogs.get(i);
            }
        }
        return temp;
    }
}
