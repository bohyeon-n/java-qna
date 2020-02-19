package com.codessquad.qna;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Question {
    private String writer;
    private String title;
    private String contents;
    private String created;
    private int id;

    public Question() {
        this.created = date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Question{" +
                "writer='" + writer + '\'' +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", created='" + created + '\'' +
                ", id=" + id +
                '}';
    }

    private String date() {
        String pattern = "MM-dd-yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("kr", "KR"));
        return simpleDateFormat.format(new Date());
    }
}
