package api.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import api.dto.Sales;

@Path("/Sales")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface SalesRest {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Sales recordSales(Sales sales, Sales principleId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Sales> listSales(int start,int numberOfrecords);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Sales voidSales(Sales sales, Sales id);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Sales viewReport(Sales sales, Sales principleId);

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/Sales/{id}")
	public Sales getSales(Sales sales);
}
