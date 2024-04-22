public class StringBuilder_Q {
    public static void equal() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        String message = sb.toString();
        System.out.println(message);
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.compareTo(sb2));

    }

    public static void sum() {
        StringBuffer sb1 = new StringBuffer("Java");
        StringBuffer sb2 = new StringBuffer("Java");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.compareTo(sb2));

        System.out.println(sb1.reverse());
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

    }

    public static void extra() {
        StringBuffer sb = new StringBuffer();
        sb.append("Praveen");
        sb.append(" ");
        sb.append("Rajput");
        System.out.println(sb.charAt(10));
        System.out.println(sb.lastIndexOf("Rajput"));
        System.out.println(sb.hashCode());

        System.out.println(sb.length());
    }

    public static void main(String[] args) {
        equal();
        sum();
        extra();
    }
}
