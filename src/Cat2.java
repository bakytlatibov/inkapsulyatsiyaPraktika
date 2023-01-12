public class Cat2 {
    private String name;
    private int age;
    private  double weight;
    private String owner;
    private Person1 person=new Person1();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Person1 getPerson1() {
        return person;
    }

    public void setPerson( Person1 person) {
        this.person = person;
    }
    public void hasOwner(String name){
        if (name==person.getName()){
            System.out.println((name)+"   ээси бар  "+(name)+"  адамдын аты");

        }else {
            System.out.println("Бездомный кот");
        }



    }
}
