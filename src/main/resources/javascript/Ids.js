var HashMap = Java.type('java.util.HashMap');

var dataIdMap = new HashMap(); 

var dataIdCounter=0; 

function dataId(vr){ 

	if(dataIdMap.get(vr) != undefined){
	
		return (dataIdMap.get(vr).intValue()) 
		
	}else{ 
	
		dataIdMap.put(vr,(dataIdCounter));
		
		dataIdCounter++;
		
		return (dataIdMap.get(vr).intValue())}};
		
var paramIdMap = new HashMap();
		
var paramIdCounter = 0;
		
function paramId(vr) {
			
if (paramIdMap.get(vr) != undefined) {
				
	return (paramIdMap.get(vr).intValue())
	
} else {
	
	paramIdMap.put(vr, (paramIdCounter));
			
	paramIdCounter++;
			
	return (paramIdMap.get(vr).intValue())}};