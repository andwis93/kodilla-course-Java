package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite
{
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests()
    {
        System.out.println("This is the beginning of test.");
    }

    @AfterAll
    public static void afterAllTests()
    {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEachTest()
    {
        testCounter++;
        System.out.println("Preparing to execute test #: " + testCounter);
    }

    @AfterEach
    public void afterEachTest()
    {
        System.out.println("Test#: " + testCounter + " was executed.");
    }

    @Nested
    @DisplayName("Tests for Shapes")
    class TestForShapes
    {
        @Test
        void testCircle()
        {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(5));


            //When
            double retrievedField;
            String retrievedName;
            retrievedField = shapeCollector.getFigure(0).getField();
            retrievedName = shapeCollector.getFigure(0).getShapeName();

            //Then
            Assertions.assertEquals(78.53981633974483, retrievedField);
            Assertions.assertEquals("Circle", retrievedName);
        }

        @Test
        void testTriangle()
        {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Triangle(5, 7));

            //When
            double retrievedField;
            String retrievedName;
            retrievedField = shapeCollector.getFigure(0).getField();
            retrievedName = shapeCollector.getFigure(0).getShapeName();

            //Then
            Assertions.assertEquals(17.50, retrievedField);
            Assertions.assertEquals("Triangle", retrievedName);
        }

        @Test
        void testSquare()
        {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Square(5));

            //When
            double retrievedField;
            String retrievedName;
            retrievedField = shapeCollector.getFigure(0).getField();
            retrievedName = shapeCollector.getFigure(0).getShapeName();

            //Then
            Assertions.assertEquals(25.00, retrievedField);
            Assertions.assertEquals("Square", retrievedName);
        }

    }

    @Nested
    @DisplayName("Tests for ShapeCollector")
    class TestForShapeCollector
    {
        @Test
        void testAddFigure()
        {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(new Circle(5));

            //Then
            Assertions.assertEquals(1, shapeCollector.getFigureQuantity());

        }
        @Test
        void testRemoveFigure()
        {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(5));
            Shape shape = new Circle(5);

            //When
            boolean result = shapeCollector.removeFigure(shape);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getFigureQuantity());
        }

        @Test
        void testGeFigure()
        {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(5);
            shapeCollector.addFigure(shape);

            //When
            Shape retrievedFigure = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(shape, retrievedFigure);
        }

        @Test
        void testShowFigures()
        {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(5);
            Shape square = new Square(5);
            Shape triangle = new Triangle(5,7);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);


            //When
            String names = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("Circle, Square, Triangle", names);
        }

    }

}

