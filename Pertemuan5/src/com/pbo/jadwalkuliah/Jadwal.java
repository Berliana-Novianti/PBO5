package src.com.pbo.jadwalkuliah;
class Jadwal {
    private String tanggal;
    private String jam;
    private MataKuliah mataKuliah;
    private Ruangan ruangan;
    private Dosen dosen;
    public Jadwal(String tanggal, String jam, MataKuliah mataKuliah, Ruangan ruangan, Dosen dosen) {
        this.tanggal = tanggal;
        this.jam = jam;
        this.mataKuliah = mataKuliah;
        this.ruangan = ruangan;
        this.dosen = dosen;
    }
    @Override
    public String toString() {
        return "Hari: " + tanggal + ", Jam: " + jam + ", Mata Kuliah: " + mataKuliah + ", Ruangan: " + ruangan + ", Dosen: " + dosen.nama;
    }
}