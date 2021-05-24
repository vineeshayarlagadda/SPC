package com.g3.spc.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Fee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FeeId")
	private int FeeId;
	
	private double totalFeesDue;
	private double totalFeesReceived;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "feeinstallment", referencedColumnName = "feeInstallmentId")
	@Embedded
	private FeeInstallment feeinstallment;
	
	public Fee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double getTotalFeesDue() {
		return totalFeesDue;
	}
	public void setTotalFeesDue(double totalFeesDue) {
		this.totalFeesDue = totalFeesDue;
	}
	public double getTotalFeesReceived() {
		return totalFeesReceived;
	}
	public void setTotalFeesReceived(double totalFeesReceived) {
		this.totalFeesReceived = totalFeesReceived;
	}

	public int getFeeId() {
		return FeeId;
	}
	public void setFeeId(int feeId) {
		FeeId = feeId;
	
	}
	

	public FeeInstallment getFeeinstallment() {
		return feeinstallment;
	}

	public void setFeeinstallment(FeeInstallment feeinstallment) {
		this.feeinstallment = feeinstallment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + FeeId;
		result = prime * result + ((feeinstallment == null) ? 0 : feeinstallment.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalFeesDue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalFeesReceived);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fee other = (Fee) obj;
		if (FeeId != other.FeeId)
			return false;
		if (feeinstallment == null) {
			if (other.feeinstallment != null)
				return false;
		} else if (!feeinstallment.equals(other.feeinstallment))
			return false;
		if (Double.doubleToLongBits(totalFeesDue) != Double.doubleToLongBits(other.totalFeesDue))
			return false;
		if (Double.doubleToLongBits(totalFeesReceived) != Double.doubleToLongBits(other.totalFeesReceived))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fee [totalFeesDue=" + totalFeesDue + ", totalFeesReceived=" + totalFeesReceived + ", FeeId=" + FeeId
				+ ", feeinstallment=" + feeinstallment + "]";
	}

}