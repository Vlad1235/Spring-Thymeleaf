package com.project.suppliercontactstoragethymeleaf.entity;

public class Supplier {

    private int id;
    private String companyWebSite;
    private String managerName;
    private String managerEmail;
    private String companyName;
    private String productName;

    public Supplier(int id, String companyWebSite, String managerName, String managerEmail, String companyName, String productName) {
        this.id = id;
        this.companyWebSite = companyWebSite;
        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.companyName = companyName;
        this.productName = productName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyWebSite() {
        return companyWebSite;
    }

    public void setCompanyWebSite(String companyWebSite) {
        this.companyWebSite = companyWebSite;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", companyWebSite='" + companyWebSite + '\'' +
                ", managerName='" + managerName + '\'' +
                ", managerEmail='" + managerEmail + '\'' +
                ", companyName='" + companyName + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}
