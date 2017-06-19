package api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType
public class StoreStock implements Serializable {

	int id;
	String quantity;
	String StockOrderLevel;
	String Description;
	int SerialNumber;
	int Barcode;
public StoreStock(){
	
}
	public StoreStock(int id, String quantity, String stockOrderLevel, String description, int serialNumber,
			int barcode, List<CurrentStock> list) {
		super();
		this.id = id;
		this.quantity = quantity;
		StockOrderLevel = stockOrderLevel;
		Description = description;
		SerialNumber = serialNumber;
		Barcode = barcode;
		this.list = list;
	}

	List<CurrentStock> list = new ArrayList();

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

	public String getStockOrderLevel() {
		return StockOrderLevel;
	}

	public void setStockOrderLevel(String stockOrderLevel) {
		StockOrderLevel = stockOrderLevel;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getSerialNumber() {
		return SerialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		SerialNumber = serialNumber;
	}

	public int getBarcode() {
		return Barcode;
	}

	public void setBarcode(int barcode) {
		Barcode = barcode;
	}

	public List<CurrentStock> getList() {
		return list;
	}

	public void setList(List<CurrentStock> list) {
		this.list = list;
	}
}
