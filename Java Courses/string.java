public class string {
    public static void main(String a[]) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World ");
        sb.insert(6, " java ");
        sb.ensureCapacity(100);

        System.out.println(sb);
    }
}
