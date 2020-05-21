package cn.fintecher.robot.common.entity;

import cn.fintecher.robot.common.enums.Sex;
import cn.fintecher.robot.common.enums.Status;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Column(columnDefinition = "varchar(100) COMMENT '用户名称'")
    private String name;

    @Column(columnDefinition = "varchar(20) COMMENT '电话号'")
    private String phone;

    @Column(columnDefinition = "varchar(20) COMMENT '性别'")
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Column(columnDefinition = "varchar(20) COMMENT '状态'")
    @Enumerated(EnumType.STRING)
    private Status status;

}
