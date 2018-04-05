package com.honda.hna.bigdata.weldboschsim;

import java.util.Date;

public class WeldBosch {

	Long protRecord_ID;
	Date dateTime;
	String timerName;
	Long progNo;
	String spotName;
	Long wear; 
	Double wearPerCent;
	Long monitorState;
	String monitorState_txt;
	Long regulationState;
	String regulationState_txt;
	Long measureState;
	String measureState_txt;
	Long powerState;
	String powerState_txt;
	Long sequenceState;
	String sequenceState_txt;
	Long sequenceStateAdd;
	String sequenceStateAdd_txt;
	Long sequenceRepeat;
	String sequenceRepeat_txt;
	Long monitorMode;
	String monitorMode_txt;
	Double iDemandStd;
	Double ilsts;
	Long regulationStd;
	String regulationStd_txt;
	Double iDemand1;
	Double iActual1;
	Long regulation1;
	String regulation1_txt;
	Double iDemand2;
	Double iActual2;
	Long regulation2;
	String regulation2_txt;
	Double iDemand3;
	Double iActual3;
	Long regulation3;
	String regulation3_txt;
	Double phaStd;
	Double pha1;
	Double pha2;
	Double pha3;
	Long t_iDemandStd;
	Long tActualStd;
	String partIdentString;
	Long tipDressCounter;
	Long electrodeNo;
	Double voltageActualValue;
	Double voltageRefValue;
	Double currentActualValue;
	Double currentReferenceValue;
	Double weldTimeActualValue;
	Double weldTimeRefValue;
	Double energyActualValue;
	Double energyRefValue;
	Double powerActualValue;
	Double powerRefValue;
	Double resistanceActualValue;
	Double resistanceRefValue;
	Double pulseWidthActualValue;
	Double pulseWidthRefValue;
	Double stabilisationFactorActValue;
	Double stabilisationFactorRefValue;
	Double thresholdStabilisationFactor;
	Double wldEffectStabilisationFactor;
	Double uipActualValue;
	Double uipRefValue;
	Long uirExpulsionTime;
	Long uirMeasuringActive;
	String uirMeasuringActive_txt;
	Long uirRegulationActive;
	String uirRegulationActive_txt;
	Long uirMonitoringActive;
	String uirMonitoringActive_txt;
	Long uirWeldTimeProlongationActive;
	String uirWeldTimeProlongActive_txt;
	Long uirQStoppRefCntValue;
	Long uirQStoppActCntValue;
	Long uirUipUpperTol;
	Long uirUipLowerTol;
	Long uirUipCondTol;
	Long uirPsfLowerTol;
	Long uirPsfCondTol;


	public WeldBosch() {
	}

	public WeldBosch(String timerNameIn, long messageIndex) {
		protRecord_ID=messageIndex;
		timerName=timerNameIn;
	}

	public Long getProtRecord_ID() {
		return protRecord_ID;
	}

	public Date getDateTime() {
		if(dateTime==null){
			dateTime = new Date(System.currentTimeMillis());	
		}
		return dateTime;
	}

	public String getTimerName() {
		return timerName;
	}
	
	public Long getProgNo() {
		if(progNo==null){
			progNo = (Math.round(Math.random()*17)+176);	
		}
		return progNo;
	}
	
	public String getSpotName() {
		return spotName;
	}
	
	public Long getWear() {
		wear = Math.round(Math.random()*(223-80))+80;
		return wear;
	}

	public Double getWearPerCent() {
		wearPerCent = (double) (Math.round(Math.random()*(557-200))+200)/100;
		return wearPerCent;
	}

	public Long getMonitorState() {
		monitorState=(long) 0;
		return monitorState;
	}

	public String getMonitorState_txt() {
		monitorState_txt = "Ok";
		return monitorState_txt;
	}

	public Long getRegulationState() {
		regulationState = (long) 0;
		return regulationState;
	}

	public String getRegulationState_txt() {
		regulationState_txt = "not relevant";
		return regulationState_txt;
	}

	public Long getMeasureState() {
		measureState = (long) 0;
		return measureState;
	}

	public String getMeasureState_txt() {
		measureState_txt = "not relevant";
		return measureState_txt;
	}

	public Long getPowerState() {
		powerState = (long) 0;
		return powerState;
	}

