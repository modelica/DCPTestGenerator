function determineState(step) {
    var found = false;
    for (var i = 0; i < t.transition.length; i++) {
        if (t.transition[i].to == step) {
            found = true;
            var trans = t.transition[i];
            var visited = [];
            while ((trans.receiving == undefined || trans.receiving.ntfStateChanged == undefined) && Number(trans.from) != 0) {
            	var noPred = true;
                for (var x = 0; x < t.transition.length; x++) {
                    if (t.transition[x].to == trans.from && visited.indexOf(t.transition[x]) == -1 ) {
                        trans = t.transition[x];
                        visited.push(trans);
                        noPred = false;
                        break;
                    }
                }
                if(noPred){
                	return -2;
                }
            }
            if (trans.receiving != undefined && trans.receiving.ntfStateChanged != undefined) {
                return trans.receiving.ntfStateChanged.stateId;
            } else {
                return 0;
            }
        }
    }
    if (found == false) {
        return 0;
    }
};
