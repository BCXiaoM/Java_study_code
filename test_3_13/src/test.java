//判断闰年
//4的倍数
//400的倍数
//100的倍数不是
/*
public class test {
    public static void main(String[] args) {
        int leap = 2004;
        if (leap % 4 == 0 && leap % 100 != 0 || leap % 400 == 0) {
            System.out.println(leap+"是闰年");
        }else{
            System.out.println(leap+"不是闰年");
        }
    }
}*/

/*判断一个数是否为水仙花数*/
public class test {
    public static void main(String[] args){
        int n = 153;
        int r = n;
        int num = 0;
        while(n != 0){
            num += (n % 10) * (n % 10) * (n % 10);
            n /= 10;
        }
        if(r == num){
            System.out.println(r + "是水仙花数");
        }else{
            System.out.println(r + "不是水仙花数");
        }
    }
}
/*输出小写的a-z及输出大写的A-Z*/
/*
public class test {
    public static void main(String[] args) {
        char i = 'a';
        char j = 'Z';
        for(i = 'a'; i <= 'z'; i++){
            System.out.print(i);
        }
        System.out.println();
        for(j = 'Z'; j >= 'A'; j--){
            System.out.print(j);
        }
    }
}*/
