package movies;

public class Movie {
    private final String name;
    private final String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    static Movie[] moviesList = MoviesArray.findAll();

    public static void list(String category) {


        System.out.println("listing " + category + " movies:");
        for (Movie movie : moviesList) {
            if (movie.category.equalsIgnoreCase(category) || category.equalsIgnoreCase("all")) {
                System.out.println("----------------------------");
                System.out.println("Movie Title: " + movie.name);
                System.out.println("Category: " + movie.category);
            }
        }
        System.out.println("-----End of movie list-----");
    }

    public static void add(String name, int cat) {
String category = "";
        if (cat == 0) {
//            animated
            category= "animated";
        } else if (cat == 1) {
//            drama
            category= "drama";
        } else if (cat == 2) {
//         horror
            category= "horror";
        } else if (cat == 3) {
//        scifi
            category= "scifi";
        } else if (cat == 4) {
//        comedy
            category= "comedy";
        } else if (cat == 5) {
//        musical
            category= "musical";
        }
        System.out.println("new movie! "+ name + " will be a part of the "+category+" category!");
         new Movie(name, category);
    }
}

/*
        consolidated into list
    public static void listAll() {
        Movie[] moviesList = MoviesArray.findAll();

        System.out.println("listing all movies:");
        for (Movie movie : moviesList) {
            System.out.println("----------------------------");
            System.out.println("Movie Title: " + movie.name);
            System.out.println("Category: " + movie.category);
        }
        System.out.println("-----End of movie list-----");
    }
*/

