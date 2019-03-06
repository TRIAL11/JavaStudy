package JavaStudy;
//CarBase
class CarBase{
    int speed;
    String color;
    String name;
    int max_speed=100;
    CarBase() {
        System.out.println("CarBase类的无参数的构造方法被调用了");
    }
    CarBase(int p_speed,String p_color,String p_name,int maxSpeed){
        this.speed=p_speed;
        this.color=p_color;
        this.name=p_name;
        this.max_speed=maxSpeed;
        System.out.println("CarBase类的有参数的构造方法被调用了");
    }
    //加速
    void speedUp(int p_speed){
        int tempSpeed=0;
        if(p_speed>0){
            tempSpeed=speed+p_speed;
        }
        if(tempSpeed<=max_speed){
            speed=tempSpeed;
        }
    }
    //减速
    void slowDown(int p_speed){
        if(p_speed > 0){
            int tempSpeed=speed-p_speed;
            if(tempSpeed >=0 ){
                speed=tempSpeed;
            }
        }
    }
}
//Bus公共汽车类
class Bus extends CarBase{
    int max_Passenger=50;
    int current_Passenger=0;
    Bus(){
        super();
        System.out.println("Bus类的构造方法被调用了");
    }
    Bus(int speed,String color,String name,int max_speed,int max_Passenger,int current_Passenger){
        super(speed,color,name,max_speed);
        this.max_Passenger=max_Passenger;
        this.current_Passenger=current_Passenger;
        System.out.println("Bus类中有参数的被调用了");
    }
    //上车getOnBus
    void getOnBus(int p_geton){
        if(p_geton<0){
            System.out.println("数字不合法");
        }else{
            int temp=current_Passenger+p_geton;
            if(temp<=max_Passenger){
                current_Passenger=temp;
                System.out.println("上车"+p_geton +"人,车上共" + current_Passenger+"人");
            }else{
                int canGetOn=max_Passenger-current_Passenger;
                System.out.println("无法全部上车，最多上车"+canGetOn+"人");
            }
        }
    }
    //下车getDownBus
    void getDownBus(int p_getdown){
        if(p_getdown<0){
            System.out.println("数字不合法");
        }else{
            int temp=current_Passenger-p_getdown;
            if(temp<=0){
                System.out.println("超过最多数，全部下车");
            }else{
                current_Passenger=temp;
                System.out.println("剩余"+temp+"人");
            }
        }
    }
}
//跑车sportsCar
class SportsCar extends CarBase{
    int nAmount=90;
    SportsCar(){
        super();
        System.out.println("sportsCar类的无参数类被调用了");
    }
    SportsCar(int speed,String color,String name,int max_speed,int nAmount){
        super(speed,color,name,max_speed);
        this.nAmount=nAmount;
        System.out.println("跑车有参数的类被调用了");
    }
    void addN(int p_amount){
        if(p_amount<0){
            return;
        }else{
            nAmount+=p_amount;
        }
    }
}

public class study_270 {
    public static void main(String[] args) {
        SportsCar sportsCar=new SportsCar();
        CarBase carBase=sportsCar;
        System.out.println("尝试将carBase引用强制转换成sportsCar引用");
        SportsCar converted=(SportsCar)carBase;
        System.out.println("转换成功！");
        System.out.println("使用converted调用addN()");
        converted.addN(45);
        System.out.println("converted.nAmount的值为"+converted.nAmount);
        Object objCar=converted;
        System.out.println("将Object类引用强制转换成CarBase类引用");
        CarBase carBase1=(CarBase)objCar;
        System.out.println("将Object类引用强制转换成SportsCar类引用");
        SportsCar sportsCar1=(SportsCar)objCar;
        //隐藏错误示例，运行时会报错
//        CarBase carBase2=new CarBase();
//        SportsCar sportsCar2=(SportsCar)carBase2;
//        sportsCar2.addN(30);
    }
}
