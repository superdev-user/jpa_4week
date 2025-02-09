package com.example.demo.EmbeddeAnotation;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by hseungkim 2020/04/16
 */
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Embedded implements Serializable {
    @Column(name = "PARENT_ID1")
    private String id1;

    @Column(name = "PARENT_ID2")
    private String id2;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Embedded embedded = (Embedded) o;
        return Objects.equals(id1, embedded.id1) &&
                Objects.equals(id2, embedded.id2);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id1, id2);
    }

}