	public String getPowerState_txt() {
		powerState_txt = "OK";
		return powerState_txt;
	}

	public Long getSequenceState() {
		sequenceState = (long) 0;
		return sequenceState;
	}

	public String getSequenceState_txt() {
		sequenceState_txt = "finished";
		return sequenceState_txt;
	}

	public Long getSequenceStateAdd() {
		sequenceStateAdd = (long) 0;
		return sequenceStateAdd;
	}

	public String getSequenceStateAdd_txt() {
		sequenceStateAdd_txt = "Ok";
		return sequenceStateAdd_txt;
	}

	public Long getSequenceRepeat() {
		sequenceRepeat = (long) 0;
		return sequenceRepeat;
	}

	public String getSequenceRepeat_txt() {
		sequenceRepeat_txt = "Off";
		return sequenceRepeat_txt;
	}

	public Long getMonitorMode() {
		monitorMode = (long) 1;
		return monitorMode;
	}

	public String getMonitorMode_txt() {
		monitorMode_txt = "Mix";
		return monitorMode_txt;
	}

	public Double getiDemandStd() {
		iDemandStd = (double) (Math.round(Math.random()*(318-307))+307)/100;
		return iDemandStd;
	}

	public Double getIlsts() {
		ilsts = (double) (Math.round(Math.random()*(1044-744))+744)/100;
		return ilsts;
	}

	public Long getRegulationStd() {
		regulationStd = (long) 1;
		return regulationStd;
	}

	public String getRegulationStd_txt() {
		regulationStd_txt = "Mix";
		return regulationStd_txt;
	}

	public Double getiDemand1() {
		iDemand1 = (double) (Math.round(Math.random()*(318-307))+307)/100;
		return iDemand1;
	}

	public Double getiActual1() {
		Double rand = Math.random();
		if(rand<0.9){
			iActual1 = (double) 0;
		} else {
			iActual1 = (double) (Math.round(Math.random()*(1099-1065))+1065)/100;
		}
		return iActual1;
	}

	public Long getRegulation1() {
		if(regulation1 == null){
			Double rand = Math.random();
			if(rand<0.5){
				regulation1 = (long) 2;
			} else {
				regulation1 = (long) 4;
			}			
		}
		return regulation1;
	}

	public String getRegulation1_txt() {
		Long reg = getRegulation1();
		if(reg==2){
			regulation1_txt = "KSR";
		}
		if(reg==4){
			regulation1_txt = "UIR";
		}		
		return regulation1_txt;
	}

	public Double getiDemand2() {
		iDemand2 = (double) (Math.round(Math.random()*(1057-703))+703)/100;
		return iDemand2;
	}

	public Double getiActual2() {
		iActual2 = (double) (Math.round(Math.random()*(1044-738))+738)/100;
		return iActual2;
	}

	public Long getRegulation2() {
		regulation2 = getRegulation1();
		return regulation2;
	}

	public String getRegulation2_txt() {
		regulation2_txt = getRegulation1_txt();
		return regulation2_txt;
	}

	public Double getiDemand3() {
		iDemand3 = (double) (Math.round(Math.random()*(318-307))+307)/100;
		return iDemand3;
	}

	public Double getiActual3() {
		Double rand = Math.random();
		if(rand<0.9){
			iActual3 = (double) 0;
		} else {
			iActual3 = (double) (Math.round(Math.random()*(891-785))+785)/100;
		}
		
		return iActual3;
	}

	public Long getRegulation3() {
		regulation3 = getRegulation1();
		return regulation3;
	}

	public String getRegulation3_txt() {
		regulation3_txt = getRegulation1_txt();
		return regulation3_txt;
	}

	public Double getPhaStd() {
		phaStd = (double) (Math.round(Math.random()*(4510-2519))+2519)/100;
		return phaStd;
	}

	public Double getPha1() {
		Double rand = Math.random();
		if(rand<0.8){
			pha1 = (double) 0;
		} else {
			pha1 = (double) (Math.round(Math.random()*(5995-4339))+4339)/100;
		}
		return pha1;
	}

	public Double getPha2() {
		pha2 = (double) (Math.round(Math.random()*(4510-2451))+2451)/100;
		return pha2;
	}

