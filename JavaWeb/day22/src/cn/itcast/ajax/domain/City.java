package cn.itcast.ajax.domain;

public class City {
    private int id;
    private String name;
    private int prov_id;

    public int getProv_id () {
        return prov_id;
    }

    public void setProv_id (int prov_id) {
        this.prov_id = prov_id;
    }

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
}
