package api.services;

import java.util.List;

import api.dto.Sales;

public interface SalesService {

	public Sales recordSales(Sales sales, Sales principleId);

	public List<Sales> listSales(int start,int numberOfrecords);

	public Sales voidSales(Sales sales, Sales id);

	public Sales viewReport(Sales sales, Sales principleId);

	public Sales getSales(Sales sales);

}
