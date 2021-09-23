package practice;

public class Main {
    public static void main(String[] args) {
        String tel= "13015911037";
        tel=StringUtil.telDesensitize(tel);
        System.out.println(tel);

        String name="欧阳恩泽";
        name=StringUtil.nameDesensitize(name);
        System.out.println(name);

        String idCard="350600199007212222";
        System.out.println(StringUtil.idCardDesensitize(idCard));
    }
}
