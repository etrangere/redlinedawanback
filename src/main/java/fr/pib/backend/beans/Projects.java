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
@Table(name = "projectss")
public class Projects implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    
    @Column(name = "names",length=50)
    private String name;
    
    @Column(name = "progress_rates",length=7)
    private String progress_rate;
    
    @Column(name = "statuss",length=20)
    private String status;
    
    @Column(name = "dead_lines")
    private Date dead_line;
    
    @Column(name = "url_remote_repositorys",length=50)
    private String url_remote_repository;
    
    @Column(name = "first_saving_date_times")
    private Date first_saving_date_time;
    
    @Column(name = "last_update_date_times")
    private Date last_update_date_time;
    
    @Column(name = "versions")
    private BigInteger version;

    public Projects() {
        super();
    }

    public Projects(long id, String name, String progress_rate, String status, Date dead_line,
            String url_remote_repository, Date first_saving_date_time, Date last_update_date_time, BigInteger version) {
        super();
        this.id = id;
        this.name = name;
        this.progress_rate = progress_rate;
        this.status = status;
        this.dead_line = dead_line;
        this.url_remote_repository = url_remote_repository;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgress_rate() {
        return progress_rate;
    }

    public void setProgress_rate(String progress_rate) {
        this.progress_rate = progress_rate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDead_line() {
        return dead_line;
    }

    public void setDead_line(Date dead_line) {
        this.dead_line = dead_line;
    }

    public String getUrl_remote_repository() {
        return url_remote_repository;
    }

    public void setUrl_remote_repository(String url_remote_repository) {
        this.url_remote_repository = url_remote_repository;
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
        return "Projects [id=" + id + ", name=" + name + ", progress_rate=" + progress_rate + ", status=" + status
                + ", dead_line=" + dead_line + ", url_remote_repository=" + url_remote_repository
                + ", first_saving_date_time=" + first_saving_date_time + ", last_update_date_time="
                + last_update_date_time + ", version=" + version + "]";
    }
    
    
}
