package com.aris.mardiyanto.myapp.strategies;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.aris.mardiyanto.myapp.appconstant.TabunganName;

@Component
public interface ITabungan {
	BigDecimal calcInterest(BigDecimal amount);
	TabunganName getTabunganName();
}
