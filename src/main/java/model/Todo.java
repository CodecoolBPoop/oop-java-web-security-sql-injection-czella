package model;

import org.postgresql.core.Utils;

import java.sql.SQLException;
import java.util.*;

public class Todo {

    String title;
    String id;
    Status status;

    public Todo(String title, String id, Status status) {
        this.title = title;
        this.id = id;
        this.status = status;
    }

    public void toggleStatus() {
        this.status = isComplete() ? Status.ACTIVE : Status.COMPLETE;
    }

    public boolean isComplete() {
        return this.status == Status.COMPLETE;
    }

    public static Todo create(String title) {
        return new Todo(title, UUID.randomUUID().toString(), Status.ACTIVE);
    }

    public String getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
