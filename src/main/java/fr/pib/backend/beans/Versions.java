package fr.pib.backend.beans;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "versionss")
public class Versions implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    
    @Column(name = "majors")
    private int major;
    
    @Column(name = "minors")
    private int minor;
    
    @Column(name = "patchs")
    private int patch;
    
    @Column(name = "production_deployment_date_times")
    private Date production_deployment_date_time;
    
    @Column(name = "first_saving_date_times")
    private Date first_saving_date_time;
    
    @Column(name = "last_update_date_times")
    private Date last_update_date_time;
    
    
    @Column(name = "versions")
    private BigInteger version;


    public Versions() {
        super();
    }


    public Versions(long id, int major, int minor, int patch, Date production_deployment_date_time,
            Date first_saving_date_time, Date last_update_date_time, BigInteger version) {
        super();
        this.id = id;
        this.major = major;
        this.minor = minor;
        this.patch = patch;
        this.production_deployment_date_time = production_deployment_date_time;
        this.first_saving_date_time = first_saving_date_time;
        this.last_update_date_time = last_update_date_time;
        this.version = version;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public int getMajor() {
        return major;
    }


    public void setMajor(int major) {
        this.major = major;
    }


    public int getMinor() {
        return minor;
    }


    public void setMinor(int minor) {
        this.minor = minor;
    }


    public int getPatch() {
        return patch;
    }


    public void setPatch(int patch) {
        this.patch = patch;
    }


    public Date getProduction_deployment_date_time() {
        return production_deployment_date_time;
    }


    public void setProduction_deployment_date_time(Date production_deployment_date_time) {
        this.production_deployment_date_time = production_deployment_date_time;
    }


    public Date getFirst_saving_date_time() {
        return first_saving_date_time;
    }


    public void setFirst_saving_date_time(Date first_saving_date_time) {
        this.first_saving_date_time = first_saving_date_time;
    }


    public Date getLast_update_date_time() {
        return last_update_date_time;
    }


    public void setLast_update_date_time(Date last_update_date_time) {
        this.last_update_date_time = last_update_date_time;
    }


    public BigInteger getVersion() {
        return version;
    }


    public void setVersion(BigInteger version) {
        this.version = version;
    }


    public static long getSerialversionuid() {
        return serialVersionUID;
    }


    @Override
    public String toString() {
        return "Versions [id=" + id + ", major=" + major + ", minor=" + minor + ", patch=" + patch
                + ", production_deployment_date_time=" + production_deployment_date_time + ", first_saving_date_time="
                + first_saving_date_time + ", last_update_date_time=" + last_update_date_time + ", version=" + version
                + "]";
    }
    
    
}
