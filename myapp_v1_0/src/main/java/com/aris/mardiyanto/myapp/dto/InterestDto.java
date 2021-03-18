package com.aris.mardiyanto.myapp.dto;

import java.math.BigDecimal;

public class InterestDto {
	private String tabunganName;
	private BigDecimal amountInterest;
	
	public String getTabunganName() {
		return tabunganName;
	}
	public void setTabunganName(String tabunganName) {
		this.tabunganName = tabunganName;
	}
	public BigDecimal getAmountInterest() {
		return amountInterest;
	}
	public void setAmountInterest(BigDecimal amountInterest) {
		this.amountInterest = amountInterest;
	}
	
}
