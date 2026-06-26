import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        boolean isTriangle;

        do{
            System.out.print("Nhap canh 1 ");
            a = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap canh 2 ");
            b = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap canh 3 ");
            c = Integer.parseInt(sc.nextLine());
            isTriangle = a+b>c && b+a>c && a+c>b;
            if (!isTriangle) {
                System.out.println("Lỗi: 3 số vừa nhập không hợp lệ. Vui lòng nhập lại!\n");
            }
        } while (!isTriangle);
        if(a == b && b == c ){
            System.out.println("Day la tam giac deu");
        }else if (a == b || b ==c || c == a){
            System.out.println("Day la tam giac deu");
        }else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            System.out.println("Day la tam giac vuong");
        }else {
            System.out.println("Day la tam giac thuong");
        }
        sc.close();
    }
}