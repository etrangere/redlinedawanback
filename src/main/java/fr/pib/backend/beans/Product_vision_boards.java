package fr.pib.backend.beans;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_vision_boardss")
public class Product_vision_boards implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    
    @Column(name = "visions",length=1000)
    private String vision;
    
    @Column(name = "target_groups",length=1000)
    private String target_group;
    
    @Column(name = "needss",length=1000)
    private String needs;
    
    @Column(name = "products",length=1000)
    private String product;
    
    @Column(name = "business_goalss",length=1000)
    private String business_goals;
    
    @Column(name = "status_progress",length=1000)
    private String status_progress;
    
    @Column(name = "first_saving_date_times")
    private Date first_saving_date_time;
    
    @Column(name = "last_update_date_times")
    private Date last_update_date_time;
    
    @Column(name = "versions")
    private BigInteger version;
    
    @OneToOne
    @JoinColumn(name = "projects_id")
    private Projects projects;

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    public Product_vision_boards() {
        super();
    }

    public Product_vision_boards(long id, String vision, String target_group, String needs, String product,
            String business_goals, String status_progress, Date first_saving_date_time, Date last_update_date_time,
            BigInteger version) {
        super();
        this.id = id;
        this.vision = vision;
        this.target_group = target_group;
        this.needs = needs;
        this.product = product;
        this.business_goals = business_goals;
        this.status_progress = status_progress;
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

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getTarget_group() {
        return target_group;
    }

    public void setTarget_group(String target_group) {
        this.target_group = target_group;
    }

    public String getNeeds() {
        return needs;
    }

    public void setNeeds(String needs) {
        this.needs = needs;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBusiness_goals() {
        return business_goals;
    }

    public void setBusiness_goals(String business_goals) {
        this.business_goals = business_goals;
    }

    public String getStatus_progress() {
        return status_progress;
    }

    public void setStatus_progress(String status_progress) {
        this.status_progress = status_progress;
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
        return "Product_vision_boards [id=" + id + ", vision=" + vision + ", target_group=" + target_group + ", needs="
                + needs + ", product=" + product + ", business_goals=" + business_goals + ", status_progress="
                + status_progress + ", first_saving_date_time=" + first_saving_date_time + ", last_update_date_time="
                + last_update_date_time + ", version=" + version + "]";
    }
    
    
}
