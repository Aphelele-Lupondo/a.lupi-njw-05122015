package api.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType
public class SalesDetails implements Serializable{

	int salesId;
	int unitPrice;
	String unitQuantity;
	public SalesDetails(){
		
	}
	public SalesDetails(int salesId, int unitPrice, String unitQuantity) {
		super();
		this.salesId = salesId;
		this.unitPrice = unitPrice;
		this.unitQuantity = unitQuantity;
	}
	public int getSalesId() {
		return salesId;
	}
	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getUnitQuantity() {
		return unitQuantity;
	}
	public void setUnitQuantity(String unitQuantity) {
		this.unitQuantity = unitQuantity;
	}

}