	public Double getPha3() {
		Double rand = Math.random();
		if(rand<0.95){
			pha3 = (double) 0;
		} else {
			pha3 = (double) (Math.round(Math.random()*(3454-2516))+2516)/100;
		}
		return pha3;
	}

	public Long getT_iDemandStd() {
		t_iDemandStd = (long) 0;
		return t_iDemandStd;
	}

	public Long gettActualStd() {
		tActualStd = (long) (Math.round(Math.random()*(697-151))+151);
		return tActualStd;
	}

	public String getPartIdentString() {
		return partIdentString;
	}

	public Long getTipDressCounter() {
		tipDressCounter = (long) 0;
		return tipDressCounter;
	}

	public Long getElectrodeNo() {
		electrodeNo = (long) 1;
		return electrodeNo;
	}

	public Double getVoltageActualValue() {
		voltageActualValue = (double) (Math.round(Math.random()*(246-122))+122)/100;
		return voltageActualValue;
	}

	public Double getVoltageRefValue() {
		voltageRefValue = (double) 3;
		return voltageRefValue;
	}

	public Double getCurrentActualValue() {
		currentActualValue = (double) (Math.round(Math.random()*(1060-747))+747)/100;
		return currentActualValue;
	}

	public Double getCurrentReferenceValue() {
		currentReferenceValue = (double) 3;
		return currentReferenceValue;
	}

	public Double getWeldTimeActualValue() {
		weldTimeActualValue = (double) (Math.round(Math.random()*(696-150))+150);
		return weldTimeActualValue;
	}

	public Double getWeldTimeRefValue() {
		weldTimeRefValue = (double) 1000;
		return weldTimeRefValue;
	}

	public Double getEnergyActualValue() {
		energyActualValue = (double) (Math.round(Math.random()*(12647030-1689801))+1689801)/1000;
		return energyActualValue;
	}

	public Double getEnergyRefValue() {
		energyRefValue = (double) 10000;
		return energyRefValue;
	}

	public Double getPowerActualValue() {
		powerActualValue = (double) (Math.round(Math.random()*(2342683-1014271))+1689801)/100;
		return powerActualValue;
	}

	public Double getPowerRefValue() {
		powerRefValue = (double) 10000;
		return powerRefValue;
	}

	public Double getResistanceActualValue() {
		resistanceActualValue = (double) (Math.round(Math.random()*(250-126))+126);
		return resistanceActualValue;
	}

	public Double getResistanceRefValue() {
		resistanceRefValue = (double) 300;
		return resistanceRefValue;
	}

	public Double getPulseWidthActualValue() {
		pulseWidthActualValue = (double) (Math.round(Math.random()*(4481-2497))+2497)/100;
		return pulseWidthActualValue;
	}

	public Double getPulseWidthRefValue() {
		pulseWidthRefValue = (double) 100;
		return pulseWidthRefValue;
	}

	public Double getStabilisationFactorActValue() {
		Double rand = Math.random();
		if(rand<0.7){
			stabilisationFactorActValue = (double) 0;
		} else {
			stabilisationFactorActValue = (double) (Math.round(Math.random()*(99-71))+71);
		}
		return stabilisationFactorActValue;
	}

	public Double getStabilisationFactorRefValue() {
		stabilisationFactorRefValue = (double) 100;
		return stabilisationFactorRefValue;
	}

	public Double getThresholdStabilisationFactor() {
		thresholdStabilisationFactor = (double) 0;
		return thresholdStabilisationFactor;
	}

	public Double getWldEffectStabilisationFactor() {
		wldEffectStabilisationFactor = (double) 100;
		return wldEffectStabilisationFactor;
	}

	public Double getUipActualValue() {
		Double rand = Math.random();
		if(rand<0.8){
			uipActualValue = (double) 0;
		} else {
			uipActualValue = (double) (Math.round(Math.random()*(177-87))+87);
		}
		
		return uipActualValue;
	}

	public Double getUipRefValue() {
		uipRefValue = (double) 100;
		return uipRefValue;
	}

	public Long getUirExpulsionTime() {
		Double rand = Math.random();
		Double rand2 = (double) (Math.round(Math.random()*(90-60))+60)/100;
		
		if(rand<rand2){
			uirExpulsionTime = (long) 0;
		} else {
			uirExpulsionTime = (long) (Math.round(Math.random()*(524-49))+49);
		}
		
		return uirExpulsionTime;
	}

