package Cars;

import java.util.ArrayList;
import java.util.List;

public class Park {
	private List<Car> cars;

	public List<Car> getCars(){
		return cars;
	}
	Park(){
		cars = new ArrayList<>();
	}

	public void addCar(Car car){
		cars.add(car);
	}
}
