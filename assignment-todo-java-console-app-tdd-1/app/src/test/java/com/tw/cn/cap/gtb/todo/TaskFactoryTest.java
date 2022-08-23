package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskFactoryTest {

    //unit test
    @Test
    void should_parse_completed_property_for_task() {
        final var isCompleted = TaskFactory.createTask("+ foobar", 1).isCompleted();
        Assertions.assertFalse(isCompleted);
    }

    @Test
    void should_support_name_with_multiple_white_spaces() {
        var name = TaskFactory.createTask("+   foo  bar   ", 1).getName();
        Assertions.assertEquals("  foo  bar   ", name);
    }
}