import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Screen {
    Scanner sc = new Scanner(System.in);
    public int mainMenuScreen() {
        int userChoiceNum = -1;
        int mainMenuNum = MenuMethod.menuList.size();
        int menuNum = 1;

        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ SHAKESHACK MENU ]");

        // 메뉴 종류 출력
        for (Menu menu: MenuMethod.menuList) {
            System.out.println(menuNum +". " +menu.getMenu());
            menuNum++;
        }

        System.out.println();

        System.out.println("[ ORDER MENU ]");

        // 장바구니 확인, 주문 취소 구현 필요
        System.out.println(mainMenuNum + 1 + ". Order | 장바구니를 확인 후 주문합니다.");
        System.out.println(mainMenuNum + 2 + ". Cancel | 진행중인 주문을 취소합니다.");

        userChoiceNum = sc.nextInt();

        return userChoiceNum;
    }

    public Product BurgerMenu() {
        int userChoiceNum = -1;
        int menuNum = 1;

        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Burgers MENU ]");

        // 버거 종류 출력
        for (Product burger: MenuMethod.BurgerList){
            System.out.println(menuNum +". " +burger.getMenu());
            menuNum++;
        }

        userChoiceNum = sc.nextInt() - 1;

        return MenuMethod.BurgerList.get(userChoiceNum);
    }
    public Product FrozenCustardMenu() {
        int userChoiceNum = -1;
        int menuNum = 1;

        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Frozen Custard MENU ]");

        // 버거 종류 출력
        for (Product FrozenCustard: MenuMethod.FrozenCustardList){
            System.out.println(menuNum +". " +FrozenCustard.getMenu());
            menuNum++;
        }

        userChoiceNum = sc.nextInt() - 1;

        return MenuMethod.FrozenCustardList.get(userChoiceNum);
    }
    public Product DrinksMenu() {
        int userChoiceNum = -1;
        int menuNum = 1;

        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Drinks MENU ]");

        // 버거 종류 출력
        for (Product drink: MenuMethod.DrinksList){
            System.out.println(menuNum +". " +drink.getMenu());
            menuNum++;
        }

        userChoiceNum = sc.nextInt() - 1;

        return MenuMethod.DrinksList.get(userChoiceNum);
    }
    public Product BeerMenu() {
        int userChoiceNum = -1;
        int menuNum = 1;

        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Beer MENU ]");

        // 버거 종류 출력
        for (Product beer: MenuMethod.BeerList){
            System.out.println(menuNum +". " +beer.getMenu());
            menuNum++;
        }

        userChoiceNum = sc.nextInt() - 1;

        return MenuMethod.BeerList.get(userChoiceNum);
    }

    // 장바구니 추가 화면 출력
    public int CheckOutProduct(Product selectedProduct) {
        System.out.println(selectedProduct.getMenu());
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        return sc.nextInt();
    }

    public int OrderMenu(HashSet<Product> ProductCheckOut){
        double total = 0;

        System.out.println("[ Orders ]");

        for (Product orderProduct: ProductCheckOut){
            System.out.println(orderProduct.getOrderMenu());
            total += orderProduct.price * orderProduct.count;
        }

        System.out.println();
        System.out.println("[ Total ]");
        System.out.println("W " + total);
        System.out.println("1. 주문         2. 메뉴판");
        return sc.nextInt();
    }

    public void CompletedOrder(int orderNumber){
        System.out.println("주문이 완료되었습니다!");
        System.out.println();
        System.out.println("대기번호는 [ " + orderNumber + " ] 번 입니다.");
        System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void EraseOrderList(HashSet<Product> ProductCheckOut){
        ProductCheckOut.clear();
    }

    public int ProductOptionOrder(Product userChoiceProduct){
        int userChoiceNum = sc.nextInt();

        switch (userChoiceNum){
            case 1:
                    userChoiceNum = CheckOutProduct(userChoiceProduct);

            case 2:

            default:
                System.out.println("잘못된 접근입니다.");
                break;
        }
        return userChoiceNum;
    }

    public double GetSalesTotal(HashSet<Product> ProductCheckOut) {
        double total = 0;
        for (Product orderProduct: ProductCheckOut){
            total += orderProduct.price * orderProduct.count;
        }

        return total;
    }

    public void AddSalesProductToal(HashSet<Product> ProductCheckOut) {

    }
}
