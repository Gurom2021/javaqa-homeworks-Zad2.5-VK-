package ru.netology.domain;

public class LikesInfo {
    private int count;
    private boolean userLikes;
    private boolean canPublish;
    private boolean canLike;

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

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
