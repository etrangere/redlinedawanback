package fr.pib.backend.beans;

import java.io.Serializable;
import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "languages_and_technoss")
public class Languages_and_technos implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    
    @Column(name = "names",length=50)
    private String name;
    
    @Column(name = "first_saving_date_times")
    private Date first_saving_date_time;


    @Column(name = "last_update_date_time")
    private Date last_update_date_time;
    
    @Column(name = "versions")
    private BigInteger version;
    
    @ManyToMany
    private List <Projects> projects = new ArrayList<>();

    public Languages_and_technos() {
        super();
    }

    public Languages_and_technos(long id, String name, Date first_saving_date_time, Date last_update_date_time,
            BigInteger version) {
        super();
        this.id = id;
        this.name = name;
        this.first_saving_date_time = first_saving_date_time;
        this.last_update_date_time = last_update_date_time;
        this.version = version;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
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
        return "Languages_and_technos [id=" + id + ", name=" + name + ", first_saving_date_time="
                + first_saving_date_time + ", last_update_date_time=" + last_update_date_time + ", version=" + version
                + "]";
    }
    
    
    
}
