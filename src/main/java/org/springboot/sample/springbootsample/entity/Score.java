package org.springboot.sample.springbootsample.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name ="score")
public class Score implements Serializable {
    private static final long serialVersionUID = 8127035730921338189L;

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, name="STUDENTID") // 这里说一下，我使用指定数据库列的时候，使用小写会不起作用，修改为大写便正常了。不知道为何，如果遇到一样问题的可以尝试下。
    private int stuId;

    @Column(nullable = false, name="SUBJECTNAME")
    private String subjectName;

    @Column(nullable = false)
    private float score;

    @Column(nullable = false, name="EXAMTIME")
    private Date examTime;


}
