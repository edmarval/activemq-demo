package com.example.demo.entities;

import java.util.Objects;

public class CompactUserDetails {
    String fullName;

    public CompactUserDetails(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompactUserDetails that = (CompactUserDetails) o;
        return Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public String toString() {
        return "CompactUserDetails{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
