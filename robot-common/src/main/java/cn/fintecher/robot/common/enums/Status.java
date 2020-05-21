package cn.fintecher.robot.common.enums;

import io.swagger.annotations.ApiModelProperty;

public enum Status implements EnumMessage {

    @ApiModelProperty("启用")
    START,
    @ApiModelProperty("停用")
    STOP
}
