class rectangle {
    int length;
    int width;

    public void getdata(int x, int y) {
        length = x;
        width = y;
    }

    public int area() {
        return length * width;
    }
}

public class rectangleclass {
    public static void main(String[] args) {
        rectangle rect1 = new rectangle();
        rect1.length = 12;
        rect1.width = 15;

        System.out.println(rect1.area());
    }
}