//package com.g3.spc.entities;
//
//import java.time.LocalDate;
//import java.util.Map;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//@Entity
//public class ClassDiary {
//	
//	@Id
//	private int classDiaryId;
//	private Map<LocalDate,DiaryNotes> diaryNotes;
//	
//	public ClassDiary(int classDiaryId, Map<LocalDate, DiaryNotes> diaryNotes) {
//		super();
//		this.classDiaryId = classDiaryId;
//		this.diaryNotes = diaryNotes;
//	}
//
//	public ClassDiary() {
//		super();
//	}
//
//	public int getClassDiaryId() {
//		return classDiaryId;
//	}
//
//	public void setClassDiaryId(int classDiaryId) {
//		this.classDiaryId = classDiaryId;
//	}
//
//	public Map<LocalDate, DiaryNotes> getDiaryNotes() {
//		return diaryNotes;
//	}
//
//	public void setDiaryNotes(Map<LocalDate, DiaryNotes> diaryNotes) {
//		this.diaryNotes = diaryNotes;
//	}
//
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return super.hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}
//
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
//	
//	
//	
//}




package com.g3.spc.entities;

import java.time.LocalDate;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyJoinColumn;

@Entity
public class ClassDiary {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int classDiaryId;
	
	@ElementCollection
	@CollectionTable(name="DiaryNotesInfo")
    @MapKeyJoinColumn(name="classDiaryId")
	@JoinColumn(name = "diaryNotesId")
	private Map<LocalDate,DiaryNotes> diaryNotes;
	public ClassDiary() {
		super();
	}
	public ClassDiary(int classDiaryId) {
		super();
		this.classDiaryId = classDiaryId;
	}
	public int getClassDiaryId() {
		return classDiaryId;
	}
	public void setClassDiaryId(int classDiaryId) {
		this.classDiaryId = classDiaryId;
	}
	public Map<LocalDate, DiaryNotes> getDiaryNotes() {
		return diaryNotes;
	}
	public void setDiaryNotes(Map<LocalDate, DiaryNotes> diaryNotes) {
		this.diaryNotes = diaryNotes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classDiaryId;
		result = prime * result + ((diaryNotes == null) ? 0 : diaryNotes.hashCode());
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
		ClassDiary other = (ClassDiary) obj;
		if (classDiaryId != other.classDiaryId)
			return false;
		if (diaryNotes == null) {
			if (other.diaryNotes != null)
				return false;
		} else if (!diaryNotes.equals(other.diaryNotes))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ClassDiary [classDiaryId=" + classDiaryId + ", diaryNotes=" + diaryNotes + "]";
	}
	
	
}
































