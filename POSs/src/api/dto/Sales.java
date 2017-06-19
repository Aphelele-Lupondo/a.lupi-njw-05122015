package api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType
public class Sales implements Serializable{

	int id;
	int totalPrice;
	List<CurrentStock> list = new ArrayList();
	public Sales(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<CurrentStock> getList() {
		return list;
	}
	public void setList(List<CurrentStock> list) {
		this.list = list;
	}
	public Sales(int id, int totalPrice, List<CurrentStock> list) {
		super();
		this.id = id;
		this.totalPrice = totalPrice;
		this.list = list;
	}
}
