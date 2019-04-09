function hasParameter() {
    for (var i = 0; i < slave.variables.variable.length; i++) {
        if (slave.variables.variable[i].parameter != undefined) {
            return true;
        }
    }
    return false;
}



function hasOutput() {
    for (var i = 0; i < slave.variables.variable.length; i++) {
        if (slave.variables.variable[i].output != undefined) {
            return true;
        }
    }
    return false;
}

function hasInput() {
    for (var i = 0; i < slave.variables.variable.length; i++) {
        if (slave.variables.variable[i].input != undefined) {
            return true;
        }
    }
    return false;
}

function hasTunableParameter() {
    for (var i = 0; i < slave.variables.variable.length; i++) {
        if (slave.variables.variable[i].parameter != undefined && slave.variables.variable[i].variability == 'tunable') {
            return true;
        }
    }
    return false;
}