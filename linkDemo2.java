public class linkDemo2{
    public static void main(String args[]){
       Link link= new Link();
       link.add("hello");
       link.add("world");
       link.print();
    }
}
class Link{                //类名称与文件夹中已有类名称重复，系统报错
    private Date a;
    public void add(String date){
        Date b= new Date(date);
        if(this.a == null){
            this.a=b;
        }else{
            this.a.addDate(b);
        }
    }
    public void print(){
        if(this.a!=null){
            this.a.printDate();
        }
    }
    public void setA(Date a){
        this.a=a;
    }
    public Date getA(){
        return a;
    }
}
class Date{
    private String date;
    private Date next;
    public Date(String date){
        setDate(date);
    }
    public String getInfo(){
        return this.date;
    }
    public void addDate(Date b){
        if(this.next==null){
            this.next=b;
        }
        else{
            this.next.addDate(b);
        }
    }
    public void printDate(){
        System.out.println(this.date);
        if(this.next!=null){
            this.next.printDate();
        }
    }
    public void setDate(String date){
        this.date=date;
    }
    public String getDate(){
        return this.date;
    }
    public void setNext(Date next){
        this.next=next;
    }
    public Date getNext(){
        return this.next;
    }
}
