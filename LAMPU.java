class LAMPU {
  
  private String power;
  private int sakelar;
  private int kamar;

  
  public LAMPU() {
    power = "OFF";
    sakelar = 0;
    kamar = 0;
  }

  
  public String getPower() {
    return(power);
  }

  public int getsakelar() {
    return(sakelar);
  }

  public int getkamar() {
    return(kamar);
  }

  public String getSakelarKamar() {
    String Kamar[] = new String[5];
    Kamar[0] = "Kamar 1";
    Kamar[1] = "Kamar 2";
    Kamar[2] = "Kamar 3";
    Kamar[3] = "Kamar 4";
    Kamar[4] = "Kamar 5";

    return(Kamar[sakelar-1]);
  }

  public String getRuanganKamar() {
    String ruangan [] = new String[5];
    ruangan[0] = "Ruang Tamu";
    ruangan[1] = "Dapur";
    ruangan[2] = "Kamar Mandi";
    ruangan[3] = "Kamar Tidur";
    ruangan[4] = "Kamar Tidur 1";

    return(ruangan[kamar-1]);
  }

  // Mutator
  public void setPower(String p) {
    power = p;
  }

  public void setSakelar(int i) {
    sakelar = i;
  }

  public void setKamar(int n) {
    kamar = n;
  }
}