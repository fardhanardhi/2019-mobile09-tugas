package adan.polinema.ac.id.tugas2.models;

public class SuperHero {
    int Gambar;
    String heroName;
    String desc;

    public SuperHero(int gambar, String heroName, String desc) {
        Gambar = gambar;
        this.heroName = heroName;
        this.desc = desc;
    }

    public int getGambar() {
        return Gambar;
    }

    public void setGambar(int gambar) {
        Gambar = gambar;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
