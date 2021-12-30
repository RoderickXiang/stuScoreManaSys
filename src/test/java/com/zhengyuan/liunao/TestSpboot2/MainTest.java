package com.zhengyuan.liunao.TestSpboot2;

import com.zhengyuan.liunao.service.TeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainTest {
    @Autowired
    TeacherService teacherService;

    @Test
    public void selectTest(){
        System.out.println(teacherService.teacherCount());
    }
}

