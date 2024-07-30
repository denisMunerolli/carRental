package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private double pricePerHour;
	private Double pricePerDay;
	
	private BrazilianTaxService taxService;

	public RentalService(double pricePerHour, Double pricePerDay, BrazilianTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		carRental.setInvoice(new Invoice(50.00, 10.00));
		
	}
}
