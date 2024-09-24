package src.com.pbo.jadwalkuliah;

class Mahasiswa extends Person {
    private String nim;
    private Prodi prodi;
    public Mahasiswa(String nama, String alamat, String nim, Prodi prodi) {
        super(nama, alamat);
        this.nim = nim;
        this.prodi = prodi;
    }
    @Override
    public String toString() {
        return super.toString() + ", NIM: " + nim + ", Prodi: " + prodi.getNama();
    }
}