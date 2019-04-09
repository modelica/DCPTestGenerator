function minMaxDefined(vr) {
    for (var i = 0; i < slave.variables.variable.length; i++) {
        if (slave.variables.variable[i].valueReference == vr) {
            if (slave.variables.variable[i].output != undefined) {
                if (slave.variables.variable[i].output.float32 != undefined) {
                    if (slave.variables.variable[i].output.float32.min != undefined && slave.variables.variable[i].output.float32.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].output.float64 != undefined) {
                    if (slave.variables.variable[i].output.float64.min != undefined && slave.variables.variable[i].output.float64.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].output.int16 != undefined) {
                    if (slave.variables.variable[i].output.int16.min != undefined && slave.variables.variable[i].output.int16.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].output.int32 != undefined) {
                    if (slave.variables.variable[i].output.int32.min != undefined && slave.variables.variable[i].output.int32.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].output.int64 != undefined) {
                    if (slave.variables.variable[i].output.int64.min != undefined && slave.variables.variable[i].output.int64.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].output.int8 != undefined) {
                    if (slave.variables.variable[i].output.int8.min != undefined && slave.variables.variable[i].output.int8.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].output.uint16 != undefined) {
                    if (slave.variables.variable[i].output.uint16.min != undefined && slave.variables.variable[i].output.uint16.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].output.uint32 != undefined) {
                    if (slave.variables.variable[i].output.uint32.min != undefined && slave.variables.variable[i].output.uint32.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].output.uint64 != undefined) {
                    if (slave.variables.variable[i].output.uint64.min != undefined && slave.variables.variable[i].output.uint64.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].output.uint8 != undefined) {
                    if (slave.variables.variable[i].output.uint8.min != undefined && slave.variables.variable[i].output.uint8.max != undefined) {
                        return true
                    }
                }
            }
            if (slave.variables.variable[i].input != undefined) {
                if (slave.variables.variable[i].input.float32 != undefined) {
                    if (slave.variables.variable[i].input.float32.min != undefined && slave.variables.variable[i].input.float32.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].input.float64 != undefined) {
                    if (slave.variables.variable[i].input.float64.min != undefined && slave.variables.variable[i].input.float64.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].input.int16 != undefined) {
                    if (slave.variables.variable[i].input.int16.min != undefined && slave.variables.variable[i].input.int16.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].input.int32 != undefined) {
                    if (slave.variables.variable[i].input.int32.min != undefined && slave.variables.variable[i].input.int32.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].input.int64 != undefined) {
                    if (slave.variables.variable[i].input.int64.min != undefined && slave.variables.variable[i].input.int64.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].input.int8 != undefined) {
                    if (slave.variables.variable[i].input.int8.min != undefined && slave.variables.variable[i].input.int8.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].input.uint16 != undefined) {
                    if (slave.variables.variable[i].input.uint16.min != undefined && slave.variables.variable[i].input.uint16.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].input.uint32 != undefined) {
                    if (slave.variables.variable[i].input.uint32.min != undefined && slave.variables.variable[i].input.uint32.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].input.uint64 != undefined) {
                    if (slave.variables.variable[i].input.uint64.min != undefined && slave.variables.variable[i].input.uint64.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].input.uint8 != undefined) {
                    if (slave.variables.variable[i].input.uint8.min != undefined && slave.variables.variable[i].input.uint8.max != undefined) {
                        return true
                    }
                }
            }
            if (slave.variables.variable[i].parameter != undefined) {
                if (slave.variables.variable[i].parameter.float32 != undefined) {
                    if (slave.variables.variable[i].parameter.float32.min != undefined && slave.variables.variable[i].parameter.float32.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].parameter.float64 != undefined) {
                    if (slave.variables.variable[i].parameter.float64.min != undefined && slave.variables.variable[i].parameter.float64.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].parameter.int16 != undefined) {
                    if (slave.variables.variable[i].parameter.int16.min != undefined && slave.variables.variable[i].parameter.int16.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].parameter.int32 != undefined) {
                    if (slave.variables.variable[i].parameter.int32.min != undefined && slave.variables.variable[i].parameter.int32.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].parameter.int64 != undefined) {
                    if (slave.variables.variable[i].parameter.int64.min != undefined && slave.variables.variable[i].parameter.int64.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].parameter.int8 != undefined) {
                    if (slave.variables.variable[i].parameter.int8.min != undefined && slave.variables.variable[i].parameter.int8.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].parameter.uint16 != undefined) {
                    if (slave.variables.variable[i].parameter.uint16.min != undefined && slave.variables.variable[i].parameter.uint16.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].parameter.uint32 != undefined) {
                    if (slave.variables.variable[i].parameter.uint32.min != undefined && slave.variables.variable[i].parameter.uint32.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].parameter.uint64 != undefined) {
                    if (slave.variables.variable[i].parameter.uint64.min != undefined && slave.variables.variable[i].parameter.uint64.max != undefined) {
                        return true
                    }
                }
                if (slave.variables.variable[i].parameter.uint8 != undefined) {
                    if (slave.variables.variable[i].parameter.uint8.min != undefined && slave.variables.variable[i].parameter.uint8.max != undefined) {
                        return true
                    }
                }
            }
        }
    }
    return false
};
