public class Exercise32 {

    public static void main(String[] args) {
        for (String element : args
        ) {
            System.out.println(element);
        }
    }
    //in console
    //cd <Absolute Path>
    //for me:
    //cd C:\DigitalEDU\crystal\crystal\src\com\crystal\session3

    //C:\DigitalEDU\crystal\crystal\src\com\crystal\session3>javac Exercise32.java
    //C:\DigitalEDU\crystal\crystal\src\com\crystal\session3>java Exercise32 1 2 abc
    //output:
    //1
    //2
    //abc

    //C:\DigitalEDU\crystal\crystal\src\com\crystal\session3>java Exercise32 "mere" pere 32 a1
    //output:
    // mere
    // pere
    // 32
    // a1

}
