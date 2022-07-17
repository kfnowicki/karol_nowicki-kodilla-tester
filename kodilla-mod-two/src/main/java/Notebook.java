public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook (int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap");
        } else if (this.price >= 600 && this.price <=1000) {
            System.out.println("This price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight <= 1000) {
            System.out.println("This notebook is light");
        } else if (this.weight > 1000 && this.weight < 1500 ){
            System.out.println("This is medium weight");
        } else {
            System.out.println("This notebook is heavy");
        }
    }

    public void checkYear() {
        if (this.year <= 2010) {
            System.out.println("This notebook is old");
        } else if (this.year > 2010 && this.year < 2015){
            System.out.println("This is still not-so-old notebook");
        } else if (this.year >= 2015 && this.year < 2020) {
            System.out.println("This notebook is almost new");
        } else {
            System.out.println("This notebook is fresh");
        }
    }
}
