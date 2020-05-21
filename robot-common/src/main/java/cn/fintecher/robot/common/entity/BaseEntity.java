package cn.fintecher.robot.common.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @GenericGenerator(
            name = "uuid2",
            strategy = "uuid2",
            parameters = {@org.hibernate.annotations.Parameter(
                    name = "uuid_gen_strategy_class",
                    value = "org.hibernate.id.uuid.CustomVersionOneStrategy")
            })
    @GeneratedValue(generator = "uuid2")
    private String id;

    @CreatedDate
    private Date createTime;

    @Column(columnDefinition = "varchar(50) comment '操作人Id'")
    private String operatorId;

    @Column(columnDefinition = "varchar(100) comment '操作人姓名'")
    private String operatorRealName;

    @LastModifiedDate
    private Date updateTime;

    @Column(columnDefinition = "varchar(50) comment '更新人Id'")
    private String updateId;

    @Column(columnDefinition = "varchar(100) comment '更新人姓名'")
    private String updateName;

}
