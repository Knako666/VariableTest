/**
 * 测试变量
 * @author  HYT
 */


public class VariableTest {



    public static void main(String[] args){



        int year=1948;  //定义一个名为“year”的 int(整型)变量，给其赋值为1949
        /*
        Java中有8种基本数据类型：
                                                    整型（4种）：byte(8位/1字节)、short(16位/2字节)、int(32位/4字节)、long(64位/8字节)
                                                    浮点型（2种）：float(32位/4字节)、double(64位/8字节)
                                                    字符串型（1种）：char(16位/2字节)
                                                    布尔型（1种）：boolean(1位,只有“false”、"true"两个值)

         */


        //测试整型
        byte b = 1;
        short s = 200;
        int i = 300;
        long l = 400;

       //如果试图给byte类型的变量赋予超出其范围的值，就会产生编译错误
       // byte b2 = 200;


       //测试浮点型
        double d = 123.45;

        //该行会出现编译错误，因为54.321默认为是double型，长度比float长
        //float f = 54.321;     (在后面加上'f'就可以定义为float)

        float f2 = 54.321f;



        //测试字符型
        char c = '中';
        //char 只能存放一个字符，超过一个字符就会产生编译错误
        //char c2 = '中国'; //报错
        //char c3 = 'ab'; //报错


        //测试布尔型
        boolean b1 = true;
        boolean b2 = false;

        // 虽然布尔型真正存放的数据是0(false) 1(true)
        // 但是，不能直接使用0 1 进行赋值
        //boolean b3 = 1;//报错




        /*String类型其实并不是基本类型，但是它是如此广泛的被使用，常常被误以为是一种基本类型。*/
        //测试String类型
        String str = "Hello Java";



        /*分别为如下值，找到合适的类型来定义
        3.14
        2.769343
        365
        12
        '吃'
        false
        "不可描述"*/


        double t1=3.14;
        double t2=2.769343;
        int t3=365;
        int t4=12;
        char t5='吃';
        boolean t6=false;
        String t7="不可描述";

        System.out.println("t1="+t1+"\nt2="+t2+"\nt3="+t3+"\nt4="+t4+"\nt5="+t5+"\nt6="+t6+"\nt7="+t7);




        //变量 字面值
        //给基本类型的变量赋值的方式叫做 字面值
        System.out.println("\n************************************************************************************************");

        //整数 字面值
        //当以l或者L结尾的时候，一个整数字面值是long类型，否则就是int类型。 建议使用大写的L而非小写的l，因为容易和1混淆。
        //byte,short,int和long的值都可以通过int类型的字面值来创建。整数的字面值可以用如下四种进制来表示：
        //十进制: 基 10, 包含从0-9的数字，平常用的就是这种
        //十六进制: 基 16, 包含从0-9的数字，和从A-F的字母。
        //八进制: 基 8, 包含从0-7的数字
        //二进制: 基 2, 包含0和1。（从 JAVA7开始就可以创建 二进制的字面值了）

        long val = 26L; //以L结尾的字面值表示long型
        int decVal = 26; //默认就是int型
        int hexVal = 0x1a; //16进制
        int oxVal = 032; //8进制
        int binVal = 0b11010; //2进制
        System.out.println(oxVal);


        //浮点数 字面值
        //当以f或者F结尾的时候，就表示一个float类型的浮点数，否则就是double类型（以d或者D结尾，写不写都可以）。
        //浮点数还可以用E或者e表示（科学计数法）
        //e2表示10的二次方，即100
        //1.234e2 = 1.234x100

        float f1 = 123.4F;// 以F结尾的字面值表示float类型
        double d1 = 123.4;// 默认就是double类型
        double d2 = 1.234e2;// 科学计数法表示double


        //字符和字符串字面值
        //字符的字面值放在单引号中
        //字符串的字面值放在双引号中
        //需要注意的是，\表示转义，比如需要表示制表符，回车换行，双引号等就需要用 \t \r \n \" 的方式进行

        String name = "盖伦";
        char a= 'c';

        //以下是转义字符
        char tab = '\t'; //制表符
        char carriageReturn = '\r'; //回车
        char newLine = '\n'; //换行
        char doubleQuote = '\"'; //双引号
        char singleQuote = '\''; //单引号
        char backslash = '\\'; //反斜杠


        //定义如下变量，然后为每种不同类型的变量赋予合法的字面值
        //byte b3;
        //short m;
        //int i;
        //long l;
        //float f;
        //double d3;
        //char c1;
        //String str1;


        byte b3 = 2;
        short m = 5;
        int i2 = 10;
        long l1 = 543L;
        float f = 133.43F;
        double d3 = 45.23;
        char c1 = '好';
        String str1 = "河山大好";




        //变量 类型转换
        System.out.println("**********************************************");
        //转换规则：
        //精度高的数据类型就像容量大的杯子，可以放更大的数据
        //精度低的数据类型就像容量小的杯子，只能放更小的数据
        //小杯子往大杯子里倒东西，大杯子怎么都放得下
        //大杯子往小杯子里倒东西，有的时候放的下，有的时候就会有溢出
        //需要注意的一点是
        //虽然short和char都是16位的，长度是一样的
        //但是彼此之间，依然需要进行强制转换


        char c2 = 'A';
        short s2 = 80;

        //虽然short和char都是16位的，长度是一样的
        //但是彼此之间，依然需要进行强制转换
        c2 = (char) s2;
        //直接进行转换，会出现编译错误
        //s2 = c2;    //报错



        //低精度向高精度转换
        //l 是long类型的，其类型长度是64位
        //i 是int类型的，其类型长度是32位
        //所以l的精度，比i的精度要高
        //l = i;
        //把i的值赋给l， 首先l和i彼此的类型是不一样的，那么能否转换就取决于彼此的精度
        //这个例子，是低精度向高精度转换 是可以正常转换的
        //换句话说，int比较小，要放进比较大的long,随便怎么样，都放的进去

        long l2 = 50;
        int i3 = 50;

        //int比较小，要放进比较大的long,随便怎么样，都放的进去
        l2 = i3;





        //高精度向低精度转换
        //b的类型是byte,其长度是8，最大只能放127
        //i1 的类型是int, 其长度是32,最大，反正就是很大了，超过127
        //所以， 把int类型的数据转成为byte类型的数据，是有风险的
        //有的时候是可以转换的，比如 b = i1 (i1=10);
        //有的时候不可以转换 比如 b= i2 (i2=300) 因为放不下了
        //编译器就会提示错误
        //这个时候就只能采用强制转换，强制转换的意思就是，转是可以转的，但是不对转换之后的值负责。 风险自担，后果自负


        byte b4 = 5;
        int i1 = 10;
        int i4 = 300;

        b4 = (byte) i1;
        //因为i1的值是在byte范围之内，所以即便进行强制转换
        //最后得到的值，也是10
        System.out.println(b4);

        //因为i2的值是在byte范围之外，所以就会按照byte的长度进行截取
        //i2的值是300，其对应的二进制数是 100101100
        //按照byte的长度8位进行截取后，其值为 00101100 即44
        b4 =(byte) i4;
        System.out.println(b4);

        //查看一个整数对应的二进制的方法：
        System.out.println(Integer.toBinaryString(i4));





        //练习类型转换：
        //short a3 = 1;
        //short b5 = 2;
        //那么 a3+b5 是什么类型？
        
        
        short a3 = 1;
        short b5 = 2;
        int b6=a3+b5;   //a3+b5位int类型，short类型报错
        //数字类型的运算中，多个相同的类型参与运算，变量要先转换为相对应的数据类型的默认类型
        System.out.println(b6);





        /*int a_;
        int a@;
        int a4;
        int 8@;
        int 9_;
        int X$_;
        int y;
        int _$_;
        int $_$;
        int $*$;
        int $1$;
        int _1_;
        int _@_;
        int a#;
        int a";
        int 123a";
        int 123a_;
        int $123b_; */




    }
}
