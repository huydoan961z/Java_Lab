
package bai333;


public class SinhVien 
{
    private String id;
    private String name;
    private String classr;

    private String birth;
    private double gpa ;

    public SinhVien(int id, String name, String classr, String birth, double gpa) 
    {
        this.id = "SV"+String.format("%03d",id);
        this.name = name;
        this.classr = classr;
        this.birth = birth;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
   public String getClassr() {
        return classr;
    }

    public void setClassr(String classr) {
        this.classr = classr;
    }
    
    
    //chuanhoaten
    public void chuanhoaten()
    {
        this.name=this.name.replaceAll("[^a-zA-Z ]", "");
        this.name=this.name.trim().toLowerCase();
        this.name = this.name.replaceAll("\\s+", " ");
        String[] arr;
        arr = this.name.split(" ");
        this.name="";
        for(int i=0;i<arr.length;i++)
        {
            this.name+= String.valueOf(arr[i].charAt(0)).toUpperCase()+arr[i].substring(1);
            if(i<arr.length -1)
            {
                this.name+=" " ;
         
        
            }
        }
        
    }  
    public void chuanhoabirth()
    {
        StringBuilder sb= new StringBuilder(this.birth);
        if(sb.charAt(1)=='/')
        {
            sb.insert(0, "0");
        }
        if(sb.charAt(4)=='/')
        {
            sb.insert(3, "0");
        }
        this.birth=sb.toString();
    }
    
    public String  toString()
    {
        return this.id+ " " +this.name+" " +this.classr+" " +this.birth+" " +String.format("%.2f", this.gpa);
    }
    
}

            

