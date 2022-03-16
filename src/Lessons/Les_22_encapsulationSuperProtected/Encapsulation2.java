package Lessons.Les_22_encapsulationSuperProtected;

public class Encapsulation2 {

    //Изменение privet поля в случае если тип данных StringBuilder с помощью метода get
    final String gender;

    public Encapsulation2(String gender) {
        this.gender = gender;
    }

    private boolean clever;

    public boolean isClever(){
        return clever;
    }

    public void setClever(boolean clever){
        this.clever = clever;
    }

    private StringBuilder name;

//    public StringBuilder getName() { //неверный метод
//        return name;
//    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public void setName(StringBuilder name){
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

class Test2 {
    public static void main(String[] args) {

        Encapsulation2 en = new Encapsulation2("male");
        en.setName(new StringBuilder("Kolya"));
        en.getName().append("!!!!"); //Изменение privet поля name StringBuilder с помощью метода getName
                                        //Так быть не должно и поэтому мы должны изменить метод getName
        //после изменения метода getName наше поле name будет не тронутым т.к. в метод getName уже
        // создаётся копия поля name, поэтому если мы будем в вызове метода get делать какие-либо изменения,
        // то изменения будут делаться над копией, а не над нашим полем.
        System.out.println(en.getName());


    }

}
