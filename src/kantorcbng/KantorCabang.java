/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kantorcbng;

/**
 *
 * @author acer
 */
public class KantorCabang {

    private String code, kota;
    private Pegawai pimpinan;
    private Pegawai[] karyawan;
    static final int MAX_PEGAWAI = 100;
    int jumlahPegawai = 0;

    public KantorCabang() {
        karyawan = new Pegawai[MAX_PEGAWAI];
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * @return the pimpinan
     */
    public Pegawai getPimpinan() {
        return pimpinan;
    }

    /**
     * @param pimpinan the pimpinan to set
     */
    public void setPimpinan(Pegawai pimpinan) {
        this.pimpinan = pimpinan;
    }

    /**
     * @return the karyawan
     */
    public Pegawai[] getKaryawan() {
        return karyawan;
    }

    /**
     * @param karyawan the karyawan to set
     */
    public void setKaryawan(Pegawai[] karyawan) {
        this.karyawan = karyawan;
    }

    public void tambahPegawai(Pegawai x) {
        if (jumlahPegawai < MAX_PEGAWAI) {
            karyawan[jumlahPegawai] = x;
            jumlahPegawai++;
        }
    }

    public Pegawai findPegawai(String x) {
        for (int i = 0; i < jumlahPegawai; i++) {
            if (karyawan[i].getNip().equalsIgnoreCase(x)) {
                return karyawan[i];
            }
        }
        return null;
    }

    public int fingIndexPegawai(String x) {
        for (int i = 0; i < jumlahPegawai; i++) {
            if (karyawan[jumlahPegawai].getNip().equalsIgnoreCase(x)) {
                return i;
            }
        }
        return -1;
    }

    public Pegawai deletePegawai(String x) {
        int index = this.fingIndexPegawai(x);
        Pegawai bantu;
        if (index >= 0) {
            bantu = karyawan[index];
            karyawan[index] = karyawan[jumlahPegawai - 1];
            karyawan[jumlahPegawai - 1] = null;
        } else {
            bantu = null;
        }
        return bantu;
    }
}
