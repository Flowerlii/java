public class lei{
    public static void main(String args[]){
    lei1 lee=new lei1();  //新增一个湛内存和堆内存
    lei1 lee1=new lei1();
    /*第二种写法
    lei1 lee1=null;
    lee1=new lei1();     这句如果不写就是空指向异常，lee1找不到堆内存内容，运行的时候系统报错 NULLPointerExcepetion
    */
    lee.title="随便名字";   //修改堆内存
    lee.price=55.5;
    lee1.title="第二个名字";
    lee1.price=60;
   //只修改了地址指向，并不是修改了lee1堆内存的内容，堆内存内容剩下的为垃圾，会不定期被垃圾收集器(GC)回收，回收完之后释放内存。在代码开发中尽量需减少垃圾的制造。
    lee1.price=100;
    lee.getInfo();    //调用类中getInfo()方法
    lee1.getInfo();
    }
}
class lei1{           //定义一个新类
    String title;
    double price;
    public void getInfo(){  //非主类不写static
    System.out.println("图书的价格" + price + "图书的名称" + title);
        }
}