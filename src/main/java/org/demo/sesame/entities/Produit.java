package org.demo.sesame.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Produit")
public class Produit implements Serializable{
@Id
private Long id ;
private String designation ;
private double prix ;

public Produit(String designation, double prix) {
	super();
	this.designation = designation;
	this.prix = prix;
}
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}

}
