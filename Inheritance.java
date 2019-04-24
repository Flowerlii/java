public class Inheritance{
    public static void main(String args[]){
        Student st= new Student();
        st.setName("张三");
        st.setAge(50);
        st.setSchool("北京大学");
        System.out.println("姓名："+ st.getName()+ "，年纪是： "+ st.getAge() + "，学校是：" +st.getSchool());
        st.fun();
    }
}
class Person{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
}
class Student extends Person{
    private String school;
    public void setSchool(String school){
        this.school=school;
    }
    public String getSchool(){
        return this.school;
    }/*
    public void fun(){
        System.out.println(name);  //无法输出，因为Person中name为隐性（无法直接访问，只能间接访问）    
    }*/
    public void fun(){
        Person p = new Person();
        p.setName("李四");       //实例化对象完后可以调用父类中的属性
        System.out.println(p.getName());
    }
    
}