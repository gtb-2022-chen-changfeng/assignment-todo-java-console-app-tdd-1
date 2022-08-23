package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ccf
 */
public class Section {
    public static final String TO_BE_DONE = "#To be done";
    public static final String COMPLETED = "#Completed";
    private final String title;
    private final boolean flag;

    public Section(String title, boolean flag) {
        this.title = title;
        this.flag = flag;
    }

    static Section tbd() {
        return new Section(TO_BE_DONE, false);
    }

    static Section completed() {
        return new Section(COMPLETED, true);
    }

    ArrayList<String> format(List<Task> tasks) {
        var result = new ArrayList<String>();
        result.add(title);
        tasks.stream()
                .filter(this::isTypeMatched)
                .map(Task::formatTask)
                .forEach(result::add);
        if (result.size() == 1) {
            result.add("Empty");
        }
        return result;
    }

    private boolean isTypeMatched(Task task) {
        return flag == task.isCompleted();
    }
}
