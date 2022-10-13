package Exercise9;

public class Person {
    private String name;
    private String streetName;
    private String adress;
    private int age;
    private int weight;
    private int height;

    public Person(String name, String streetName, String adress, int age, int weight, int height) {
        this.name = name;
        this.streetName = streetName;
        this.adress = adress;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getAdress() {
        return adress;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", streetName='" + streetName + '\'' +
                ", adress='" + adress + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
