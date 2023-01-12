public class Main {
    public static void main(String[] args) {
//   Cat cat=new Cat();
//   cat.setName("Misha");
//   cat.setAge(2);
//   cat.setWeight(1.2);
//   System.out.println(cat.getName());
//   System.out.println(cat.getAge());
//   System.out.println(cat.getWeight());


//        Cat1 cat1=new Cat1();
//        cat1.setName("opo");
//        cat1.age=3;
//        cat1.setWeight(1.4);
//        System.out.println(cat1.getName());
//        System.out.println(cat1.age);
//        System.out.println(cat1.getWeight());
         Person1 person1=new Person1();
         person1.setName("Bakyt");
         Cat2 cat2=new Cat2();
         cat2.setName("misha");
         cat2.setAge(2);
         cat2.setWeight(1.2);
         cat2.setOwner("Bakyt");
        System.out.println(cat2.getName());
        System.out.println(cat2.getAge());
        System.out.println(cat2.getWeight());
        System.out.println(cat2.getOwner());

        cat2.hasOwner("Bakyt");




    }
}