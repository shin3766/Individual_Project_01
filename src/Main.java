import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    // %%% 필수 요구사항 %%%
    // (완)메뉴 클래스, 상품클래스, 주문 클래스
    // (완)메인메뉴판 화면
    // (완)상품메뉴판 화면
    // (완)구매 화면
    // (완)주문 화면
    // (완)주문완료 화면
    // (완)주문 취소 화면

    // %%% 선택 요구사항 %%%
    // (완)주문갯수 기능 추가
    // 상품 옵션 기능 추가 // Single과 Double을 구별해 추가하는데에 어려움
    // (완)총 판매금액 조회 기능 추가
    // 총 판매 상품 목록 조회 기능 추가 //HashSet으로 바꾸면서 구현에 어려움

    public static void main(String[] args) {
        // 메뉴 객체 가져오기
        Scanner sc = new Scanner(System.in);
        MenuMethod MenuMethod = new MenuMethod();
        Screen Screen = new Screen();
        HashSet<Product> ProductCheckOut = new HashSet<>();
        HashSet<Product> TotalSalesProduct = new HashSet<>();
        Product userChoiceProduct;
        int userChoiceNum;
        int orderNumber = 1;
        double salesTotal = 0;

        // 메뉴 데이터 생성
        MenuMethod.makeMenu();

        //
        while (true) {
            // 메인 메뉴 스크린 보여주기 & 사용자가 누른번호 저장
            userChoiceNum = Screen.mainMenuScreen();

            // 사용자가 누른 번호로 소메뉴창 이동 & 사용자가 누른 번호로 상품 저장

            switch (userChoiceNum) {
                case 1:
                    // 버거메뉴
                    userChoiceProduct = Screen.BurgerMenu();

                    // 위 메뉴를 장바구니에 추가시겠습니까?
                    userChoiceNum = Screen.CheckOutProduct(userChoiceProduct);

                    switch (userChoiceNum) {
                        case 1:
                            // userChoiceProduct 장바구니에 추가 알림
                            ProductCheckOut.add(userChoiceProduct);
                            userChoiceProduct.addCount(); // (선택과제)제품 count 1씩 올리기
                            System.out.println(userChoiceProduct.name + "가 장바구니에 추가되었습니다.");
                            // 메뉴판으로 돌아가기
                            continue;

                        case 2:
                            // 메뉴판으로 돌아가기
                            continue;
                        default:
                            System.out.println("잘못된 접근입니다.");
                            break;

                    }
                    continue;

                case 2:
                    // 아이스크림메뉴
                    userChoiceProduct = Screen.FrozenCustardMenu();
                    // 위 메뉴를 장바구니에 추가시겠습니까?
                    userChoiceNum = Screen.CheckOutProduct(userChoiceProduct);

                    switch (userChoiceNum) {
                        case 1:
                            // userChoiceProduct 장바구니에 추가 알림
                            ProductCheckOut.add(userChoiceProduct);
                            userChoiceProduct.addCount(); // (선택과제)제품 count 1씩 올리기
                            System.out.println(userChoiceProduct.name + "가 장바구니에 추가되었습니다.");
                            // 메뉴판으로 돌아가기
                            continue;

                        case 2:
                            // 메뉴판으로 돌아가기
                            continue;
                        default:
                            System.out.println("잘못된 접근입니다.");
                            break;

                    }
                    continue;

                case 3:
                    // 음료메뉴
                    userChoiceProduct = Screen.DrinksMenu();

                    // 위 메뉴를 장바구니에 추가시겠습니까?
                    userChoiceNum = Screen.CheckOutProduct(userChoiceProduct);

                    switch (userChoiceNum) {
                        case 1:
                            // userChoiceProduct 장바구니에 추가 알림
                            ProductCheckOut.add(userChoiceProduct);
                            userChoiceProduct.addCount(); // (선택과제)제품 count 1씩 올리기
                            System.out.println(userChoiceProduct.name + "가 장바구니에 추가되었습니다.");
                            continue;

                        case 2:
                            // 메뉴판으로 돌아가기
                            continue;
                        default:
                            System.out.println("잘못된 접근입니다.");
                            break;

                    }
                    continue;

                case 4:
                    // 맥주메뉴
                    userChoiceProduct = Screen.BeerMenu();

                    // 위 메뉴를 장바구니에 추가시겠습니까?
                    userChoiceProduct.addCount(); // (선택과제)제품 count 1씩 올리기
                    userChoiceNum = Screen.CheckOutProduct(userChoiceProduct);

                        switch (userChoiceNum) {
                            case 1:
                                // userChoiceProduct 장바구니에 추가 알림
                                ProductCheckOut.add(userChoiceProduct);
                                System.out.println(userChoiceProduct.name + "가 장바구니에 추가되었습니다.");
                                continue;

                            case 2:
                                // 메인판으로 돌아가기
                                continue;
                            default:
                                System.out.println("잘못된 접근입니다.");
                                break;

                        }
                        continue;

                case 5:
                    // 장바구니보여주기
                    userChoiceNum = Screen.OrderMenu(ProductCheckOut);
                    switch (userChoiceNum){
                        case 1: //주문하고 번호표
                            Screen.CompletedOrder(orderNumber);

                            salesTotal += Screen.GetSalesTotal(ProductCheckOut);
                            orderNumber++;
                            Screen.EraseOrderList(ProductCheckOut);
                            continue;

                        case 2: //메뉴판으로 돌아가기
                            continue;
                        default:
                            System.out.println("잘못된 접근입니다.");
                            break;
                    }


                case 6:
                    //취소
                    System.out.println("진행하던 주문을 취소하시겠습니까?");
                    System.out.println("1. 확인           2. 취소");
                    userChoiceNum = sc.nextInt();
                    switch (userChoiceNum){
                        case 1: //주문취소 확인
                            Screen.EraseOrderList(ProductCheckOut);

                            continue;

                        case 2: //주문취소 취소
                            continue;
                        default:
                            System.out.println("잘못된 접근입니다.");
                            break;
                    }
                    
                case 0:
                    System.out.println("[ 총 판매상품 현황 ]");
                    System.out.println("현재까지 총 판매된 상품 목록은 아래와 같습니다.");
                    System.out.println();

                    System.out.println("현재까지 총 판매된 상품 목록은 아래와 같습니다.");



                    System.out.println("[ 총 판매금액 현황 ]");
                    System.out.println("[ 현재까지 총 판매된 금액은 [ W " + salesTotal + " ] 입니다. ]");
                    System.out.println();
                    System.out.println("1. 돌아가기");
                    userChoiceNum = sc.nextInt();

                    switch (userChoiceNum) {
                        case 1:
                            continue;
                        case 2:
                            System.out.println("잘못된 접근입니다.");
                            break;
                    }

                default:
                    System.out.println("알 수 없는 번호입니다.");
                    break;

           }
        }
    }
}




