package entity.shipping;

import org.example.DistanceCalculator;

import common.interfaces.DistanceInterface;

public class DistanceAdapter implements CalculatorDistance {
	
	private DistanceInterface distanceInterface;
	
	public DistanceAdapter(DistanceInterface distanceInterface) {
		// TODO Auto-generated constructor stub
		this.distanceInterface = distanceInterface;
	}

	@Override
	public int calculateDistance(String address, String province) {
		// TODO Auto-generated method stub
		return this.distanceInterface.calculateDistance(address, province);
	}



}
