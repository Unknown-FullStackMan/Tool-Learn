package com.simple.pojo;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Simple
 * @date 2021/4/2 9:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@JsonIgnoreProperties({"id","username","birthday"}
@JsonTypeName(value = "user1111")
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
public class User {
    private Long id;
    @JsonProperty("username")
    private String name;
    private Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date birthday;
}
