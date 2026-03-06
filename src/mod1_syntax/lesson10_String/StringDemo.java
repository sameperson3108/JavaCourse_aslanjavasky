package mod1_syntax.lesson10_String;

public class StringDemo {
    static void main() {
        String strName = "Semen";
        String strLastName = new String("Kondratenko");

        System.out.println(strName + " " + strLastName);

        String firstStr = "Java";
        String secondStr = "java";

        //equals - сравнение строк
        // equalsIgnoreCase - игнорирование регистра
        System.out.println(firstStr.equals(secondStr));
        System.out.println(firstStr.equalsIgnoreCase(secondStr));

        //length() - размер строки
        System.out.println("strName.length() = " + strName.length());

        //получение подстроки
        String greeting = "hello, world!";
        String substring = greeting.substring(
                greeting.indexOf("w"),//7
                greeting.indexOf("!")//12
        );
        System.out.println(substring);

        //проверка наличия подстроки
        System.out.println("contains \"world\": " + greeting.contains("world"));

        //все в еерхний или нижний регистр
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());

        //удаление пробелов (trim)
        var login = "  solara_3108  ";
        String loginTrim = login.trim();
        System.out.println("login after trim: " + loginTrim);

        //replace, замена
        var loginReplace = loginTrim.replace("_",".");
        System.out.println("login after replace" + loginReplace);

        //StringBuffer - для многопоточного
        StringBuilder sb = new StringBuilder("Hello, ");
        sb.append("solara");
        sb.append(" 3108!");
        System.out.println(sb);
    }
}
