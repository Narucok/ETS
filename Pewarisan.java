// Kelas induk
class Ibu {
    protected String nama;
    protected int umur;

    public Ibu(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode perkenalan
    public String perkenalan() {
        return "Nama saya " + nama + ", dan saya berumur " + umur + " tahun.";
    }
}

// Kelas turunan (Anak) mewarisi dari Ibu
class Anak extends Ibu {
    private String kuliah;

    public Anak(String nama, int umur, String kuliah) {
        super(nama, umur);
        this.kuliah = kuliah;
    }

    // Override metode perkenalan
    @Override
    public String perkenalan() {
        return "Nama saya " + nama + ", saya berumur " + umur + " tahun, dan saya berkuliah di " + kuliah + ".";
    }
}

public class Main {
    public static void main(String[] args) {
        Ibu ibu = new Ibu("Itha", 56);
        Anak anak = new Anak("Naruto", 19, "ITS");

        System.out.println(ibu.perkenalan());
        System.out.println(anak.perkenalan());
    }
}
