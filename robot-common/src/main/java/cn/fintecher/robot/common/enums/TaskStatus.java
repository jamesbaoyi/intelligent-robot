package cn.fintecher.robot.common.enums;

import io.swagger.annotations.ApiModelProperty;

public enum TaskStatus implements EnumMessage {

    @ApiModelProperty(notes = "未开始")
    NEW,

    @ApiModelProperty(notes = "准备就绪")
    READY,

    @ApiModelProperty(notes = "取消")
    CANCEL,

    @ApiModelProperty(notes = "正在取消")
    CANCELING,

    @ApiModelProperty(notes = "拨打中")
    EXCUTING,

    @ApiModelProperty(notes = "排队中")
    QUEUE,

    @ApiModelProperty(notes = "未接通")
    UNCONNECTED,

    @ApiModelProperty(notes = "已接通")
    CONNECTED,

    @ApiModelProperty(notes = "结束")
    FINISH
}
