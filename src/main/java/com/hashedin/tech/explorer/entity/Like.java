package com.hashedin.tech.explorer.entity;


import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.Hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@AttributeOverride(name = "id", column = @Column(name = "like_id"))
public class Like extends BaseEntity {

    @ManyToOne
    Comment onComment;

    @ManyToOne
    Post post;

    @ManyToOne(optional = false)
    User likedBy;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Like like = (Like) o;
        return Objects.equals(getId(), like.getId());
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
