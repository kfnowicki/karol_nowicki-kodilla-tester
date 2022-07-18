public class RandomNumbers {
    int max;
    int range;
    int maxValue;
    int minValue;

    public static void main(String[] args){
        RandomNumbers randomNum = new RandomNumbers(30,5000);
        randomNum.randomize();
        System.out.println("Największa wylosowana liczba to: " + randomNum.getMaxValue());
        System.out.println("Najmniejsza wylosowana liczba to: " + randomNum.getMinValue());
    }


    public RandomNumbers(int range, int max){
        this.range = range;
        this.max = max;
    }

    public void randomize(){
        int randomNum = 0;
        int sum = 0;
        maxValue = 0;
        minValue = this.max;
        int temp;
        while (sum < max) {
            temp = (int)(Math.random()*(this.range + 1));
            if (temp > maxValue) {
                maxValue = temp;
            }
            if (temp < minValue){
                minValue = temp;
            }
            sum = sum + temp;
        }
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }
}
