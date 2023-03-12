import java.util.Random;

public class RandomNumber1 {
    public static void main(String[] args) {

        int max = 5000;

        Random random = new Random();
        int result = 0;
        int sum = 0;
        for (int i = 0; i <= max; i++){
            if (sum < max){
                int temp = random.nextInt(30);
                sum = sum + temp;
                System.out.println(sum);
            }
        }
    }
}
