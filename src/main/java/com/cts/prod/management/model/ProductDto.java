package com.cts.prod.management.model;

import java.util.List;

//import lombok.Data;

//@Data
public class ProductDto{
    private int productId;
    private String productName;
    private String shortDescription;
    private String detailedDescription;
    private String category;
    private int startingPrice;
    private String bidEndDate;
    private int sellerId;
    private List<ByerinfoDto> byerInfoDto;
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
	public String getBidEndDate() {
		return bidEndDate;
	}
	public void setBidEndDate(String bidEndDate) {
		this.bidEndDate = bidEndDate;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public List<ByerinfoDto> getByerInfoDto() {
		return byerInfoDto;
	}
	public void setByerInfoDto(List<ByerinfoDto> byerInfoDto) {
		this.byerInfoDto = byerInfoDto;
	}
    
    
    
}
