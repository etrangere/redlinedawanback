package fr.pib.backend.beans;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "resourcess")
public class Resources implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    
    @Column(name = "names",length=50)
    private String name;
    
    @Column(name = "types",length=50)
    private String type;
    
    @Column(name = "links",length=50)
    private String link;
    
    @Column(name = "link_types",length=50)
    private String link_type;
    
    @Column(name = "first_saving_date_times")
    private String first_saving_date_time;
    
    @Column(name = "last_update_date_times")
    private String last_update_date_time;
    
    
    @Column(name = "versions")
    private BigInteger version;
    
    @ManyToMany
    private List <Projects> projects = new ArrayList<>();

    
    public Resources() {
        super();
    }


    public Resources(long id, String name, String type, String link, String link_type, String first_saving_date_time,
            String last_update_date_time, BigInteger version) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
        this.link = link;
        this.link_type = link_type;
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


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getLink() {
        return link;
    }


    public void setLink(String link) {
        this.link = link;
    }


    public String getLink_type() {
        return link_type;
    }


    public void setLink_type(String link_type) {
        this.link_type = link_type;
    }


    public String getFirst_saving_date_time() {
        return first_saving_date_time;
    }


    public void setFirst_saving_date_time(String first_saving_date_time) {
        this.first_saving_date_time = first_saving_date_time;
    }


    public String getLast_update_date_time() {
        return last_update_date_time;
    }


    public void setLast_update_date_time(String last_update_date_time) {
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
        return "Resources [id=" + id + ", name=" + name + ", type=" + type + ", link=" + link + ", link_type="
                + link_type + ", first_saving_date_time=" + first_saving_date_time + ", last_update_date_time="
                + last_update_date_time + ", version=" + version + "]";
    }
    
    
}
