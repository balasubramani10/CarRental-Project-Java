package com.cab.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TripBookingDTO {

	private Integer tripBookingId;
	
	private String pickupLocation;
	private String fromDateTime;
	private String dropLocation;
	private String toDateTime;
	private float distanceInKm;
	private String TripStatus;
	
	private String driverName;
	private String licenceNo;
	private float rating; 
	
	private String carType;
	private String carName;
	private String carNumber;
	private float perKmRate;
	
	private float fare;
}
