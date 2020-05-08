package net.togogo.bean;

/**
 * @author 麦锦文
 */
public class Student {

    private Integer id;
    private String name;
    private Cat cat;

    public Student() {
    }

    public Student(Integer id, String name, Cat cat) {
        this.id = id;
        this.name = name;
        this.cat = cat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }

    public void sayHello(){
        System.out.println("你好啊:" + name);
    }

    public void creatBean(){
        System.out.println("对象创建了");
    }

    public void destroyBean(){
        System.out.println("对象销毁了");
    }
}
