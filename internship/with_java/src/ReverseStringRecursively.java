public class ReverseStringRecursively {
    public static String reverse(String str) {
        // chuỗi rỗng hoặc chỉ có 1 ký tự
        if(str == null || str.length() <= 1) return str;

        // đệ quy: lấy ký tự cuối + đảo phần còn lại
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
}
