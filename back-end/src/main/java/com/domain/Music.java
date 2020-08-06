package com.domain;

public class Music {
    private long id;
    private String name;
    private String singer;
    private String url;
    private long singer_id;
    private String album;
    private Integer time_length;
    private String pic_url;
    private String encode_type;

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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getSinger_id() {
        return singer_id;
    }

    public void setSinger_id(long singer_id) {
        this.singer_id = singer_id;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Integer getTime_length() {
        return time_length;
    }

    public void setTime_length(Integer time_length) {
        this.time_length = time_length;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public String getEncode_type() {
        return encode_type;
    }

    public void setEncode_type(String encode_type) {
        this.encode_type = encode_type;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                ", url='" + url + '\'' +
                ", singer_id=" + singer_id +
                ", album='" + album + '\'' +
                ", time_length=" + time_length +
                ", pic_url='" + pic_url + '\'' +
                ", encode_type='" + encode_type + '\'' +
                '}';
    }
}
