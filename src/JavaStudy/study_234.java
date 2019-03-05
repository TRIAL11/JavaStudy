package JavaStudy;

/*本节阐述 "==" 的意义：
        当两个引用指向同一对象或者同时为null时结果为true，否则为false*/
public class study_234 {
    public static void main(String[] args) {
        int value=1;
        String str1="ABC"+value;
        String str2="ABC"+value;
        String str3=str1;
        boolean equals12=(str1==str2);
        boolean equals13=(str1==str3);
        boolean equals23=(str2==str3);
        System.out.println("引用str1和str2相等" + equals12 + "  其中str1="+str1 +" str2=" +str2); //false
        System.out.println("引用str1和str3相等" + equals13 + "  其中str1="+str1 +" str3=" +str3); //true
        System.out.println("引用str2和str3相等" + equals23 + "  其中str2="+str2 +" str3=" +str3); //false
    }
}
