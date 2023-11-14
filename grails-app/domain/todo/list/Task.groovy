package todo.list

import enums.Priority
import enums.Status

import java.time.LocalDateTime

class Task {

    String title
    String description
    LocalDateTime creationDate
    LocalDateTime lastModificationDate
    LocalDateTime endDate
    Status status
    Category category
    Priority priority
    List<LocalDateTime> alarms

    static constraints = {
        title blank: false,
                maxSize: 100
        description maxSize: 400
        creationDate nullable: false
        lastModificationDate nullable: false
        endDate nullable: true
        status enumType: Status
        category nullable: false
        priority enumType: Priority
        alarms nullable: true
    }

}
