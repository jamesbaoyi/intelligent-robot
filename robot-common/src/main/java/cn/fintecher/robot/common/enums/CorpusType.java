package cn.fintecher.robot.common.enums;

import io.swagger.annotations.ApiModelProperty;

public enum CorpusType implements EnumMessage {
    @ApiModelProperty("语音合成")
    TTS,

    @ApiModelProperty("记录")
    RECORD
}
