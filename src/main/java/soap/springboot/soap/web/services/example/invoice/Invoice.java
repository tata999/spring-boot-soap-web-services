package soap.springboot.soap.web.services.example.invoice;

public class Invoice {
	private Long id;
	private String name;
	private String invoiceNumber;

	public Invoice() {
		super();
	}

	public Invoice(Long id, String name, String invoiceNumber) {
		super();
		this.id = id;
		this.name = name;
		this.invoiceNumber = invoiceNumber;
	}

	public Invoice(String name, String invoiceNumber) {
		super();
		this.name = name;
		this.invoiceNumber = invoiceNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportNumber() {
		return invoiceNumber;
	}

	public void setPassportNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	@Override
	public String toString() {
		return String.format("Invoice [id=%s, name=%s, invoiceNumber=%s]", id, name, invoiceNumber);
	}

}
