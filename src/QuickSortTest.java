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

    @Test
    public void test8() throws Exception {
        checkInputAndOutput(new int[]{2, 3, 1}, new int[]{1, 2, 3});
    }

    @Test
    public void test9() throws Exception {
        checkInputAndOutput(new int[]{9, 2, 6, 4, 5, 3, 5, 4}, new int[]{2, 3, 4, 4, 5, 5, 6, 9});
    }

    @Test
    public void test10() throws Exception {
        checkInputAndOutput(new int[]{6, 5, 5, 9}, new int[]{5, 5, 6, 9});
    }

    @Test
    public void test11() throws Exception {
        checkInputAndOutput(new int[]{-74,48,-20,2,10,-84,-5,-9,11,-24,-91,2,-71,64,63,80,28,-30,-58,-11,-44,-87,-22,54,-74,-10,-55,-28,-46,29,10,50,-72,34,26,25,8,51,13,30,35,-8,50,65,-6,16,-2,21,-78,35,-13,14,23,-3,26,-90,86,25,-56,91,-13,92,-25,37,57,-20,-69,98,95,45,47,29,86,-28,73,-44,-46,65,-84,-96,-24,-12,72,-68,93,57,92,52,-45,-2,85,-63,56,55,12,-85,77,-39},
                new int[]{-96,-91,-90,-87,-85,-84,-84,-78,-74,-74,-72,-71,-69,-68,-63,-58,-56,-55,-46,-46,-45,-44,-44,-39,-30,-28,-28,-25,-24,-24,-22,-20,-20,-13,-13,-12,-11,-10,-9,-8,-6,-5,-3,-2,-2,2,2,8,10,10,11,12,13,14,16,21,23,25,25,26,26,28,29,29,30,34,35,35,37,45,47,48,50,50,51,52,54,55,56,57,57,63,64,65,65,72,73,77,80,85,86,86,91,92,92,93,95,98});
    }

    @Test
    public void test12() throws Exception {
        checkInputAndOutput(new int[]{9, -3, 5, 2, 6, 8, -6, 1, 3}, new int[]{-6, -3, 1, 2, 3, 5, 6, 8, 9});
    }

    @Test
    public void test13() throws Exception {
        checkInputAndOutput(new int[]{-74,48,-20,2,10,-2,85,-63,56,55,12,-85,77,-39},
                new int[]{-85, -74, -63, -39, -20, -2, 2, 10, 12, 48, 55, 56, 77, 85});
    }

    private String getCurrentName() {
        return Thread.currentThread()
                .getStackTrace()[3]
                .getMethodName();
    }

    private void checkInputAndOutput(int[] input, int[] output) throws Exception {
        String getCurrentName = getCurrentName();
        int[] res = quickSort.sort(input);
        if (res.length != output.length) {
            System.out.println("Тест " + getCurrentName + " не прошел.");
            throw new Exception();
        }

        for (int i  = 0; i < output.length; i++) {
            if (res[i] != output[i]) {
                System.out.println("Тест " + getCurrentName + " не прошел.");
                throw new Exception();
            }
        }
        System.out.println("Тест " + getCurrentName + " прошел.");
    }

}