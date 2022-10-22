package sales.model.domain;

//빈 클래스 정의
public class SalesDTO {
	private int year;
	private int quarter;
	private int comm_num;
	private String comm_name;
	private String area;
	private int sales;
	private int salse_num;
	private int store_num;
   public int a;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		builder.append("판매량=");
		builder.append(sales);
		builder.append("지역=");
		builder.append(area);
	
		return builder.toString();
	}

	public SalesDTO() {
	}
	public SalesDTO( String area) {
		super();
				this.area = area;

	}

	public SalesDTO(int quarter, String area) {
		super();
		this.quarter = quarter;
		this.area = area;

	}

	public SalesDTO(int year, int quarter, int comm_num, String comm_name, String area, int sales, int salse_num,
			int store_num) {
		super();
		this.quarter = quarter;
		this.comm_num = comm_num;
		this.comm_name = comm_name;
		this.area = area;
		this.sales = sales;
		this.salse_num = salse_num;
		this.store_num = store_num;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getQuarter() {
		return quarter;
	}

	public void setQuarter(int quarter) {
		this.quarter = quarter;
	}

	public int getComm_num() {
		return comm_num;
	}

	public void setComm_num(int comm_num) {
		this.comm_num = comm_num;
	}

	public String getComm_name() {
		return comm_name;
	}

	public void setComm_name(String comm_name) {
		this.comm_name = comm_name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public int getSalse_num() {
		return salse_num;
	}

	public void setSalse_num(int salse_num) {
		this.salse_num = salse_num;
	}

	public int getStore_num() {
		return store_num;
	}

	public void setStore_num(int store_num) {
		this.store_num = store_num;
	}

}
