function getMin(vr) {
    for (var i = 0; i < slave.variables.variable.length; i++) {
        if (slave.variables.variable[i].valueReference == vr) {
            if (slave.variables.variable[i].output != undefined) {
                if (slave.variables.variable[i].output.float32 != undefined) {
                    if (slave.variables.variable[i].output.float32.min != undefined) {
                        return slave.variables.variable[i].output.float32.min
                    }
                }
                if (slave.variables.variable[i].output.float64 != undefined) {
                    if (slave.variables.variable[i].output.float64.min != undefined) {
                        return slave.variables.variable[i].output.float64.min
                    }
                }
                if (slave.variables.variable[i].output.int16 != undefined) {
                    if (slave.variables.variable[i].output.int16.min != undefined) {
                        return slave.variables.variable[i].output.int16.min
                    }
                }
                if (slave.variables.variable[i].output.int32 != undefined) {
                    if (slave.variables.variable[i].output.int32.min != undefined) {
                        return slave.variables.variable[i].output.int32.min
                    }
                }
                if (slave.variables.variable[i].output.int64 != undefined) {
                    if (slave.variables.variable[i].output.int64.min != undefined) {
                        return slave.variables.variable[i].output.int64.min
                    }
                }
                if (slave.variables.variable[i].output.int8 != undefined) {
                    if (slave.variables.variable[i].output.int8.min != undefined) {
                        return slave.variables.variable[i].output.int8.min
                    }
                }
                if (slave.variables.variable[i].output.uint16 != undefined) {
                    if (slave.variables.variable[i].output.uint16.min != undefined) {
                        return slave.variables.variable[i].output.uint16.min
                    }
                }
                if (slave.variables.variable[i].output.uint32 != undefined) {
                    if (slave.variables.variable[i].output.uint32.min != undefined) {
                        return slave.variables.variable[i].output.uint32.min
                    }
                }
                if (slave.variables.variable[i].output.uint64 != undefined) {
                    if (slave.variables.variable[i].output.uint64.min != undefined) {
                        return slave.variables.variable[i].output.uint64.min
                    }
                }
                if (slave.variables.variable[i].output.uint8 != undefined) {
                    if (slave.variables.variable[i].output.uint8.min != undefined) {
                        return slave.variables.variable[i].output.uint8.min
                    }
                }
            }
            if (slave.variables.variable[i].input != undefined) {
                if (slave.variables.variable[i].input.float32 != undefined) {
                    if (slave.variables.variable[i].input.float32.min != undefined) {
                        return slave.variables.variable[i].input.float32.min
                    }
                }
                if (slave.variables.variable[i].input.float64 != undefined) {
                    if (slave.variables.variable[i].input.float64.min != undefined) {
                        return slave.variables.variable[i].input.float64.min
                    }
                }
                if (slave.variables.variable[i].input.int16 != undefined) {
                    if (slave.variables.variable[i].input.int16.min != undefined) {
                        return slave.variables.variable[i].input.int16.min
                    }
                }
                if (slave.variables.variable[i].input.int32 != undefined) {
                    if (slave.variables.variable[i].input.int32.min != undefined) {
                        return slave.variables.variable[i].input.int32.min
                    }
                }
                if (slave.variables.variable[i].input.int64 != undefined) {
                    if (slave.variables.variable[i].input.int64.min != undefined) {
                        return slave.variables.variable[i].input.int64.min
                    }
                }
                if (slave.variables.variable[i].input.int8 != undefined) {
                    if (slave.variables.variable[i].input.int8.min != undefined) {
                        return slave.variables.variable[i].input.int8.min
                    }
                }
                if (slave.variables.variable[i].input.uint16 != undefined) {
                    if (slave.variables.variable[i].input.uint16.min != undefined) {
                        return slave.variables.variable[i].input.uint16.min
                    }
                }
                if (slave.variables.variable[i].input.uint32 != undefined) {
                    if (slave.variables.variable[i].input.uint32.min != undefined) {
                        return slave.variables.variable[i].input.uint32.min
                    }
                }
                if (slave.variables.variable[i].input.uint64 != undefined) {
                    if (slave.variables.variable[i].input.uint64.min != undefined) {
                        return slave.variables.variable[i].input.uint64.min
                    }
                }
                if (slave.variables.variable[i].input.uint8 != undefined) {
                    if (slave.variables.variable[i].input.uint8.min != undefined) {
                        return slave.variables.variable[i].input.uint8.min
                    }
                }
            }
            if (slave.variables.variable[i].parameter != undefined) {
                if (slave.variables.variable[i].parameter.float32 != undefined) {
                    if (slave.variables.variable[i].parameter.float32.min != undefined) {
                        return slave.variables.variable[i].parameter.float32.min
                    }
                }
                if (slave.variables.variable[i].parameter.float64 != undefined) {
                    if (slave.variables.variable[i].parameter.float64.min != undefined) {
                        return slave.variables.variable[i].parameter.float64.min
                    }
                }
                if (slave.variables.variable[i].parameter.int16 != undefined) {
                    if (slave.variables.variable[i].parameter.int16.min != undefined) {
                        return slave.variables.variable[i].parameter.int16.min
                    }
                }
                if (slave.variables.variable[i].parameter.int32 != undefined) {
                    if (slave.variables.variable[i].parameter.int32.min != undefined) {
                        return slave.variables.variable[i].parameter.int32.min
                    }
                }
                if (slave.variables.variable[i].parameter.int64 != undefined) {
                    if (slave.variables.variable[i].parameter.int64.min != undefined) {
                        return slave.variables.variable[i].parameter.int64.min
                    }
                }
                if (slave.variables.variable[i].parameter.int8 != undefined) {
                    if (slave.variables.variable[i].parameter.int8.min != undefined) {
                        return slave.variables.variable[i].parameter.int8.min
                    }
                }
                if (slave.variables.variable[i].parameter.uint16 != undefined) {
                    if (slave.variables.variable[i].parameter.uint16.min != undefined) {
                        return slave.variables.variable[i].parameter.uint16.min
                    }
                }
                if (slave.variables.variable[i].parameter.uint32 != undefined) {
                    if (slave.variables.variable[i].parameter.uint32.min != undefined) {
                        return slave.variables.variable[i].parameter.uint32.min
                    }
                }
                if (slave.variables.variable[i].parameter.uint64 != undefined) {
                    if (slave.variables.variable[i].parameter.uint64.min != undefined) {
                        return slave.variables.variable[i].parameter.uint64.min
                    }
                }
                if (slave.variables.variable[i].parameter.uint8 != undefined) {
                    if (slave.variables.variable[i].parameter.uint8.min != undefined) {
                        return slave.variables.variable[i].parameter.uint8.min
                    }
                }
            }
        }
    }
    return false
};
