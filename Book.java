class Book {
    // Atribut
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String namaPenerbit;
    private String kategoriBuku;
    
    public Book(String judul, String penulis, int tahunTerbit, String namaPenerbit, String kategoriBuku) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.namaPenerbit = namaPenerbit;
        this.kategoriBuku = kategoriBuku;
    }
    
    public void printDetails() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Penerbit: " + namaPenerbit);
        System.out.println("Kategori: " + kategoriBuku);
    }
    
    public static void main(String[] args) {
        Book buku1 = new Book("Koala Kumal", "Raditya Dika", 2015, "GagasMedia", "Komedi");
        
        buku1.printDetails();
    }
}
