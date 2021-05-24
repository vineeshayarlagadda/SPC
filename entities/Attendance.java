package com.g3.spc.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Attendance {
	
	@Id
	private int attendanceId;
	
//	@OneToOne(cascade = CascadeType.ALL)                           
//	@JoinColumn(name = "Student_ID",referencedColumnName = "userId")
//	private Student student;
	
	private LocalDate dateOfClass;
	private boolean present;
	
	
	public Attendance(int attendanceId, LocalDate dateOfClass, boolean present) {
		super();
		this.attendanceId = attendanceId;
		this.dateOfClass = dateOfClass;
		this.present = present;
	}


	public Attendance() {
		super();
	}


	public int getAttendanceId() {
		return attendanceId;
	}


	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}

//
//	public Student getStudent() {
//		return student;
//	}
//
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}


	public LocalDate getDateOfClass() {
		return dateOfClass;
	}


	public void setDateOfClass(LocalDate dateOfClass) {
		this.dateOfClass = dateOfClass;
	}


	public boolean isPresent() {
		return present;
	}


	public void setPresent(boolean present) {
		this.present = present;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attendanceId;
		result = prime * result + ((dateOfClass == null) ? 0 : dateOfClass.hashCode());
		result = prime * result + (present ? 1231 : 1237);
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
		Attendance other = (Attendance) obj;
		if (attendanceId != other.attendanceId)
			return false;
		if (dateOfClass == null) {
			if (other.dateOfClass != null)
				return false;
		} else if (!dateOfClass.equals(other.dateOfClass))
			return false;
		if (present != other.present)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Attendance [attendanceId=" + attendanceId + ", dateOfClass=" + dateOfClass + ", present=" + present
				+ "]";
	}
		
}
