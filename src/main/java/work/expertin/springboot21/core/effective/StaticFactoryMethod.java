package work.expertin.springboot21.core.effective;

public class StaticFactoryMethod {


    public static class Person {
        private String name;
        private Integer age;

        private Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public static Person newPerson(String name, Integer age) {
            if (name == null || age == null) {
                return new Person("",0);
            }

            if (age < 18) {
                return new Child(name, age);
            } else {
                return new Audlt(name, age);
            }
        }
    }

    public static class Audlt extends Person {
        public Audlt(String name, Integer age) {
            super(name, age);
        }
    }

    public static class Child extends Person {
        public Child(String name, Integer age) {
            super(name, age);
        }
    }

    public static void main(String[] args) {
        Person felix = Person.newPerson("Felix", 30);
        System.out.println("Felix Audit? :" + (felix instanceof Audlt));

        Person somebody = Person.newPerson("Somebody", 10);
        System.out.println("Somebody Audit? :" + (somebody instanceof Audlt));
    }


}
