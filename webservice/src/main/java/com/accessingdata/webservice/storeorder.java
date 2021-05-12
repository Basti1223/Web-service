package com.accessingdata.webservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class storeorder {
	private Integer id;
	private String rowId;
	private String orderId;
	private String orderDate;
	private String shipDate;
	private String shipMode;
	private String customerId;
	private String segment;
	private String country;
	private String city;
	private String state;
	private String postalCode;
	private String region;
	private String productId;
	private String category;
	private String subCategory;
	private String productName;
	private String sales;
	private float discount;
	private float profit;

	public storeorder() {
	}

	public storeorder(Integer id, String rowId, String orderId, String orderDate, String shipDate, String shipMode,
			String customerId, String segment, String country, String city, String state, String postalCode,
			String region, String productId, String category, String subCategory, String productName, String sales,
			float discount, float profit) {
		super();
		this.id = id;
		this.rowId = rowId;
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.shipDate = shipDate;
		this.shipMode = shipMode;
		this.customerId = customerId;
		this.segment = segment;
		this.country = country;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.region = region;
		this.productId = productId;
		this.category = category;
		this.subCategory = subCategory;
		this.productName = productName;
		this.sales = sales;
		this.discount = discount;
		this.profit = profit;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getShipDate() {
		return shipDate;
	}

	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}

	public String getShipMode() {
		return shipMode;
	}

	public void setShipMode(String shipMode) {
		this.shipMode = shipMode;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSales() {
		return sales;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getProfit() {
		return profit;
	}

	public void setProfit(float profit) {
		this.profit = profit;
	}

}
