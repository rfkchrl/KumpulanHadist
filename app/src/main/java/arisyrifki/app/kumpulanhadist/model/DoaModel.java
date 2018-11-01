package arisyrifki.app.kumpulanhadist.model;

/**
 * Created by rfkchrl on 10/19/2018.
 */

//Doa model sebagai blueprint, isi bisa melalui setter dan constructor


public class DoaModel {
    //Variable yang dideklarasikan
    private String nama;
    private String arti;
    private String surah;

    /* *Constructor * Menginisialisasikan Variable  */
    public DoaModel(String nama, String arti, String surah) {
        this.nama = nama;
        this.arti = arti;
        this.surah = surah;
    }

     /* *Getter *untuk mengambil isian dari constructo */


    public String getNama() {
        return nama;
    }

    public String getArti() {
        return arti;
    }

    public String getSurah() { return surah; }
}
