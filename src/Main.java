import lesson3.Human;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Human[] human = new Human[10];
        for (int i = 0; i < human.length; i++) {
            
            int arg = random.nextInt(50);

            char[] chars = new char[50];
            for (int j = 0; j < 50; j++) {
                chars[i] = (char) random.nextInt(150);
            }

            Human human = new Human(new String (chars), age);
            human [i] = human;
        }
    }
}