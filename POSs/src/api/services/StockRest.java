package api.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import api.dto.Stock;

@Path("/Stock")
public interface StockRest {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Stock createStock(Stock stock);
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/Stock/{id}")
	public List<Stock> deleteStock(int id);
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Stock updateStock(Stock stock);

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/Stock/{id}")
	public Stock getStock(int id);

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Stock> listStocks();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Stock acceptDelivery(Stock stock);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Stock transferStock(Stock stock);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Stock adjustStock(Stock stock);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Stock receiveStock(Stock stock);
	
}
