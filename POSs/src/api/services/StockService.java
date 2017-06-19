package api.services;

import java.util.List;

import api.dto.Stock;

public interface StockService {

	// CRUD
	public Stock createStock(Stock stock);

	public List<Stock> deleteStock(int id);

	public Stock updateStock(Stock stock);

	public Stock getStock(int id);

	public List<Stock> listStocks();

	// Stock treatment/handeling of stock
	public Stock acceptDelivery(Stock stock);

	public Stock transferStock(Stock stock);

	public Stock adjustStock(Stock stock);

	public Stock receiveStock(Stock stock);

}
