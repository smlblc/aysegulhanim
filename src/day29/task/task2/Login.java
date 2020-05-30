package day29.task.task2;

public class Login {

    String userName;
    String password;
    String role;//User,Admin


    public static Login createUser(String user,String pass){
        Login login= new Login();
        login.userName=user;
        login.password=pass;
        login.role="User";
        return  login;
    }

    public static Login createAdmin(String user,String pass){
        Login login= new Login();
        login.userName=user;
        login.password=pass;
        login.role="Admin"; //A always Upper//developerlar kod yazarken mutlka bir farklilik
        //olmasi icin boyle ayrimlar koyarlar
        return  login;
    }

    // create instance method in Login to check
    // if username and password are not empty and not null
     // hoca dediki bu bir instance method bu nedenle parametre yazmamiza gerek yok
        public void check(){
        //boolean a=StringUtils.isBlank(userName);
        if(StringUtils.isBlank(userName)){
            System.out.println("Please enter valid username ");
        }if(StringUtils.isBlank(password)){
            System.out.println("Please enter valid password");


}}}
