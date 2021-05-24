//package com.g3.spc.entities;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.persistence.ElementCollection;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//@Entity
//public class DiaryNotes {
//	@Id
//	private int diaryNotesId;
//	private Map<Subject,String> notes;
//	
//	@ElementCollection  
//    private Map<Subject,String> map=new HashMap<Subject,String>();
//	
//	public DiaryNotes(int diaryNotesId, Map<Subject, String> notes) {
//		super();
//		this.diaryNotesId = diaryNotesId;
//		this.notes = notes;
//	}
//
//
//	public DiaryNotes() {
//		super();
//	}
//
//
//	public int getDiaryNotesId() {
//		return diaryNotesId;
//	}
//
//
//	public void setDiaryNotesId(int diaryNotesId) {
//		this.diaryNotesId = diaryNotesId;
//	}
//
//
//	public Map<Subject, String> getNotes() {
//		return notes;
//	}
//
//
//	public void setNotes(Map<Subject, String> notes) {
//		this.notes = notes;
//	}
//
//
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return super.hashCode();
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}
//
//
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
//	
//	
//	
//	
//	
//}

























package com.g3.spc.entities;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyJoinColumn;

@Entity
public class DiaryNotes {
	@Id
	//@Column(name = "DiaryNotesId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int diaryNotesId;
	
	@ElementCollection
	@CollectionTable(name="SubjectNotesInfo")
    @MapKeyJoinColumn(name="subjectId")
	@JoinColumn(name = "Notes")
	private Map<Subject,String> notes;
	
	public DiaryNotes() {
		super();
	}

	public DiaryNotes(int diaryNotesId) {
		super();
		this.diaryNotesId = diaryNotesId;
	}



	public int getDiaryNotesId() {
		return diaryNotesId;
	}
	public void setDiaryNotesId(int diaryNotesId) {
		this.diaryNotesId = diaryNotesId;
	}
	
	public Map<Subject, String> getNotes() {
		return notes;
	}



	public void setNotes(Map<Subject, String> notes) {
		this.notes = notes;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diaryNotesId;
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
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
		DiaryNotes other = (DiaryNotes) obj;
		if (diaryNotesId != other.diaryNotesId)
			return false;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DiaryNotes [diaryNotesId=" + diaryNotesId + ", notes=" + notes + "]";
	}
	
	
	
}
