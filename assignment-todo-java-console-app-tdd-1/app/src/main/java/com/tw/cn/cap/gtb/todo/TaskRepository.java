package com.tw.cn.cap.gtb.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ccf
 */
public class TaskRepository {
    public TaskRepository() {
    }

    ArrayList<Task> loadTasks() {
        final var tasks = new ArrayList<Task>();
        final var taskLines = readTaskLines();
        for (int i = 0; i < taskLines.size(); i++) {
            var id = i + 1;
            var line = taskLines.get(i);
            Task task = TaskFactory.createTask(line, id);
            tasks.add(task);
        }
        return tasks;
    }

    List<String> readTaskLines() {
        List<String> result;
        try {
            result = Files.readAllLines(Constants.TASK_FILE_PATH);
        } catch (IOException e) {
            throw new TodoCanNotReadFileException();
        }

        return result;
    }
}