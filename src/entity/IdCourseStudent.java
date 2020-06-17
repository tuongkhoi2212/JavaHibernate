/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author AEVN
 */
public class IdCourseStudent implements java.io.Serializable{
     private String maMon;
     private Integer mssv;
     
     public IdCourseStudent() {
    }

    public IdCourseStudent(String maMon, int mssv) {
        this.maMon = maMon;
        this.mssv = mssv;
    }
    
    public String getMaMon() {
        return this.maMon;
    }
    
    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }
    public Integer getMssv() {
        return this.mssv;
    }
    
    public void setMssv(Integer mssv) {
        this.mssv = mssv;
    }
}
