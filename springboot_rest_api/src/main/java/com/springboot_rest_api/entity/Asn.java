package com.springboot_rest_api.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.crypto.Data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter*/
@Entity
@XmlRootElement
@Table(name = "ASN")
public class Asn implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Po_Item_Id;

	private String Plant;
	private int Asn_Id;
	private String Asn_Status;
	private String Asn_Name;
	private String Logical_Id;
	private java.util.Date Date;
	private java.util.Date Expect_Deliv_Date;
	private java.util.Date shipping_Date;
	private Long Shipping_Id;
	private String Mode_Of_Transport;
	private String Transport_Id_Code;

	public int getAsn_Id() {
		return Asn_Id;
	}

	public void setAsn_Id(int asn_Id) {
		Asn_Id = asn_Id;
	}

	public String getAsn_Status() {
		return Asn_Status;
	}

	public void setAsn_Status(String asn_Status) {
		Asn_Status = asn_Status;
	}

	public String getAsn_Name() {
		return Asn_Name;
	}

	public void setAsn_Name(String asn_Name) {
		Asn_Name = asn_Name;
	}

	public Long getShipping_Id() {
		return Shipping_Id;
	}

	public void setShipping_Id(Long shipping_Id) {
		Shipping_Id = shipping_Id;
	}

	@Override
	public String toString() {
		return "Asn [Po_Item_Id=" + Po_Item_Id + ", Plant=" + Plant + ", Asn_Id=" + Asn_Id + ", Asn_Status="
				+ Asn_Status + ", Asn_Name=" + Asn_Name + ", Logical_Id=" + Logical_Id + ", Date=" + Date
				+ ", Expect_Deliv_Date=" + Expect_Deliv_Date + ", shipping_Date=" + shipping_Date + ", Shipping_Id="
				+ Shipping_Id + ", Mode_Of_Transport=" + Mode_Of_Transport + ", Transport_Id_Code=" + Transport_Id_Code
				+ "]";
	}

}
