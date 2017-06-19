package api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType
public class Stock implements Serializable {

	String name;
	int id;
	String measureType;
	String stockCode;
	
	List<StoreStock> list = new ArrayList();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
public Stock(){
	}
	public Stock(String name, int id, String measureType, String stockCode, List<StoreStock> list) {
		super();
		this.name = name;
		this.id = id;
		this.measureType = measureType;
		this.stockCode = stockCode;
		this.list = list;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMeasureType() {
		return measureType;
	}

	public void setMeasureType(String measureType) {
		this.measureType = measureType;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public List<StoreStock> getList() {
		return list;
	}

	public void setList(List<StoreStock> list) {
		this.list = list;
	}
	
}
