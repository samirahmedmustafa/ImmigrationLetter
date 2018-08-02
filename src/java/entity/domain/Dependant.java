/**
 * This file was generated by the Jeddict
 */
package entity.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 * @author sawad
 */
@Entity
public class Dependant implements Serializable {

    @Id
    @NotNull
    private String qid;

    @Basic
    private String Name;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date DOB;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date IDExpiry;

    @Basic
    private String Nationality;

    @Basic
    private String Occupation;

    @Basic
    private String PassportNo;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date PassportExpiry;

    @Basic
    private String ResidencyType;

    @Basic
    private String MyHost;

    @ManyToOne
    private Employee employee;

    public Dependant() {
    }

    
    public String getQid() {
        return this.qid;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Date getDOB() {
        return this.DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Date getIDExpiry() {
        return this.IDExpiry;
    }

    public void setIDExpiry(Date IDExpiry) {
        this.IDExpiry = IDExpiry;
    }

    public String getNationality() {
        return this.Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getOccupation() {
        return this.Occupation;
    }

    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }

    public String getPassportNo() {
        return this.PassportNo;
    }

    public void setPassportNo(String PassportNo) {
        this.PassportNo = PassportNo;
    }

    public Date getPassportExpiry() {
        return this.PassportExpiry;
    }

    public void setPassportExpiry(Date PassportExpiry) {
        this.PassportExpiry = PassportExpiry;
    }

    public String getResidencyType() {
        return this.ResidencyType;
    }

    public void setResidencyType(String ResidencyType) {
        this.ResidencyType = ResidencyType;
    }

    public String getMyHost() {
        return MyHost;
    }

    public void setMyHost(String MyHost) {
        this.MyHost = MyHost;
    }


    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Dependant{" + "qid=" + qid + ", Name=" + Name + ", DOB=" + DOB + ", IDExpiry=" + IDExpiry + ", Nationality=" + Nationality + ", Occupation=" + Occupation + ", PassportNo=" + PassportNo + ", PassportExpiry=" + PassportExpiry + ", ResidencyType=" + ResidencyType + ", MyHost=" + MyHost + ", employee=" + employee + '}';
    }


    

}