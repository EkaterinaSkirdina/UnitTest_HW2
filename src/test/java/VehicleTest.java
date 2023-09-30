import Vehicle.Car;
import Vehicle.Motorcycle;
import Vehicle.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    public void creatingTestObjects() {
        car = new Car("BMW", "X5", 2022);
        motorcycle = new Motorcycle("Honda", "CBF 1000", 2019);
    }

//    проверка того, что экземпляр объекта Car также является экземпляром транспортного
//    средства; (instanceof)
    @Test
    public void isCarVehicle() {
        assertTrue(car instanceof Vehicle);
    }

// проверка того, объект Car создается с 4-мя колесами
    @Test
    public void isCarObjectСreatedWithFourWheels() {
        int expectedResult = 4;
        int actualResult = car.getNumWheels();
        assertEquals(expectedResult, actualResult, "оличество колёс не соответствует объекту Car");
    }

//    проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    public void isMotorcycleObjectСreatedWithTwoWheels() {
        int expectedResult = 2;
        int actualResult = motorcycle.getNumWheels();
        assertEquals(expectedResult, actualResult, "оличество колёс не соответствует объекту Motorcycle");
    }

//    проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    public void isCorrectSpeedInTestDriveCar() {
        int expectedSpeed = 60;
        car.testDrive();
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed, actualSpeed, "Скорость объекта Car в режиме тестового вождения не соответствует требуемой");
    }

//    проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    public void isCorrectSpeedInTestDriveMotorcycle() {
        int expectedSpeed = 75;
        motorcycle.testDrive();
        int actualSpeed = motorcycle.getSpeed();
        assertEquals(expectedSpeed, actualSpeed, "Скорость объекта Motorcycle в режиме тестового вождения не соответствует требуемой");
    }

//    проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    public void isCorrectSpeedInParkingCar() {
        int expectedSpeed = 0;
        car.testDrive();
        car.park();
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed, actualSpeed, "Скорость объекта Car в режиме парковки не соответствует требуемой");
    }

//    проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    public void isCorrectSpeedInParkingMotorcycle() {
    int expectedSpeed = 0;
    motorcycle.testDrive();
    motorcycle.park();
    int actualSpeed = motorcycle.getSpeed();
    assertEquals(expectedSpeed, actualSpeed, "Скорость объекта Motorcycle в режиме парковки не соответствует требуемой");
}
}