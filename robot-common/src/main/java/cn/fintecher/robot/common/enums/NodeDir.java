package cn.fintecher.robot.common.enums;

import io.swagger.annotations.ApiModelProperty;

public enum NodeDir implements EnumMessage {

    @ApiModelProperty("左边")
    LEFT,

    @ApiModelProperty("下一个")
    NEXT,

    @ApiModelProperty("右边")
    RIGHT,

    @ApiModelProperty("其他")
    OTHER
}
