public class SortK implements ITest {


    @Override
    public void test() {
        //取出前k个大小的数
        int[] arr1 = {9, 8, 7, 6, 5};
        int[] arr2 = {6, 5, 4, 3};

        int k = 4;
        int[] sortKArr = new int[k];
        int index = 0;
        int index2 = 0;
        for (int i = 0; i < k; i++) {
            if (arr1[index] > arr2[index]) {
                sortKArr[i] = arr1[index];

                if (arr1.length > k)
                    index++;
            } else {
                sortKArr[i] = arr2[index2];

                if (arr2.length > k)
                    index2++;
            }
        }

        for (int s : sortKArr
        ) {
            System.out.println("---->" + s);
        }
    }
}
