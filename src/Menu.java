public class Menu {
    // 메뉴 클래스는 이름, 설명 필드를 가지는 클래스로 만들어주세요.
    String name;
    String description;


    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }

    String getMenu() {
        return name + "         | " + description;
    }

}


