public class Compare{
    public static void main(String args[]){
        Book book= new Book("JAVA",80);
        Book book1= new Book("JAVA",80);
        if(book==book1){                              //直接比较识比较堆内存，两个new开辟了两个内存，所以不会相等
            System.out.println("这是同一个对象");
        }else{
            System.out.println("这不是同一个对象");
        }
        if(book.compare(book1)){
            System.out.println("这是同一个对象");
        }else{
            System.out.println("这不是同一个对象");
        }



    }
}
class Book{
    private String  title;
    private double price;
    public Book(String title, double price){
        setTitle(title);
        setPrice(price);
    }
    public String getInfo(){
        return title+price;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }
    public boolean compare(Book book){
        if(book==null){ 
            return false;
        }
        if(this==book){
            return true;
        }
        if(this.title.equals(book.title)&&this.price==(book.price)){
            return true;
        }else{
            return false;
        }
    }

}