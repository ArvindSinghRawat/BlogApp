package com.hashedin.tech.explorer.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommentAssociation {

    @Id
    @OneToOne
    Comment commentedOn;

    @ManyToOne(optional = false)
    Comment immediateParent;

    @ManyToOne(optional = false)
    Comment superParent;

}
