package DAY_6;
import Access_modifiers.*;

public class defaultex {
    public static void main(String[] args) {
        defaultex obj=new defaultex();
        obj.display();// this will give compilation error since we cannotaccess outside the package
    }
}
