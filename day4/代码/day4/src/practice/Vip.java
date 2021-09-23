package practice;

import java.math.BigDecimal;

/**
 * 会员卡
 * 定义一个理发店会员卡的类
 *   属性：姓名、卡号、手机号、积分、余额
 *   方法：查看姓名、查看卡号、查看手机号、查看积分、查看余额、消费、充值
 *   （1）定义方法 属性
 *   （2)消费的时候打折，如果超过1000元 打8折；超过2000打5折；1000以内不打折。
 * 	(3)编写有姓名和余额的构造方法
 * 	(4) 创建对象，并测试方法。
 *
 */
public class Vip {
    private String name;
    private String idNo;
    private String tel;
    private String score;
    private BigDecimal account;

    public Vip(String name,String tel){
        this.name=name;
        this.tel=tel;
        this.account=BigDecimal.ZERO;
    }

    public Vip(String name, BigDecimal account){
        this.name=name;
        this.account=account;
    }

    public void setName(String name) throws Exception {
        if(name.indexOf("逼")!=-1){
            throw new Exception("名字里面包含违禁字");
        }
        this.name=name;
    }

    //获取名字
    public String getName() {
        String x= name.substring(0,1);
        return x+"**";
    }

    //获取卡号
    public String getIdNo() {
        return idNo;
    }

    //获取手机号
    public String getTel() {
        return tel;
    }

    //获取积分
    public String getScore() {
        return score;
    }

    //获取余额
    public BigDecimal getAccount() {
        return account;
    }

    /**
     * 充值
     * @param money
     */
    public void deposit(BigDecimal money){
        this.account=this.account.add(money);
    }

    /**
     * 消费
     * @param price
     */
    public void pay(BigDecimal price) {
        //判断余额是否够用
        if(this.account.compareTo(price)<0){
            System.out.println("钱不够，请充值");
            return;
        }

        if (price.compareTo(new BigDecimal(1000)) > 0 && price.compareTo(new BigDecimal(2000)) <= 0) {
            price = price.multiply(new BigDecimal(0.8)).setScale(0,BigDecimal.ROUND_DOWN);
        } else if (price.compareTo(new BigDecimal(2000)) > 0) {
            price = price.multiply(new BigDecimal(0.5)).setScale(0,BigDecimal.ROUND_DOWN);
        }
        this.account = this.account.subtract(price);
    }

    /**
     * 提示
     */
    public void accountTip(){
        System.out.println("尊敬的用户:"+name+"先生/女士，您当前的余额为"+account);
    }



    public static void main(String[] args) {
        //如果a<b 返回-1 a>b 返回1 a等于b返回0
        BigDecimal a= new BigDecimal(1000);
        BigDecimal b= new BigDecimal(999);
        System.out.println(a.compareTo(b));
    }

}
