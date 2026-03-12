package week02.sec02.works;

public class W5 {
    public static void main(String[] args) {
        String str1 = "" + "{\n" +
                "\t\"name\":\"jang\"\n" +
                "}";

        String str2 = """
                {
                "id": "winter",
                "name": "jang"
                }
                """;
        System.out.println(str1);
        System.out.println("----------------");
        System.out.println(str2);
        System.out.println("----------------");
        String str = """
                나는 자바를 \
                학습합니다.
                나는 자바 고-수 인 것입니다..(아마도)
                """;
        System.out.println(str);
    }
}
