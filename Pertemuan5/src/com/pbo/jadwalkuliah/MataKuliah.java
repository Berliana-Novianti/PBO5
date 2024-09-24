package src.com.pbo.jadwalkuliah;

class MataKuliah {
    private String nama;
    public MataKuliah(String nama) {
        this.nama = nama;
    }
    @Override
    public String toString() {
        return nama;
    }
}