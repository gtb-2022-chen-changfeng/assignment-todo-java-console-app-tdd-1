package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ccf
 */
public class ListCommand {
    final TaskRepository taskRepository = new TaskRepository();

    public ListCommand() {
    }

    List<String> run() {
        final ArrayList<Task> tasks = taskRepository.loadTasks();
        var showLists = new ArrayList<String>();
        showLists.addAll(Section.tbd().format(tasks));
        showLists.addAll(Section.completed().format(tasks));
        return showLists;
    }
}