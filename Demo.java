public class Demo{
    public static void main(String args[]){
        Demo1 mo = new Demo1("dsfasdf");
        mo.getInfo();
        new Demo1("dsfasdf",99.6).getInfo();//匿名对象
    }
}
class Demo1{
    private String title;
    private double price;
    public Demo1(){
        System.out.println("请输入");
    }
    public Demo1(String t  ){
        title=t;
    
    }
    public Demo1(double p ){
        setPrice(p);
    }
    public Demo1(String t , double p ){
        setTitle(t);
        setPrice(p);
    }
    public void setTitle(String t){
        title=t;
    }
    public void setPrice(double p){
        price=p;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }

    public void getInfo(){      //void 无返回值， 如果跟String就是有返回值，必须用return,主类输出System.out,println();
       System.out.println( "书本的价格为   " + price + "书本的名称为   " + title) ;
    }
}