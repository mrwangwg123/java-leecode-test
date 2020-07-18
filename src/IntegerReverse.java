public class IntegerReverse implements ITest {



    @Override
    public void test() {
        int num = -129050;
        int reverseN = 0;
        System.out.println("num="+num);
        while (num!=0){
            int mod = num%10;
            reverseN = reverseN*10+ mod;
            num = num/10;
        }

        System.out.println("reverseN="+reverseN);
    }
}
