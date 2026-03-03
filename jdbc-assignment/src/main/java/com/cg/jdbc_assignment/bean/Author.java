package com.cg.jdbc_assignment.bean;

public class Author {

    private int authorId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phoneNo;

    // Default Constructor
    public Author() {}

    // Parameterized Constructor
    public Author(String firstName, String middleName, String lastName, String phoneNo) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
    }

    // Getters and Setters
    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    // toString() method (Very Important for display)
    @Override
    public String toString() {
        return "Author [authorId=" + authorId +
                ", firstName=" + firstName +
                ", middleName=" + middleName +
                ", lastName=" + lastName +
                ", phoneNo=" + phoneNo + "]";
    }
}