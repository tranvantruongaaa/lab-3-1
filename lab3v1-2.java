package LAB3_1;
import java.util.Scanner;
class Thisinh {
    Scanner sc = new Scanner(System.in);
    protected String Hoten;
    protected int DiemToan,DiemVan,DiemNN;

    int x;
    int y[]= null;
    Thisinh(){
        System.out.println("Nhập họ va tên thí sinh:");
        Hoten = sc.nextLine();
        System.out.println("Nhâp điểm môn Toán: ");
        DiemToan = sc.nextInt();
        System.out.println("Nhâp điểm môn Văn: ");
        DiemVan = sc.nextInt();
        System.out.println("Nhâp điểm môn Ngoại Ngữ: ");
        DiemNN = sc.nextInt();
    }
    Thisinh(String Hoten,int DiemToan,int DiemVan,int DiemNN)
    {
        this.Hoten=Hoten;
        this.DiemToan=DiemToan;
        this.DiemVan=DiemVan;
        this.DiemNN=DiemNN;
    }
    
    public void intt(){
        System.out.println("Ho ten: "+Hoten+"Điem toan:  "+DiemToan+"Điem van: "+DiemVan+"Điem Ngoai ngu:  "+DiemNN+"\tTong điem: "+(DiemNN+ DiemToan+DiemVan)+"\n");
    }
    public void nhapds(){
        Thisinh y[];
        do{
            System.out.println("Nhap so thi sinh");
            x=sc.nextInt();
            if(x<=0){
                System.out.println("Yeu cau nhap lai");
            }
        }while(x<=0);
        y=new Thisinh[x];
        for(int i=0;i<x;i++)
        {
            System.out.println("Nhap thi sinh thu"+(i+1)+":");
            y[i]= new Thisinh();
        }
        for(int i=0;i<x;i++)
        {
            y[i].intt();
        }
    }
}
public class lab3v1_2{
    public static void main(String[]args){
        Thisinh a= new Thisinh();
        a.nhapds(); 
    }
}