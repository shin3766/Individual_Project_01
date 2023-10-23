import java.util.ArrayList;
import java.util.List;

public class MenuMethod {
   static List<Menu> menuList = new ArrayList<Menu>();
   static List<Product> BurgerList = new ArrayList<Product>();
   static List<Product> FrozenCustardList = new ArrayList<Product>();
   static List<Product> DrinksList = new ArrayList<Product>();
   static List<Product> BeerList = new ArrayList<Product>();

    // 메뉴 데이터 만들고 저장하기
     public void makeMenu() {

        // 대 메뉴 만들기==========================================================
        Menu Burgers = new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거");
        Menu Frozen_Custard = new Menu("Frozen Custard", "매장에서 신선하게 만드는 아이스크림");
        Menu Drinks = new Menu("Drinks", "매장에서 직접 만드는 음료");
        Menu Beer = new Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주");

        // 대메뉴판에 메뉴 추가하기--------------------------------------------------
        menuList.add(Burgers);
        menuList.add(Frozen_Custard);
        menuList.add(Drinks);
        menuList.add(Beer);
        //======================================================================

        // 소메뉴 만들기===========================================================
        // Burgers-----------------------------------------------------------------
        Product ShackBurger = new Product("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9, 10.9);
        Product SmokeShack = new Product("SmokeBurger", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9, 12.9);
        Product ShroomBurger = new Product("Shroom Burger", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 9.4, -1);
        Product Cheeseburger  = new Product("Cheeseburger ", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 10.9, -1);
        Product Hamburger = new Product("Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4, 9.0);

        // Frozen Custard-------------------------------------------------------
        Product Shakes = new Product("Shakes", "바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피", 5.9, -1);
        Product ShakeOfTheWeek = new Product("Shake of the week", "특별한 커스터드 플레이버", 6.5, -1);
        Product RedBeanShake = new Product("Red Bead Shakes", "신선한 커스터드와 함께 우유와 레드빈이 블렌딩된 시즈널 쉐이크", 6.5, -1);
        Product Floats = new Product("Floats", "루트 비어, 퍼플 카우, 크림시클", 5.9, -1);

        // Drinks---------------------------------------------------------------
        Product ShackMadeLemonade = new Product("Shack Made Lemonade", "매장에서 직접 만드는 상큼한 레몬에이드", 3.9, 4.5);
        Product FreshBrewedIcedTea = new Product("Fresh Brewed Iced Tea", "직접 유기농 홍차를 우려낸 아이스티", 3.4, 3.9);
        Product FifyFifty = new Product("Fify/Fifty", "레몬에이드와 아이스티의 만남", 3.5, 4.4);
        Product FountainSoda = new Product("Fountain Soda", "코카콜라, 코카콜라 제로, 스프라이트 환타 오렌지, 환타 그레이프", 2.7, 3.3);
        Product AbitaRootBeer = new Product("Abita Root Beer", "청량감 있는 독특한 미국식 무알콜 탄산음료", 4.4, -1);
        Product BottledWater = new Product("Bottled Water", "지리산 암반대수층으로 만든 프리미엄 생수", 1.0, -1);

        // Beer------------------------------------------------------------------
        Product ShackMeisterAle = new Product("Shack Made Lemonade", "쉐이크쉨 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주", 3.9, -1);
        Product MagpieBrewingCo = new Product("Shack Made Lemonade", "Pale Ale, Draft", 3.9, -1);

        // 소메뉴판에 Burgers 추가------------------------------------------------------------
        BurgerList.add(ShackBurger);
        BurgerList.add(SmokeShack);
        BurgerList.add(ShroomBurger);
        BurgerList.add(Cheeseburger);
        BurgerList.add(Hamburger);

        // 소메뉴판에 Frozen Custards 추가------------------------------------------------------------
        FrozenCustardList.add(Shakes);
        FrozenCustardList.add(ShakeOfTheWeek);
        FrozenCustardList.add(RedBeanShake);
        FrozenCustardList.add(Floats);

        // 소메뉴판에 Drinks 추가------------------------------------------------------------
        DrinksList.add(ShackMadeLemonade);
        DrinksList.add(FreshBrewedIcedTea);
        DrinksList.add(FifyFifty);
        DrinksList.add(FountainSoda);
        DrinksList.add(AbitaRootBeer);
        DrinksList.add(BottledWater);

        // 소메뉴판에 Beers 추가------------------------------------------------------------
        BeerList.add(ShackMeisterAle);
        BeerList.add(MagpieBrewingCo);

        //======================================================================
    }

}
