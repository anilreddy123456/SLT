package com.springboot_rest_api.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PURCHASE ORDER HEADER")
public class PurchageOrderHeader implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Po_Id")
	private Long PONumber;
	
	@Column(name="Logical_Id")
	private String LogicalSystem;
	
	@Column(name="Description")
	private String Description;
	
	@Column(name="Po_Type")
	private String POType;
	
	@Column(name="Ref_Number")
	private String ReferenceNumber;
	
	@Column(name="Po_Created_By")
	private String POCreatedBy;
	
	@Column(name="Po_Date")
	private Date POCreationDate;
	
	@Column(name="Required_Date")
	private Date RequiredDate;
	
	@Column(name="Net_amount")
	private double NetAmount;
	
	@Column(name="Tax_amount")
	private double TaxAmount;
	
	@Column(name="Total_Amount")
	private double TotalAmount;
	
	@Column(name="Currency")
	private double Currency;
	
	@Column(name="Vendor_Id")
	private int VendorNumber;
	
	@Column(name="Vendor_Name")
	private String VendorName;
	
	@Column(name="Payment_Term")
	private String PaymentTerms;
	
	@Column(name="Inco_Terms")
	private String IncoTerms;
	
	@Column(name="Billing_Adrs_Id")
	private int BillingAddressId;
	
	@Column(name="Delivery_Adrs_Id")
	private int DeliveryAddressId;
	
	@Column(name="Supplier_Adrs_Id")
	private int SupplierAddressId;

	@Override
	public String toString() {
		return "PurchageOrderHeader [PONumber=" + PONumber + ", LogicalSystem=" + LogicalSystem + ", Description="
				+ Description + ", POType=" + POType + ", ReferenceNumber=" + ReferenceNumber + ", POCreatedBy="
				+ POCreatedBy + ", POCreationDate=" + POCreationDate + ", RequiredDate=" + RequiredDate + ", NetAmount="
				+ NetAmount + ", TaxAmount=" + TaxAmount + ", TotalAmount=" + TotalAmount + ", Currency=" + Currency
				+ ", VendorNumber=" + VendorNumber + ", VendorName=" + VendorName + ", PaymentTerms=" + PaymentTerms
				+ ", IncoTerms=" + IncoTerms + ", BillingAddressId=" + BillingAddressId + ", DeliveryAddressId="
				+ DeliveryAddressId + ", SupplierAddressId=" + SupplierAddressId + "]";
	}

	
}
