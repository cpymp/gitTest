package domain;

/**
 * ClassName: Users
 * Package: domain
 * Description:
 *
 * @Author cpymp
 * @Create 2023/11/20 15:11
 * @Version 1.0
 */
public class Users {
            private String name;
            private int age;
            private String password;

    public static void main(String[] args) {

        /*
        unable to access 'https://github.com/cpymp/gitTest.git/': Failed to connect to github.com port 443 after 21100 ms: Couldn't connect to server
         */
        for (int i = 0; i < 100 ; i++){
            System.out.println("i = : " + i);
        }

        for (int i = 1 ; i <= 9;i++){
            for (int j = 1 ; j <= i;j++){
                System.out.print(j+"*"+i+"=" + (i*j) +"\t");
            }
            System.out.println();
        }

        int s = 1;
        while (s < 24){
            System.out.println("----------");
            s++;
        }


    }
}
