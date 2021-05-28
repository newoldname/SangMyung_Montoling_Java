import java.util.ArrayList;

class Person{
    String name,tel;
    Person(String na, String te){
        this.name = na;
        this.tel = te;
    }
}

public class arrTest0515 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("123","123456789"));
        list.add(new Person("456","456456456"));
        list.add(new Person("789","789789789"));

        for (Person a : list){
            System.out.println(a.name + a.tel);
        }
    }
}
