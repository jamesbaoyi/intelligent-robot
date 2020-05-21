package cn.fintecher.robot.common.enums;

import io.swagger.annotations.ApiModelProperty;

public enum VoiceType implements EnumMessage {

    @ApiModelProperty("语音合成")
    TTS,
    @ApiModelProperty("语音识别")
    ASR,
    @ApiModelProperty("语音理解")
    NLP
}
