import org.junit.*;

public class QuickSortTest {
    private QuickSort quickSort;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After CalculatorTest.class");
    }

    @Before
    public void initTest() {
        quickSort = new QuickSort();
    }

    @After
    public void afterTest() {
        quickSort = null;
    }


    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }

//    @Test(timeout = 500)
//    public void timeStampTest() {
//        while (true);
//    }

    @Test
    public void test1() throws Exception {
        checkInputAndOutput(new int[]{3, 5}, new int[]{3, 5});
    }

    @Test
//    @Ignore
    public void test2() throws Exception {
        checkInputAndOutput(new int[]{5, 3}, new int[]{3, 5});
    }

    @Test
    public void test3() throws Exception {
        checkInputAndOutput(new int[]{5, 2, 1, 3}, new int[]{1, 2, 3, 5});
    }

    @Test
    public void test4() throws Exception {
        checkInputAndOutput(new int[]{5, 2, 4, 1, 3}, new int[]{1, 2, 3, 4, 5});
    }

    @Test
    public void test5() throws Exception {
        checkInputAndOutput(new int[]{2, 1, 3}, new int[]{1, 2, 3});
    }

    @Test
    public void test6() throws Exception {
        checkInputAndOutput(new int[]{2, 2, 1, 3}, new int[]{1, 2, 2, 3});
    }

    @Test
    public void test7() throws Exception {
        checkInputAndOutput(new int[]{}, new int[]{});
    }

    private String getCurrentName() {
        return Thread.currentThread()
                .getStackTrace()[3]
                .getMethodName();
    }

    private void checkInputAndOutput(int[] input, int[] output) {
        String getCurrentName = getCurrentName();
        int[] res = quickSort.sort(input);
        if (res.length != output.length) {
            System.out.println("Тест " + getCurrentName + " не прошел.");
            return;
        }

        for (int i  = 0; i < output.length; i++) {
            if (res[i] != output[i]) {
                System.out.println("Тест " + getCurrentName + " не прошел.");
                return;
            }
        }
        System.out.println("Тест " + getCurrentName + " прошел.");
    }

}