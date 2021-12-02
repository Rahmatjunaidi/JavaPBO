/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi1;

/**
 *
 * @author HP
 */


      
//////////
    class dataSiswa {
    private String Nama;
    private String Kelas;
    private String Tanggal_Lahir;
    private String Bulan;
    private String Tahun;
    private String Umur;
    
    public void setNama(String value) {
        Nama = value;
    }
    public void setKelas(String value) {
        Kelas = value;
    }
     public void setTanggal_Lahir(String value) {
        Tanggal_Lahir = value;
    }
      public void setBulan(String value) {
        Bulan = value;
    }
      public void setTahun(String value) {
        Tahun = value;
    }
      public void setUmur(String value) {
        Umur = value;
    }
      //
      
      public String getNama(){
          return Nama;
      }

      public String getKelas() {
        return Kelas;
      }

    public String getTanggal_Lahir() {
        return Tanggal_Lahir;
    }

    public String getBulan() {
        return Bulan;
    }

    public String getTahun() {
        return Tahun;
    }

    public String getUmur() {
        return Umur;
    }
    
}
    public class Enkapsulasi1 {
    public static void main(String[] args) {
         
        dataSiswa a = new dataSiswa() ;
        a.setNama("Rahmat Junaidi Nasution");
        a.setKelas("11");
        a.setTanggal_Lahir("Tanggal 06");
        a.setBulan("September");
        a.setTahun("2004");
        a.setUmur("17 Tahun");
        System.out.println("Nama Saya Adalah "+ a.getNama()+ " Dan Saya Kelas :"+ a.getKelas()+ " Tanggal Lahir Saya Adalah : "+ a.getTanggal_Lahir() + " Pada Bulan : " + a.getBulan() + " Tahun : "+ a.getTahun() + " Dan Sekarang Umur Saya Adalah : " +a.getUmur());
    
    }
}

/////


    

