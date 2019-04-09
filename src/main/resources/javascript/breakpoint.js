function breakpoint(step, state) {
    
	for (var i = 0; i < t.transition.length; i++) {
		if (t.transition[i].receiving != undefined && t.transition[i].from == step && t.transition[i].receiving.ntfStateChanged != undefined && t.transition[i].receiving.ntfStateChanged.stateId == state) {
        
			return t.transition[i].to;
        
		}
    
	}
    
	throw ('No Breakpoint found for step : ' + step + ' and state : ' + state)
};
