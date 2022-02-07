package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Supplier_details")
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer supplier_id;
	@NotNull
	private String supplier_name;
	@NotNull
	private String sup_description;

	 @ManyToMany(fetch = FetchType.LAZY,
	            cascade = {
	                CascadeType.PERSIST,
	                CascadeType.MERGE
	            })
	 @JoinTable(name="supplier_component", joinColumns = { @JoinColumn(name = "sup_id",referencedColumnName = "Supplier_id" )},
			 inverseJoinColumns = { @JoinColumn(name = "comp_id",referencedColumnName = "component_id") })
	 private List<Component> component;

	public String getSupplier_name() {
		return supplier_name;
	}

	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	public String getSup_description() {
		return sup_description;
	}

	public void setSup_description(String sup_description) {
		this.sup_description = sup_description;
	}

	public Integer getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(Integer supplier_id) {
		this.supplier_id = supplier_id;
	}

}
