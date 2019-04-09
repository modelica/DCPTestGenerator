function dataType(vr) {
    var uint8 = 0;
    var uint16 = 1;
    var uint32 = 2;
    var uint64 = 3;
    var int8 = 4;
    var int16 = 5;
    var int32 = 6;
    var int64 = 7;
    var float32 = 8;
    var float64 = 9;
    var string = 10;
    var binary = 11;
    for (var i = 0; i < slave.variables.variable.length; i++) {
        if (slave.variables.variable[i].valueReference == vr) {
            if (slave.variables.variable[i].output != undefined) {
                if (slave.variables.variable[i].output.float32 != undefined) {
                    return float32
                }
                if (slave.variables.variable[i].output.float64 != undefined) {
                    return float64
                }
                if (slave.variables.variable[i].output.int16 != undefined) {
                    return int16
                }
                if (slave.variables.variable[i].output.int32 != undefined) {
                    return int32
                }
                if (slave.variables.variable[i].output.int64 != undefined) {
                    return int64
                }
                if (slave.variables.variable[i].output.int8 != undefined) {
                    return int8
                }
                if (slave.variables.variable[i].output.uint16 != undefined) {
                    return uint16
                }
                if (slave.variables.variable[i].output.uint32 != undefined) {
                    return uint32
                }
                if (slave.variables.variable[i].output.uint64 != undefined) {
                    return uint64
                }
                if (slave.variables.variable[i].output.uint8 != undefined) {
                    return uint8
                }
            }
            if (slave.variables.variable[i].input != undefined) {
                if (slave.variables.variable[i].input.float32 != undefined) {
                    return float32
                }
                if (slave.variables.variable[i].input.float64 != undefined) {
                    return float64
                }
                if (slave.variables.variable[i].input.int16 != undefined) {
                    return int16
                }
                if (slave.variables.variable[i].input.int32 != undefined) {
                    return int32
                }
                if (slave.variables.variable[i].input.int64 != undefined) {
                    return int64
                }
                if (slave.variables.variable[i].input.int8 != undefined) {
                    return int8
                }
                if (slave.variables.variable[i].input.uint16 != undefined) {
                    return uint16
                }
                if (slave.variables.variable[i].input.uint32 != undefined) {
                    return uint32
                }
                if (slave.variables.variable[i].input.uint64 != undefined) {
                    return uint64
                }
                if (slave.variables.variable[i].input.uint8 != undefined) {
                    return uint8
                }
            }
            if (slave.variables.variable[i].parameter != undefined) {
                if (slave.variables.variable[i].parameter.float32 != undefined) {
                    return float32
                }
                if (slave.variables.variable[i].parameter.float64 != undefined) {
                    return float64
                }
                if (slave.variables.variable[i].parameter.int16 != undefined) {
                    return int16
                }
                if (slave.variables.variable[i].parameter.int32 != undefined) {
                    return int32
                }
                if (slave.variables.variable[i].parameter.int64 != undefined) {
                    return int64
                }
                if (slave.variables.variable[i].parameter.int8 != undefined) {
                    return int8
                }
                if (slave.variables.variable[i].parameter.uint16 != undefined) {
                    return uint16
                }
                if (slave.variables.variable[i].parameter.uint32 != undefined) {
                    return uint32
                }
                if (slave.variables.variable[i].parameter.uint64 != undefined) {
                    return uint64
                }
                if (slave.variables.variable[i].parameter.uint8 != undefined) {
                    return uint8
                }
            }
        }
    }
    return false
};
