
package bai4;


public class nhanvien {
    private String ma;
    private String name;
    private String gender;
    private String birth, diachi,thue,hopdong ;

    public nhanvien(String ma, String name, String gender, String birth, String diachi, String thue, String hopdong) {
        this.ma = ma;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.diachi = diachi;
        this.thue = thue;
        this.hopdong = hopdong;
    }
 public String toString()
 {
     return this.ma +" " + this.name +" " + this.gender +" " + this.birth +" " + this.diachi +" " + this.thue +" " + this.hopdong+" " ;
 }
         
    public void chuanHoaBirth()
    {
        StringBuilder sb= new StringBuilder(this.birth);
        if(sb.charAt(1)=='/')
            sb.insert(0, "0");
        if(sb.charAt(4)=='/')
            sb.insert(3, "0");
        this.birth=sb.toString();
    }
}

