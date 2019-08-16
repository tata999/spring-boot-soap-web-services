package soap.springboot.soap.web.services.example.invoice;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class InvoiceDetailsEndpoint {

	@PayloadRoot(namespace = "http://soap.com/invoices", localPart = "GetInvoiceDetailsRequest")
	@ResponsePayload
	public soap.invoices.GetInvoiceDetailsResponse processCourseDetailsRequest(@RequestPayload soap.invoices.GetInvoiceDetailsRequest request) {
		soap.invoices.GetInvoiceDetailsResponse response = new soap.invoices.GetInvoiceDetailsResponse();
		
		soap.invoices.InvoiceDetails invoiceDetails = new soap.invoices.InvoiceDetails();
		invoiceDetails.setId(request.getId());
		invoiceDetails.setName("Adam");
		invoiceDetails.setInvoiceNumber("E1234567");
		
		response.setInvoiceDetails(invoiceDetails);
		
		return response;
	}

}