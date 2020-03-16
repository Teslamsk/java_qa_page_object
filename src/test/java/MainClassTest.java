import org.junit.*;

public class MainClassTest {

//    @BeforeClass
//    public void beforeClassMethod() {
//
//    }
//
//    @Before
//    public void setUp(){
//
//    }

    @Test
    public void test1(){
        Assert.assertEquals("Value are not equals", 2, 1 + 1);
    }
    @Test
    @Ignore
    public void test2(){
        Assert.assertNull( 0);
        Assert.assertNotNull(1);
    }
    @Test
    public void test3(){
        Assert.assertEquals(10, 5+5);
        Assert.assertNotEquals(11, 5+5);
    }
    @Test
    public void test4(){
        Assert.assertEquals(11, 5+5);
    }
//    @After
//    public void teardown(){
//
//    }
//
//    @AfterClass
//    public void afterClassMethot(){
//
//    }
}
