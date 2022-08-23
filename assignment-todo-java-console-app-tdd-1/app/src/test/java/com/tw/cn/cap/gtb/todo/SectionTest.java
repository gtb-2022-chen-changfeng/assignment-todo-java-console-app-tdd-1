package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SectionTest {
    @Test
    void should_show_init_message_when_section_no_tasks() {
        var res_tbd = Section.tbd().format(Collections.emptyList());
        Assertions.assertEquals(List.of("#To be done", "Empty"), res_tbd);
        var res_completed = Section.completed().format(Collections.emptyList());
        Assertions.assertEquals(List.of("#Completed", "Empty"), res_completed);

    }
}