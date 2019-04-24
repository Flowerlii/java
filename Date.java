public class Date{
    public static void main(String args[]){
        int a []= new int [5];   //开辟了一个长度为3的数组，无内容，int 默认为0
        a[0]=1;
        a[1]=2;
        a[2]=3;
        int b[]=a;
        b[0]=4;
        a[0]=5;
        System.out.println(b [0]);  //超出范围报错：Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        for (int x=0; x<a.length; x++){
            System.out.println(a[x]);
        }
    }
}
class Date2{
    public static void main(String args[]){
        int a[]=new int[]{1,2,3,4};
        for(int x=0; x<a.length; x++){
            System.out.println(a[x]);
        }
    }
}
class Date3{
    public static void main(String args[]){
        int a[][]=new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9,0,5}
        };
        for (int x = 0 ; x<a.length; x++){
            for (int b=0 ; b<a[x].length; b++){
                System.out.print(a[x][b]+ "\t");
            }
            System.out.println();
        }
    }
}