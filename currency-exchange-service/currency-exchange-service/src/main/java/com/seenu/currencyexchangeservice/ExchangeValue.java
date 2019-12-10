package com.seenu.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	@Id
	
	private long id;
	@Column(name="currency_from")
	
	private String from;
	@Column(name="currency_to")
	
	private String to;
	private BigDecimal ConvertionMultiple;
	private int port;
	
	private ExchangeValue() {
	}
	
	public ExchangeValue(long id, String from, String to, BigDecimal convertionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.ConvertionMultiple = convertionMultiple;
	}
	public long getId() {
		return id;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public BigDecimal getConvertionMultiple() {
		return ConvertionMultiple;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
}
