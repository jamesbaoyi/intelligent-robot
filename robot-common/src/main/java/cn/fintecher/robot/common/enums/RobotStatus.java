package cn.fintecher.robot.common.enums;

import io.swagger.annotations.ApiModelProperty;

public enum RobotStatus implements EnumMessage {

    @ApiModelProperty("忙")
    BUSY,
    @ApiModelProperty("休闲")
    IDLE
}
