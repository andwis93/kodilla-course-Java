package com.kodilla.matrix.hibernate.tasklist.dao;

import com.kodilla.matrix.hibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskListDao extends CrudRepository<TaskList,Long> {
    List<TaskList> findByListName(String listName);
}
