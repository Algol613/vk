package ru.netology.domain;

public class CommentsInfo {

    private int count;
    private int canComment;
    private int groupsCanComment;
    private boolean canOpen;
    private boolean canClose;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanComment() {
        return count;
    }

    public void setCanComment(int canComment) {
        this.canComment = canComment;
    }

    public int getGroupsCanComment() {
        return groupsCanComment;
    }

    public void setGroupsCanComment(int groupsCanComment) {
        this.groupsCanComment = groupsCanComment;
    }


    public boolean isCanOpen() {
            return canOpen;
    }

        public void setCanOpen(boolean canOpen) {
            this.canOpen = canOpen;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;

    }



}
