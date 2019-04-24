public class Text15{
    public static void main(String args[]){
        Text16 text16 = new Text16();
        text16.setPrice(66);
        text16.setName("随便");
        text16.getInfo();
    }
}
class Text16{
    private double price;
    private String name;
    public void setPrice(double p){   //p是输入值，如果写p=price ,那么返回值就变成price的默认值
        price=p;
    }
    public void setName(String n){
        name=n;
    }
    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public void getInfo(){
        System.out.println("书本的名称是" + name +"书本的价格是" + price);
    }
}