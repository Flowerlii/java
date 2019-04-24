

public class StringDemo{
    public static void main(String args[]){
        String a="Hello";
        String b= new String("hello");
        String c= b;
        System.out.println(a==b);   //  ==只是比较内存地址，并不比较内存中的内容；
        System.out.println(a==c);
        System.out.println(b==c);
        System.out.println(a.equals(c));//.equals比较的是内存中的内容； 区分大小写
        System.out.println(a.equalsIgnoreCase(c));//不区分大小写；
        System.out.println(a.compareTo(c));//比较a跟c的编码大小，区分大小写；（只有String类具备这个判断大小的功能，其他的不具备）
        System.out.println(a.compareToIgnoreCase(c));//比较a跟c的编码大小，不区分大小写；
    }
}
class StringDemo1{
    public static void main(String args[]){
        String a="hello";
        String b= "hello";
        String c= b;
        System.out.println(a==b);   //  ==堆内存跟栈内存相同，这是堆内存自动引用
        System.out.println(a==c);
        System.out.println(b==c);
        System.out.println(a.equals(c));//.equals比较的是内存中的内容； 
    }
}
class StringDemo2{
    public static void main(String args[]){
        String date="145615615dfg61";
        if(isNumber(date)){
            System.out.println("这是个全数字");
        }
        else{
            System.out.println("这是个不是全数字");
        }

    }
    public static boolean isNumber(String temp){
        char[] date=temp.toCharArray();   //将字符串转化为字符数组，这样就可以取出每一个内容；
        for(int x=0; x<date.length; x++){
            if(date[x]<'0' ||date[x]>'9'){
                return false;  //一个部位数字，后面的都不判断了
            }
        }
        return true;
    }
}
class StringDemo3{
    public static void main(String args[]){
        String date="hello";
        Sort(date);
    }
    public static void Sort(String temp){
        byte[] a=temp.getBytes();     //将字符串转换为字节数组。
        for(int x=0 ; x<a.length; x++){
            a[x]-=32;                  //字母大小写数据先插32个字节。
        }
        System.out.println(new String(a));  //new String (a) 是将a转换回String类型。
        System.out.println(new String(a,2,2));// 只转换a中第二个开始，2长度的数据。
    }
}
class StringDemo4{
    public static void main(String args[]){
        String str="helloworld";
        System.out.println(str.indexOf("world"));//返回查找字符串中符合条件单词中的字母第一个的索引，如果没满足的就返回-1,索引跟实际位置需要+1
        System.out.println(str.indexOf("l"));//如果有多个，仅返回第一个索引位置；
        System.out.println(str.indexOf("l",3));//从第3个索引开始查，第四个指的是hell后开始查
        System.out.println(str.lastIndexOf("l"));//从后开始查l的位置，返回的索引位置是从前到后的；
        System.out.println(str.lastIndexOf("l",4));//从第4个索引位置开始，由后往前查；
        System.out.println(str.contains("l"));//直接判断是否有l，返回布尔值；（最方便。jdk1.5之后才有）
        System.out.println(str.startsWith("h"));//判断是否以h开头；
        System.out.println(str.startsWith("e",1));//判断从第一个索引开始是否是以e开头；
        System.out.println(str.endsWith("d"));//判断是否以d结尾；
        System.out.println(str.endsWith("l"));//没有办法判断从某位索引开始是否以l结尾；
        String str2=str.replaceAll("l","*");
        System.out.println(str2);             //将str中所有的l替换成*；  返回值为String
        System.out.println(str.replaceFirst("l","*"));//将str中首个l替换成*  返回值为String
        System.out.println(str.substring(5));//从第5个索引开始截取到最后；
        System.out.println(str.substring(5,6));//从第5个索引截取到第6个；（不包含第6个索引），不能用负数作为开始点截取。
    }
}
class StringDemo5{ 
    public static void main(String args[]){             //有些拆不开，比如正则系列，如果抢强制要拆使用（"\\."）转义后拆
        String str="hello word hi";
        String date[]=str.split("o");    //“”双引号中有空格，按空格拆分所有的字符串，如果没有东西，则按字符拆分所有的字符串,被拆封的内容不会出现。出现结果为空
        for (int i=0; i<date.length; i++){
            System.out.println(date[i]);
        }
        Chai(str);
    }
    public static void Chai(String a){
        String date2[]=a.split(" ",25);       //2表示最多拆分2个
        for (int x=0; x<date2.length; x++){
            System.out.println(date2[x]);
        }
    }
}
class StringDemo6{                //字符串多次拆分
    public static void main(String args[]){
        String str="张三:55|李四:66|王五:99";
        Chai(str);

    }
    public static void Chai(String a){
        String date[]=a.split("\\|");
        for (int x=0; x<date.length; x++){
            String date2[]=date[x].split(":");
            for(int b=0; b<date2.length; b++){
                System.out.println(date2[b]);
            }
            System.out.println("姓名"+date2[0]+"成绩"+date2[1]);
        }
    }
}
class StringDemo7{
    public static void main(String args[]){
        String str="*/*-/Hello";
        String str2="   helloo     word   ";
        int a=str2.length();   //取得字符串长度   带（）与date.length的区别，用于限制输入长度
        System.out.println(a);
        System.out.println(str.toUpperCase());  //转化大写，非字母不会转化
        System.out.println(str.toLowerCase());      //转化小写，非字母不会转化
        System.out.println(str2.trim());//取出字符串最开始喝最后的所有空格,应用实例如：输入框中误输入空格，可以剔除

    }
}