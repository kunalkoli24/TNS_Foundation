package P22Hierarchical_Inheritance;


    public class Test_Inheritance {
        public static void main(String[] args) {
            Person p1=new Person();
            System.out.println("Person Detail..");
            System.out.println(p1);

            Person p;
            p=new Person("Mumbai","param");
            System.out.println("Person details : "+p);

            p=new Student("XYZ","pushkar","b",65.67f);
            System.out.println("Person details : "+p);

            p=new Employee("ABC","surve","computer",1234,4567888f);
            System.out.println("Person details : "+p);
        }

    }
