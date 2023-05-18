package fr.pib.backend.beans;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "developmentss")
public class Developments implements Serializable{
     
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    
    @Column(name = "comments")
    private String comment;
    
    @Column(name = "front_end_conceptions")
    private String front_end_conception;
    
    @Column(name = "front_end_implementations")
    private String front_end_implementation;
    
    @Column(name = "front_end_unit_testings")
    private String front_end_unit_testing;
    
    @Column(name = "front_end_integration_testings")
    private String front_end_integration_testing;
    
    @Column(name = "front_end_code_correcting_and_refactorings")
    private String front_end_code_correcting_and_refactoring;
    
    @Column(name = "front_end_documentation_creating_or_updatings")
    private String front_end_documentation_creating_or_updating;
    
    @Column(name = "back_end_conception")
    private String back_end_conception;

    public Developments(String comment, String front_end_conception, String front_end_implementation,
            String front_end_unit_testing, String front_end_integration_testing,
            String front_end_code_correcting_and_refactoring, String front_end_documentation_creating_or_updating,
            String back_end_conception) {
        super();
        this.comment = comment;
        this.front_end_conception = front_end_conception;
        this.front_end_implementation = front_end_implementation;
        this.front_end_unit_testing = front_end_unit_testing;
        this.front_end_integration_testing = front_end_integration_testing;
        this.front_end_code_correcting_and_refactoring = front_end_code_correcting_and_refactoring;
        this.front_end_documentation_creating_or_updating = front_end_documentation_creating_or_updating;
        this.back_end_conception = back_end_conception;
    }

    public Developments() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getFront_end_conception() {
        return front_end_conception;
    }

    public void setFront_end_conception(String front_end_conception) {
        this.front_end_conception = front_end_conception;
    }

    public String getFront_end_implementation() {
        return front_end_implementation;
    }

    public void setFront_end_implementation(String front_end_implementation) {
        this.front_end_implementation = front_end_implementation;
    }

    public String getFront_end_unit_testing() {
        return front_end_unit_testing;
    }

    public void setFront_end_unit_testing(String front_end_unit_testing) {
        this.front_end_unit_testing = front_end_unit_testing;
    }

    public String getFront_end_integration_testing() {
        return front_end_integration_testing;
    }

    public void setFront_end_integration_testing(String front_end_integration_testing) {
        this.front_end_integration_testing = front_end_integration_testing;
    }

    public String getFront_end_code_correcting_and_refactoring() {
        return front_end_code_correcting_and_refactoring;
    }

    public void setFront_end_code_correcting_and_refactoring(String front_end_code_correcting_and_refactoring) {
        this.front_end_code_correcting_and_refactoring = front_end_code_correcting_and_refactoring;
    }

    public String getFront_end_documentation_creating_or_updating() {
        return front_end_documentation_creating_or_updating;
    }

    public void setFront_end_documentation_creating_or_updating(String front_end_documentation_creating_or_updating) {
        this.front_end_documentation_creating_or_updating = front_end_documentation_creating_or_updating;
    }

    public String getBack_end_conception() {
        return back_end_conception;
    }

    public void setBack_end_conception(String back_end_conception) {
        this.back_end_conception = back_end_conception;
    }
}
