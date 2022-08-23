package com.tw.cn.cap.gtb.todo;

/**
 * @author ccf
 */
public class TaskFactory {

    static Task createTask(String line, int id) {
        var fields = line.split(" ", 2);
        var name = fields[1];
        boolean isCompleted = "x".equals(fields[0]);
        return new Task(id, name, isCompleted);
    }
}
