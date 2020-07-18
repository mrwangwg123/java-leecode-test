import java.util.ArrayList;

/**
 * 直接对数组进行删除操作
 */
public class ArrayOption implements ITest {


    @Override
    public void test() {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(5);

        arrayOption(arrayList, 0);
    }

    private void arrayOption(ArrayList<Integer> arr, int index) {
        for (int i = index; i < arr.size(); i++) {

            if (arr.get(i) == 3) {
                arr.remove(i);
                System.out.println("i="+i+";size="+arr.size());
                arrayOption(arr, i);
                System.out.println("arr="+arr.toString());
                break;
            }
        }
    }
}
