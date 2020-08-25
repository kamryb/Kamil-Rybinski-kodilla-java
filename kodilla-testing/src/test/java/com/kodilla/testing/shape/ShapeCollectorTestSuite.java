import com.kodilla.testing.shape.*;
import org.junit.*;

import java.util.ArrayList;

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
        ShapeCollector test1 = new ShapeCollector();
        Square square = new Square("kwadrat","15mm2");
        Triangle triangle = new Triangle("trojkat","20mm2");
        Circle circle = new Circle("kolo","piR2");

//when

        test1.addFigure(square);
        test1.addFigure(triangle);
        test1.addFigure(circle);
  //     test1.add(triangle);
  //      test1.add(circle);

//Then
        Assert.assertEquals(3, test1.size());
    }


    @Test
//test2

    public void testRemoveFigure() {
        //Given
        ShapeCollector test2 = new ShapeCollector();
        Square square = new Square("kwadrat","15mm2");
        Triangle triangle = new Triangle("trojkat","20mm2");
        Circle circle = new Circle("kolo","piR2");

//when
        test2.addFigure(square);
        test2.addFigure(triangle);
        test2.addFigure(circle);

        test2.removeFigure(square);
        test2.removeFigure(triangle);


//Then
        Assert.assertEquals(1, test2.size());
    }

    @Test
//test3

    public void testGetFigure() {
        //Given
        ShapeCollector test3 = new ShapeCollector();
        Square square = new Square("kwadrat","15mm2");
        Triangle triangle = new Triangle("trojkat","20mm2");
        Circle circle = new Circle("kolo","piR2");

//when
        test3.addFigure(square);
        test3.addFigure(triangle);
        test3.addFigure(circle);

//Then
        Assert.assertEquals(circle, test3.getFigure(test3.size()-1));
    }
}