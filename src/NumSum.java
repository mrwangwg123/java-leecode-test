public class NumSum implements ITest {

    private int j;

    @Override
    public void test() {
        int[] intArr = {2, 7, 15, 18};
        int target = 9;

        int[] tmp = numSum(intArr, target);

   /*     int[] tmp = new int[2];

        //跳出多重循环  return会导致后面代码不执行
        here:
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {

                System.out.println(i + "=====" + j);
                if ((intArr[i] + intArr[j]) == target) {
                    if (i < j) {
                        tmp[0] = i;
                        tmp[1] = j;
                    } else {
                        tmp[0] = j;
                        tmp[1] = i;
                    }
                    break here;
                }
            }
        }*/

        for (int t : tmp
        ) {
            System.out.println("---->" + t);
        }
    }


    public int[] numSum(int[] intArr, int target) {
        int[] tmp = new int[2];

        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {

                System.out.println(i + "=====" + j);
                if ((intArr[i] + intArr[j]) == target) {
                    if (i < j) {
                        tmp[0] = i;
                        tmp[1] = j;
                    } else {
                        tmp[0] = j;
                        tmp[1] = i;
                    }
                    return tmp;
                }
            }
        }
        return tmp;
    }
}
