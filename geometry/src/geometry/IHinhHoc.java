
package geometry;
import java.util.ArrayList;
import java.util.Scanner;

public interface IHinhHoc {
    double tinhDienTich();
    double tinhTheTich();
}

// Lớp trừu tượng HinhTron đại diện cho một hình tròn
abstract class HinhTron implements IHinhHoc {
    protected double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public abstract double tinhTheTich();
}

// Lớp HinhNon kế thừa từ HinhTron, đại diện cho một hình nón
class HinhNon extends HinhTron {
    private double chieuCao;

    public HinhNon(double banKinh, double chieuCao) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhTheTich() {
        return (1.0 / 3.0) * tinhDienTich() * chieuCao;
    }
}

// Lớp HinhTru kế thừa từ HinhTron, đại diện cho một hình trụ
class HinhTru extends HinhTron {
    private double chieuCao;

    public HinhTru(double banKinh, double chieuCao) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhTheTich() {
        return tinhDienTich() * chieuCao;
    }
}

// Lớp ListOfHinh quản lý danh sách các đối tượng hình học
class ListOfHinh {
    private ArrayList<IHinhHoc> list;

    public ListOfHinh() {
        list = new ArrayList<IHinhHoc>();
    }

    // Phương thức nhập 10 hình từ bàn phím
    public void nhapHinh() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Nhập hình " + (i + 1) + ":");
            System.out.println("Nhập 1 cho hình nón, 2 cho hình trụ:");
            int choice = sc.nextInt();
            System.out.println("Nhập bán kính:");
            double banKinh = sc.nextDouble();
            System.out.println("Nhập chiều cao:");
            double chieuCao = sc.nextDouble();
            if (choice == 1) {
                list.add(new HinhNon(banKinh, chieuCao));
            } else if (choice == 2) {
                list.add(new HinhTru(banKinh, chieuCao));
            } else {
                System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
                i--;
            }
        }
        sc.close();
    }

    // Phương thức hiển thị thông tin của danh sách hình
    public void hienThiDanhSach() {
        for (int i = 0; i < list.size(); i++) {
            IHinhHoc hinh = list.get(i);
            System.out.println("Hình " + (i + 1) + ":");
            System.out.println("Diện tích: " + hinh.tinhDienTich());
            System.out.println("Thể tích: " + hinh.tinhTheTich());
        }
    }

    // Phương thức hiển thị hình có diện tích lớn nhất
    public void hienThiHinhCoDienTichLonNhat() {
        double maxArea = 0;
        int maxIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            IHinhHoc hinh = list.get(i);
            double area = hinh.tinhDienTich();
            if (area > maxArea) {
                maxArea = area;
                maxIndex = i;
            }
        }
        if (maxIndex != -1) {
            System.out.println("Hình có diện tích lớn nhất là hình " + (maxIndex + 1) + ":");
            System.out.println("Diện tích: " + maxArea);
            System.out.println("Thể tích: " + list.get(maxIndex).tinhTheTich());
        } else {
            System.out.println("Không có hình nào trong danh sách.");
        }
    }

    // Phương thức hiển thị hình trụ có diện tích lớn nhất và nhỏ nhất
    public void hienThiHinhTruCoDienTichLonNhatNhoNhat() {
        double maxArea = 0;
        int maxIndex = -1;
        double minArea = Double.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            IHinhHoc hinh = list.get(i);
            if (hinh instanceof HinhTru) {
                double area = hinh.tinhDienTich();
                if (area > maxArea) {
                    maxArea = area;
                    maxIndex = i;
                }
                if (area < minArea) {
                    minArea = area;
                    minIndex = i;
                }
            }
        }
        if (maxIndex != -1) {
            System.out.println("Hình trụ có diện tích lớn nhất là hình " + (maxIndex + 1) + ":");
            System.out.println("Diện tích: " + maxArea);
            System.out.println("Thể tích: " + list.get(maxIndex).tinhTheTich());
        } else {
            System.out.println("Không có hình trụ nào trong danh sách.");
        }
        if (minIndex != -1) {
            System.out.println("Hình trụ có diện tích nhỏ nhất là hình " + (minIndex + 1) + ":");
            System.out.println("Diện tích: " + minArea);
            System.out.println("Thể tích: " + list.get(minIndex).tinhTheTich());
        } else {
            System.out.println("Không có hình trụ nào trong danh sách.");
        }
    }
}

