package Lessons.encapsulationSuperProtected_Les22;

public class Encapsulation {

    final String gender;

    public Encapsulation(String gender) {
        this.gender = gender;
    }

    private boolean clever;

    public boolean isClever(){
        return clever;
    }

    public void setClever(boolean clever){
        this.clever = clever;
    }

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    private int age;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age > 0) {
            this.age = age;
        }
    }

    private int weight;

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        if (weight > 0){
            this.weight = weight;
        }
    }


}

class Test {
    public static void main(String[] args) {

        Encapsulation en = new Encapsulation("male");
        en.setName("Kolya");
        en.setWeight(50);
        en.setAge(15);

        System.out.println(en.getName());
        System.out.println(en.getAge());
        System.out.println(en.getWeight());

    }


}
