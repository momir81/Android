package com.example.stockquote;

public class StockInfo {

	
	private String daysLow = "";
	
	
	public StockInfo(String daysLow, String daysHigh, String yearsLow,
			String yearsHigh, String name, String lastTRadePriceonly,
			String change, String daysRange) {
		super();
		this.daysLow = daysLow;
		this.daysHigh = daysHigh;
		this.yearsLow = yearsLow;
		this.yearsHigh = yearsHigh;
		this.name = name;
		this.lastTRadePriceonly = lastTRadePriceonly;
		this.change = change;
		this.daysRange = daysRange;
	}
	public String getDaysLow() {
		return daysLow;
	}
	public void setDaysLow(String daysLow) {
		this.daysLow = daysLow;
	}
	public String getDaysHigh() {
		return daysHigh;
	}
	public void setDaysHigh(String daysHigh) {
		this.daysHigh = daysHigh;
	}
	public String getChange() {
		return change;
	}
	public void setChange(String change) {
		this.change = change;
	}
	public String getDaysRange() {
		return daysRange;
	}
	public void setDaysRange(String daysRange) {
		this.daysRange = daysRange;
	}
	private String daysHigh = "";
	private String yearsLow = "";
	private String yearsHigh = "";
	private String name = "";
	private String lastTRadePriceonly = "";
	private String change = "";
	private String daysRange = "";
	public String getYearLow() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getYearHigh() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getLastTradePriceOnly() {
		// TODO Auto-generated method stub
		return null;
	}
}
