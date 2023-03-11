public class Person {

    public String name;
    public double age;
    public double height;

    public Person(String name,double age, double height){
    this.name = name;
    this.age = age;
    this.height = height;
        }

    public static void main(String[] args) {
        Person Adam = new Person("Adam",40.5,178);
        if (Adam.age > 30 && Adam.height > 160) {
            System.out.println("User is older than 30 and taller than 160cm");
        }else{
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }


    }




