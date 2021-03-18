package com.aris.mardiyanto.myapp.strategies;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;
import com.aris.mardiyanto.myapp.appconstant.TabunganName;

@Component
public class Ekspresi implements ITabungan {

	@Override
	public BigDecimal calcInterest(BigDecimal amount) {
		// TODO Auto-generated method stub
		return amount.multiply(BigDecimal.valueOf(0.29));
	}

	@Override
	public TabunganName getTabunganName() {
		// TODO Auto-generated method stub
		return TabunganName.Ekspresi;
	}

}
