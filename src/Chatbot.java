public class Chatbot{
    private String name;
    public Chatbot(){
        System.out.println("チャットボットの原型を作成します。");
    }
    public Chatbot(String _name){
        this.name = _name;
        System.out.println("チャットボット名" + this.name + "を作成します。");
    }
}