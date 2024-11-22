import Model.CarList;
import Utils.MyFileHandler;
import Model.Car;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CarModelManager
{
  private String fileName;

  public CarModelManager(String fileName)
  {
    this.fileName = fileName;
  }

  public CarList getAllCars()
  {
    //created new empty list
    CarList cars = new CarList();

    try
    {
      cars = (CarList) MyFileHandler.readFromBinaryFile(fileName);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found or could not be opened");
    }
    catch (IOException e)
    {
      System.out.println("IO error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class not found");
    }

    return cars;
  }

  public void addCar(Car car)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(fileName, car.toString());
    }
    catch (FileNotFoundException e)
    {
      System.out.println("FIle not found or not opened");
    }
    catch (IOException e)
    {
      System.out.println("IO error writing to file");
    }
  }

  public void addCars(CarList cars)
  {
    CarList[] carArr = new CarList[cars.size()];
    for (int i = 0; i < cars.size(); i++)
    {
      carArr[i] = getAllCars();
    }

    try
    {
      MyFileHandler.writeArrayToBinaryFile(fileName, carArr);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found or not opened");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }

  public void deleteCar(Car car)
  {

    try
    {
      MyFileHandler.readFromBinaryFile(fileName);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO error writing to file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class not found");
    }
  }
}
