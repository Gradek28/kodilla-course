import java.util.Random;

public class RandomNumbers {


        Random random = new Random();
        int result = 0;
        int maximum = 5000;
        private int min;
        private int max;

        public void los() {
        int sum = 0;
        int temp = 0;
        this.min = 30;
        this.max = 0;
        while (sum < maximum){
            temp = random.nextInt(31);
            sum = sum + temp;
            if (temp > this.max) {
                this.max=temp;
            }
            if(temp<this.min){
                this.min=temp;
            }
        }

        }
        public int getMax(){
            return this.max;
        }
        public int getMin(){
            return this.min;
        }

    public static void main(String[] args) {
        RandomNumbers los = new
                RandomNumbers();
        los.los();
        System.out.println("Min:" + los.getMin());
        System.out.println("Max:" + los.getMax());
    }

}




