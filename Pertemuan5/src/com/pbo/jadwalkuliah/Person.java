package src.com.pbo.jadwalkuliah;

class Person {
    protected String nama;
    protected String alamat;
    public Person(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    @Override
    public String toString() {
        return "Nama: " + nama + ", Alamat: " + alamat;
    }
}