	public Long getUirMeasuringActive() {
		uirMeasuringActive = (long) 1;
		return uirMeasuringActive;
	}

	public String getUirMeasuringActive_txt() {
		uirMeasuringActive_txt = "On";
		return uirMeasuringActive_txt;
	}

	public Long getUirRegulationActive() {
		if(uirRegulationActive == null){
			Double rand = Math.random();
			if(rand<0.7){
				uirRegulationActive = (long) 0;
			} else {
				uirRegulationActive = (long) 1;
			}			
		}
		return uirRegulationActive;
	}

	public String getUirRegulationActive_txt() {
		if(getUirRegulationActive() == 0){
			uirRegulationActive_txt = "Off";
		}else{
			uirRegulationActive_txt = "On";
		}
		return uirRegulationActive_txt;
	}

	public Long getUirMonitoringActive() {
		uirMonitoringActive = (long) 0;
		return uirMonitoringActive;
	}

	public String getUirMonitoringActive_txt() {
		uirMonitoringActive_txt = "Off";
		return uirMonitoringActive_txt;
	}

	public Long getUirWeldTimeProlongationActive() {
		if(uirWeldTimeProlongationActive == null){
			Double rand = Math.random();
			if(rand<0.7){
				uirWeldTimeProlongationActive = (long) 0;
			} else {
				uirWeldTimeProlongationActive = (long) 1;
			}			
		}
		return uirWeldTimeProlongationActive;
	}

	public String getUirWeldTimeProlongActive_txt() {
		if(getUirWeldTimeProlongationActive() == 0){
			uirWeldTimeProlongActive_txt = "Off";
		} else {
			uirWeldTimeProlongActive_txt = "On";
		}
		return uirWeldTimeProlongActive_txt;
	}

	public Long getUirQStoppRefCntValue() {
		uirQStoppRefCntValue = (long) 0;
		return uirQStoppRefCntValue;
	}

	public Long getUirQStoppActCntValue() {
		uirQStoppActCntValue = (long) 0;
		return uirQStoppActCntValue;
	}

	public Long getUirUipUpperTol() {
		uirUipUpperTol = (long) 100;
		return uirUipUpperTol;
	}

	public Long getUirUipLowerTol() {
		uirUipLowerTol = (long) 100;
		return uirUipLowerTol;
	}

	public Long getUirUipCondTol() {
		uirUipCondTol = (long) 100;
		return uirUipCondTol;
	}

	public Long getUirPsfLowerTol() {
		uirPsfLowerTol = (long) 100;
		return uirPsfLowerTol;
	}

	public Long getUirPsfCondTol() {
		uirPsfCondTol = (long) 100;
		return uirPsfCondTol;
	}

