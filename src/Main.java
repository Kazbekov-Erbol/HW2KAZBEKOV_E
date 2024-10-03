import java.util.Random;

public class Main {
    public static String permission(int age, int temperature) {
        if (age >= 20 && temperature <= 45 && temperature >= -20 && temperature <= 30) {
            return "можно идти гулить";
        } else if (age < 20 && temperature <= 0 && temperature >= 28) {
            return "можно идти гулять";
        } else if (age < 45 && temperature >= -10 && temperature <= 25) {
            return "можно идти гулять";
        } else {
            return "оставайтесь дома";
        }
    }
     public static void main(String[] args) {

         for (int i = 0; i < 5; i++) {
             int age = generateRandomAge();
             int temperature = getRandomTemperature();
             System.out.println("возраст: " + age + ",температура:" + temperature + " - " + permission(age, temperature));
         }
    }
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static int getRandomTemperature() {
        Random random = new Random();
        return random.nextInt(66) -35;
    }
}