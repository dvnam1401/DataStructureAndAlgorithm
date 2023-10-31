package geometry;
public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng của lớp ListOfHinh để quản lý danh sách các hình học
        ListOfHinh listOfHinh = new ListOfHinh();
        
        // Gọi phương thức nhapHinh để nhập 10 hình từ bàn phím
        listOfHinh.nhapHinh();
        
        // Gọi phương thức hienThiDanhSach để hiển thị thông tin của danh sách hình
        listOfHinh.hienThiDanhSach();
        
        // Gọi phương thức hienThiHinhCoDienTichLonNhat để hiển thị hình có diện tích lớn nhất
        listOfHinh.hienThiHinhCoDienTichLonNhat();
        
        // Gọi phương thức hienThiHinhTruCoDienTichLonNhatNhoNhat để hiển thị hình trụ có diện tích lớn nhất và nhỏ nhất
        listOfHinh.hienThiHinhTruCoDienTichLonNhatNhoNhat();
    }
}

