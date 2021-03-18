package com.aris.mardiyanto.myapp.service;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aris.mardiyanto.myapp.appconstant.TabunganName;
import com.aris.mardiyanto.myapp.factory.TabunganFactory;
import com.aris.mardiyanto.myapp.strategies.ITabungan;

@Service
public class TabunganService {
	@Autowired
	private TabunganFactory tabFactory;
	private BigDecimal amountInterest;
	ITabungan tab;
	
	public BigDecimal getInterests(BigDecimal amount,  TabunganName aTabunganName){  
		BigDecimal amt;
		amt = amount; //new BigDecimal(1000); 
		
		tab = tabFactory.findTabungan(aTabunganName);
		amountInterest = tab.calcInterest(amt);

		return amountInterest;
	  }
}
