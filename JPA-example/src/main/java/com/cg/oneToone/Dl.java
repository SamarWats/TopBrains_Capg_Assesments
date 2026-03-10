package com.cg.oneToone;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
public class Dl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // @GeneratedValue(strategy = GenerationType.AUTO) is used to automatically generate the primary 	key value for an entity in JPA/Hibernate, we do not need to do it manually
    private int dlNumber;

    private LocalDate expDate;
    private LocalDate issueDate;
    private String type;

    public Dl() {}

    public Dl(int dlNumber, LocalDate expDate, LocalDate issueDate, String type) {
        this.expDate = expDate;
        this.issueDate = issueDate;
        this.type = type;
    }
    
    
	public int getDlNumber() {
		return dlNumber;
	}
	public void setDlNumber(int dlNumber) {
	    this.dlNumber = dlNumber;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
