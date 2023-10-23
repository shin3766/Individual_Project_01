public class Product extends Menu{
    //- (완료)상품 클래스는 이름, 가격, 설명 필드를 가지는 클래스로 만들어주세요.
    //- (완료)상품 클래스의 이름, 설명 필드는 메뉴 클래스를 상속받아 사용하는 구조로 개발해주세요.
    //- (진행중)상품 메뉴 보여주는 메서드
    double price;
    double priceDouble;
    int count = 0;
    boolean productDouble = false;
    public Product(String name, String description, double price, double priceDouble){
        super(name, description);
        this.price = price;
        this.priceDouble = priceDouble;
    }

    public void addCount(){
        count++;
    }

    public void clearCount(){
        count = 0;
    }

    @Override
    public String getMenu() {
        return name + "   | " + "W " + price + " | "  + description;
    }

    public String getOrderMenu() {
        return name + "   | " + "W " + price + " | " + count + "개 | " + description;
    }

    public String getDoubleMenu() {
        return name + "(Double)   | " + "W " + price + " | " + count + "개 | " + description;
    }
}
