public class Grades {
    private int[] grades;
    private int size;


    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int readLast(){
        return this.grades[this.size - 1];
    }

    public float average(){
        float sum = 0;
        if (this.size == 0){
            return 0;
        } else {
            for (int i=0;i < this.size; i++) {
                sum = sum + grades[i];
            }
            return sum / this.size;
        }
    }
}
