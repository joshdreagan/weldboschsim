import groovy.json.JsonOutput

import java.util.Date

weldBosch = [:]
weldBosch['protRecord_ID'] = request.headers['protRecordId']
weldBosch['dateTime'] = new Date()
weldBosch['timerName'] = null
weldBosch['progNo'] = Math.round(Math.random()*17)+176
weldBosch['spotName'] = null
weldBosch['wear'] = Math.round(Math.random()*(223-80))+80
weldBosch['wearPerCent'] = (Math.round(Math.random()*(557-200))+200)/100
weldBosch['monitorState'] = 0L
weldBosch['monitorState_txt'] = 'Ok'
weldBosch['regulationState'] = 0L
weldBosch['regulationState_txt'] = 'not relevant'
weldBosch['measureState'] = 0L
weldBosch['measureState_txt'] = 'not relevant'
weldBosch['powerState'] = 0L
weldBosch['powerState_txt'] = 'OK'
weldBosch['sequenceState'] = 0L
weldBosch['sequenceState_txt'] = 'finished'
weldBosch['sequenceStateAdd'] = 0L
weldBosch['sequenceStateAdd_txt'] = 'Ok'
weldBosch['sequenceRepeat'] = 0L
weldBosch['sequenceRepeat_txt'] = 'Off'
weldBosch['monitorMode'] = 1L
weldBosch['monitorMode_txt'] = 'Mix'
weldBosch['iDemandStd'] = (Math.round(Math.random()*(318-307))+307)/100
weldBosch['ilsts'] = (Math.round(Math.random()*(1044-744))+744)/100
weldBosch['regulationStd'] = 1L
weldBosch['regulationStd_txt'] = 'Mix'
weldBosch['iDemand1'] = (Math.round(Math.random()*(318-307))+307)/100
weldBosch['iActual1'] = (Math.random()<0.9)?0:(Math.round(Math.random()*(1099-1065))+1065)/100
weldBosch['regulation1'] = (Math.random()<0.5)?2L:4L
weldBosch['regulation1_txt'] = (weldBosch['regulation1']==2L)?'KSR':(weldBosch['regulation1']==4L)?'UIR':null
weldBosch['iDemand2'] = (Math.round(Math.random()*(1057-703))+703)/100
weldBosch['iActual2'] = (Math.round(Math.random()*(1044-738))+738)/100
weldBosch['regulation2'] = weldBosch['regulation1']
weldBosch['regulation2_txt'] = weldBosch['regulation1_txt']
weldBosch['iDemand3'] = (Math.round(Math.random()*(318-307))+307)/100
weldBosch['iActual3'] = (Math.random()<0.9)?0:(Math.round(Math.random()*(891-785))+785)/100
weldBosch['regulation3'] = weldBosch['regulation1']
weldBosch['regulation3_txt'] = weldBosch['regulation1_txt']
weldBosch['phaStd'] = (Math.round(Math.random()*(4510-2519))+2519)/100
weldBosch['pha1'] = (Math.random()<0.8)?0:(Math.round(Math.random()*(5995-4339))+4339)/100
weldBosch['pha2'] = (Math.round(Math.random()*(4510-2451))+2451)/100
weldBosch['pha3'] = (Math.random()<0.95)?0:(Math.round(Math.random()*(3454-2516))+2516)/100
weldBosch['t_iDemandStd'] = 0L
weldBosch['tActualStd'] = (Math.round(Math.random()*(697-151))+151)
weldBosch['partIdentString'] = null
weldBosch['tipDressCounter'] = 0L
weldBosch['electrodeNo'] = 1L
weldBosch['voltageActualValue'] = (Math.round(Math.random()*(246-122))+122)/100
weldBosch['voltageRefValue'] = 3
weldBosch['currentActualValue'] = (Math.round(Math.random()*(1060-747))+747)/100
weldBosch['currentReferenceValue'] = 3
weldBosch['weldTimeActualValue'] = (Math.round(Math.random()*(696-150))+150)
weldBosch['weldTimeRefValue'] = 1000
weldBosch['energyActualValue'] = (Math.round(Math.random()*(12647030-1689801))+1689801)/1000
weldBosch['energyRefValue'] = 10000
weldBosch['powerActualValue'] = (Math.round(Math.random()*(2342683-1014271))+1689801)/100
weldBosch['powerRefValue'] = 10000
weldBosch['resistanceActualValue'] = (Math.round(Math.random()*(250-126))+126)
weldBosch['resistanceRefValue'] = 300
weldBosch['pulseWidthActualValue'] = (Math.round(Math.random()*(4481-2497))+2497)/100
weldBosch['pulseWidthRefValue'] = 100
weldBosch['stabilisationFactorActValue'] = (Math.random()<0.7)?0:(Math.round(Math.random()*(99-71))+71)
weldBosch['stabilisationFactorRefValue'] = 100
weldBosch['thresholdStabilisationFactor'] = 0
weldBosch['wldEffectStabilisationFactor'] = 100
weldBosch['uipActualValue'] = (Math.random()<0.8)?0:(Math.round(Math.random()*(177-87))+87)
weldBosch['uipRefValue'] = 100
weldBosch['uirExpulsionTime'] = (Math.random()<((Math.round(Math.random()*(90-60))+60)/100))?0L:(Math.round(Math.random()*(524-49))+49)
weldBosch['uirMeasuringActive'] = 1L
weldBosch['uirMeasuringActive_txt'] = 'On'
weldBosch['uirRegulationActive'] = (Math.random()<0.7)?0L:1L
weldBosch['uirRegulationActive_txt'] = (weldBosch['uirRegulationActive']==0)?'Off':'On'
weldBosch['uirMonitoringActive'] = 0L
weldBosch['uirMonitoringActive_txt'] = 'Off'
weldBosch['uirWeldTimeProlongationActive'] = (Math.random()<0.7)?0L:1L
weldBosch['uirWeldTimeProlongActive_txt'] = (weldBosch['uirWeldTimeProlongationActive']==0)?'Off':'On'
weldBosch['uirQStoppRefCntValue'] = 0L
weldBosch['uirQStoppActCntValue'] = 0L
weldBosch['uirUipUpperTol'] = 100L
weldBosch['uirUipLowerTol'] = 100L
weldBosch['uirUipCondTol'] = 100L
weldBosch['uirPsfLowerTol'] = 100L
weldBosch['uirPsfCondTol'] = 100L

return JsonOutput.prettyPrint(JsonOutput.toJson(weldBosch))