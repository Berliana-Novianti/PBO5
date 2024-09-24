package src.com.pbo.jadwalkuliah;
class Dosen extends Person {
    private String nip;
    public Dosen(String nama, String alamat, String nip) {
        super(nama, alamat);
        this.nip = nip;
    }
    @Override
    public String toString() {
        return super.toString() + ", NIP: " + nip;
    }
}