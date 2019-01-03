package cn.itcast.ajax.domain;

public class County {
    private int id;
    private String name;
    private int city_id;

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getCity_id () {
        return city_id;
    }

    public void setCity_id (int city_id) {
        this.city_id = city_id;
    }
}
