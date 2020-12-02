import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void classifyTriangle() {
        int triangleEdge1 = 2;
        int triangleEdge2 = 2;
        int triangleEdge3 = 2;
        String result = TriangleClassifier.classifyTriangle(triangleEdge1,triangleEdge2,triangleEdge3);
        String expect = "tam giac deu";

        assertEquals(expect, result);
    }
}