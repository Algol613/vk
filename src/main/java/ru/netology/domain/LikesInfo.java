package ru.netology.domain;

public class LikesInfo {

    private int count;
    private int userLike;


    public LikesInfo(int count, int userLike) {
        this.count = count;
        this.userLike = userLike;
    }
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserLike() {
        return userLike;
    }

    public void setUserLike(int userLike) {
        this.userLike = userLike;
    }
}
