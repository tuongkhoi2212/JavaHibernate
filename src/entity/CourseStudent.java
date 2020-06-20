package entity;
// Generated Jun 20, 2020 5:44:52 PM by Hibernate Tools 4.3.1



/**
 * CourseStudent generated by hbm2java
 */
public class CourseStudent  implements java.io.Serializable {


     private CourseStudentId id;
     private Course course;
     private Student student;
     private Float diemGk;
     private Float diemCk;
     private Float diemKhac;
     private Float diemTong;

    public CourseStudent() {
    }

	
    public CourseStudent(CourseStudentId id, Course course, Student student) {
        this.id = id;
        this.course = course;
        this.student = student;
    }
    public CourseStudent(CourseStudentId id, Course course, Student student, Float diemGk, Float diemCk, Float diemKhac, Float diemTong) {
       this.id = id;
       this.course = course;
       this.student = student;
       this.diemGk = diemGk;
       this.diemCk = diemCk;
       this.diemKhac = diemKhac;
       this.diemTong = diemTong;
    }
   
    public CourseStudentId getId() {
        return this.id;
    }
    
    public void setId(CourseStudentId id) {
        this.id = id;
    }
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    public Float getDiemGk() {
        return this.diemGk;
    }
    
    public void setDiemGk(Float diemGk) {
        this.diemGk = diemGk;
    }
    public Float getDiemCk() {
        return this.diemCk;
    }
    
    public void setDiemCk(Float diemCk) {
        this.diemCk = diemCk;
    }
    public Float getDiemKhac() {
        return this.diemKhac;
    }
    
    public void setDiemKhac(Float diemKhac) {
        this.diemKhac = diemKhac;
    }
    public Float getDiemTong() {
        return this.diemTong;
    }
    
    public void setDiemTong(Float diemTong) {
        this.diemTong = diemTong;
    }




}


