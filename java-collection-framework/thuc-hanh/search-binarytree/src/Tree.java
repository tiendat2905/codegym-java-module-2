public interface Tree<E> {
    //chèn phần tử e vào cây nhị phân
    //*Trả về true nếu phần tử được chèn thành công
    public boolean insert(E e);

    //duyệt theo thứ tự đi qua từ root
    public void inorder();

    //Lấy số lượng nút trong cây
    public int getSize();
}