	public void setProtRecord_ID(Long protRecord_ID) {
		this.protRecord_ID = protRecord_ID;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public void setTimerName(String timerName) {
		this.timerName = timerName;
	}

	public void setProgNo(Long progNo) {
		this.progNo = progNo;
	}

	public void setSpotName(String spotName) {
		this.spotName = spotName;
	}

	public void setWear(Long wear) {
		this.wear = wear;
	}

	public void setWearPerCent(Double wearPerCent) {
		this.wearPerCent = wearPerCent;
	}

	public void setMonitorState(Long monitorState) {
		this.monitorState = monitorState;
	}

	public void setMonitorState_txt(String monitorState_txt) {
		this.monitorState_txt = monitorState_txt;
	}

	public void setRegulationState(Long regulationState) {
		this.regulationState = regulationState;
	}

	public void setRegulationState_txt(String regulationState_txt) {
		this.regulationState_txt = regulationState_txt;
	}

	public void setMeasureState(Long measureState) {
		this.measureState = measureState;
	}

	public void setMeasureState_txt(String measureState_txt) {
		this.measureState_txt = measureState_txt;
	}

	public void setPowerState(Long powerState) {
		this.powerState = powerState;
	}

	public void setPowerState_txt(String powerState_txt) {
		this.powerState_txt = powerState_txt;
	}

	public void setSequenceState(Long sequenceState) {
		this.sequenceState = sequenceState;
	}

	public void setSequenceState_txt(String sequenceState_txt) {
		this.sequenceState_txt = sequenceState_txt;
	}

	public void setSequenceStateAdd(Long sequenceStateAdd) {
		this.sequenceStateAdd = sequenceStateAdd;
	}

	public void setSequenceStateAdd_txt(String sequenceStateAdd_txt) {
		this.sequenceStateAdd_txt = sequenceStateAdd_txt;
	}

	public void setSequenceRepeat(Long sequenceRepeat) {
		this.sequenceRepeat = sequenceRepeat;
	}

	public void setSequenceRepeat_txt(String sequenceRepeat_txt) {
		this.sequenceRepeat_txt = sequenceRepeat_txt;
	}

	public void setMonitorMode(Long monitorMode) {
		this.monitorMode = monitorMode;
	}

	public void setMonitorMode_txt(String monitorMode_txt) {
		this.monitorMode_txt = monitorMode_txt;
	}

	public void setiDemandStd(Double iDemandStd) {
		this.iDemandStd = iDemandStd;
	}

	public void setIlsts(Double ilsts) {
		this.ilsts = ilsts;
	}

	public void setRegulationStd(Long regulationStd) {
		this.regulationStd = regulationStd;
	}

	public void setRegulationStd_txt(String regulationStd_txt) {
		this.regulationStd_txt = regulationStd_txt;
	}

	public void setiDemand1(Double iDemand1) {
		this.iDemand1 = iDemand1;
	}

	public void setiActual1(Double iActual1) {
		this.iActual1 = iActual1;
	}

	public void setRegulation1(Long regulation1) {
		this.regulation1 = regulation1;
	}

	public void setRegulation1_txt(String regulation1_txt) {
		this.regulation1_txt = regulation1_txt;
	}

	public void setiDemand2(Double iDemand2) {
		this.iDemand2 = iDemand2;
	}

	public void setiActual2(Double iActual2) {
		this.iActual2 = iActual2;
	}

	public void setRegulation2(Long regulation2) {
		this.regulation2 = regulation2;
	}

	public void setRegulation2_txt(String regulation2_txt) {
		this.regulation2_txt = regulation2_txt;
	}

	public void setiDemand3(Double iDemand3) {
		this.iDemand3 = iDemand3;
	}

	public void setiActual3(Double iActual3) {
		this.iActual3 = iActual3;
	}

	public void setRegulation3(Long regulation3) {
		this.regulation3 = regulation3;
	}

	public void setRegulation3_txt(String regulation3_txt) {
		this.regulation3_txt = regulation3_txt;
	}

	public void setPhaStd(Double phaStd) {
		this.phaStd = phaStd;
	}

	public void setPha1(Double pha1) {
		this.pha1 = pha1;
	}

	public void setPha2(Double pha2) {
		this.pha2 = pha2;
	}

	public void setPha3(Double pha3) {
		this.pha3 = pha3;
	}

	public void setT_iDemandStd(Long t_iDemandStd) {
		this.t_iDemandStd = t_iDemandStd;
	}

	public void settActualStd(Long tActualStd) {
		this.tActualStd = tActualStd;
	}

	public void setPartIdentString(String partIdentString) {
		this.partIdentString = partIdentString;
	}

	public void setTipDressCounter(Long tipDressCounter) {
		this.tipDressCounter = tipDressCounter;
	}

	public void setElectrodeNo(Long electrodeNo) {
		this.electrodeNo = electrodeNo;
	}

	public void setVoltageActualValue(Double voltageActualValue) {
		this.voltageActualValue = voltageActualValue;
	}

	public void setVoltageRefValue(Double voltageRefValue) {
		this.voltageRefValue = voltageRefValue;
	}

	public void setCurrentActualValue(Double currentActualValue) {
		this.currentActualValue = currentActualValue;
	}

	public void setCurrentReferenceValue(Double currentReferenceValue) {
		this.currentReferenceValue = currentReferenceValue;
	}

	public void setWeldTimeActualValue(Double weldTimeActualValue) {
		this.weldTimeActualValue = weldTimeActualValue;
	}

	public void setWeldTimeRefValue(Double weldTimeRefValue) {
		this.weldTimeRefValue = weldTimeRefValue;
	}

	public void setEnergyActualValue(Double energyActualValue) {
		this.energyActualValue = energyActualValue;
	}

	public void setEnergyRefValue(Double energyRefValue) {
		this.energyRefValue = energyRefValue;
	}

	public void setPowerActualValue(Double powerActualValue) {
		this.powerActualValue = powerActualValue;
	}

	public void setPowerRefValue(Double powerRefValue) {
		this.powerRefValue = powerRefValue;
	}

	public void setResistanceActualValue(Double resistanceActualValue) {
		this.resistanceActualValue = resistanceActualValue;
	}

	public void setResistanceRefValue(Double resistanceRefValue) {
		this.resistanceRefValue = resistanceRefValue;
	}

	public void setPulseWidthActualValue(Double pulseWidthActualValue) {
		this.pulseWidthActualValue = pulseWidthActualValue;
	}

	public void setPulseWidthRefValue(Double pulseWidthRefValue) {
		this.pulseWidthRefValue = pulseWidthRefValue;
	}

	public void setStabilisationFactorActValue(Double stabilisationFactorActValue) {
		this.stabilisationFactorActValue = stabilisationFactorActValue;
	}

	public void setStabilisationFactorRefValue(Double stabilisationFactorRefValue) {
		this.stabilisationFactorRefValue = stabilisationFactorRefValue;
	}

	public void setThresholdStabilisationFactor(Double thresholdStabilisationFactor) {
		this.thresholdStabilisationFactor = thresholdStabilisationFactor;
	}

	public void setWldEffectStabilisationFactor(Double wldEffectStabilisationFactor) {
		this.wldEffectStabilisationFactor = wldEffectStabilisationFactor;
	}

	public void setUipActualValue(Double uipActualValue) {
		this.uipActualValue = uipActualValue;
	}

	public void setUipRefValue(Double uipRefValue) {
		this.uipRefValue = uipRefValue;
	}

	public void setUirExpulsionTime(Long uirExpulsionTime) {
		this.uirExpulsionTime = uirExpulsionTime;
	}

	public void setUirMeasuringActive(Long uirMeasuringActive) {
		this.uirMeasuringActive = uirMeasuringActive;
	}

	public void setUirMeasuringActive_txt(String uirMeasuringActive_txt) {
		this.uirMeasuringActive_txt = uirMeasuringActive_txt;
	}

	public void setUirRegulationActive(Long uirRegulationActive) {
		this.uirRegulationActive = uirRegulationActive;
	}

	public void setUirRegulationActive_txt(String uirRegulationActive_txt) {
		this.uirRegulationActive_txt = uirRegulationActive_txt;
	}

	public void setUirMonitoringActive(Long uirMonitoringActive) {
		this.uirMonitoringActive = uirMonitoringActive;
	}

	public void setUirMonitoringActive_txt(String uirMonitoringActive_txt) {
		this.uirMonitoringActive_txt = uirMonitoringActive_txt;
	}

	public void setUirWeldTimeProlongationActive(Long uirWeldTimeProlongationActive) {
		this.uirWeldTimeProlongationActive = uirWeldTimeProlongationActive;
	}

	public void setUirWeldTimeProlongActive_txt(String uirWeldTimeProlongActive_txt) {
		this.uirWeldTimeProlongActive_txt = uirWeldTimeProlongActive_txt;
	}

	public void setUirQStoppRefCntValue(Long uirQStoppRefCntValue) {
		this.uirQStoppRefCntValue = uirQStoppRefCntValue;
	}

	public void setUirQStoppActCntValue(Long uirQStoppActCntValue) {
		this.uirQStoppActCntValue = uirQStoppActCntValue;
	}

	public void setUirUipUpperTol(Long uirUipUpperTol) {
		this.uirUipUpperTol = uirUipUpperTol;
	}

	public void setUirUipLowerTol(Long uirUipLowerTol) {
		this.uirUipLowerTol = uirUipLowerTol;
	}

	public void setUirUipCondTol(Long uirUipCondTol) {
		this.uirUipCondTol = uirUipCondTol;
	}

	public void setUirPsfLowerTol(Long uirPsfLowerTol) {
		this.uirPsfLowerTol = uirPsfLowerTol;
	}

	public void setUirPsfCondTol(Long uirPsfCondTol) {
		this.uirPsfCondTol = uirPsfCondTol;
	}
}
