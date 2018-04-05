package com.honda.hna.bigdata.weldboschsim;

import org.apache.camel.component.dataset.SimpleDataSet;

public class WeldBoschDataSet extends SimpleDataSet {
	String timerName;
	

	public WeldBoschDataSet(String timerName) {
		super();
		this.timerName = timerName;
	}


	@Override
	protected Object createMessageBody(long messageIndex) {
		return new WeldBosch(timerName,messageIndex);
	}

}
