package src.com.pbo.jadwalkuliah;

class Prodi {
    private String nama;
    private Jurusan jurusan;
    
    public Prodi(String nama, Jurusan jurusan) {
        this.nama = nama;
        this.jurusan = jurusan;
    }
    
    public String getNama() {
        return nama;
    }
    
    @Override
    public String toString() {
        return "Prodi: " + nama + ", " + jurusan;
    }
}