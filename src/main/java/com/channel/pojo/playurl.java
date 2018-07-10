package com.channel.pojo;

public class playurl {
    private Integer id;

    private String title;

    private Integer quality;

    private Byte vipOnly;

    private Byte sharable;

    public playurl(Integer id, String title, Integer quality, Byte vipOnly, Byte sharable) {
        this.id = id;
        this.title = title;
        this.quality = quality;
        this.vipOnly = vipOnly;
        this.sharable = sharable;
    }

    public playurl() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Byte getVipOnly() {
        return vipOnly;
    }

    public void setVipOnly(Byte vipOnly) {
        this.vipOnly = vipOnly;
    }

    public Byte getSharable() {
        return sharable;
    }

    public void setSharable(Byte sharable) {
        this.sharable = sharable;
    }
}