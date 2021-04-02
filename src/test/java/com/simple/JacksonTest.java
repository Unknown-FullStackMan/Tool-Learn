package com.simple;

import com.simple.pojo.User;
import com.simple.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Date;

/**
 * @author Simple
 * @date 2021/4/2 9:41
 */
@Slf4j
public class JacksonTest {
    @Test
    public void test01(){
        User user = User.builder()
                .id(1L)
                .name("Simple")
                .age(23)
                .birthday(new Date())
                .build();

        String json = JsonUtils.toJsonString(user);
        log.info("[{}] toJsonString:[{}]", user.getClass().getSimpleName(),json);
       // System.out.printf("[{}] toJsonString:[{}]", user.getClass().getSimpleName(),json);
        User u = JsonUtils.parse(json, User.class);
        log.info("parse  {{}} to  [{}]",json, u);

    }

}
