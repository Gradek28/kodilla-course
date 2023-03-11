public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensvie");
            }

        }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("This notebook is light");
        } else if (this.weight > 600 && this.weight <= 1200) {
            System.out.println("This notebook is quite heavy");
        } else if (this.weight > 1200) {
            System.out.println("This notebook is heavy");
        }

        }
        public void checkYear() {
            if (this.year <= 2012 & this.price <=600) {
                System.out.println("This Notebook is old and cheap");
            } else if (this.year > 2015 && this.year <= 2020 & this.price > 600 && this.price <= 1000) {
                System.out.println("This notebook is pretty new and in good price");
            } else if (this.year > 2019 & this.price > 1000) {
                System.out.println("This notebook is new and quite expensive");
            }
        }
    }

