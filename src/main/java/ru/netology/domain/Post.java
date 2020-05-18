package ru.netology.domain;

public class Post {
        private int postId;
        private int userId;
        private String namePost;
        private String textPost;
        private String picturePost;
        private int date;
        private LikesInfo likeInfo;
        private CommentsInfo commentsInfo;
        private SharedInfo sharedInfo;
        private ViewInfo viewsInfo;
        private MoreInfo moreInfo;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId(){
        return userId;
    }

    public void setUserId(int UserId) {
        this.userId= UserId;
    }

    public String getNamePost(){
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    public String getTextPostPost(){
        return textPost;
    }

    public void setTextPostPost(String textPost) {
        this.textPost = textPost;
    }

    public String getPicturePost(){
        return picturePost;
    }

    public void setPicturePost(String picturePost) {
        this.picturePost = picturePost;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public LikesInfo getLikeInfo() {
        return likeInfo;
    }

    public void setLikeInfo(LikesInfo likeInfo) {
        this.likeInfo = likeInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public SharedInfo getSharedInfo() {
        return sharedInfo;
    }

    public void setSharedInfo(SharedInfo sharedInfo) {
        this.sharedInfo = sharedInfo;
    }

    public ViewInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public MoreInfo getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(MoreInfo moreInfo) {
        this.moreInfo = moreInfo;
    }

}
