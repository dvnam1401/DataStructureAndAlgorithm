public class ReverseString {
    public static String reverse(String str) {
        char[] charArray = str.toCharArray(); // chuyển chuỗi thành mảng ký tự
        int l = 0, r = charArray.length - 1;
        // lặp để hoán đổi các ký tự
        while (l < r) {
            // hóa đổi ký tự tại vị trí l và r
            char temp = charArray[l];
            charArray[l] = charArray[r];
            charArray[r] = temp;

            // tăng l, giảm r
            l++;
            r--;
        }

        return new String(charArray);
    }
}
