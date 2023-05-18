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
@Table(name = "ticketings")
public class Ticketing implements Serializable{
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    
    @Column(name = "urls",length=200)
    private String url;
    
    @Column(name = "api_keys",length=200)
    private String api_key;
    
    
    @Column(name = "tokens",length=1000)
    private String token;
    
    
    @Column(name = "first_saving_date_times")
    private Date first_saving_date_time;
    
    
    @Column(name = "last_update_date_times")
    private Date last_update_date_time;
    
    
    
    @Column(name = "versions")
    private BigInteger version;



    public Ticketing() {
        super();
    }



    public Ticketing(long id, String url, String api_key, String token, Date first_saving_date_time,
            Date last_update_date_time, BigInteger version) {
        super();
        this.id = id;
        this.url = url;
        this.api_key = api_key;
        this.token = token;
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



    public String getUrl() {
        return url;
    }



    public void setUrl(String url) {
        this.url = url;
    }



    public String getApi_key() {
        return api_key;
    }



    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }



    public String getToken() {
        return token;
    }



    public void setToken(String token) {
        this.token = token;
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
        return "Ticketing [id=" + id + ", url=" + url + ", api_key=" + api_key + ", token=" + token
                + ", first_saving_date_time=" + first_saving_date_time + ", last_update_date_time="
                + last_update_date_time + ", version=" + version + "]";
    }
    
    
}
