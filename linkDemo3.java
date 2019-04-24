public class linkDemo3{
    public static void main(String args[]){
        link all=new link();
        all.add("hello");
        all.add("world");
        all.print();
        System.out.println(all.size());

    }
}
class link{
    private class root{
        private String date;
        private root next;
        public root(String date){
            this.date=date;
        }
        public void adddate(root newroot){
            if(this.next==null){
                this.next=newroot;
            }else{
                this.next.adddate(newroot);
            }
        }
        public void printdate(){
            System.out.println(this.date);
            if(this.next !=null){
                this.next.printdate();
            }
        }
    }
    private root frist;
    private int count;
    public void add(String date){
        root newroot=new root(date);
        if (this.frist==null){
            this.frist=newroot;
        }else{
            this.frist.adddate(newroot);
        }
        this.count++;
    }
    public int size(){
        return this.count;
    }
    public void print(){
        if(this.frist!=null){
            this.frist.printdate();
        }
    }

}