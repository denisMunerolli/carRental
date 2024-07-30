package model.entities;

import java.time.LocalDateTime;

public class CarRental {

	private LocalDateTime start;
	private LocalDateTime finish;
	private Vehicles vehicles;
	private Invoice invoice;
	
	public CarRental() {
	}

	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicles vehicles/*, Invoice invoice*/) {
		this.start = start;
		this.finish = finish;
		this.vehicles = vehicles;
		//this.invoice = invoice;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public Vehicles getVehicles() {
		return vehicles;
	}

	//public Invoice getInvoice() {
	//	return invoice;
	//}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public void setVehicles(Vehicles vehicles) {
		this.vehicles = vehicles;
	}

	//public void setInvoice(Invoice invoice) {
	//	this.invoice = invoice;
	//}
	
	
	
}
