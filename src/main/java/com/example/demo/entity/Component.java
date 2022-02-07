package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Component_details")
public class Component {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	
		private Integer component_id;
		private String component_name;
		private String comp_description;
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "pro_idfk", referencedColumnName = "product_id")
		private Product product;
		@ManyToMany(mappedBy = "component")
		private List<Supplier> supplier;
		
		
		
		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public String getComponent_name() {
			return component_name;
		}

		public void setComponent_name(String component_name) {
			this.component_name = component_name;
		}

		public String getComp_description() {
			return comp_description;
		}

		public void setComp_description(String comp_description) {
			this.comp_description = comp_description;
		}

		public Integer getComponent_id() {
			return component_id;
		}

		public void setComponent_id(Integer component_id) {
			this.component_id = component_id;
		}


	}


