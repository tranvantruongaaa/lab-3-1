package LAB3_1;
import java.util.Scanner;
class person{
    Scanner sc = new Scanner(System.in);
    protected String ten , ngaysinh,gioitinh,quequan; 
   
    int a;
    int b[] = null;
    person(){
            System.out.print("nhap ten: ");
            ten = sc.nextLine();
            System.out.print("nhap ngay sinh: ");
            ngaysinh = sc.nextLine();
            System.out.print("nhap gioitinh: ");
            gioitinh= sc.nextLine();
            System.out.print("nhap quequan: ");
            quequan = sc.nextLine();
    }
    person(String ten ,String  ngaysinh,String gioitinh, String quequan){
        this.ten=ten;
        this.ngaysinh =ngaysinh;
        this.gioitinh =gioitinh;
        this.quequan =quequan;
    }
    public void hienthitt(){
        System.out.print("hien thi: "+ ten +" "+ ngaysinh +" "+ gioitinh +" "+ quequan + "\n");
    }
    public void nhapsonguoi(){
        person b[];
            do{
            System.out.print("nhap so nguoi: ");
            a = sc.nextInt();
         if(a<=0){
            System.out.print("nhap sai yeu cau nhap lai! ");
         }
        }while(a<=0);
        b = new person[a];
       for(int i=0; i<a;i++){
        System.out.print("nhap nguoi t" + (i+1)+" : ");
          b[i] = new person();
       }
       for(int i=0; i<a;i++){
        System.out.print("nhap nguoi t" + (i+1)+" : ");
          b[i].hienthitt();
       }
    }
}
public class lab3v1 {
    public static void main(String[]args) {
    person a = new person();
    a.nhapsonguoi();
    }
}