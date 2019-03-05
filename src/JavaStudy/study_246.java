package JavaStudy;

class Test{
    String str;
    Test(){};
    void noUseElse(String str){
        this.str="A" +str;
    }
}
public class study_246 {
    public static void main(String[] args) {
        String str="OOPS";
        noUse(str);
        System.out.println(str); //输出为OOPS
        Test test=new Test();
        test.noUseElse(str);
        System.out.println(str);
    }
     static void noUse(String str){
        str = "O"+str;
    }
}
