public class Book implements Comparable<Book> {
    private String title;
    private int pageNum;

    public Book(String title, int pageNum) {
        this.title = title;
        this.pageNum = pageNum;
    }

    public String getTitle() {
        return title;
    }

    public int getPageNum() {
        return pageNum;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }



    @Override
    public String toString() {
        return "Tittle: " + title + ", PageNum: " + pageNum;
    }

}
