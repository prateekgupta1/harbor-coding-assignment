package com.p0.impl.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "availability")
@EqualsAndHashCode
@Data
public class Availability extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "date", nullable = false)
    private LocalDate date;
    @Column(name = "start_time", nullable = false)
    private LocalTime startTime;
    @Column(name = "end_time", nullable = false)
    private LocalTime endTime;

    // Method to check overlap with another Availability
    public boolean overlaps(Availability other) {
        return this.date.isEqual(other.date) &&
                (this.startTime.isBefore(other.endTime) && this.endTime.isAfter(other.startTime));
    }
}
