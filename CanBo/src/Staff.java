import java.util.ArrayList;
import java.util.Scanner;

public class Staff {
    private String ho_ten;
    private int tuoi;
    private String gioi_tinh;
    private String dia_chi;

    // Hàm khởi tạo có tham số
    public Staff(String ho_ten, int tuoi, String gioi_tinh, String dia_chi) {
        this.ho_ten = ho_ten;
        this.tuoi = tuoi;
        this.gioi_tinh = gioi_tinh;
        this.dia_chi = dia_chi;
    }

   
    public void hienThiThongTin() {
        System.out.println("Ho ten can bo: " + ho_ten);
        System.out.println("Tuoi can bo: " + tuoi);
        System.out.println("Gioi tinh can bo: " + gioi_tinh);
        System.out.println("Dia chi can bo: " + dia_chi);
    }
     // Getters và Setters
     public String getho_ten() {
        return ho_ten;
    }

    public int gettuoi() {
        return tuoi;
    }

    public String getgioi_tinh() {
        return gioi_tinh;
    }

    public String getdia_chi() {
        return dia_chi;
    }
   
      
    
}
class Worker extends Staff{
    private int bac;
    public Worker(String ho_ten, int tuoi, String gioi_tinh, String dia_chi,int bac)
    {
        super(ho_ten,tuoi,gioi_tinh, dia_chi);
        this.bac=bac;
    }
      public int getbac() {
        return bac;
    }
}
class Engineer extends Staff{
    private String nganhdaotao;
    public Engineer(String ho_ten, int tuoi, String gioi_tinh, String dia_chi,String nganhdaotao){
        super(ho_ten,tuoi,gioi_tinh, dia_chi);
        this.nganhdaotao= nganhdaotao;
    }
     public String getnganhdaotao() {
        return nganhdaotao;
    }
}
class Officer extends Staff{
    private String congviec;
    public Officer(String ho_ten, int tuoi, String gioi_tinh, String dia_chi, String congviec){
        super(ho_ten,tuoi,gioi_tinh, dia_chi);
        this.congviec= congviec;
    }
    public String getcongviec(){
        return congviec;
    }
}
