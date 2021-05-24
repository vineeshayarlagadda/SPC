package com.g3.spc.SpcApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.g3.spc.entities.Address;
import com.g3.spc.entities.Attendance;
import com.g3.spc.entities.ClassDiary;
import com.g3.spc.entities.ClassId;
import com.g3.spc.entities.DiaryNotes;
import com.g3.spc.entities.Fee;
import com.g3.spc.entities.FeeInstallment;
import com.g3.spc.entities.Student;
import com.g3.spc.entities.Subject;
import com.g3.spc.entities.Teacher;



public class TestRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory(); 
		
		System.out.println("1");
		
		Session session = factory.openSession();// jdbc -> coonection object
		Transaction t = session.beginTransaction();
		
		// ---- write code for data base operation ----
		
		Student student = new Student(1,LocalDate.of(2000, 7, 8),"Vineesha","vineesha@gmail.com","9988776655");
		
		Subject s1 = new Subject(1,"Maths");
		Subject s2 = new Subject(2,"Science");
		Subject s3 = new Subject(3,"English");
		Subject s4 = new Subject(4,"Hindi");
		
		Teacher classTeacher = new Teacher(101,"Vaish");
		Subject s5 = new Subject(5,"Social");
		classTeacher.setSubject(s5);
		
		Teacher teacher1 = new Teacher(102,"Aish");
		teacher1.setSubject(s1);
		Teacher teacher2 = new Teacher(103,"Rash");
		teacher2.setSubject(s2);
		Teacher teacher3 = new Teacher(104,"Keshav");
		teacher3.setSubject(s3);
		Teacher teacher4 = new Teacher(105,"Varsha");
		teacher4.setSubject(s4);
		List<Teacher> subTeachers = Arrays.asList(teacher1,teacher2,teacher3,teacher4);		
		
		ClassId classID = new ClassId(4,'A');
		student.setCurrentClass(classID);
		classID.setClassTeacher(classTeacher);
		classID.setSubjectTeachers(subTeachers);
	
		List<Subject> subjectList = Arrays.asList(s1,s2,s3,s4);
		
		student.setSubjects(subjectList);
		
		Address address = new Address("NB","Jasmine","Paloncha","507115");
		student.setAddress(address);

		Attendance day1 = new Attendance(1,LocalDate.of(2021, 5, 3),true);
		Attendance day2 = new Attendance(1,LocalDate.of(2021, 5, 4),false);

		List<Attendance> attendanceList = Arrays.asList(day1);
		student.setAttendance(attendanceList);
		
		ClassDiary cd = new ClassDiary();
		
		Map<Subject,String> map = new HashMap<Subject,String>();
		Map<Subject,String> map1 = new HashMap<Subject,String>();
		
		map.put(s1,"Complete The essay given in the exercise" );
		map.put(s2,"Complete The Diagram" );
		map.put(s3,"Prepare for the test" );
		
		map1.put(s4, "Do the given worksheet");
		map1.put(s1, "Complete the worksheet");
		
		DiaryNotes dn = new DiaryNotes();
		DiaryNotes dn1 = new DiaryNotes();
		
		dn.setNotes(map);
		dn1.setNotes(map1);
		
		Map<LocalDate,DiaryNotes> m = new HashMap<LocalDate,DiaryNotes>();
		m.put(LocalDate.of(2021, 5, 1), dn);
		m.put(LocalDate.of(2021, 5, 2), dn1);
		cd.setDiaryNotes(m);
		
		session.save(dn);
		session.save(dn1);
		session.save(cd);
		student.setClassDiary(cd);
		
		Fee f1 = new Fee();
		f1.setTotalFeesDue(15000);
		f1.setTotalFeesReceived(5000);
		
		FeeInstallment feeInstallment1 = new FeeInstallment(1,20000,LocalDate.of(2021, 1, 4),LocalDate.of(2021, 1, 2));
		f1.setFeeinstallment(feeInstallment1);
		
		
		Fee f2 = new Fee();
		f2.setTotalFeesDue(65000);
		f2.setTotalFeesReceived(55000);
		
		FeeInstallment feeInstallment2 = new FeeInstallment(2,35000,LocalDate.of(2021, 3, 8),LocalDate.of(2021, 3, 4));
		f2.setFeeinstallment(feeInstallment2);

		List<Fee> feeList = Arrays.asList(f1,f2);
		student.setFee(feeList);
		
		
		
		session.save(student);
		
		System.out.println("  -->> Data Saved ..");
		
		 
		t.commit();
		
		
		session.close();
		System.out.println("----Done----");

	}

}
