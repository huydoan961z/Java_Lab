
package bai3;


public class SinhVien {
    private String id ;
    private double grades;
    private String name;
    private String classr;
    private String birth;
    private static int cntt=0;

    public SinhVien()
    {
        this.cntt++ ;
    }
    public SinhVien(String id, double grades, String name, String classr, String birth) {
        this.id = id;
        this.grades = grades;
        this.name = name;
        this.classr = classr;
        this.birth = birth;
        this.cntt++ ;
    }

    public static int getCntt() {
        return cntt;
    }

    
   
    public String toString()
    {
        return id+" " +grades+ " " + name+ " "+ classr+ " "+ birth+ "" ;
    }
    
    public void inFo()
    {
        System.out.println(id+" " +grades+ " " + name+ " "+ classr+ " "+ birth+ "");
    }
    
}
