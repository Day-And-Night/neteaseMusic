package com.domain;

public class MusicList {
    private long id;
    private String name;
    private String tags;
    private String coverImgUrl;
    private String description;
    private String trackIds;
    private Integer playCount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTrackIds() {
        return trackIds;
    }

    public void setTrackIds(String trackIds) {
        this.trackIds = trackIds;
    }

    public Integer getPlayCount() {
        return playCount;
    }

    public void setPlayCount(Integer playCount) {
        this.playCount = playCount;
    }

    @Override
    public String toString() {
        return "MusicList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tags='" + tags + '\'' +
                ", coverImgUrl='" + coverImgUrl + '\'' +
                ", description='" + description + '\'' +
                ", trackIds='" + trackIds + '\'' +
                ", playCount=" + playCount +
                '}';
    }
}
