package com.aris.mardiyanto.myapp.controller;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aris.mardiyanto.myapp.appconstant.TabunganName;
import com.aris.mardiyanto.myapp.dto.InterestDto;
import com.aris.mardiyanto.myapp.service.TabunganService;


@RestController
@RequestMapping("api")
public class MyController {

	@Autowired
	private TabunganService tabunganSvc;

	@RequestMapping(value = "/getinterest", method = RequestMethod.GET)
	public ResponseEntity<?> getinterest() {
		List<InterestDto> res = new ArrayList<InterestDto>();
		BigDecimal amt = new BigDecimal(1000);
		
		//using java 8 Stream
		Stream.of(TabunganName.values())
	      .forEach((item) -> populateList(res, amt, item)
	    		  );
		return new ResponseEntity<>(res, HttpStatus.OK); 
	}
	
	private void populateList(List<InterestDto> aList, BigDecimal amount, TabunganName aTabunganName ){
		//List<InterestDto> ls = new ArrayList<InterestDto>();
			InterestDto dto = new InterestDto();
			BigDecimal amt = tabunganSvc.getInterests(amount, aTabunganName);
			dto.setAmountInterest(amt);
			dto.setTabunganName(aTabunganName.toString());
			aList.add(dto);
		
		//return aList;
	}

}
