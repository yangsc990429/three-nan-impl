package org.three.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

public interface TestService {

   String  userList(String name);

}
