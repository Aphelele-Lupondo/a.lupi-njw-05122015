package api.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType
public class CurrentStock implements Serializable {
public CurrentStock(){	
}

	int id;
	String quantity;
	String refill;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getRefill() {
		return refill;
	}
	public void setRefill(String refill) {
		this.refill = refill;
	}
	public CurrentStock(int id, String quantity, String refill) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.refill = refill;
	}
}