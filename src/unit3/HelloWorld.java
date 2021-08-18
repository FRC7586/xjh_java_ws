package unit3;

public class HelloWorld {
	public static void main(String[] args) {
        int year = 1949;
        byte b = 1;
        short s = 200;
        int i = 300;
        long l = 400;
        char c = 'z';//actually i want to type a chinese character in it but my eclipse isn't OK
        double d = 123.45;
        float f = 54.321f;
        boolean b1 = true;
        boolean b2 = false;
        String str = "Hello Java";
        
        long val = 26L;
        int decVal = 26;
        int hexVal = 0x1a;//16jinzhi starts with 0x
        int oxVal = 032;//8jinzhi starts with 0
        int binVal = 0b11010;
        System.out.println(oxVal);
        float f2 = 123.4f;
        double d1 = 123.4;
        double d2 = 1.234e2;
        char tab = '\t';
        char carriageReturn = '\r';//huiche
        char newLine = '\n';//huanhang
        char doubleQuote = '\"';
        char singleQuote = '\'';
        char backslash = '\\';//fanxiegang
        
        char c2 = 'A';
        short s1 = 80;
        c = (char) s;
        
        byte bi2 = 5;
        int i1 = 10;
        int i2 = 300; 
        bi2 = (byte) i1;
        System.out.println(bi2);
        bi2 =(byte) i2;
        System.out.println(bi2);
        System.out.println(Integer.toBinaryString(i2));
        //!@#$%^&*()
        
        double d3 = 3.14;
        float f1 = 2.769343f;
        int i3 = 365;
        byte b4 = 12;
        char c1 = 'c';
        boolean b3 = false;
        String str1 = "bukemiaoshu";
        
        int a_;
        //int a@;
        int a3;
        //int 8@;
        //int 9_;
        int X$;
        int y;
        int _$_;
        int $_$;
        //int $*$;
        int $1$;
        int _1_;
        //int _@_;
        //int a#;
        //int a";
        //int 123a";
        //int 123a_; i do not understand it very well
        int $123b_;
        /*
        letter, _, $ and number are acceptable in it
        
        more difficult and complicated knowledge is unnecessary
        for FRC
        */
    }
}