package com.acme.todolist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTue;

import com.acme.todolist.domain.TodoItem;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class TodoItemTest {
    
    /**
     * Test de vérification que la méthode isLate() renvoie bien true lorsque c'est le cas
     */
    @Test
    public void item_is_late_true(){
        TodoItem item = new TodoItem("1",Instant.now().min(25,ChronoUnit.HOURS),"test renvoyant true");
        assertTrue(item.isLate());
    }
    /**
     * Test de vérification que le content de l'item contient bien 'LATE' lorsque attendu
     */
    @Test
    public void item_is_late_verify_string(){
        TodoItem item = new TodoItem("1",Instant.now().min(25,ChronoUnit.HOURS),"test renvoyant true");
        assertTrue(item.finalContent().contains("[LATE!]"));
    }
}