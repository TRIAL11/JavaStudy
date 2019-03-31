package 面试题目._智臾科技.Test2;

public class Algorithm_2 {
    int ori_year=1969;
    int ori_month=1;
    int ori_day=1;
    //是否闰年
    public boolean isLeapYear(int a){
        return (a%100!=0&&a%4==0||a%400==0);
    }
    //每个月的最大日期
    public int getMaxMonthDay(int a, int b){
        if(a==1||a==3||a==5||a==7||a==8||a==10||a==12){
            return 31;
        }
        else if(a==4||a==6||a==9||a==11){
            return 30;
        }else{
            if(isLeapYear(b)){
                return 29;
            }else{
                return 28;
            }
        }
    }
    //判断正负
    public boolean bOrs(int now_year){
        if(now_year>=ori_year){
            return true;
        }else{
            return false;
        }
    }
    //添加天数至饱和
    public int addDayToSat(int now_year,int now_month,int now_day){
        int apartDays=0;
        int maxYear,maxMonth,maxDay;
        int minYear,minMonth,minDay;
        if(now_year>=ori_year){
            maxYear=now_year;
            maxMonth=now_month;
            maxDay=now_day;
            minYear=ori_year;
            minMonth=ori_month;
            minDay=ori_day;
        }else{
            maxYear=ori_year;
            maxMonth=ori_month;
            maxDay=ori_day;
            minYear=now_year;
            minMonth=now_month;
            minDay=now_day;
        }
        while ((minYear<maxYear)||(minYear<=maxYear&&minMonth<maxMonth) ||
                (minYear<=maxYear&&minMonth<maxMonth&&minDay<maxDay)){
            minDay++;
            apartDays++;
            if(minDay>getMaxMonthDay(minMonth,minYear)){
                minDay=1;
                minMonth++;
                if(minMonth>12){
                    minMonth=1;
                    minYear++;
                }
            }
        }
        return apartDays;
    }

}
