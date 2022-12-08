import java.io.*;              

class SaklarLAMPU {              
  
  public static void main(String arg[]) {        
    
    LAMPU lampu= new LAMPU();

   
    InputStreamReader istream = new InputStreamReader(System.in);
    BufferedReader bufRead = new BufferedReader(istream);

    int sklr = 0;
    int kmr = 0;
    try {
     
      System.out.println();
      System.out.print("Sakelar (1-5) : ");
      String iString = bufRead.readLine();
      sklr = Integer.parseInt(iString);

      System.out.print("Kamar         : ");
      String nString = bufRead.readLine();
      kmr = Integer.parseInt(nString);

      
      lampu.setPower("ON");  
      lampu.setSakelar(sklr);
      lampu.setKamar(kmr);  

      System.out.println();
      System.out.println("Power   : "+lampu.getPower());
      System.out.println("Kamar   : "+lampu.getkamar());
      System.out.println("Sakelar : "+lampu.getsakelar());
      System.out.println("  "+lampu.getSakelarKamar());
      System.out.println("  "+lampu.getRuanganKamar());
    }
    catch (IOException err) {
      System.out.println("Proses baca GAGAL,Silahkan COBA LAGI!");
    }
    catch (NumberFormatException err) {
      System.out.println("Kamar yang di Input tidak valid!");
    }
  }
}
