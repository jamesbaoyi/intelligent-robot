package cn.fintecher.robot.common.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class SessionModel implements Serializable {
    private String id;//账号id

    private String userId;//用户id

    private String userName;//用户名称

    private String userCode;//登录用户

    private String token;//身份校验

    private String companyId;//企业

    private String companyCode;//企业编号

    private String companyName;//企业名称

}
