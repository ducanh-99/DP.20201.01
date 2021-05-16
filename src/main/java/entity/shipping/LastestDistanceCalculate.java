package entity.shipping;

import common.interfaces.DistanceInterface;
import org.example.DistanceCalculator;

public class LastestDistanceCalculate implements DistanceInterface {

	@Override
	public int calculateDistance(String address, String province) {
		DistanceCalculator distanceCalculator = new DistanceCalculator();
		return distanceCalculator.calculateDistance(address, province);
	}

}
