package com.kodilla.matrix.testing.weather.mock;

import com.kodilla.matrix.testing.weather.stub.Temperatures;
import com.kodilla.matrix.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@DisplayName("TDD: Shape Collector Test Suite")
@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite
{
    @Mock
    private Temperatures temperaturesMock;

    private static int testCounter = 0;
    private static Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeAll
    public static void beforeAllTests()
    {
        System.out.println("This is the beginning of test.");
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
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
        when(temperaturesMock.getTemperature()).thenReturn(temperaturesMap);
    }


    @AfterEach
    public void afterEachTest()
    {
        System.out.println("Test#: " + testCounter + " was executed.");
    }

    @Nested
    @DisplayName("Kodilla example")
    class KodillaExample {

        @Test
        void testCalculateForecastWithMock() {
            //Given
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            int quantityOfSensors = weatherForecast.calculateForecast().size();

            //Then
            Assertions.assertEquals(5, quantityOfSensors);
        }
    }

    @Nested
    @DisplayName("My Exercises")
    class MyExercises
    {
        @Test
        void testCalculateAverageTemperature()
        {
            //Given
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            double averageTemperature = weatherForecast.calculateAverageTemperature();

            //Then
            Assertions.assertEquals(25.56, averageTemperature);
        }

        @Test
        void testCalculateMedianTemperature()
        {
            //Given
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            double median = weatherForecast.medianTemperature();

            //Then
            Assertions.assertEquals(25.5, median);
        }
    }
}
