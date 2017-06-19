package api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType
public class Store implements Serializable{

	String name;
	int id;
	int ParentId;
	List<Stock> list =new ArrayList();
	public Store(){
		
	}
	public Store(String name, int id, int parentId, List<Stock> list) {
		super();
		this.name = name;
		this.id = id;
		ParentId = parentId;
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentId() {
		return ParentId;
	}
	public void setParentId(int parentId) {
		ParentId = parentId;
	}
	public List<Stock> getList() {
		return list;
	}
	public void setList(List<Stock> list) {
		this.list = list;
	}
	

	
}
