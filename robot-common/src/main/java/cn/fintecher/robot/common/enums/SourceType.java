package cn.fintecher.robot.common.enums;

import io.swagger.annotations.ApiModelProperty;

public enum SourceType implements EnumMessage {

    @ApiModelProperty("企业")
    COMPANY,
    @ApiModelProperty("管理端")
    SAFEMANAGER
}
