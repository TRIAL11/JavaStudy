package JavaStudy;

/*对象在创建过程中肯定会调用类的构造方法
* */
class CountObject{
    static int objCount=0;
    CountObject(){
        objCount++;
    }
}
public class study_243 {
    public static void main(String[] args) {
        CountObject countObject1=new CountObject();
        System.out.println("现在创建了"+ CountObject.objCount +"个CountObject类"); //如果去除static则objCount报错
        CountObject countObject2=new CountObject();
        CountObject countObject3=new CountObject();
        System.out.println("现在创建了"+ CountObject.objCount +"个CountObject类");
    }
}
