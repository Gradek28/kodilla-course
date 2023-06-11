package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
@Transactional
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;


    @AfterEach
    public void cleanup() {
        taskListRepository.deleteAll();
    }

    @Test
    public void testFindByListName() {
        // Given
        String listName = "Test List";
        String description = "This is a test list";
        TaskList taskList = new TaskList(listName, description);
        taskListRepository.save(taskList);

        // When
        List<TaskList> foundLists = taskListRepository.findByListName(listName);

        // Then
        Assertions.assertEquals(1, foundLists.size());
        TaskList foundList = foundLists.get(0);
        Assertions.assertEquals(listName, foundList.getListName());
        Assertions.assertEquals(description, foundList.getDescription());
    }
}