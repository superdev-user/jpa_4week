package com.example.demo.IdClass;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by hseungkim 2020/04/16
 */
@NoArgsConstructor
@AllArgsConstructor
public class ParentId implements Serializable {
    private String id1; // EmbeddedMapping.id1 에 대한 정보 제공
    private String id2; // EmbeddedMapping.id2 에 대한 정보 제공

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParentId parentId = (ParentId) o;
        return Objects.equals(id1, parentId.id1) &&
                Objects.equals(id2, parentId.id2);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id1, id2);
    }

}