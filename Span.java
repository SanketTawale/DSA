package DSA;

public class Span {
    //span = max - min;
    static int span(int[] a){
        int max=a[0],min=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]< min){
                min=a[i];
            }
            else if(a[i]> max){
                max=a[i];
            }
        }
        int span=max-min;
        return span;
    }
    public static void main(String[] args) {
    int[] a={20,42,88,10,99,6};
        System.out.println("Span : "+span(a));
    }
}
