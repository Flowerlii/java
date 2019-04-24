public class Demo2{
    public static void main(String args[]){
        Demo5 mo5 = new Demo5("dsfa",-1,12,"sdfas");
        mo5.setName("abc");
        System.out.println(mo5.getInfo());
        System.out.println(new Demo5().getInfo());  //匿名方法
    }
}
class Demo5{
    private String name;
    private double age;
    private int high;
    private String fat;
    public Demo5(){

    }
    public Demo5(double a){
        age =a ;
    }
    public Demo5(String n, double a, int h){
        setName(n);               //调用了setName(n)这个方法，跟setName(n)中的name=n这个方法一样
        setAge(a);
        setHigh(h);
    }
    public  Demo5(String n , double a , int h, String f){
        setName(n);
        setAge(a);
        setHigh(h);
        setFat(f);
    }
    public void setName(String n){
        name=n;
    }
    public void setAge(double a){
        if(a>0){
            age=a;
        }
        
    }
    public void setHigh(int h){
        high=h;
    }
    public void setFat(String f){
        fat=f;
    }
    public String getName(){
        return name;
    }
    public double getAge(){
        return age;
    }
    public int getHigh(){
        return high;
    }
    public String getFat(){
        return fat;
    }
    public String getInfo(){             //尽量不要用void 无返回对象，用String + return;
       return name + age + high + "肥不肥"+fat;
    }
}