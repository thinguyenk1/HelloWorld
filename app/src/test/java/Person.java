/**
 * Created by Thinguyen on 6/22/2017.
 */

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(){
    }
    public Person(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getage(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setAddress(String address){
        this.address=address;
    }
}
