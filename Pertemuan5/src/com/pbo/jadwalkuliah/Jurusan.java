package src.com.pbo.jadwalkuliah;
import java.util.ArrayList;
import java.util.List;

class Jurusan {
    private String nama;
    private List<Prodi> prodis;
    
    public Jurusan(String nama) {
        this.nama = nama;
        this.prodis = new ArrayList<>();
    }
    
    public void addProdi(Prodi prodi) {
        prodis.add(prodi);
    }
    
    @Override
    public String toString() {
        return "Jurusan: " + nama;
    }
}
