package NIIT.Book;

public class Main {

    public static void main(String[] args) {

        int m = 3;
        Author _author[] = new Author[m];
        for (int i=0; i<m; i++ )
        {
            char g;
            int r = (int)(Math.random()*2);
            if (r==0)
                g = 'M';
            else
                g = 'F';
            _author[i] = new Author((String.valueOf(i+1))+"Author", (String.valueOf(i+1))+"mail.@mir",g);

            System.out.println(_author[i].toString());
        }

        Book _book = new Book("Peter Pan",_author, 150,3);
        System.out.println(_book.toString());

        System.out.println("Authors names: " + _book.getAuthorNames());

	// write your code here
    }
}
