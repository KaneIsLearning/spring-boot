package com.kane.springboot002.aop.bean;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户类〉
 *
 * @author Kane
 * Date:   2019/5/29 10:24
 * @since 1.0.0
 */
public class User {
    private int id;
    private String name;
    private String description;

    public User(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
