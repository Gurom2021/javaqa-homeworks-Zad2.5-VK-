package ru.netology.domain;

public class LikesInfo {
    private int count;
    private boolean userLikes;


    public boolean isUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }



}
