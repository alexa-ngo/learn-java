public class Display {
    public static void main(String[] args) {
        Pixel p = Pixel.getVeryRedPixel(65, 121);
        
        System.out.println(p.toJSON());
    }
}