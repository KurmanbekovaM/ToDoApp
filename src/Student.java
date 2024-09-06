public class Student{
    String name;
    int age;

    public Student(){

    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void work(){
        System.out.println(this.name + " is working");
    }
}