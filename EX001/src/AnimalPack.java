import java.util.ArrayList;

/**
 * Created by jxu on 11/30/2016.
 */
public class AnimalPack {
    private ArrayList<Animal> animals;
    public void makeArray(int s) {
        animals = new ArrayList<Animal>(s);
    }
    public int getSize() {
        return animals.size();
    }
    public void addAnimal(int i, Animal ani) {
        animals.add(i , ani);
    }

    public Animal biggestAnimal(){
        Animal temp = animals.get(0);
        for (int i = 1; i<animals.size() ; i++){
            if (animals.get(i).isBigger(temp)==true){
                temp = animals.get(i);
            }
        }
        return temp;
    }
    public void makeNoise(){
        for (Animal temp: animals){
            temp.makeNoise();
        }


    }
}
