package com.g3.spc.entities;

import java.time.LocalDate;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
@Embeddable
public class FeeInstallment {
	
	private int feeInstallmentId;
	private double feeInstallment;
	private LocalDate dueDate;
	private LocalDate feePaymentDate;

	public FeeInstallment() {
		super();
	// TODO Auto-generated constructor stub
	}
	
	
	
	public FeeInstallment(int feeInstallmentId, double feeInstallment, LocalDate dueDate, LocalDate feePaymentDate) {
		super();
		this.feeInstallmentId = feeInstallmentId;
		this.feeInstallment = feeInstallment;
		this.dueDate = dueDate;
		this.feePaymentDate = feePaymentDate;
	}



	public int getFeeInstallmentId() {
		return feeInstallmentId;
	}
	public void setFeeInstallmentId(int feeInstallmentId) {
		this.feeInstallmentId = feeInstallmentId;
	}
	public double getFeeInstallment() {
		return feeInstallment;
	}
	public void setFeeInstallment(double feeInstallment) {
		this.feeInstallment = feeInstallment;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public LocalDate getFeePaymentDate() {
		return feePaymentDate;
	}
	public void setFeePaymentDate(LocalDate feePaymentDate) {
		this.feePaymentDate = feePaymentDate;
	}
	@Override
	public String toString() {
		return "FeeInstallment [feeInstallmentId=" + feeInstallmentId + ", feeInstallment=" + feeInstallment
				+ ", dueDate=" + dueDate + ", feePaymentDate=" + feePaymentDate + "]";
	}

	

}
