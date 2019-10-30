package com.springboot_rest_api.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PURCHASE ORDER LINE ITEM")
public class PurchaseOrderLineItem implements Serializable{
	@NotNull
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Po_Id;
	@NotNull
	private String Po_Item_Id;
	@NotNull
	private String Logical_Id;
	@NotNull
	private String Material_Category;
	@NotNull
	private String Service_Category;
	@NotNull
	private String Material_Id;
	@NotNull
	private String Service_Id;
	@NotNull
	private char Plant;
	@NotNull
	private int Po_Quantity;
	@NotNull
	private char Unit_Of_Measure;
	@NotNull
	private double Unit_Price;
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date Required_Date;
	@Override
	public String toString() {
		return "PurchaseOrderLineItem [Po_Id=" + Po_Id + ", Po_Item_Id=" + Po_Item_Id + ", Logical_Id=" + Logical_Id
				+ ", Material_Category=" + Material_Category + ", Service_Category=" + Service_Category
				+ ", Material_Id=" + Material_Id + ", Service_Id=" + Service_Id + ", Plant=" + Plant + ", Po_Quantity="
				+ Po_Quantity + ", Unit_Of_Measure=" + Unit_Of_Measure + ", Unit_Price=" + Unit_Price
				+ ", Required_Date=" + Required_Date + "]";
	}

	
}
