public class Date4{
    public static void main(String args[]){
        int date[]=new int [] {9,6,4,5};
        Sort(date);
        for (int i=0; i<date.length; i++){
            System.out.print(date[i]);
        }
        Print(date);
    }
    public static void Sort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for (int b= 0; b<a.length-1; b++){
                if(a[b]>a[b+1]){
                int t=a[b];
                a[b]=a[b+1];
                a[b+1]=t;
                }
            }
        }
    }
    public static void Print(int temp[]){    //都会改变原始数据的内容，但是因为Sort方法调用的是数组length-1没办法跟输出方法合并写，否则无法输出数组最后一个数、。
        for (int i=0; i<temp.length; i++){
            System.out.print(temp[i]);
        }
        System.out.println();
    }
}
class Date5{
    public static void main(String args[]){
        int date[]=new int[]{1,2,3,4,5,6,7};
        int date2[]=new int[]{11,22,33,44,55,66,77,88};
        System.arraycopy(date,5,date2,6,2);
        Print(date2);
    }
    public static void Print(int temp[]){
        for (int i =0 ; i<temp.length; i++){
            System.out.print(temp[i]);
        }
        System.out.println();
    }
}
class Date6{
    public static void main(String args[]){
        int date[]= new int[] {3,6,2,1,8,9,8};
        java.util.Arrays.sort(date);             //简单升序排列函数调用
        Print(date);
    }
    public static void Print(int temp[]){
        for (int i = 0 ; i < temp.length ; i++){
            System.out.print(temp[i]);
        }
    }
}
class Date7{
    public static void main(String args[]){
        int date [] =new int [] {1,2,3,4,5,6,7,8,9,10};
        Sort(date);
        Print(date);
    }
    public static void Sort(int a[]){
        int c=a.length-1;
        for(int b=0; b< a.length/2; b++){
            int t = a[b];
            a[b]=a[c];
            a[c]=t;
            c--;
        }
    }
    public static void Print(int temp[]){
        for (int i=0 ; i<temp.length; i++){
            System.out.print(temp[i]);
        }
        System.out.println();
    }
}