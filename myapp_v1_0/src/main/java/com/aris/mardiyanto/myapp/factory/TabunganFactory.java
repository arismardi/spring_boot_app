package com.aris.mardiyanto.myapp.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aris.mardiyanto.myapp.appconstant.TabunganName;
import com.aris.mardiyanto.myapp.strategies.ITabungan;

@Component
public class TabunganFactory {
	  
	  private Map<TabunganName, ITabungan> tabungans;
	  
	  @Autowired
	  public TabunganFactory(List<ITabungan> tabunganSet) {
	      //ftabunganSet = tabunganSet;
		  createTabungan(tabunganSet);
	  }
	  	  
	  public ITabungan findTabungan(TabunganName aTabunganName) {
	     return tabungans.get(aTabunganName);
	  }
	  
	  public void createTabungan(List<ITabungan> tabunganSet) {
	      tabungans = new HashMap<TabunganName, ITabungan>();
	      tabunganSet.forEach( 
			   Tabungan ->tabungans.put(Tabungan.getTabunganName(), Tabungan)
		  );
		  /*for (ITabungan beanName : tabunganSet) {
			    System.out.println("getTabunganName "+beanName.getTabunganName());
		  }*/
	      
	}

}
