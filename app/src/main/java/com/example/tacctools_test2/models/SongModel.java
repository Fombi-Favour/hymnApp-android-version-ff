package com.example.tacctools_test2.models;

public class SongModel {
    int title_id;
    int verse_id;
    int chorus_id;
    String title;
    String verse;
    String chorus;

    public SongModel(int title_id, int verse_id, int chorus_id, String title, String verse, String chorus) {
        this.title_id = title_id;
        this.verse_id = verse_id;
        this.chorus_id = chorus_id;
        this.title = title;
        this.verse = verse;
        this.chorus = chorus;
    }

    public int getTitle_id() {
        return title_id;
    }

    public void setTitle_id(int title_id) {
        this.title_id = title_id;
    }

    public int getVerse_id() {
        return verse_id;
    }

    public void setVerse_id(int verse_id) {
        this.verse_id = verse_id;
    }

    public int getChorus_id() {
        return chorus_id;
    }

    public void setChorus_id(int chorus_id) {
        this.chorus_id = chorus_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVerse() {
        return verse;
    }

    public void setVerse(String verse) {
        this.verse = verse;
    }

    public String getChorus() {
        return chorus;
    }

    public void setChorus(String chorus) {
        this.chorus = chorus;
    }
}
