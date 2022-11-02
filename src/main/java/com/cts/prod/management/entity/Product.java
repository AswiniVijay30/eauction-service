package com.cts.prod.management.entity;

import java.io.Serializable;
import java.sql.Date;
//import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
@Entity(name="product")
public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="product_id", unique=true, nullable=false, precision=10)
    private int productId;
    @Column(name="product_name", nullable=false, length=30)
    private String productName;
    @Column(name="short_description", length=255)
    private String shortDescription;
    @Column(name="detailed_description", length=255)
    private String detailedDescription;
    @Column(name="category", length=10)
    private String category;
    @Column(name="starting_price", precision=10)
    private int startingPrice;
    @Column(name="bid_end_date")
    private Date bidEndDate;
    @OneToMany(mappedBy="product")
    @JsonIgnore
    private Set<Byerinfo> byerinfo;
    @ManyToOne(cascade = CascadeType.MERGE, optional=false)
    @JoinColumn(name="seller_id")
    @JsonIgnore
    private Sellerinfo sellerinfo;
    
    
    
	public Product() {		
		super();
	}
	
	
	public Product(int productId, String productName, String shortDescription, String detailedDescription,
			String category, int startingPrice, Date bidEndDate, Set<Byerinfo> byerinfo, Sellerinfo sellerinfo) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.shortDescription = shortDescription;
		this.detailedDescription = detailedDescription;
		this.category = category;
		this.startingPrice = startingPrice;
		this.bidEndDate = bidEndDate;
		this.byerinfo = byerinfo;
		this.sellerinfo = sellerinfo;
	}


	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getDetailedDescription() {
		return detailedDescription;
	}
	public void setDetailedDescription(String detailedDescription) {
		this.detailedDescription = detailedDescription;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getStartingPrice() {
		return startingPrice;
	}
	public void setStartingPrice(int startingPrice) {
		this.startingPrice = startingPrice;
	}
	public Date getBidEndDate() {
		return bidEndDate;
	}
	public void setBidEndDate(Date bidEndDate) {
		this.bidEndDate = bidEndDate;
	}
	public Set<Byerinfo> getByerinfo() {
		return byerinfo;
	}
	public void setByerinfo(Set<Byerinfo> byerinfo) {
		this.byerinfo = byerinfo;
	}
	public Sellerinfo getSellerinfo() {
		return sellerinfo;
	}
	public void setSellerinfo(Sellerinfo sellerinfo) {
		this.sellerinfo = sellerinfo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bidEndDate == null) ? 0 : bidEndDate.hashCode());
		result = prime * result + ((byerinfo == null) ? 0 : byerinfo.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((detailedDescription == null) ? 0 : detailedDescription.hashCode());
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((sellerinfo == null) ? 0 : sellerinfo.hashCode());
		result = prime * result + ((shortDescription == null) ? 0 : shortDescription.hashCode());
		result = prime * result + startingPrice;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (bidEndDate == null) {
			if (other.bidEndDate != null)
				return false;
		} else if (!bidEndDate.equals(other.bidEndDate))
			return false;
		if (byerinfo == null) {
			if (other.byerinfo != null)
				return false;
		} else if (!byerinfo.equals(other.byerinfo))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (detailedDescription == null) {
			if (other.detailedDescription != null)
				return false;
		} else if (!detailedDescription.equals(other.detailedDescription))
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (sellerinfo == null) {
			if (other.sellerinfo != null)
				return false;
		} else if (!sellerinfo.equals(other.sellerinfo))
			return false;
		if (shortDescription == null) {
			if (other.shortDescription != null)
				return false;
		} else if (!shortDescription.equals(other.shortDescription))
			return false;
		if (startingPrice != other.startingPrice)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", shortDescription="
				+ shortDescription + ", detailedDescription=" + detailedDescription + ", category=" + category
				+ ", startingPrice=" + startingPrice + ", bidEndDate=" + bidEndDate + ", byerinfo=" + byerinfo
				+ ", sellerinfo=" + sellerinfo + "]";
	}
    
    
    
    
}
