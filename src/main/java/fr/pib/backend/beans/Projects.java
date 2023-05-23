package fr.pib.backend.beans;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
    
    @OneToOne(mappedBy="projects")
    @NonNull
    private Developments developements;
    
    @OneToOne(mappedBy="projects")
    @NonNull
    private Time_lines timelines;
    
    @OneToOne(mappedBy="projects")
    @NonNull
    private Product_vision_boards product_vision_boards;
    
    @OneToOne(mappedBy="projects")
    @NonNull
    private Ticketing ticketing;
    
    @OneToMany(mappedBy="projects")
    @NonNull
    private List <Roadmaps> roadmpas = new ArrayList<>();
    
    @OneToMany(mappedBy="projects")
    @NonNull
    private List <Versions> versions = new ArrayList<>();
    
    @ManyToMany(mappedBy="projects")
    private List <Resources> resources = new ArrayList<>();
    
    @ManyToMany(mappedBy="projects")
    @NonNull
    private List <Languages_and_technos> languages_and_technos = new ArrayList<>();
    
        

   
   
    
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

    public Developments getDevelopements() {
        return developements;
    }

    public void setDevelopements(Developments developements) {
        this.developements = developements;
    }

    public Time_lines getTimelines() {
        return timelines;
    }

    public void setTimelines(Time_lines timelines) {
        this.timelines = timelines;
    }

    public Product_vision_boards getProduct_vision_boards() {
        return product_vision_boards;
    }

    public void setProduct_vision_boards(Product_vision_boards product_vision_boards) {
        this.product_vision_boards = product_vision_boards;
    }

    public Ticketing getTicketing() {
        return ticketing;
    }

    public void setTicketing(Ticketing ticketing) {
        this.ticketing = ticketing;
    }

    public List<Roadmaps> getRoadmpas() {
        return roadmpas;
    }

    public void setRoadmpas(List<Roadmaps> roadmpas) {
        this.roadmpas = roadmpas;
    }

    public List<Versions> getVersions() {
        return versions;
    }

    public void setVersions(List<Versions> versions) {
        this.versions = versions;
    }

    public List<Languages_and_technos> getLanguages_and_technos() {
        return languages_and_technos;
    }

    public void setLanguages_and_technos(List<Languages_and_technos> languages_and_technos) {
        this.languages_and_technos = languages_and_technos;
    }

    public List<Resources> getResources() {
        return resources;
    }

    public void setResources(List<Resources> resources) {
        this.resources = resources;
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
