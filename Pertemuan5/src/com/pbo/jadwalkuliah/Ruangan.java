package src.com.pbo.jadwalkuliah;

class Ruangan {
    private String kode;
    public Ruangan(String kode) {
        this.kode = kode;
    }
    @Override
    public String toString() {
        return kode;
    }
}