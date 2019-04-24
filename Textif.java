public class Textif{
    public static void main(String args[]){
        double score =98.5565;
        if (score>60){
            System.out.println("优秀，你的成绩是"+ score + "分");
        }
        else if (score==60){
            System.out.println("刚好及格，你的成绩是"+ score + "分");
        }
        else{
            System.out.println("不及格，你的成绩是" + score +"分");
       }
    }
}
class text2{
    public static void main(String args[]){
        int ch=1;
        switch(ch){                     //switch只能用于判断内容，不能用于判断布尔值，也就是不能判断是否满足条件，但是可以支持判断字符串！字符串必须用""表示
            case 1:{
                System.out.println("这是1");
                break;
            }
            case 2:{
                System.out.println("这是2");
                break;
            }
            case 3:{
                System.out.println("这是3");
                break;
            }
            default:{
                System.out.println("没有这个数");
                break;
            }
        }
    }
}
class text3{
    public static void main(String args[]){
        String ch="hii";
        switch(ch){                     //switch只能用于判断内容，不能用于判断布尔值，也就是不能判断是否满足条件，但是可以支持判断字符串！字符串必须用""表示
            case "hi":{
                System.out.println("这是1");
                break;
            }
            case "2":{
                System.out.println("这是2");
                break;
            }
            case "3":{
                System.out.println("这是3");
                break;
            }
            default:{
                System.out.println("没有这个数");
                break;
            }
        }
    }
}
class text4{
    public static void main(String args[]) {
        int num=0;
        int sun=0;
        while(num<=100){
            sun+=num;
            num++;
        }
        System.out.println(sun);
        
    }

}
class text5{
    public static void main(String args[]){
        int sum=0;
        for (int num=0; num<=100;num++){
            sum+=num;
        }
        System.out.println(sum);

    }
}
class text6{
    public static void main(String args[]){
        int sum =0;
        int num =0;
        for(;num<=100;){        //封号一定要加，不能无法执行
            sum+=num;
            num++;
        }
        System.out.println(sum);
    }
}
class text7{           //乘法口诀表
    public static void main(String args[]){
        for (int a=1;a<=9;a++){
            for(int b=1;b<=a;b++){
                System.out.print(b+"*"+a+"="+(a*b)+"\t");
                /*\t是补全当前字符串长度到8的整数倍，最少1个最多8个空格

                补多少要看你\t前字符串长度
                
                比如当前字符串长度10，那么\t后长度是16，也就是补6个空格
                
                如果当前字符串长度12，此时\t后长度是16，补4个空格*/
            }
            System.out.println();
        }
        
    }
}
class text8{           //乘法口诀表
    public static void main(String args[]){
        for (int a=1;a<=9;a++){
            if (a<3){
                continue;//a小于3的情况下不执行，跳过，直到a>=3之后开始执行
            }
            for(int b=1;b<=a;b++){
                System.out.print(a+"*"+b+"="+(a*b)+"\t");
            }
            System.out.println();
        }
        
    }
}
class text9{           //乘法口诀表
    public static void main(String args[]){
        for (int a=1;a<=9;a++){
            if (a>4){
                break;//a>3的情况下结束循环内所有代码
            }
            for(int b=1;b<=a;b++){
                System.out.print(a+"*"+b+"="+(a*b)+"\t");
            }
            System.out.println();
        }
        
    }
}
class text10{                //方法调用

    public static void main(String args[]){
        printInfo();
        printInfo();
        }
        public static void printInfo () {   //定义方法名称，首字母为小写，第二个单词起，大写
            System.out.println("123");
    }
}
class text11{               //单数据调用
    public static void main(String args[]){
        get(10.25);

    }
    public static void get(double a){
        if (a >0){
            System.out.println("有钱，你的钱是" + a);
        }
        else{
            System.out.println("没钱");
        }
    }
}
class text12{
    public static void main(String args[]){
        double result=add(50.5,6);
        System.out.println(result);
        //第二种写法
        System.out.println(add(50,6));        //尽量用这种方法写，省行数
    }
    public static double add(double a , double b ){      //void是没有返回值的，有void，return就是用作结束
        return a + b ;
    }
}
class text13{
    public static void main(String args[]){
        //系统会根据不同的输入自动匹配方法
        System.out.println(add(10,5,5)+" "+add(5.5,5));
    }
    //方法的名称必须一样，其他的可以不同，一下为同意方法名称add()的三个不同重载
    public static int add(int a , int b){
        return a+b;
    }
    public static int add(int b , int c , int d){
        return b+c+d;
    }
    public static double add(double c , double d){
        return c+d;
    }
}