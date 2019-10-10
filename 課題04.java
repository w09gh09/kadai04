public class Singleton1 {
    public static void main(String[] args) {
        cadeS cade1 = cadeS.getInstance();
        cade1.torihikizandaka(4000);
        cade1.print();
        cadeS cade2 = cadeS.getInstance();
        cade2.torihikizandaka(1000);

        if (cade1 == cade2)
            System.out.println("カード１とカード２は同じインスタンス");
        else
            System.out.println("カード１とカード２は別のインスタンス");

    }
}
class cadeS{
    private static cadeS jittai = new cadeS();
    private String code;
    private String namae;
    private int torihikizandaka;
    private cadeS(){
        this.code = "170-34715";
        this.namae = "重松万葉";
    }
    public static cadeS getInstance{
        return jittai;
    }
    public void torihikizandaka(int kingaku){
        torihikizandaka += kingaku;
    }
    public void print(){
        System.out.println("+------------------+")
        System.out.println("口座番号 : " + code);
        System.out.println("氏名 : " + nama);
        System.out.println("取引残高 : "+ torihikizandaka);
    }
}
