package entity.shipping;

import common.interfaces.DistanceInterface;

public class AdapterDelivery extends DeliveryInfo {

	public AdapterDelivery(String name, String phone, String province, String address, String shippingInstructions,
			DistanceInterface distanceInterface) {
		super(name, phone, province, address, shippingInstructions, distanceInterface);
		// TODO Auto-generated constructor stub
	}

}
