package cn.fintecher.robot.common.enums;

import io.swagger.annotations.ApiModelProperty;

public enum ResourceType implements EnumMessage {
    @ApiModelProperty("目录")
    DIRECTORY,
    @ApiModelProperty("菜单")
    MENU,
    @ApiModelProperty("控件")
    CONTROL
}
