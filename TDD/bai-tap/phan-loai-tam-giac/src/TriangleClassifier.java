public class TriangleClassifier {
    public static String classifyTriangle(int edge1, int edge2, int edge3){
        if (edge1 + edge2 <= edge3 || edge2 + edge3 <= edge1 || edge1 + edge3 <= edge2)
            return "khong phai tam giac";

        if (edge1 == edge2 && edge2 == edge3)
            return "tam giac deu";

        if (edge1 == edge2 || edge2 == edge3 || edge1 == edge3)
            return "tam giac can";

        return "tam giac thuong";
    }
}
