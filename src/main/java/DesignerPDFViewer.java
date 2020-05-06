


public class DesignerPDFViewer {

    static int designerPdfViewer(int[] h, String word) {
        int maxHeight=word.codePoints().mapToObj(letter->h[letter-'a']).max((o1,o2)->o1-o2).orElseThrow(RuntimeException::new);
        return word.length()*maxHeight;

    }

    public static void main(String[] args) {
        System.out.println(designerPdfViewer(new int[]{1, 3, 1 ,3, 1, 4 ,1 ,3 ,2 ,5, 5 ,5, 5, 5 ,5 ,5, 5, 5 ,5 ,5, 5, 5 ,5 ,5 ,5 ,7},"zaba"));
    }
}
