package fr.pib.backend.beans;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "roadmapss")
public class Roadmaps implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    
    @Column(name = "date_or_timeframes")
    private Date date_or_timeframe;
    
    @Column(name = "name_versions",length=50)
    private String name_version;
    
    @Column(name = "goals",length=1000)
    private String goal;
    
    @Column(name = "featuress",length=1000)
    private String features;
    
    @Column(name = "metricss",length=1000)
    private String metrics;
    
    @Column(name = "completed_or_ignoreds")
    private Boolean  completed_or_ignored; 
    
    @Column(name = "status_progresss")
    private String status_progress;
    
    @Column(name = "first_saving_date_times")
    private Date first_saving_date_time;
    
    @Column(name = "last_update_date_times")
    private Date last_update_date_time;
    
    
    @Column(name = "versions")
    private BigInteger version;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Projects projects ;
    
        

    public Roadmaps() {
        super();
    }


    public Roadmaps(long id, Date date_or_timeframe, String name_version, String goal, String features, String metrics,
            Boolean completed_or_ignored, String status_progress, Date first_saving_date_time,
            Date last_update_date_time, BigInteger version) {
        super();
        this.id = id;
        this.date_or_timeframe = date_or_timeframe;
        this.name_version = name_version;
        this.goal = goal;
        this.features = features;
        this.metrics = metrics;
        this.completed_or_ignored = completed_or_ignored;
        this.status_progress = status_progress;
        this.first_saving_date_time = first_saving_date_time;
        this.last_update_date_time = last_update_date_time;
        this.version = version;
    }

    public Projects getProjects() {
        return projects;
    }


    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public Date getDate_or_timeframe() {
        return date_or_timeframe;
    }


    public void setDate_or_timeframe(Date date_or_timeframe) {
        this.date_or_timeframe = date_or_timeframe;
    }


    public String getName_version() {
        return name_version;
    }


    public void setName_version(String name_version) {
        this.name_version = name_version;
    }


    public String getGoal() {
        return goal;
    }


    public void setGoal(String goal) {
        this.goal = goal;
    }


    public String getFeatures() {
        return features;
    }


    public void setFeatures(String features) {
        this.features = features;
    }


    public String getMetrics() {
        return metrics;
    }


    public void setMetrics(String metrics) {
        this.metrics = metrics;
    }


    public Boolean getCompleted_or_ignored() {
        return completed_or_ignored;
    }


    public void setCompleted_or_ignored(Boolean completed_or_ignored) {
        this.completed_or_ignored = completed_or_ignored;
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
        return "Roadmaps [id=" + id + ", date_or_timeframe=" + date_or_timeframe + ", name_version=" + name_version
                + ", goal=" + goal + ", features=" + features + ", metrics=" + metrics + ", completed_or_ignored="
                + completed_or_ignored + ", status_progress=" + status_progress + ", first_saving_date_time="
                + first_saving_date_time + ", last_update_date_time=" + last_update_date_time + ", version=" + version
                + "]";
    }
    
    
    
}
