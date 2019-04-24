public class ThisDemo{
    public static void main(String args[]){
        ThisDemo1 tis = new ThisDemo1("张三",50,40);   
        System.out.println(tis.getInfo());    
    }
}
class ThisDemo1{
    private String name;
    private double sal;
    private int age;
    public ThisDemo1(){            //至少要一个构造方法没有使用this()调用其他构造情况，保留出口;
        System.out.println("二十行代码");
    }
    public ThisDemo1(String name){
        this();//调用本类的无参构造；
        this.name=name;               //this 便是类中的属性，不是变量中的name,属性与变量重名时候使用，每一次都必须写this;
    }
    public ThisDemo1(String name,double sal){
        this(name);//调用本类单仓参构造；
        setSal(sal);
    }
    public ThisDemo1(String name , double sal,int age){  
        this(name,sal);
        setAge(age);
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSal(double sal){
        this.sal=sal;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public double getSal(){
        return this.sal;
    }
    public int getAge(){
        return this.age;
    }
    public String getInfo(){
        return "名字是 "+ this.name + "  薪资为： "+ this.sal + "  年纪为： " + this.age;
    }
}