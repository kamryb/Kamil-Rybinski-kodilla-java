import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import org.junit.*;

//Test suite for classes of Shape
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    private Shape shape;
    @BeforeClass
    public static void beforeAllTest() {
        System.out.println("This is the beginnning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
//test1
    public void testAddFigure() {
        //Given
        ArrayList<Shape> test1 = new ArrayList<>();
        Square square = new Square("kwadrat","15mm2");
        Triangle triangle = new Triangle("trojkat","20mm2");
        Circle circle = new Circle("kolo","piR2");

//when

        test1.add(square);
        test1.add(triangle);
        test1.add(circle);

//Then
        Assert.assertEquals(3, test1.size());
    }


    @Test
//test2

    public void testRemoveFigure() {
        //Given
        ArrayList<Shape> test2 = new ArrayList<>();
        Square square = new Square("kwadrat","15mm2");
        Triangle triangle = new Triangle("trojkat","20mm2");
        Circle circle = new Circle("kolo","piR2");

//when
        test2.add(square);
        test2.add(triangle);
        test2.add(circle);

        test2.remove(square);
        test2.remove(triangle);


//Then
        Assert.assertEquals(1, test2.size());
    }

    @Test
//test3

    public void testGetFigure() {
        //Given
        ArrayList<Shape> test3 = new ArrayList<>();
        Square square = new Square("kwadrat","15mm2");
        Triangle triangle = new Triangle("trojkat","20mm2");
        Circle circle = new Circle("kolo","piR2");

//when
        test3.add(Square);
        test3.add(Triangle);
        test3.add(Circle);

//Then
        Assert.assertEquals(Square, test3.get(0));
    }
}