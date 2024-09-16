package HyperSkills;
import java.util.Random;



public class Main {

    public static void main(String[] args) {

        MeClass c = new MeClass();

        Random random = new Random(100000);
        System.out.println(random.nextInt(5)); 
    }
}


class MeClass implements Flying {
    public int getHeight() {
        return 100; 
    }
}

interface Flying {
    // returns height of flying in meters
    int getHeight();

    // implements a default method getHeightInKm that returns height of flying in km as int type
    default int getHeightInKm () {
        return getHeight() / 1000;
    }
}